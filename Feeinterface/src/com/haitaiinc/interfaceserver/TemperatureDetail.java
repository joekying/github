package com.haitaiinc.interfaceserver;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.haitaiinc.ICommon.DataUtil;

public class TemperatureDetail extends com.haitaiinc.struct.TemperatureDetail {
	public static final String INSERT ="insert into INPTEMPER.TEMPERATURE_DETAIL  (IPID,MEASURE_DATE,MEASURE_TIME,PID,TEMPER,TEMPER_TYPE,TEMPER_AGAIN,TEMPER_DOWN,TEMPER_UP,IS_MEASURE,PULSE,PULSE_FLAG,BREATH,BREATH_FLAG,HR,HR_FLAG,TOP_REMARKS,BOTTOM_REMARKS,DEPT_CODE,DEPT_NAME,WARD_CODE,WARD_NAME)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE ="update INPTEMPER.TEMPERATURE_DETAIL  set MEASURE_DATE=?,MEASURE_TIME=?,PID=?,TEMPER=?,TEMPER_TYPE=?,TEMPER_AGAIN=?,TEMPER_DOWN=?,TEMPER_UP=?,IS_MEASURE=?,PULSE=?,PULSE_FLAG=?,BREATH=?,BREATH_FLAG=?,HR=?,HR_FLAG=?,TOP_REMARKS=?,BOTTOM_REMARKS=?,DEPT_CODE=?,DEPT_NAME=?,WARD_CODE=?,WARD_NAME=? where IPID=? ";
	public static final String SELECT ="select RecordFlow,IPID,MEASURE_DATE,MEASURE_TIME,PID,TEMPER,TEMPER_TYPE,TEMPER_AGAIN,TEMPER_DOWN,TEMPER_UP,IS_MEASURE,PULSE,PULSE_FLAG,BREATH,BREATH_FLAG,HR,HR_FLAG,TOP_REMARKS,BOTTOM_REMARKS,DEPT_CODE,DEPT_NAME,WARD_CODE,WARD_NAME,ManageType from TEMPERATURE_DETAIL";
	public static final String DELETE="delete from INPTEMPER.TEMPERATURE_DETAIL where IPID=?";

