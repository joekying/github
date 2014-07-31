package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

/**
 * @author 
 * 2012-09-17
 * 用于从PDA系统读取病人生命体征数据
 */
public class ManagePDA {
private Connection pdadb = null;
private Connection emrdb = null;
	
	public ManagePDA(Connection pdadb,Connection emrdb)throws Exception {
		if (pdadb == null||emrdb==null ) {
			throw new Exception("异常参数");
		}
		this.pdadb = pdadb;
		this.emrdb=emrdb;
	}
	
	/**
	 *从PDA中间表Temperature中读取需要处理的病人生命体征数据。
	 */
	public void manageTemperature() throws Exception {
		//-------读取Temperature中间表中的数据---
		
		List tpList = new Vector();
		String sql = Temperature.SELECT+" where ImpFlag='0'";
		System.out.println("sql---"+sql);
		Statement stm = pdadb.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			Temperature tp_temp = new Temperature();
			tp_temp.fetchTemperature(rs);
			tpList.add(tp_temp);
		}
		rs.close();
		stm.close();
		System.out.println("从PDA中间表TEMPERATURE中读取需要处理的病人生命体征数据"+tpList.size()+"条");
		String returnCode = "";
		String returnStr = "";
		for(int i=0;i<tpList.size();i++){
			Temperature tp = new Temperature();
			tp = (Temperature)tpList.get(i);
			if(tp.getRecordflow().toString()==null) {
				returnCode="2";
				returnStr="Recordflow为空，请pda方检查插入中间表中的数据";
				writerBack(tp,returnCode,returnStr);
				continue;
			}else 
				if("".equals(tp.getManageType())||tp.getManageType()==null) {
				returnCode="2";
				returnStr="MangeType为空，请pda方检查插入中间表中的数据";
				writerBack(tp,returnCode,returnStr);
				continue;
			}else if("".equals(tp.getIpid())||"".equals(tp.getMeasureDate())||tp.getIpid()==null||tp.getMeasureDate()==null) {
				returnCode="2";
				returnStr="Ipid或者MeasureDate为空，请pda方检查插入中间表中的数据";
				writerBack(tp,returnCode,returnStr);
				continue;
			} 
			if(tp.getManageType().equals("1")) {//新增处理
				insertData(tp);

			}else if(tp.getManageType().equals("2")) {//修改处理
				updateData(tp);
					
			}else if(tp.getManageType().equals("3")) {//删除处理
				deleteData(tp);
			}
//			else if(tp.getManageType().equals("4")){//处理附加项
//				TemperatureEle temperatureEle=new TemperatureEle();
//				temperatureEle=ManagePDA.transFor(tp);
//				insertDataEle(temperatureEle);
//				//将附加项数据回写到主表中
//				Temperature temperature= new Temperature();
//				
//				temperature.setIpid(tp.getIpid());
//				temperature.setPid(tp.getPid());
//				temperature.setMeasureDate(tp.getMeasureDate());
//				String sql_temp="select DEFINED_ITEM_CODES from INPTEMPER.TEMPERATURE where IPID= '"+tp.getIpid()+"'  and MEASURE_DATE= '"+tp.getMeasureDate()+"'";
//				try{
//					Statement stm1 = emrdb.createStatement();
//				    ResultSet rs1 = stm1.executeQuery(sql_temp);
//					if(rs1.next()){
//						String rs_temp="";
//						rs_temp=rs1.getString(1);
//						if(rs_temp==null){
//							temperature.setDefinedItemCodes(temperatureEle.getTemperEleSn());
//						}else{
//							temperature.setDefinedItemCodes(rs1.getString(1)+","+temperatureEle.getTemperEleSn());
//						}
//					}
//					rs1.close();
//					stm1.close();
//					
//				}catch(Exception e){
//					e.printStackTrace();
//				}
//				
//				updateData(temperature);	
//			}
			
		}
		pdadb.commit();
		emrdb.commit();
	}
	
	/**
	 *从PDA中间表TemperatureDetail中读取需要处理的病人生命体征数据。
	 */
	public void manageTemperatureDetail() throws Exception {
	//-----------读取TemperatureDetail中间表中的数据---
		
		List tpdList=new Vector();
		String sql2=TemperatureDetail.SELECT+" where ImpFlag='0'";
		System.out.println("sql2---"+sql2);
		Statement stm1 = pdadb.createStatement();
	    ResultSet rs1 = stm1.executeQuery(sql2);
		while (rs1.next()) {
		TemperatureDetail tpd_temp = new TemperatureDetail();
			tpd_temp.fetchTemperatureDetail(rs1);
			tpdList.add(tpd_temp);
		}
		rs1.close();
		stm1.close();
		
		System.out.println("从PDA中间表TEMPERATURE_DETAIL中读取需要处理的病人生命体征数据"+tpdList.size()+"条");
		String returnCode = "";
		String returnStr = "";
		TemperatureDetail tpd=new TemperatureDetail();
		for(int i=0;i<tpdList.size();i++) {
		tpd=(TemperatureDetail)tpdList.get(i);
		if(tpd.getRecordflow().toString()==null) {
			returnCode="2";
			returnStr="Recordflow为空，请pda方检查插入中间表中的数据";
			writerBack(tpd,returnCode,returnStr);
			continue;
		}else if("".equals(tpd.getManageType())||tpd.getRecordflow()==null) {
				returnCode="2";
				returnStr="MangeType为空，请pda方检查插入中间表中的数据";
				writerBack(tpd,returnCode,returnStr);
				continue;
			}else if("".equals(tpd.getIpid())||"".equals(tpd.getMeasureDate())||tpd.getIpid()==null||tpd.getMeasureDate()==null) {
				returnCode="2";
				returnStr="Ipid或者MeasureDate为空，请pda方检查插入中间表中的数据";
				writerBack(tpd,returnCode,returnStr);
				continue;
			}
			if(tpd.getManageType().equals("1")) {//新增处理
				insertData(tpd);

			}else if(tpd.getManageType().equals("2")) {//修改处理
				updateData(tpd);
					
			}else if(tpd.getManageType().equals("3")) {//删除处理
				deleteData(tpd);
			}
		}
		pdadb.commit();
		emrdb.commit();
	}
	
