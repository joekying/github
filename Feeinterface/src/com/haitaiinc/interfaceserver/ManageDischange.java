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
 * ��EMRϵͳ�н���ԺС��ͬ����HIS�м����HIS����
 */
public class ManageDischange {
	private Connection emrdb = null;
	private Connection hisdb = null;
	
	public ManageDischange(Connection emrdb,Connection hisdb)throws Exception {
		if (emrdb == null ) {
			throw new Exception("�쳣����");
		}
		if (hisdb == null ) {
			throw new Exception("�쳣����");
		}
		this.emrdb = emrdb;
		this.hisdb = hisdb;
	}
	
	/**
	 *��EMRϵͳ�н���ԺС��ͬ�����м����HIS����
	 */
	public void Discharge() throws Exception {
		//��ʼ��ѯEMR�еĳ�ԺС������
		System.out.println("******��ʼ��ѯEMR�еĳ�ԺС������*******");
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
		//��ʼ��EMR�еĳ�ԺС������ת��
		System.out.println("******��ʼ��EMR�еĳ�ԺС������ת��*******");
		List dciList = new Vector();
		for(int i=0;dssList!=null&&i<dssList.size();i++){
			DischangeSummary dstemp = (DischangeSummary)dssList.get(i);
			Dischangeinfo dci = new Dischangeinfo();
			dci.summarytoDischange(dstemp,emrdb);
			dciList.add(dci);
		}
		//��ʼ���м��д��ԺС������
		System.out.println("******��ʼ���м��д��ԺС������*******");
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
			//���³�ԺС����ϴ��޸�ʱ�䣨�Ƿ���±�ǣ�
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
		System.out.println("******��ɳ�ԺС��ͬ��*******");
	    emrdb.commit();
	    hisdb.commit();
	}
	
	/**
	 * ���ݲ���סԺ��ˮ�Ų�ѯ InPatient����
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
