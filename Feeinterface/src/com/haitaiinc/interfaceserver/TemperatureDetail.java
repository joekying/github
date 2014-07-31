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
		//recordflow = rs.getString("RecordFlow"); //��¼��ˮ��
		recordflow = rs.getInt("RecordFlow");
		ipid = rs.getString("IPID"); //סԺ��ˮ�� key
		//measureDate=DataUtil.transDateTime( rs.getString("MEASURE_DATE"), "yyyy-MM-dd", "yyyyMMdd");//�������� key
		measureDate = rs.getString("MEASURE_DATE"); //�������� key
		measureTime = rs.getString("MEASURE_TIME"); //����ʱ�� key
		pid = rs.getString("PID"); //����ID
//		String temper_temp=rs.getString("TEMPER"); //����
//		if(temper_temp!=null){
//			temper=Double.valueOf(temper_temp);
//		}
		temper = rs.getDouble("TEMPER"); //����
		temperType = rs.getString("TEMPER_TYPE"); //�������͡�E�����£�G�����£�K�����£�Ĭ�ϣ���Y��Ҹ�¡�
		String temperAgain_temp=rs.getString("TEMPER_AGAIN");  //��������
		if(temperAgain_temp!=null){
			temperAgain=Double.valueOf(temperAgain_temp);
		}
		//temperAgain = rs.getDouble("TEMPER_AGAIN");  //��������
		String temperDown_temp=rs.getString("TEMPER_DOWN");  //���º�����
		if(temperDown_temp!=null){
			temperDown=Double.valueOf(temperDown_temp);
		}
		//temperDown= rs.getDouble("TEMPER_DOWN");  //���º�����
		String temperUp_temp=rs.getString("TEMPER_UP");  //���ȵ�����
		if(temperUp_temp!=null){
			temperUp=Double.valueOf(temperUp_temp);
		}
		//temperUp= rs.getDouble("TEMPER_UP");  //���ȵ�����
		isMeasure = rs.getString("IS_MEASURE"); //�Ƿ�������������N����Y���ǡ�
		String pulse_temp= rs.getString("PULSE"); //����
		if(pulse_temp!=null){
			pulse=Integer.parseInt(pulse_temp);
		}
		//pulse = rs.getInt("PULSE"); //����
		pulseFlag = rs.getString("PULSE_FLAG"); //������穱�־��N����Ĭ�ϣ���Y���ǡ�
		String breath_temp=rs.getString("BREATH"); //����
		if(breath_temp!=null){
			breath=Integer.parseInt(breath_temp);
		}
		//breath = rs.getInt("BREATH"); //����
		breathFlag = rs.getString("BREATH_FLAG");//������ע��λ��N����Ĭ�ϣ���Y���ǡ�
		String hr_temp=rs.getString("HR");//����
		if(hr_temp!=null){
			hr=	Integer.parseInt(hr_temp);
		}
		//hr = rs.getInt("HR");//����
		hrFlag = rs.getString("HR_FLAG");//�����ʱ�־��N����Ĭ�ϣ���Y���ǡ�
		topRemarks = rs.getString("TOP_REMARKS"); //��ע��
		bottomRemarks = rs.getString("BOTTOM_REMARKS"); //��ע��
		deptCode = rs.getString("DEPT_CODE");//����(����)����
		deptName = rs.getString("DEPT_NAME"); //����(����)����
		wardCode = rs.getString("WARD_CODE"); //��������
		wardName = rs.getString("WARD_NAME"); //��������
		manageType = rs.getString("ManageType");//�������ͣ�1-���� 2-�޸� 3-ɾ����
	    
	}
	/**
	 * Method makeInsSt.
	 * ���ɲ��������PreparedStatement
	 * @param pst ʹ��INSERTԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		//pst.setString(++index, recordflow); //��¼��ˮ��
		if(measureDate.equals("0")||measureDate==null){
			pst.setNull(1, java.sql.Types.VARCHAR);
		}else{
			pst.setString(1, measureDate); //�������� key
		}
		if(measureTime.equals("0")||measureTime==null){
			pst.setNull(2, java.sql.Types.VARCHAR);
		}else{

			pst.setString(2, measureTime);//����ʱ�� key
		}

		if(pid.equals("0")||pid==null){
			pst.setNull(3, java.sql.Types.VARCHAR);
		}else{

			pst.setString(3, pid); //����ID
		}
		if(temper==0.0){
			pst.setNull(4, java.sql.Types.DOUBLE);
		}else{

			pst.setDouble(4, temper);//����
		}
		if(temperType.equals("0")||temperType==null){
			pst.setNull(5, java.sql.Types.VARCHAR);
		}else{
			pst.setString(5, temperType);//�������͡�E�����£�G�����£�K�����£�Ĭ�ϣ���Y��Ҹ�¡�
		}
		if(temperAgain==0.0){
			pst.setNull(6, java.sql.Types.DOUBLE);
		}else{

			pst.setDouble(6, temperAgain);//��������
		}
		if(temperDown==0.0){
			pst.setNull(7, java.sql.Types.DOUBLE);
		}else{
			pst.setDouble(7, temperDown); //���º�����
		}
		if(temperUp==0.0){
			pst.setNull(8, java.sql.Types.DOUBLE);
		}else{
			pst.setDouble(8, temperUp); //���ȵ�����
		}
		if(isMeasure.equals("0")||isMeasure==null){
			pst.setNull(9, java.sql.Types.VARCHAR);
		}else{
			pst.setString(9, isMeasure);//�Ƿ�������������N����Y���ǡ�
		}
		if(pulse==0){
			pst.setNull(10, java.sql.Types.INTEGER);
		}else{
			pst.setInt(10, pulse); //����
		}
		if(pulseFlag.equals("0")||pulseFlag==null){
			pst.setNull(11, java.sql.Types.VARCHAR);
		}else{
			
			pst.setString(11, pulseFlag);//������穱�־��N����Ĭ�ϣ���Y���ǡ�
		}
		if(breath==0){
			pst.setNull(12, java.sql.Types.INTEGER);
		}else{
			pst.setInt(12, breath);//����
		}
		if(breathFlag.equals("0")||breathFlag==null){
			pst.setNull(13, java.sql.Types.VARCHAR);
		}else{
			pst.setString(13, breathFlag);//������ע��λ��N����Ĭ�ϣ���Y���ǡ�
		}
		if(hr==0){
			pst.setNull(14, java.sql.Types.INTEGER);
		}else{
			pst.setInt(14, hr);//����
		}
		if(hrFlag.equals("0")||hrFlag==null){
			pst.setNull(15, java.sql.Types.VARCHAR);
		}else{
			pst.setString(15, hrFlag);//�����ʱ�־��N����Ĭ�ϣ���Y���ǡ�
		}
		if(topRemarks.equals("0")||topRemarks==null){
			pst.setNull(16, java.sql.Types.VARCHAR);
		}else{
			pst.setString(16, topRemarks);//��ע��
		}
		if(bottomRemarks.equals("0")||bottomRemarks==null){
			pst.setNull(17, java.sql.Types.VARCHAR);
		}else{
			pst.setString(17, bottomRemarks);//��ע��
		}
		if(deptCode.equals("0")||deptCode==null){
			pst.setNull(18, java.sql.Types.VARCHAR);
		}else{
			pst.setString(18, deptCode);//����(����)����
		}
		if(deptName.equals("0")||deptName==null){
			pst.setNull(19, java.sql.Types.VARCHAR);
		}else{
			pst.setString(19, deptName);//����(����)����
		}
		if(wardCode.equals("0")||wardCode==null){
			pst.setNull(20, java.sql.Types.VARCHAR);
		}else{
			pst.setString(20, wardCode);//��������
		}
		if(wardName.equals("0")||wardName==null){
			pst.setNull(21, java.sql.Types.VARCHAR);
		}else{
			pst.setString(21, wardName);//��������
		}
		if(ipid.equals("0")||ipid==null){
			pst.setNull(22, java.sql.Types.VARCHAR);
		}else{
			pst.setString(22, ipid); //סԺ��ˮ�� key
		}
		
		//pst.setString(++index, manageType);//�������ͣ�1-���� 2-�޸� 3-ɾ����
		return pst;
	}
	
	/**
	 * Method makeInsSt.
	 * ���ɲ��������PreparedStatement
	 * @param pst ʹ��UPDATEԤ����õ�PreparedStatement
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
		pst.setString(++index, measureTime);//����ʱ�� key
		pst.setString(++index, pid); //����ID
		try{
			pst.setDouble(++index, temper);//����
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, temperType);//�������͡�E�����£�G�����£�K�����£�Ĭ�ϣ���Y��Ҹ�¡�
		try{
			pst.setDouble(++index, temperAgain);//��������
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, temperDown); //���º�����
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		try{
			pst.setDouble(++index, temperUp); //���ȵ�����
		}catch(Exception e){
			pst.setNull(++index, Types.DOUBLE);
		}
		
		pst.setString(++index, isMeasure);//�Ƿ�������������N����Y���ǡ�
		try{
			pst.setInt(++index, pulse); //����
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, pulseFlag);//������穱�־��N����Ĭ�ϣ���Y���ǡ�
		try{
			pst.setInt(++index, breath);//����
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, breathFlag);//������ע��λ��N����Ĭ�ϣ���Y���ǡ�
		try{
			pst.setInt(++index, hr);//����
		}catch(Exception e){
			pst.setNull(++index, Types.INTEGER);
		}
		
		pst.setString(++index, hrFlag);//�����ʱ�־��N����Ĭ�ϣ���Y���ǡ�
		pst.setString(++index, topRemarks);//��ע��
		pst.setString(++index, bottomRemarks);//��ע��
		pst.setString(++index, deptCode);//����(����)����
		pst.setString(++index, deptName);//����(����)����
		pst.setString(++index, wardCode);//��������
		pst.setString(++index, wardName);//��������
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
