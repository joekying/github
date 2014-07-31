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
		//recordflow = rs.getString("RecordFlow"); //记录流水号
		recordflow = rs.getInt("RecordFlow");
		ipid = rs.getString("IPID"); //住院流水号 key
		//measureDate=DataUtil.transDateTime( rs.getString("MEASURE_DATE"), "yyyy-MM-dd", "yyyyMMdd");//测量日期 key
		measureDate = rs.getString("MEASURE_DATE"); //测量日期 key
		createTime = rs.getString("CREATE_TIME"); //创建时间
		creator = rs.getString("CREATOR"); //创建人
		modifyTime = rs.getString("MODIFY_TIME"); //修改时间
		modifier = rs.getString("MODIFIER"); //修改人
		postoperativeDays = rs.getString("POSTOPERATIVE_DAYS"); //术后日数
		String intakeValue_temp=rs.getString("INTAKE_VALUE"); //摄入值
		if(intakeValue_temp!=null){
			intakeValue=Double.valueOf(intakeValue_temp);
		}
		//intakeValue = rs.getDouble("INTAKE_VALUE"); //摄入值
		intakeUnit = rs.getString("INTAKE_UNIT"); //摄入单位
		stoolTimes = rs.getString("STOOL_TIMES"); //大便次数
		String urineVolume_temp=rs.getString("URINE_VOLUME");//尿量
		if(urineVolume_temp!=null){
			urineVolume=Double.valueOf(urineVolume_temp);
		}
		//urineVolume = rs.getDouble("URINE_VOLUME");//尿量
		String dischargeValue_temp=rs.getString("DISCHARGE_VALUE");//排出值
		if(dischargeValue_temp!=null){
			dischargeValue=Double.valueOf(dischargeValue_temp);
		}
		//dischargeValue = rs.getDouble("DISCHARGE_VALUE");//排出值
		dischargeUnit = rs.getString("DISCHARGE_UNIT"); //排出单位
		String diastolicPressure_temp=rs.getString("DIASTOLIC_PRESSURE");//舒张压
		if(diastolicPressure_temp!=null){
			diastolicPressure=Integer.parseInt(diastolicPressure_temp);
		}
		//diastolicPressure = rs.getInt("DIASTOLIC_PRESSURE");//舒张压
		String systolicPressure_temp=rs.getString("SYSTOLIC_PRESSURE");//收缩压
		if(systolicPressure_temp!=null){
			systolicPressure=Integer.parseInt(systolicPressure_temp);
		}
		//systolicPressure = rs.getInt("SYSTOLIC_PRESSURE");//收缩压
		String weight_temp=rs.getString("WEIGHT");//体重
		if(weight_temp!=null){
			weight=Double.valueOf(weight_temp);
		}
		//weight = rs.getDouble("WEIGHT");//体重
		String height_temp=rs.getString("HEIGHT"); //身高
		if(height_temp!=null){
			height=Double.valueOf(height_temp);
		}
		//height = rs.getDouble("HEIGHT"); //身高
		String abdominalCircumference_temp=rs.getString("ABDOMINAL_CIRCUMFERENCE"); //腹围
		if(abdominalCircumference_temp!=null){
			abdominalCircumference=Double.valueOf(abdominalCircumference_temp);
		}
		//abdominalCircumference= rs.getDouble("ABDOMINAL_CIRCUMFERENCE"); //腹围
		skinTestResult = rs.getString("SKIN_TEST_RESULT"); //皮试结果（阴性/阳性）
		otherDesc = rs.getString("OTHER_DESC"); ///其它描述
		String allDischargeValue_temp=rs.getString("ALL_DISCHARGE_VALUE");  //总出量
		if(allDischargeValue_temp!=null){
			allDischargeValue=Double.valueOf(allDischargeValue_temp);
		}
		//allDischargeValue = rs.getDouble("ALL_DISCHARGE_VALUE");  //总出量
		allDischargeUnit = rs.getString("ALL_DISCHARGE_UNIT"); //总出量单位
		deptCode = rs.getString("DEPT_CODE");//部门(科室)代码
		deptName = rs.getString("DEPT_NAME"); //部门(科室)名称
		wardCode = rs.getString("WARD_CODE"); //病区代码
		wardName = rs.getString("WARD_NAME"); //病区名称
		md5Content = rs.getString("MD5_CONTENT");//md5编码
		pid = rs.getString("PID");//病人ID
		inHospitalDay = rs.getInt("IN_HOPITAL_DAY");//住院天数
		intakeUnitCode = rs.getString("INTAKE_UNIT_CODE");//摄入量代码
		dischargeUnitCode = rs.getString("DISCHARGE_UNIT_CODE");//排除单位代码
		allDischargeUnitCode = rs.getString("ALL_DISCHARGE_UNIT_CODE");//所有排出单位代码
		String waistCircumference_temp=rs.getString("WAIST_CIRCUMFERENCE");  //腰围
		if(waistCircumference_temp!=null){
			waistCircumference=Double.valueOf(waistCircumference_temp);
		}
		//waistCircumference = rs.getDouble("WAIST_CIRCUMFERENCE");  //腰围
		definedItemCodes = rs.getString("DEFINED_ITEM_CODES");//自定义项目代码集合
		weightDesc = rs.getString("WEIGHT_DESC");//体重描述
		stoolTimesDesc = rs.getString("STOOL_TIMES_DESC");//大便次数描述
		urineVolumeDesc = rs.getString("URINE_VOLUME_DESC");//尿量描述
		manageType = rs.getString("ManageType");//处理类型（1-新增 2-修改 3-删除  4-处理附加值）