	public void fetchTemperatureDetail(ResultSet rs)throws Exception{
		//recordflow = rs.getString("RecordFlow"); //记录流水号
		recordflow = rs.getInt("RecordFlow");
		ipid = rs.getString("IPID"); //住院流水号 key
		//measureDate=DataUtil.transDateTime( rs.getString("MEASURE_DATE"), "yyyy-MM-dd", "yyyyMMdd");//测量日期 key
		measureDate = rs.getString("MEASURE_DATE"); //测量日期 key
		measureTime = rs.getString("MEASURE_TIME"); //测量时间 key
		pid = rs.getString("PID"); //病人ID
//		String temper_temp=rs.getString("TEMPER"); //体温
//		if(temper_temp!=null){
//			temper=Double.valueOf(temper_temp);
//		}
		temper = rs.getDouble("TEMPER"); //体温
		temperType = rs.getString("TEMPER_TYPE"); //体温类型【E：耳温；G：肛温；K：口温（默认）；Y：腋温】
		String temperAgain_temp=rs.getString("TEMPER_AGAIN");  //复试体温
		if(temperAgain_temp!=null){
			temperAgain=Double.valueOf(temperAgain_temp);
		}
		//temperAgain = rs.getDouble("TEMPER_AGAIN");  //复试体温
		String temperDown_temp=rs.getString("TEMPER_DOWN");  //降温后体温
		if(temperDown_temp!=null){
			temperDown=Double.valueOf(temperDown_temp);
		}
		//temperDown= rs.getDouble("TEMPER_DOWN");  //降温后体温
		String temperUp_temp=rs.getString("TEMPER_UP");  //发热的体温
		if(temperUp_temp!=null){
			temperUp=Double.valueOf(temperUp_temp);
		}
		//temperUp= rs.getDouble("TEMPER_UP");  //发热的体温
		isMeasure = rs.getString("IS_MEASURE"); //是否是正常测量【N：否；Y：是】
		String pulse_temp= rs.getString("PULSE"); //脉搏
		if(pulse_temp!=null){
			pulse=Integer.parseInt(pulse_temp);
		}
		//pulse = rs.getInt("PULSE"); //脉搏
		pulseFlag = rs.getString("PULSE_FLAG"); //脉搏短绌标志【N：否（默认）；Y：是】
		String breath_temp=rs.getString("BREATH"); //呼吸
		if(breath_temp!=null){
			breath=Integer.parseInt(breath_temp);
		}
		//breath = rs.getInt("BREATH"); //呼吸
		breathFlag = rs.getString("BREATH_FLAG");//呼吸机注释位【N：否（默认）；Y：是】
		String hr_temp=rs.getString("HR");//心率
		if(hr_temp!=null){
			hr=	Integer.parseInt(hr_temp);
		}
		//hr = rs.getInt("HR");//心率
		hrFlag = rs.getString("HR_FLAG");//起搏心率标志【N：否（默认）；Y：是】
		topRemarks = rs.getString("TOP_REMARKS"); //上注释
		bottomRemarks = rs.getString("BOTTOM_REMARKS"); //下注释
		deptCode = rs.getString("DEPT_CODE");//部门(科室)代码
		deptName = rs.getString("DEPT_NAME"); //部门(科室)名称
		wardCode = rs.getString("WARD_CODE"); //病区代码
		wardName = rs.getString("WARD_NAME"); //病区名称
		manageType = rs.getString("ManageType");//处理类型（1-新增 2-修改 3-删除）
	    
	}
	/**
	 * Method makeInsSt.
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用INSERT预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		//pst.setString(++index, recordflow); //记录流水号
		if(measureDate.equals("0")||measureDate==null){
			pst.setNull(1, java.sql.Types.VARCHAR);
		}else{
			pst.setString(1, measureDate); //测量日期 key
		}
		if(measureTime.equals("0")||measureTime==null){
			pst.setNull(2, java.sql.Types.VARCHAR);
		}else{

			pst.setString(2, measureTime);//测量时间 key
		}

		if(pid.equals("0")||pid==null){
			pst.setNull(3, java.sql.Types.VARCHAR);
		}else{

			pst.setString(3, pid); //病人ID
		}
		if(temper==0.0){
			pst.setNull(4, java.sql.Types.DOUBLE);
		}else{

			pst.setDouble(4, temper);//体温
		}
		if(temperType.equals("0")||temperType==null){
			pst.setNull(5, java.sql.Types.VARCHAR);
		}else{
			pst.setString(5, temperType);//体温类型【E：耳温；G：肛温；K：口温（默认）；Y：腋温】
		}
		if(temperAgain==0.0){
			pst.setNull(6, java.sql.Types.DOUBLE);
		}else{

			pst.setDouble(6, temperAgain);//复试体温
		}
		if(temperDown==0.0){
			pst.setNull(7, java.sql.Types.DOUBLE);
		}else{
			pst.setDouble(7, temperDown); //降温后体温
		}
		if(temperUp==0.0){
			pst.setNull(8, java.sql.Types.DOUBLE);
		}else{
			pst.setDouble(8, temperUp); //发热的体温
		}
		if(isMeasure.equals("0")||isMeasure==null){
			pst.setNull(9, java.sql.Types.VARCHAR);
		}else{
			pst.setString(9, isMeasure);//是否是正常测量【N：否；Y：是】
		}
		if(pulse==0){
			pst.setNull(10, java.sql.Types.INTEGER);
		}else{
			pst.setInt(10, pulse); //脉搏
		}
		if(pulseFlag.equals("0")||pulseFlag==null){
			pst.setNull(11, java.sql.Types.VARCHAR);
		}else{
			
			pst.setString(11, pulseFlag);//脉搏短绌标志【N：否（默认）；Y：是】
		}
		if(breath==0){
			pst.setNull(12, java.sql.Types.INTEGER);
		}else{
			pst.setInt(12, breath);//呼吸
		}
		if(breathFlag.equals("0")||breathFlag==null){
			pst.setNull(13, java.sql.Types.VARCHAR);
		}else{
			pst.setString(13, breathFlag);//呼吸机注释位【N：否（默认）；Y：是】
		}
		if(hr==0){
			pst.setNull(14, java.sql.Types.INTEGER);
		}else{
			pst.setInt(14, hr);//心率
		}
		if(hrFlag.equals("0")||hrFlag==null){
			pst.setNull(15, java.sql.Types.VARCHAR);
		}else{
			pst.setString(15, hrFlag);//起搏心率标志【N：否（默认）；Y：是】
		}
		if(topRemarks.equals("0")||topRemarks==null){
			pst.setNull(16, java.sql.Types.VARCHAR);
		}else{
			pst.setString(16, topRemarks);//上注释
		}
		if(bottomRemarks.equals("0")||bottomRemarks==null){
			pst.setNull(17, java.sql.Types.VARCHAR);
		}else{
			pst.setString(17, bottomRemarks);//下注释
		}
		if(deptCode.equals("0")||deptCode==null){
			pst.setNull(18, java.sql.Types.VARCHAR);
		}else{
			pst.setString(18, deptCode);//部门(科室)代码
		}
		if(deptName.equals("0")||deptName==null){
			pst.setNull(19, java.sql.Types.VARCHAR);
		}else{
			pst.setString(19, deptName);//部门(科室)名称
		}
		if(wardCode.equals("0")||wardCode==null){
			pst.setNull(20, java.sql.Types.VARCHAR);
		}else{
			pst.setString(20, wardCode);//病区代码
		}
		if(wardName.equals("0")||wardName==null){
			pst.setNull(21, java.sql.Types.VARCHAR);
		}else{
			pst.setString(21, wardName);//病区名称
		}
		if(ipid.equals("0")||ipid==null){
			pst.setNull(22, java.sql.Types.VARCHAR);
		}else{
			pst.setString(22, ipid); //住院流水号 key
		}
		
		//pst.setString(++index, manageType);//处理类型（1-新增 2-修改 3-删除）
		return pst;
	}
	
	/**
	 * Method makeInsSt.
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用UPDATE预处理好的PreparedStatement
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
		pst.setString(++index, measureTime);//测量时间 key
		pst.setString(++index, pid); //病人ID
		try{
			pst.setDouble(++index, temper);//体温
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, temperType);//体温类型【E：耳温；G：肛温；K：口温（默认）；Y：腋温】
		try{
			pst.setDouble(++index, temperAgain);//复试体温
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, temperDown); //降温后体温
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, temperUp); //发热的体温
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, isMeasure);//是否是正常测量【N：否；Y：是】
		try{
			pst.setInt(++index, pulse); //脉搏
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, pulseFlag);//脉搏短绌标志【N：否（默认）；Y：是】
		try{
			pst.setInt(++index, breath);//呼吸
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, breathFlag);//呼吸机注释位【N：否（默认）；Y：是】
		try{
			pst.setInt(++index, hr);//心率
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, hrFlag);//起搏心率标志【N：否（默认）；Y：是】
		pst.setString(++index, topRemarks);//上注释
		pst.setString(++index, bottomRemarks);//下注释
		pst.setString(++index, deptCode);//部门(科室)代码
		pst.setString(++index, deptName);//部门(科室)名称
		pst.setString(++index, wardCode);//病区代码
		pst.setString(++index, wardName);//病区名称
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
		String sql="update INPTEMPER.TEMPERATURE_DETAIL   set ";
		if(pid!=null){
			if(pid.equals(""))
			{}else{
				sql+=" PID='"+pid+"',";	
			}
				
		}
		if(temper!=null){
			if(temper.toString().equals("")){
				
			}else{
				sql+=" TEMPER='"+temper+"',";	
			}		
		}
		if(temperType!=null){
			if(temperType.equals("")){
				
			}else{
				sql+=" TEMPER_TYPE='"+temperType+"',";
			}		
		}
		if(temperAgain!=null){
			if(temperAgain.toString().equals("")){
				
			}else{
				sql+=" TEMPER_AGAIN='"+temperAgain+"',";
			}		
		}
		if(temperDown!=null){
			if(temperDown.toString().equals("")){
				
			}else{
				sql+=" TEMPER_DOWN='"+temperDown+"',";
			}		
		}
		if(temperUp!=null){
			if(temperUp.toString().equals("")){
				
			}else{
				sql+=" TEMPER_UP='"+temperUp+"',";	
			}	
		}
		if(isMeasure!=null){
			if(isMeasure.equals("")){
				
			}else{
				sql+=" IS_MEASURE='"+isMeasure+"',";
			}		
		}
		if(pulse!=null){
			if(pulse.equals("")){
				
			}else{
				sql+=" PULSE='"+pulse+"',";
			}			
		}
		if(pulseFlag!=null){
			if(pulseFlag.equals("")){
				
			}else{
				sql+=" PULSE_FLAG='"+pulseFlag+"',";
			}	
		}
		if(breath!=null){
			if(breath.equals("")){
				
			}else{
				sql+=" BREATH='"+breath+"',";	
			}	
		}
		if(breathFlag!=null){
			if(breathFlag.equals("")){
				
			}else{
				sql+=" BREATH_FLAG='"+breathFlag+"',";
			}		
		}
		if(hr!=null){
			if(hr.equals("")){
				
			}else{
				sql+=" HR='"+hr+"',";
			}			
		}
		if(hrFlag!=null){
			if(hrFlag.equals("")){
				
			}else{
				sql+=" HR_FLAG='"+hrFlag+"',";
			}		
		}
		if(topRemarks!=null){
			if(topRemarks.equals("")){
				
			}else{
				sql+=" TOP_REMARKS='"+topRemarks+"',";
			}		
		}
		if(bottomRemarks!=null){
			if(bottomRemarks.equals("")){
				
			}else{
				sql+=" BOTTOM_REMARKS='"+bottomRemarks+"',";
			}			
		}
		if(deptCode!=null){
			if(deptCode.equals("")){
				
			}else{
				sql+=" DEPT_CODE='"+deptCode+"',";	
			}	
		}
		if(deptName!=null){
			if(deptName.equals("")){
				
			}else{
				sql+=" DEPT_NAME='"+deptName+"',";	
			}
				
		}
		if(wardCode!=null){
			if(wardCode.equals("")){
				
			}else{
				sql+=" WARD_CODE='"+wardCode+"',";	
			}		
		}
		if(wardName!=null){
			if(wardName.equals("")){
				
			}else{
				sql+=" WARD_NAME='"+wardName+"',";		
			}
		}

		sql=sql.substring(0,sql.length()-1);
		sql+=" where IPID='"+ipid+"' and MEASURE_DATE='"+measureDate+"' and MEASURE_TIME='"+measureTime+"'";
		return sql;
	}
}
