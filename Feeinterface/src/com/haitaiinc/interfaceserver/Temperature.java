package com.haitaiinc.interfaceserver;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.haitaiinc.ICommon.DataUtil;

public class Temperature extends com.haitaiinc.struct.Temperature {
	public static final String INSERT ="insert into INPTEMPER.TEMPERATURE  (IPID,MEASURE_DATE,CREATE_TIME,CREATOR,MODIFY_TIME,MODIFIER,POSTOPERATIVE_DAYS,INTAKE_VALUE,INTAKE_UNIT,STOOL_TIMES,URINE_VOLUME,DISCHARGE_VALUE,DISCHARGE_UNIT,DIASTOLIC_PRESSURE,SYSTOLIC_PRESSURE,WEIGHT,HEIGHT,ABDOMINAL_CIRCUMFERENCE,SKIN_TEST_RESULT,OTHER_DESC,ALL_DISCHARGE_VALUE,ALL_DISCHARGE_UNIT,DEPT_CODE,DEPT_NAME,WARD_CODE,WARD_NAME,MD5_CONTENT,PID,IN_HOPITAL_DAY,INTAKE_UNIT_CODE,DISCHARGE_UNIT_CODE,ALL_DISCHARGE_UNIT_CODE,WAIST_CIRCUMFERENCE,DEFINED_ITEM_CODES,WEIGHT_DESC,STOOL_TIMES_DESC,URINE_VOLUME_DESC)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE ="update INPTEMPER.TEMPERATURE  set MEASURE_DATE=?,CREATE_TIME=?,CREATOR=?,MODIFY_TIME=?,MODIFIER=?,POSTOPERATIVE_DAYS=?,INTAKE_VALUE=?,INTAKE_UNIT=?,STOOL_TIMES=?,URINE_VOLUME=?,DISCHARGE_VALUE=?,DISCHARGE_UNIT=?,DIASTOLIC_PRESSURE=?,SYSTOLIC_PRESSURE=?,WEIGHT=?,HEIGHT=?,ABDOMINAL_CIRCUMFERENCE=?,SKIN_TEST_RESULT=?,OTHER_DESC=?,ALL_DISCHARGE_VALUE=?,ALL_DISCHARGE_UNIT=?,DEPT_CODE=?,DEPT_NAME=?,WARD_CODE=?,WARD_NAME=?,MD5_CONTENT=?,PID=?,IN_HOPITAL_DAY=?,INTAKE_UNIT_CODE=?,DISCHARGE_UNIT_CODE=?,ALL_DISCHARGE_UNIT_CODE=?,WAIST_CIRCUMFERENCE=?,DEFINED_ITEM_CODES=?,WEIGHT_DESC=?,STOOL_TIMES_DESC=?,URINE_VOLUME_DESC=? where  IPID=?";
	public static final String SELECT ="select RecordFlow,IPID,MEASURE_DATE,CREATE_TIME,CREATOR,MODIFY_TIME,MODIFIER,POSTOPERATIVE_DAYS,INTAKE_VALUE,INTAKE_UNIT,STOOL_TIMES,URINE_VOLUME,DISCHARGE_VALUE,DISCHARGE_UNIT,DIASTOLIC_PRESSURE,SYSTOLIC_PRESSURE,WEIGHT,HEIGHT,ABDOMINAL_CIRCUMFERENCE,SKIN_TEST_RESULT,OTHER_DESC,ALL_DISCHARGE_VALUE,ALL_DISCHARGE_UNIT,DEPT_CODE,DEPT_NAME,WARD_CODE,WARD_NAME,MD5_CONTENT,PID,IN_HOPITAL_DAY,INTAKE_UNIT_CODE,DISCHARGE_UNIT_CODE,ALL_DISCHARGE_UNIT_CODE,WAIST_CIRCUMFERENCE,DEFINED_ITEM_CODES,WEIGHT_DESC,STOOL_TIMES_DESC,URINE_VOLUME_DESC,ManageType from TEMPERATURE ";
	public static final String DELETE="delete from INPTEMPER.TEMPERATURE where IPID=?";

