package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 * @author dxhu
 * 2012-06-19
 * 跳过EMR护士站入科确认功能，直接进入在科
 */
public class ManageStatus {
	private Connection emrdb = null;
	
	public ManageStatus(Connection emrdb)throws Exception {
		if (emrdb == null ) {
			throw new Exception("异常参数");
		}
		this.emrdb = emrdb;
	}
	
	public void Status() throws Exception {
		//开始同步病人状态数据
		System.out.println("******开始同步病人状态数据*******");
		PreparedStatement update = emrdb.prepareStatement("update ADT.INPATIENT set IN_STATUS=? where IN_STATUS=?");
		
		update.setString(1, "1"); //在科
		update.setString(2, "0");//待入科
		
		update.executeUpdate();
		if(update!=null){
			update.close();
		}
		System.out.println("******完成病人状态数据同步*******");
	    emrdb.commit();
	}
}