//		eleID = rs.getString("ELE_ID");//附加项 2--血压2 3--血压3
//		eleValue = rs.getString("ELE_VALUE");//附加项的值
	}
	/**
	 * Method makeInsSt.
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用INSERT预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		//pst.setString(++index, recordflow); //记录流水号
		pst.setString(++index, ipid); //住院流水号 key
		pst.setString(++index, measureDate); //测量日期 key
		pst.setString(++index, createTime);//创建时间
		pst.setString(++index, creator); //创建人
		pst.setString(++index, modifyTime);//修改时间
		pst.setString(++index, modifier);//修改人
		pst.setString(++index, postoperativeDays);//术后日数	
		pst.setString(++index, intakeUnit); //摄入单位
		pst.setString(++index, stoolTimes);//大便次数
		System.out.println("-------------1-----------");
		try{
			pst.setDouble(++index, urineVolume); //尿量
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		System.out.println("-------------2-----------");
		try{
			pst.setDouble(++index, dischargeValue);//排出值
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, dischargeUnit);//排出单位
		try{
			pst.setInt(++index, diastolicPressure);//舒张压
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		try{
			pst.setInt(++index, systolicPressure);//收缩压
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		try{
			pst.setDouble(++index, weight);//体重
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, height);//身高
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, abdominalCircumference);//腹围
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, skinTestResult);//皮试结果（阴性/阳性）
		pst.setString(++index, otherDesc);//其它描述
		try{
			pst.setDouble(++index, allDischargeValue);//总出量
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, allDischargeUnit);//总出量单位
		pst.setString(++index, deptCode);//部门(科室)代码
		pst.setString(++index, deptName);//部门(科室)名称
		pst.setString(++index, wardCode);//病区代码
		pst.setString(++index, wardName);//病区名称
		pst.setString(++index, md5Content);//md5编码
		pst.setString(++index, pid);//病人ID
		try{
			pst.setInt(++index, inHospitalDay);//住院天数
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, intakeUnitCode);//摄入量代码
		pst.setString(++index, dischargeUnitCode);//排除单位代码
		pst.setString(++index, allDischargeUnitCode);//所有排出单位代码
		try{
			pst.setDouble(++index, waistCircumference);//腰围
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, definedItemCodes);//自定义项目代码集合
		pst.setString(++index, weightDesc);//体重描述
		pst.setString(++index, stoolTimesDesc);//大便次数描述
		pst.setString(++index, urineVolumeDesc);//尿量描述
//		pst.setString(++index, eleID);//附加项 2--血压2 3--血压3
//		pst.setString(++index, eleValue);//附加项的值
		//pst.setString(++index, manageType);//处理类型（1-新增 2-修改 3-删除）
		return pst;
	}
	
	/**
	 * Method makeUpdSt.
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用UPDATE预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		//pst.setString(++index, recordflow); //记录流水号
			pst.setString(1, measureDate); //测量日期 key		
			pst.setString(2, createTime);//创建时间		
			pst.setString(3, creator); //创建人		
			pst.setString(4, modifyTime);//修改时间		
			pst.setString(5, modifier);//修改人		
			pst.setString(6, postoperativeDays);//术后日数		
			pst.setDouble(7, intakeValue); //摄入值		
			pst.setString(8, intakeUnit); //摄入单位		
			pst.setString(9, stoolTimes);//大便次数	
			pst.setDouble(10, urineVolume); //尿量		
			pst.setDouble(11, dischargeValue);//排出值		
			pst.setString(12, dischargeUnit);//排出单位		
			pst.setInt(13, diastolicPressure);//舒张压		
			pst.setInt(14, systolicPressure);//收缩压		
			pst.setDouble(15, weight);//体重		
			pst.setDouble(16, height);//身高		
			pst.setDouble(17, abdominalCircumference);//腹围		
			pst.setString(18, skinTestResult);//皮试结果（阴性/阳性）		
			pst.setString(19, otherDesc);//其它描述		
			pst.setDouble(20, allDischargeValue);//总出量		
			pst.setString(21, allDischargeUnit);//总出量单位		
			pst.setString(22, deptCode);//部门(科室)代码		
			pst.setString(23, deptName);//部门(科室)名称		
			pst.setString(24, wardCode);//病区代码		
			pst.setString(25, wardName);//病区名称		
			pst.setString(26, md5Content);//md5编码		
			pst.setString(27, pid);//病人ID		
			pst.setInt(28, inHospitalDay);//住院天数		
			pst.setString(29, intakeUnitCode);//摄入量代码		
			pst.setString(30, dischargeUnitCode);//排除单位代码		
			pst.setString(31, allDischargeUnitCode);//所有排出单位代码		
			pst.setDouble(32, waistCircumference);//腰围		
			pst.setString(33, definedItemCodes);//自定义项目代码集合		
			pst.setString(34, weightDesc);//体重描述		
			pst.setString(35, stoolTimesDesc);//大便次数描述		
			pst.setString(36, urineVolumeDesc);//尿量描述	
			pst.setString(37, ipid); //住院流水号 key
//			pst.setString(++index, eleID);//附加项 2--血压2 3--血压3	
//			pst.setString(++index, eleValue);//附加项的值
		
		//pst.setString(++index, manageType);//处理类型（1-新增 2-修改 3-删除）
		
		return pst;
	}
	public PreparedStatement makeDelSt(PreparedStatement pst)
	throws SQLException {
		int index = 0;
		pst.setString(++index, ipid); //住院流水号 key
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
