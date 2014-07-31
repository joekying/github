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
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用INSERT预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, temperEleSn); //体温单元素流水号 key
		pst.setString(++index, ipid); //住院流水号 key
		pst.setString(++index, measureDate); //测量日期 key
		pst.setString(++index, pid);//病人ID
		pst.setString(++index, eleID); //元素ID
		pst.setString(++index, eleName);//元素名
		pst.setString(++index, eleValue);//元素值
		pst.setString(++index, eleFloatValue);//元素数值
		pst.setString(++index, md5Content); //md5编码
		pst.setString(++index, skinTestResult); //皮试结果
		pst.setString(++index, ordinal);//排序码
		
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
		
			pst.setString(1, temperEleSn); //体温单元素流水号 key
			pst.setString(2, ipid); //住院流水号 key		
			pst.setString(3, measureDate); //测量日期 key		
			pst.setString(4, pid);//病人ID		
			pst.setString(5, eleID); //元素ID		
			pst.setString(6, eleName);//元素名		
			pst.setString(7, eleValue);//元素值		
			pst.setString(8, eleFloatValue);//元素数值		
			pst.setString(9, md5Content); //md5编码		
			pst.setString(10, skinTestResult); //皮试结果		
			pst.setString(11, ordinal);//排序码
		return pst;
	}
	/**
	 * 删除
	 * @param pst
	 * @return
	 * @throws SQLException
	 */
	public PreparedStatement makeDelSt(PreparedStatement pst)
	throws SQLException {
		int index = 0;
		pst.setString(++index, ipid); //住院流水号 key
		pst.setString(++index, measureDate); //测量日期 key
		pst.setString(++index, eleID); //元素ID
		
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
