package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;


/**
 * 
 * @author user
 *��ɽ����ҽԺ�������ýӿڷ���
 */		
public class ManageInFirstFee {
	
	private Connection hisdb = null;
	private Connection emrdb = null;
	public ManageInFirstFee(Connection hisdb,Connection emrdb)throws Exception {
		if (hisdb == null||emrdb==null ) {
			throw new Exception("�쳣����");
		}
		this.hisdb = hisdb;
		this.emrdb=emrdb;	
	}
	/**
	 *��HIS�м��IN_FIRST_FEE�ж�ȡ��Ҫ����Ĳ�����ҳ������Ϣ��
	 */
	public void manageInFirstFeeDetial() throws Exception {
		
		List inFirstFeeList=new Vector();
		String sql2=InFirstFee.SELECT+" where INSERTFLAG='1' or INSERTFLAG='2'";
		System.out.println("sql2---"+sql2);
		Statement stm1 = hisdb.createStatement();
	    ResultSet rs1 = stm1.executeQuery(sql2);
		while (rs1.next()) {
			InFirstFee inFirstFee_temp = new InFirstFee();
			inFirstFee_temp.fetchInFirstFee(rs1);
			inFirstFeeList.add(inFirstFee_temp);
		}
		rs1.close();
		stm1.close();
		
		System.out.println("��HIS�м��IN_FIRST_FEE�ж�ȡ��Ҫ����Ĳ�����ҳ������Ϣ"+inFirstFeeList.size()+"��");
		String returnCode = "";
		String returnStr = "";
		
		for(int i=0;i<inFirstFeeList.size();i++) {
			InFirstFee inFirstFee=new InFirstFee();
			inFirstFee=(InFirstFee)inFirstFeeList.get(i);
			if(("".equals(inFirstFee.getInsertFlag()))||(inFirstFee.getInsertFlag()==null)) {
				returnCode="2";
				returnStr="InsertFlagΪ�գ���his���������м���е�����";
				writerBack(inFirstFee,returnCode,returnStr);
				continue;
			}else if("".equals(inFirstFee.getInPatientFlow())||(inFirstFee.getInPatientFlow()==null)) {
				returnCode="2";
				returnStr="InPatientFlowΪ�գ���his���������м���е�����";
				writerBack(inFirstFee,returnCode,returnStr);
				continue;
			}
			if(inFirstFee.getInsertFlag().equals("1")) {//��������
				String sql="select IN_PATIENT_FLOW FROM IN_FIRST_FEE WHERE  IN_PATIENT_FLOW='"+inFirstFee.getInPatientFlow()+"'";
				System.out.println("sql---"+sql);
				Statement stm = emrdb.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				InFirstFee inFirstFee_temp1 = new InFirstFee();
				if(rs.next()){
					
					inFirstFee_temp1.setInPatientFlow(rs.getString(1));
				}
				rs.close();
				stm.close();

				if(inFirstFee.getInPatientFlow().equals(inFirstFee_temp1.getInPatientFlow())){
					updateData(inFirstFee);
				}else{
					insertData(inFirstFee);
				}
				
			}else if(inFirstFee.getInsertFlag().equals("2")) {//�޸Ĵ���
				updateData(inFirstFee);
					
			}
		}
		hisdb.commit();
		emrdb.commit();
	}
	
	/**
	 * ���ش�����Ϣ
	 * @param inFirstFee
	 * @param returnCode
	 * @param returnStr
	 * @throws Exception
	 */
	public void writerBack(InFirstFee inFirstFee,String returnCode,String returnStr)throws Exception {
		String flag=null;
		if(returnCode.equals("1")){
			flag="a";
			
			
		}else if(returnCode.equals("2")){
			flag="b";
		}
		String update_sql = "update IN_FIRST_FEE set INSERTFLAG='"+flag+"'  where FLOWID='"+inFirstFee.getFlowID()+"'";
		System.out.println("------return information :  "+returnStr);
		System.out.println("update_sql---"+update_sql);
		PreparedStatement pst = hisdb.prepareStatement(update_sql);
		pst.executeUpdate(); 
		pst.close();
	}

	/**
	 * ���봦��
	 * @param inFirstFee
	 * @throws Exception
	 */
	public void insertData(InFirstFee inFirstFee)throws Exception
	{
		String returnCode = "";
		String returnStr = "";
		try {
			PreparedStatement pst = emrdb.prepareStatement(InFirstFee.INSERT);
			pst = inFirstFee.makeInsSt(pst);
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="����ɹ�!";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(inFirstFee,returnCode,returnStr);
	}
	
	/**
	 * �������ݴ���
	 * @param inFirstFee
	 * @throws Exception
	 */
	public void updateData(InFirstFee inFirstFee)throws Exception {
		String returnCode = "";
		String returnStr = "";
		try {
//			PreparedStatement pst = emrdb.prepareStatement(InFirstFee.UPDATE);
//			pst = inFirstFee.makeUpdSt(pst);
			String sql=null;
			sql=inFirstFee.makeUpdate();
			System.out.println("update_sql---"+sql);
			PreparedStatement pst = emrdb.prepareStatement(sql);
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="����ɹ���";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(inFirstFee,returnCode,returnStr);
	}

}