//------------转换对象--------------------
	public static TemperatureEle transFor(Temperature temperature){
		TemperatureEle temperatureEle=new TemperatureEle();
		temperatureEle.setIpid(temperature.getIpid());
		temperatureEle.setPid(temperature.getPid());
		temperatureEle.setMeasureDate(temperature.getMeasureDate());
		if(temperature.getEleID().equals("2")){//血压2
			temperatureEle.setEleID("HT51.02.881");
			temperatureEle.setEleName("血压2");
		}else if(temperature.getEleID().equals("3")){//血压3
			temperatureEle.setEleID("HT51.02.882");
			temperatureEle.setEleName("血压3");
		}
		temperatureEle.setTemperEleSn(temperature.getIpid()+temperature.getMeasureDate()+temperatureEle.getEleID());
		temperatureEle.setEleValue(temperature.getEleValue());
		return temperatureEle;
	}
	
//---------------------插入数据处理-------------------
	public void insertDataEle(TemperatureEle temperatureEle)throws Exception{
		try {
			PreparedStatement pst = emrdb.prepareStatement(TemperatureEle.INSERT);
			pst = temperatureEle.makeInsSt(pst);
			pst.executeUpdate();
			pst.close();			
			}catch (Exception e) {
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
	}
	public void insertData(Temperature tp)throws Exception
	{
		String returnCode = "";
		String returnStr = "";
		try {
			PreparedStatement pst = emrdb.prepareStatement(Temperature.INSERT);
			System.out.println("===========111========");
			pst = tp.makeInsSt(pst);
			System.out.println("===========112========");
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="处理成功!";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(tp,returnCode,returnStr);
	}
	public void insertData(TemperatureDetail tpd)throws Exception
	{
		String returnCode = "";
		String returnStr = "";
		try {
			PreparedStatement pst = emrdb.prepareStatement(TemperatureDetail.INSERT);
			pst = tpd.makeInsSt(pst);
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="处理成功!";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(tpd,returnCode,returnStr);
	}
//-----------------更新数据处理----------
	public void updateData(Temperature tp)throws Exception {
		String returnCode = "";
		String returnStr = "";
		try {
			String sql=null;
			System.out.println("===========0211========");
			sql=tp.makeUpdate();
			System.out.println("update_sql---"+sql);
			PreparedStatement pst = emrdb.prepareStatement(sql);
			System.out.println("===========211========");
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="处理成功！";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(tp,returnCode,returnStr);
	}
	public void updateData(TemperatureDetail tpd)throws Exception {
		String returnCode = "";
		String returnStr = "";
		try {
			String sql=null;
			sql=tpd.makeUpdate();
			System.out.println("update_sql---"+sql);
			PreparedStatement pst = emrdb.prepareStatement(sql);
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="处理成功！";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(tpd,returnCode,returnStr);
	}
	//----------------删除数据处理--------------
	public void deleteData(TemperatureDetail tpd)throws Exception {
		String returnCode = "";
		String returnStr = "";
		try {
			PreparedStatement pst = emrdb.prepareStatement(TemperatureDetail.DELETE);
			pst = tpd.makeDelSt(pst);
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="处理成功！";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(tpd,returnCode,returnStr);
	}
	public void deleteData(Temperature tp)throws Exception {
		String returnCode = "";
		String returnStr = "";
		try {
			PreparedStatement pst = emrdb.prepareStatement(Temperature.DELETE);
			pst = tp.makeDelSt(pst);
			pst.executeUpdate();
			pst.close();
			returnCode="1";
			returnStr="处理成功！";
			}catch (Exception e) {
				returnCode="2";
				returnStr=e.getMessage();
				try {
					emrdb.rollback();
				} catch (Exception e2) {
					}
				}
			writerBack(tp,returnCode,returnStr);
	}
	//-------------更新pda数据库处理----------------
	public void writerBack(Temperature tp,String returnCode,String returnStr)throws Exception {
		String update_sql = "update Temperature set ImpFlag='"+returnCode+"',ReturnDesc='"+returnStr+"' where RecordFlow='"+tp.getRecordflow()+"'";
		System.out.println("update_sql---"+update_sql);
		PreparedStatement pst = pdadb.prepareStatement(update_sql);
		pst.executeUpdate();
		pst.close();
//		pdadb.commit();
	}
	public void writerBack(TemperatureDetail tpd,String returnCode,String returnStr)throws Exception {
		String update_sql = "update TEMPERATURE_DETAIL set ImpFlag='"+returnCode+"',Returndesc='"+returnStr+"' where RecordFlow='"+tpd.getRecordflow()+"'";
		System.out.println("update_sql---"+update_sql);
		PreparedStatement pst = pdadb.prepareStatement(update_sql);
		pst.executeUpdate();
		pst.close();
//		pdadb.commit();
	}
}