	public void fetchTemperature(ResultSet rs)throws Exception{
		//recordflow = rs.getString("RecordFlow"); //��¼��ˮ��
		recordflow = rs.getInt("RecordFlow");
		ipid = rs.getString("IPID"); //סԺ��ˮ�� key
		//measureDate=DataUtil.transDateTime( rs.getString("MEASURE_DATE"), "yyyy-MM-dd", "yyyyMMdd");//�������� key
		measureDate = rs.getString("MEASURE_DATE"); //�������� key
		createTime = rs.getString("CREATE_TIME"); //����ʱ��
		creator = rs.getString("CREATOR"); //������
		modifyTime = rs.getString("MODIFY_TIME"); //�޸�ʱ��
		modifier = rs.getString("MODIFIER"); //�޸���
		postoperativeDays = rs.getString("POSTOPERATIVE_DAYS"); //��������
		String intakeValue_temp=rs.getString("INTAKE_VALUE"); //����ֵ
		if(intakeValue_temp!=null){
			intakeValue=Double.valueOf(intakeValue_temp);
		}
		//intakeValue = rs.getDouble("INTAKE_VALUE"); //����ֵ
		intakeUnit = rs.getString("INTAKE_UNIT"); //���뵥λ
		stoolTimes = rs.getString("STOOL_TIMES"); //������
		String urineVolume_temp=rs.getString("URINE_VOLUME");//����
		if(urineVolume_temp!=null){
			urineVolume=Double.valueOf(urineVolume_temp);
		}
		//urineVolume = rs.getDouble("URINE_VOLUME");//����
		String dischargeValue_temp=rs.getString("DISCHARGE_VALUE");//�ų�ֵ
		if(dischargeValue_temp!=null){
			dischargeValue=Double.valueOf(dischargeValue_temp);
		}
		//dischargeValue = rs.getDouble("DISCHARGE_VALUE");//�ų�ֵ
		dischargeUnit = rs.getString("DISCHARGE_UNIT"); //�ų���λ
		String diastolicPressure_temp=rs.getString("DIASTOLIC_PRESSURE");//����ѹ
		if(diastolicPressure_temp!=null){
			diastolicPressure=Integer.parseInt(diastolicPressure_temp);
		}
		//diastolicPressure = rs.getInt("DIASTOLIC_PRESSURE");//����ѹ
		String systolicPressure_temp=rs.getString("SYSTOLIC_PRESSURE");//����ѹ
		if(systolicPressure_temp!=null){
			systolicPressure=Integer.parseInt(systolicPressure_temp);
		}
		//systolicPressure = rs.getInt("SYSTOLIC_PRESSURE");//����ѹ
		String weight_temp=rs.getString("WEIGHT");//����
		if(weight_temp!=null){
			weight=Double.valueOf(weight_temp);
		}
		//weight = rs.getDouble("WEIGHT");//����
		String height_temp=rs.getString("HEIGHT"); //���
		if(height_temp!=null){
			height=Double.valueOf(height_temp);
		}
		//height = rs.getDouble("HEIGHT"); //���
		String abdominalCircumference_temp=rs.getString("ABDOMINAL_CIRCUMFERENCE"); //��Χ
		if(abdominalCircumference_temp!=null){
			abdominalCircumference=Double.valueOf(abdominalCircumference_temp);
		}
		//abdominalCircumference= rs.getDouble("ABDOMINAL_CIRCUMFERENCE"); //��Χ
		skinTestResult = rs.getString("SKIN_TEST_RESULT"); //Ƥ�Խ��������/���ԣ�
		otherDesc = rs.getString("OTHER_DESC"); ///��������
		String allDischargeValue_temp=rs.getString("ALL_DISCHARGE_VALUE");  //�ܳ���
		if(allDischargeValue_temp!=null){
			allDischargeValue=Double.valueOf(allDischargeValue_temp);
		}
		//allDischargeValue = rs.getDouble("ALL_DISCHARGE_VALUE");  //�ܳ���
		allDischargeUnit = rs.getString("ALL_DISCHARGE_UNIT"); //�ܳ�����λ
		deptCode = rs.getString("DEPT_CODE");//����(����)����
		deptName = rs.getString("DEPT_NAME"); //����(����)����
		wardCode = rs.getString("WARD_CODE"); //��������
		wardName = rs.getString("WARD_NAME"); //��������
		md5Content = rs.getString("MD5_CONTENT");//md5����
		pid = rs.getString("PID");//����ID
		inHospitalDay = rs.getInt("IN_HOPITAL_DAY");//סԺ����
		intakeUnitCode = rs.getString("INTAKE_UNIT_CODE");//����������
		dischargeUnitCode = rs.getString("DISCHARGE_UNIT_CODE");//�ų���λ����
		allDischargeUnitCode = rs.getString("ALL_DISCHARGE_UNIT_CODE");//�����ų���λ����
		String waistCircumference_temp=rs.getString("WAIST_CIRCUMFERENCE");  //��Χ
		if(waistCircumference_temp!=null){
			waistCircumference=Double.valueOf(waistCircumference_temp);
		}
		//waistCircumference = rs.getDouble("WAIST_CIRCUMFERENCE");  //��Χ
		definedItemCodes = rs.getString("DEFINED_ITEM_CODES");//�Զ�����Ŀ���뼯��
		weightDesc = rs.getString("WEIGHT_DESC");//��������
		stoolTimesDesc = rs.getString("STOOL_TIMES_DESC");//����������
		urineVolumeDesc = rs.getString("URINE_VOLUME_DESC");//��������
		manageType = rs.getString("ManageType");//�������ͣ�1-���� 2-�޸� 3-ɾ��  4-������ֵ��
//		eleID = rs.getString("ELE_ID");//������ 2--Ѫѹ2 3--Ѫѹ3
//		eleValue = rs.getString("ELE_VALUE");//�������ֵ
	}
	/**
	 * Method makeInsSt.
	 * ���ɲ��������PreparedStatement
	 * @param pst ʹ��INSERTԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		//pst.setString(++index, recordflow); //��¼��ˮ��
		pst.setString(++index, ipid); //סԺ��ˮ�� key
		pst.setString(++index, measureDate); //�������� key
		pst.setString(++index, createTime);//����ʱ��
		pst.setString(++index, creator); //������
		pst.setString(++index, modifyTime);//�޸�ʱ��
		pst.setString(++index, modifier);//�޸���
		pst.setString(++index, postoperativeDays);//��������	
		pst.setString(++index, intakeUnit); //���뵥λ
		pst.setString(++index, stoolTimes);//������
		System.out.println("-------------1-----------");
		try{
			pst.setDouble(++index, urineVolume); //����
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		System.out.println("-------------2-----------");
		try{
			pst.setDouble(++index, dischargeValue);//�ų�ֵ
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, dischargeUnit);//�ų���λ
		try{
			pst.setInt(++index, diastolicPressure);//����ѹ
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		try{
			pst.setInt(++index, systolicPressure);//����ѹ
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		try{
			pst.setDouble(++index, weight);//����
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, height);//���
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, abdominalCircumference);//��Χ
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, skinTestResult);//Ƥ�Խ��������/���ԣ�
		pst.setString(++index, otherDesc);//��������
		try{
			pst.setDouble(++index, allDischargeValue);//�ܳ���
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, allDischargeUnit);//�ܳ�����λ
		pst.setString(++index, deptCode);//����(����)����
		pst.setString(++index, deptName);//����(����)����
		pst.setString(++index, wardCode);//��������
		pst.setString(++index, wardName);//��������
		pst.setString(++index, md5Content);//md5����
		pst.setString(++index, pid);//����ID
		try{
			pst.setInt(++index, inHospitalDay);//סԺ����
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, intakeUnitCode);//����������
		pst.setString(++index, dischargeUnitCode);//�ų���λ����
		pst.setString(++index, allDischargeUnitCode);//�����ų���λ����
		try{
			pst.setDouble(++index, waistCircumference);//��Χ
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, definedItemCodes);//�Զ�����Ŀ���뼯��
		pst.setString(++index, weightDesc);//��������
		pst.setString(++index, stoolTimesDesc);//����������
		pst.setString(++index, urineVolumeDesc);//��������
//		pst.setString(++index, eleID);//������ 2--Ѫѹ2 3--Ѫѹ3
//		pst.setString(++index, eleValue);//�������ֵ
		//pst.setString(++index, manageType);//�������ͣ�1-���� 2-�޸� 3-ɾ����
		return pst;
	}
	
	/**
	 * Method makeUpdSt.
	 * ���ɲ��������PreparedStatement
	 * @param pst ʹ��UPDATEԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		//pst.setString(++index, recordflow); //��¼��ˮ��
			pst.setString(1, measureDate); //�������� key		
			pst.setString(2, createTime);//����ʱ��		
			pst.setString(3, creator); //������		
			pst.setString(4, modifyTime);//�޸�ʱ��		
			pst.setString(5, modifier);//�޸���		
			pst.setString(6, postoperativeDays);//��������		
			pst.setDouble(7, intakeValue); //����ֵ		
			pst.setString(8, intakeUnit); //���뵥λ		
			pst.setString(9, stoolTimes);//������	
			pst.setDouble(10, urineVolume); //����		
			pst.setDouble(11, dischargeValue);//�ų�ֵ		
			pst.setString(12, dischargeUnit);//�ų���λ		
			pst.setInt(13, diastolicPressure);//����ѹ		
			pst.setInt(14, systolicPressure);//����ѹ		
			pst.setDouble(15, weight);//����		
			pst.setDouble(16, height);//���		
			pst.setDouble(17, abdominalCircumference);//��Χ		
			pst.setString(18, skinTestResult);//Ƥ�Խ��������/���ԣ�		
			pst.setString(19, otherDesc);//��������		
			pst.setDouble(20, allDischargeValue);//�ܳ���		
			pst.setString(21, allDischargeUnit);//�ܳ�����λ		
			pst.setString(22, deptCode);//����(����)����		
			pst.setString(23, deptName);//����(����)����		
			pst.setString(24, wardCode);//��������		
			pst.setString(25, wardName);//��������		
			pst.setString(26, md5Content);//md5����		
			pst.setString(27, pid);//����ID		
			pst.setInt(28, inHospitalDay);//סԺ����		
			pst.setString(29, intakeUnitCode);//����������		
			pst.setString(30, dischargeUnitCode);//�ų���λ����		
			pst.setString(31, allDischargeUnitCode);//�����ų���λ����		
			pst.setDouble(32, waistCircumference);//��Χ		
			pst.setString(33, definedItemCodes);//�Զ�����Ŀ���뼯��		
			pst.setString(34, weightDesc);//��������		
			pst.setString(35, stoolTimesDesc);//����������		
			pst.setString(36, urineVolumeDesc);//��������	
			pst.setString(37, ipid); //סԺ��ˮ�� key
//			pst.setString(++index, eleID);//������ 2--Ѫѹ2 3--Ѫѹ3	
//			pst.setString(++index, eleValue);//�������ֵ
		
		//pst.setString(++index, manageType);//�������ͣ�1-���� 2-�޸� 3-ɾ����
		
		return pst;
	}
	public PreparedStatement makeDelSt(PreparedStatement pst)
	throws SQLException {
		int index = 0;
		pst.setString(++index, ipid); //סԺ��ˮ�� key
		return pst;
	}
	
	public String makeUpdate(){
		String sql="update INPTEMPER.TEMPERATURE  set ";
		if(createTime!=null){
			if(createTime.equals("")){
				
			}else{
				sql+=" CREATE_TIME='"+createTime+"',";
			}
					
		}
		if(creator!=null||!creator.equals("")){
			sql+=" CREATOR='"+creator+"',";		
		}
		if(modifyTime!=null||!modifyTime.equals("")){
			sql+=" MODIFY_TIME='"+modifyTime+"',";		
		}
		if(postoperativeDays!=null||!postoperativeDays.equals("")){
			sql+=" POSTOPERATIVE_DAYS='"+postoperativeDays+"',";		
		}
		if(intakeValue!=null||!intakeValue.equals("")){
			sql+=" INTAKE_VALUE='"+intakeValue+"',";		
		}
		if(intakeUnit!=null||!intakeUnit.equals("")){
			sql+=" INTAKE_UNIT='"+intakeUnit+"',";		
		}
		if(stoolTimes!=null||!stoolTimes.equals("")){
			sql+=" STOOL_TIMES='"+stoolTimes+"',";		
		}
		if(urineVolume!=null||!urineVolume.equals("")){
			sql+=" URINE_VOLUME='"+urineVolume+"',";		
		}
		if(dischargeValue!=null||!dischargeValue.equals("")){
			sql+=" DISCHARGE_VALUE='"+dischargeValue+"',";		
		}
		if(dischargeUnit!=null||!dischargeUnit.equals("")){
			sql+=" DISCHARGE_UNIT='"+dischargeUnit+"',";		
		}
		if(diastolicPressure!=null||!diastolicPressure.equals("")){
			sql+=" DIASTOLIC_PRESSURE='"+diastolicPressure+"',";		
		}
		if(systolicPressure!=null||!systolicPressure.equals("")){
			sql+=" SYSTOLIC_PRESSURE='"+systolicPressure+"',";		
		}
		if(weight!=null||!weight.equals("")){
			sql+=" WEIGHT='"+weight+"',";		
		}
		
		if(height!=null||!height.equals("")){
			sql+=" HEIGHT='"+height+"',";		
		}
		if(abdominalCircumference!=null||!abdominalCircumference.equals("")){
			sql+=" ABDOMINAL_CIRCUMFERENCE='"+abdominalCircumference+"',";		
		}
		if(skinTestResult!=null||!skinTestResult.equals("")){
			sql+=" SKIN_TEST_RESULT='"+skinTestResult+"',";		
		}
		if(otherDesc!=null||!otherDesc.equals("")){
			sql+=" OTHER_DESC='"+otherDesc+"',";		
		}
		if(allDischargeValue!=null||!allDischargeValue.equals("")){
			sql+=" ALL_DISCHARGE_VALUE='"+allDischargeValue+"',";		
		}
		if(allDischargeUnit!=null||!allDischargeUnit.equals("")){
			sql+=" ALL_DISCHARGE_UNIT='"+allDischargeUnit+"',";		
		}
		if(deptCode!=null||!deptCode.equals("")){
			sql+=" DEPT_CODE='"+deptCode+"',";		
		}
		if(deptName!=null||!deptName.equals("")){
			sql+=" DEPT_NAME='"+deptName+"',";		
		}
		if(wardCode!=null||!wardCode.equals("")){
			sql+=" WARD_CODE='"+wardCode+"',";		
		}
		if(wardName!=null||!wardName.equals("")){
			sql+=" WARD_NAME='"+wardName+"',";		
		}
		if(md5Content!=null||!md5Content.equals("")){
			sql+=" MD5_CONTENT='"+md5Content+"',";		
		}
		if(pid!=null||!pid.equals("")){
			sql+=" PID='"+pid+"',";		
		}
		if(inHospitalDay!=null||!inHospitalDay.equals("")){
			sql+=" IN_HOPITAL_DAY='"+inHospitalDay+"',";		
		}
		if(intakeUnitCode!=null||!intakeUnitCode.equals("")){
			sql+=" INTAKE_UNIT_CODE='"+intakeUnitCode+"',";		
		}
		if(dischargeUnitCode!=null||!dischargeUnitCode.equals("")){
			sql+=" DISCHARGE_UNIT_CODE='"+dischargeUnitCode+"',";		
		}
		if(allDischargeUnitCode!=null||!allDischargeUnitCode.equals("")){
			sql+=" ALL_DISCHARGE_UNIT_CODE='"+allDischargeUnitCode+"',";		
		}
		if(waistCircumference!=null||!waistCircumference.equals("")){
			sql+=" WAIST_CIRCUMFERENCE='"+waistCircumference+"',";		
		}
		if(definedItemCodes!=null||!definedItemCodes.equals("")){
			sql+=" DEFINED_ITEM_CODES='"+definedItemCodes+"',";		
		}
		if(weightDesc!=null||!weightDesc.equals("")){
			sql+=" WEIGHT_DESC='"+weightDesc+"',";		
		}
		if(stoolTimesDesc!=null||!stoolTimesDesc.equals("")){
			sql+=" STOOL_TIMES_DESC='"+stoolTimesDesc+"',";		
		}
		if(urineVolumeDesc!=null||!urineVolumeDesc.equals("")){
			sql+=" URINE_VOLUME_DESC='"+urineVolumeDesc+"',";		
		}
		sql=sql.substring(0,sql.length()-1);
		sql+=" where IPID='"+ipid+"' and MEASURE_DATE='"+measureDate+"'";
		return sql;
	}
}
