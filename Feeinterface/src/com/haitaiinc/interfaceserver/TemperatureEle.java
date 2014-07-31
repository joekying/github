package com.haitaiinc.interfaceserver;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TemperatureEle extends com.haitaiinc.struct.TemperatureEle {
	public static final String INSERT ="insert into INPTEMPER.TEMPERATURE_ELE (TEMPER_ELE_SN,IPID,MEASURE_DATE,PID,ELE_ID,ELE_NAME,ELE_VALUE,ELE_FLOAT_VALUE,MD5_CONTENT,SKIN_TEST_RESULT,ORDINAL)values(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE ="update INPTEMPER.TEMPERATURE_ELE  set TEMPER_ELE_SN=?,PID=?,ELE_NAME=?,ELE_VALUE=?,ELE_FLOAT_VALUE=?,MD5_CONTENT=?,SKIN_TEST_RESULT=?,ORDINAL=? where  IPID=? and MEASURE_DATE=? and ELE_ID=?";
	public static final String SELECT ="select TEMPER_ELE_SN,IPID,MEASURE_DATE,PID,ELE_ID,ELE_NAME,ELE_VALUE,ELE_FLOAT_VALUE,MD5_CONTENT,SKIN_TEST_RESULT,ORDINAL from INPTEMPER.TEMPERATURE_ELE ";
	public static final String DELETE="delete from INPTEMPER.TEMPERATURE_ELE where IPID=? and MEASURE_DATE=? and ELE_ID=?";
	
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
		pst.setString(++index, temperEleSn); //���µ�Ԫ����ˮ�� key
		pst.setString(++index, ipid); //סԺ��ˮ�� key
		pst.setString(++index, measureDate); //�������� key
		pst.setString(++index, pid);//����ID
		pst.setString(++index, eleID); //Ԫ��ID
		pst.setString(++index, eleName);//Ԫ����
		pst.setString(++index, eleValue);//Ԫ��ֵ
		pst.setString(++index, eleFloatValue);//Ԫ����ֵ
		pst.setString(++index, md5Content); //md5����
		pst.setString(++index, skinTestResult); //Ƥ�Խ��
		pst.setString(++index, ordinal);//������
		
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
		
			pst.setString(1, temperEleSn); //���µ�Ԫ����ˮ�� key
			pst.setString(2, ipid); //סԺ��ˮ�� key		
			pst.setString(3, measureDate); //�������� key		
			pst.setString(4, pid);//����ID		
			pst.setString(5, eleID); //Ԫ��ID		
			pst.setString(6, eleName);//Ԫ����		
			pst.setString(7, eleValue);//Ԫ��ֵ		
			pst.setString(8, eleFloatValue);//Ԫ����ֵ		
			pst.setString(9, md5Content); //md5����		
			pst.setString(10, skinTestResult); //Ƥ�Խ��		
			pst.setString(11, ordinal);//������
		return pst;
	}
	/**
	 * ɾ��
	 * @param pst
	 * @return
	 * @throws SQLException
	 */
	public PreparedStatement makeDelSt(PreparedStatement pst)
	throws SQLException {
		int index = 0;
		pst.setString(++index, ipid); //סԺ��ˮ�� key
		pst.setString(++index, measureDate); //�������� key
		pst.setString(++index, eleID); //Ԫ��ID
		
		return pst;
	}

	
	public String makeUpdate(){
		String sql="update INPTEMPER.TEMPERATURE_ELE   set ";
		if(pid!=null||!pid.equals("")){
			sql+=" PID='"+pid+"',";		
		}
		if(eleID!=null||!eleID.equals("")){
			sql+=" ELE_ID='"+eleID+"',";		
		}
		if(eleName!=null||!eleName.equals("")){
			sql+=" ELE_NAME='"+eleName+"',";		
		}
		if(eleValue!=null||!eleValue.equals("")){
			sql+=" ELE_VALUE='"+eleValue+"',";		
		}
		if(eleFloatValue!=null||!eleFloatValue.equals("")){
			sql+=" ELE_FLOAT_VALUE='"+eleFloatValue+"',";		
		}
		if(md5Content!=null||!md5Content.equals("")){
			sql+=" MD5_CONTENT='"+md5Content+"',";		
		}
		if(skinTestResult!=null||!skinTestResult.equals("")){
			sql+=" SKIN_TEST_RESULT='"+skinTestResult+"',";		
		}
		if(ordinal!=null||!ordinal.equals("")){
			sql+=" ORDINAL='"+ordinal+"',";		
		}

		sql=sql.substring(0,sql.length()-1);
		sql+=" where TEMPER_ELE_SN='"+ipid+measureDate+eleID+"'";
		
		return sql;
	}
}
