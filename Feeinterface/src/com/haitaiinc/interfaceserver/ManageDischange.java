package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import com.haitaiinc.struct.DischangeSummary;


/**
 * @author dxhu
 * 2012-06-10
 * 从EMR系统中将出院小结同步到HIS中间表，供HIS调用
 */
public class ManageDischange {
	private Connection emrdb = null;
	private Connection hisdb = null;
	
	public ManageDischange(Connection emrdb,Connection hisdb)throws Exception {
		if (emrdb == null ) {
			throw new Exception("异常参数");
		}
		if (hisdb == null ) {
			throw new Exception("异常参数");
		}
		this.emrdb = emrdb;
		this.hisdb = hisdb;
	}
	
	/**
	 *从EMR系统中将出院小结同步到中间表，供HIS调用
	 */
	public void Discharge() throws Exception {
		//开始查询EMR中的出院小结数据
		System.out.println("******开始查询EMR中的出院小结数据*******");
		DischangeSummary ds = new DischangeSummary();
		List dssList = new Vector();
		Statement stm = emrdb.createStatement();
		ResultSet rs = stm.executeQuery(ds.SELECT);
		while (rs.next()) {
			ds = new DischangeSummary();
			ds.fetchDischangeSummary(rs);
			dssList.add(ds);
		}

		rs.close();
		stm.close();
		//开始将EMR中的出院小结数据转换
		System.out.println("******开始将EMR中的出院小结数据转换*******");
		List dciList = new Vector();
		for(int i=0;dssList!=null&&i<dssList.size();i++){
			DischangeSummary dstemp = (DischangeSummary)dssList.get(i);
			Dischangeinfo dci = new Dischangeinfo();
			dci.summarytoDischange(dstemp,emrdb);
			dciList.add(dci);
		}
		//开始向中间表写出院小结数据
		System.out.println("******开始向中间表写出院小结数据*******");
		PreparedStatement insert_sql = hisdb.prepareStatement(Dischangeinfo.INSERT);
		PreparedStatement update_sql = hisdb.prepareStatement(Dischangeinfo.UPDATE);
		PreparedStatement update = emrdb.prepareStatement(DischangeSummary.UPDATE);
		for(int i=0;dciList!=null&&i<dciList.size();i++){
			Dischangeinfo dci = (Dischangeinfo)dciList.get(i);
			Dischangeinfo dcitemp = readDischangeinfo(dci.getAno(), hisdb);
			if(dcitemp==null){
				dci.makeInsSt(insert_sql);
				insert_sql.executeUpdate();
			}else{
				dci.makeUpdSt(update_sql);
				update_sql.executeUpdate();
			}
			//更新出院小结表上次修改时间（是否更新标记）
			update.setString(1, dci.getAno()); 
			update.executeUpdate();
		}
		if(insert_sql!=null){
			insert_sql.close();
		}
		if(update_sql!=null){
			update_sql.close();
		}
		if(update!=null){
			update.close();
		}
		System.out.println("******完成出院小结同步*******");
	    emrdb.commit();
	    hisdb.commit();
	}
	
	/**
	 * 根据病人住院流水号查询 InPatient数据
	 * @throws SQLException
	 */
	private Dischangeinfo readDischangeinfo(String ipid, Connection conn)throws SQLException {
		Dischangeinfo di = null;
		String sql = Dischangeinfo.SELECT + " where Ano =" + ipid;
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			di = new Dischangeinfo();
			di.fetchDischangeinfo(rs);
		}
		rs.close();
		stm.close();
		return di;
	}
}
