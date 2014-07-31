package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 * @author dxhu
 * 2012-06-19
 * ����EMR��ʿվ���ȷ�Ϲ��ܣ�ֱ�ӽ����ڿ�
 */
public class ManageStatus {
	private Connection emrdb = null;
	
	public ManageStatus(Connection emrdb)throws Exception {
		if (emrdb == null ) {
			throw new Exception("�쳣����");
		}
		this.emrdb = emrdb;
	}
	
	public void Status() throws Exception {
		//��ʼͬ������״̬����
		System.out.println("******��ʼͬ������״̬����*******");
		PreparedStatement update = emrdb.prepareStatement("update ADT.INPATIENT set IN_STATUS=? where IN_STATUS=?");
		
		update.setString(1, "1"); //�ڿ�
		update.setString(2, "0");//�����
		
		update.executeUpdate();
		if(update!=null){
			update.close();
		}
		System.out.println("******��ɲ���״̬����ͬ��*******");
	    emrdb.commit();
	}
}
