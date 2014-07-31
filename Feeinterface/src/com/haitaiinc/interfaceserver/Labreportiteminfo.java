package com.haitaiinc.interfaceserver;

import java.sql.*;

import com.haitaiinc.utils.StringUtil;

/**
 * @author haitaiinc
 * LabReportItemInfo
 */
public class Labreportiteminfo
		extends com.haitaiinc.struct.Labreportiteminfo{

	public static final String INSERT =
		"insert into LabReportItemInfo(RecordItemFlow,RecordFlow,LAB_ITEM_RCD_FLOW,LAB_FLOW,PID,IPID,LAB_REPITEM_CODE,LAB_REPITEM_NAME,LAB_REPITEM_OTHER_NAME,RESULT_TYPE,RESULT_NUM,RESULT_TEXT,LOWER_LIMIT1,UPPER_LIMIT1,REFERENCE_TEXT,LAB_REPITEM_UNIT_CODE,LAB_REPITEM_UNIT,DANGER_FLAG,CHANGE_FLAG)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String UPDATE =
		"update LabReportItemInfo set RecordFlow=?,LAB_ITEM_RCD_FLOW=?,LAB_FLOW=?,PID=?,IPID=?,LAB_REPITEM_CODE=?,LAB_REPITEM_NAME=?,LAB_REPITEM_OTHER_NAME=?,RESULT_TYPE=?,RESULT_NUM=?,RESULT_TEXT=?,LOWER_LIMIT1=?,UPPER_LIMIT1=?,REFERENCE_TEXT=?,LAB_REPITEM_UNIT_CODE=?,LAB_REPITEM_UNIT=?,DANGER_FLAG=?,CHANGE_FLAG=? where RecordItemFlow=?";

	public static final String SELECT =
		"select RecordItemFlow,RecordFlow,LAB_ITEM_RCD_FLOW,LAB_FLOW,PID,IPID,LAB_REPITEM_CODE,LAB_REPITEM_NAME,LAB_REPITEM_OTHER_NAME,RESULT_TYPE,RESULT_NUM,RESULT_TEXT,LOWER_LIMIT1,UPPER_LIMIT1,REFERENCE_TEXT,LAB_REPITEM_UNIT_CODE,LAB_REPITEM_UNIT,DANGER_FLAG,CHANGE_FLAG from LabReportItemInfo ";

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
		pst.setString(++index, recorditemflow); //子表记录流水号 必填	key
		pst.setString(++index, recordflow); //对应的主表记录流水号 必填
		pst.setString(++index, labItemRcdFlow); //检验项目值记录流水号必填
		pst.setString(++index, labFlow); //检验流水号必填
		pst.setString(++index, pid); //病人ID
		pst.setString(++index, ipid); //住院流水号
		pst.setString(++index, labRepitemCode); //检验报告项目代码
		pst.setString(++index, labRepitemName); //检验报告项目名称
		pst.setString(++index, labRepitemOtherName); //检验项目其它名称
		pst.setString(++index, resultType); //结果值类型【N：数值；O：选项；T：文本】
		try {
			pst.setFloat(++index, Float.parseFloat(resultNum)); //结果值_数值
		}
		catch(Exception e) {
			pst.setNull(index, java.sql.Types.FLOAT);//结果值_数值
		}
		pst.setString(++index, resultText); //结果值_文本【：一定有内容】
		try {
			pst.setFloat(++index, Float.parseFloat(lowerLimit1)); //参考组1_最小值
		}
		catch(Exception e) {
			pst.setNull(index, java.sql.Types.FLOAT);//参考组1_最小值
		}
		try {
			pst.setFloat(++index, Float.parseFloat(upperLimit1)); //参考组1_最大值
		}
		catch(Exception e) {
			pst.setNull(index, java.sql.Types.FLOAT);//参考组1_最大值
		}
		pst.setString(++index, referenceText); //参考文本【：最大值最小值拼在一起或阴性、阳性等】
		pst.setString(++index, labRepitemUnitCode); //检验项目单位代码
		pst.setString(++index, labRepitemUnit); //检验项目单位
		pst.setString(++index, dangerFlag); //危急值标志【N：否；Y：是】
		pst.setString(++index, changeFlag); //变化标志【：上箭头或下箭头】
		return pst;
	}

	/**
	 * Method makeUpdSt.
	 * 生成修改操作的PreparedStatement
	 * @param pst 使用UPDATE预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, recordflow); //对应的主表记录流水号 必填
		pst.setString(++index, labItemRcdFlow); //检验项目值记录流水号必填
		pst.setString(++index, labFlow); //检验流水号必填
		pst.setString(++index, pid); //病人ID
		pst.setString(++index, ipid); //住院流水号
		pst.setString(++index, labRepitemCode); //检验报告项目代码
		pst.setString(++index, labRepitemName); //检验报告项目名称
		pst.setString(++index, labRepitemOtherName); //检验项目其它名称
		pst.setString(++index, resultType); //结果值类型【N：数值；O：选项；T：文本】
		try {
			pst.setFloat(++index, Float.parseFloat(resultNum)); //结果值_数值
		}
		catch(Exception e) {
			pst.setNull(index, java.sql.Types.FLOAT);//结果值_数值
		}
		pst.setString(++index, resultText); //结果值_文本【：一定有内容】
		try {
			pst.setFloat(++index, Float.parseFloat(lowerLimit1)); //参考组1_最小值
		}
		catch(Exception e) {
			pst.setNull(index, java.sql.Types.FLOAT);//参考组1_最小值
		}
		try {
			pst.setFloat(++index, Float.parseFloat(upperLimit1)); //参考组1_最大值
		}
		catch(Exception e) {
			pst.setNull(index, java.sql.Types.FLOAT);//参考组1_最大值
		}
		pst.setString(++index, referenceText); //参考文本【：最大值最小值拼在一起或阴性、阳性等】
		pst.setString(++index, labRepitemUnitCode); //检验项目单位代码
		pst.setString(++index, labRepitemUnit); //检验项目单位
		pst.setString(++index, dangerFlag); //危急值标志【N：否；Y：是】
		pst.setString(++index, changeFlag); //变化标志【：上箭头或下箭头】
		pst.setString(++index, recorditemflow); //子表记录流水号 必填	key
		return pst;
	}

	/**
	 * Method makeSearchSql.
	 * 生成已设置过值的属性为查询条件组成的sql语句
	 * @return String
	 */
	public String makeSearchSql() {
		String sql=SELECT;
		String par = "";
		String temp = null;
		if (!isnull(recorditemflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordItemFlow" + recorditemflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recorditemflow, "'", "''"));
			par += temp;
		}
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(labItemRcdFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_ITEM_RCD_FLOW" + labItemRcdFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labItemRcdFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(labFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_FLOW" + labFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PID" + pidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(pid, "'", "''"));
			par += temp;
		}
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IPID" + ipidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(ipid, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_CODE" + labRepitemCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_NAME" + labRepitemNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemName, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemOtherName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_OTHER_NAME" + labRepitemOtherNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemOtherName, "'", "''"));
			par += temp;
		}
		if (!isnull(resultType)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_TYPE" + resultTypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultType, "'", "''"));
			par += temp;
		}
		if (!isnull(resultNum)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_NUM" + resultNumOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultNum, "'", "''"));
			par += temp;
		}
		if (!isnull(resultText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_TEXT" + resultTextOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultText, "'", "''"));
			par += temp;
		}
		if (!isnull(lowerLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LOWER_LIMIT1" + lowerLimit1Oper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(lowerLimit1, "'", "''"));
			par += temp;
		}
		if (!isnull(upperLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "UPPER_LIMIT1" + upperLimit1Oper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(upperLimit1, "'", "''"));
			par += temp;
		}
		if (!isnull(referenceText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "REFERENCE_TEXT" + referenceTextOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(referenceText, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemUnitCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_UNIT_CODE" + labRepitemUnitCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemUnitCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemUnit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_UNIT" + labRepitemUnitOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemUnit, "'", "''"));
			par += temp;
		}
		if (!isnull(dangerFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DANGER_FLAG" + dangerFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dangerFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(changeFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CHANGE_FLAG" + changeFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(changeFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(par))
			sql += " WHERE " + par;
		if (!isnull(orderByStr))
			sql += " order by " + orderByStr;
		return sql;
	}

	/**
	 * Method makeSearchPst.
	 * 生成已设置过值的属性为查询条件组成的pst
	 * @param conn 数据库链接
	 * @return pst
	 */
	public PreparedStatement makeSearchPst(Connection conn) throws Exception {
		String sql=SELECT;
		String par = "";
		String temp = null;
		if (!isnull(recorditemflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordItemFlow" + recorditemflowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labItemRcdFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_ITEM_RCD_FLOW" + labItemRcdFlowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_FLOW" + labFlowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PID" + pidOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IPID" + ipidOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepitemCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_CODE" + labRepitemCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepitemName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_NAME" + labRepitemNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepitemOtherName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_OTHER_NAME" + labRepitemOtherNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(resultType)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_TYPE" + resultTypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(resultNum)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_NUM" + resultNumOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(resultText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_TEXT" + resultTextOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(lowerLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LOWER_LIMIT1" + lowerLimit1Oper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(upperLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "UPPER_LIMIT1" + upperLimit1Oper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(referenceText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "REFERENCE_TEXT" + referenceTextOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepitemUnitCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_UNIT_CODE" + labRepitemUnitCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepitemUnit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_UNIT" + labRepitemUnitOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(dangerFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DANGER_FLAG" + dangerFlagOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(changeFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CHANGE_FLAG" + changeFlagOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(par))
			sql += " WHERE " + par;
		if (!isnull(orderByStr))
			sql += " order by " + orderByStr;
		PreparedStatement pst = conn.prepareStatement(sql);
		int idx=0;
		if (!isnull(recorditemflow)) {
			if(!(recorditemflowOper.equals(ISNULL) ||recorditemflowOper.equals(NOTISNULL))){
				pst.setString(++idx, recorditemflow);
			}
		}
		if (!isnull(recordflow)) {
			if(!(recordflowOper.equals(ISNULL) ||recordflowOper.equals(NOTISNULL))){
				pst.setString(++idx, recordflow);
			}
		}
		if (!isnull(labItemRcdFlow)) {
			if(!(labItemRcdFlowOper.equals(ISNULL) ||labItemRcdFlowOper.equals(NOTISNULL))){
				pst.setString(++idx, labItemRcdFlow);
			}
		}
		if (!isnull(labFlow)) {
			if(!(labFlowOper.equals(ISNULL) ||labFlowOper.equals(NOTISNULL))){
				pst.setString(++idx, labFlow);
			}
		}
		if (!isnull(pid)) {
			if(!(pidOper.equals(ISNULL) ||pidOper.equals(NOTISNULL))){
				pst.setString(++idx, pid);
			}
		}
		if (!isnull(ipid)) {
			if(!(ipidOper.equals(ISNULL) ||ipidOper.equals(NOTISNULL))){
				pst.setString(++idx, ipid);
			}
		}
		if (!isnull(labRepitemCode)) {
			if(!(labRepitemCodeOper.equals(ISNULL) ||labRepitemCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepitemCode);
			}
		}
		if (!isnull(labRepitemName)) {
			if(!(labRepitemNameOper.equals(ISNULL) ||labRepitemNameOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepitemName);
			}
		}
		if (!isnull(labRepitemOtherName)) {
			if(!(labRepitemOtherNameOper.equals(ISNULL) ||labRepitemOtherNameOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepitemOtherName);
			}
		}
		if (!isnull(resultType)) {
			if(!(resultTypeOper.equals(ISNULL) ||resultTypeOper.equals(NOTISNULL))){
				pst.setString(++idx, resultType);
			}
		}
		if (!isnull(resultNum)) {
			if(!(resultNumOper.equals(ISNULL) ||resultNumOper.equals(NOTISNULL))){
				pst.setFloat(++idx, Float.parseFloat(resultNum));
			}
		}
		if (!isnull(resultText)) {
			if(!(resultTextOper.equals(ISNULL) ||resultTextOper.equals(NOTISNULL))){
				pst.setString(++idx, resultText);
			}
		}
		if (!isnull(lowerLimit1)) {
			if(!(lowerLimit1Oper.equals(ISNULL) ||lowerLimit1Oper.equals(NOTISNULL))){
				pst.setFloat(++idx, Float.parseFloat(lowerLimit1));
			}
		}
		if (!isnull(upperLimit1)) {
			if(!(upperLimit1Oper.equals(ISNULL) ||upperLimit1Oper.equals(NOTISNULL))){
				pst.setFloat(++idx, Float.parseFloat(upperLimit1));
			}
		}
		if (!isnull(referenceText)) {
			if(!(referenceTextOper.equals(ISNULL) ||referenceTextOper.equals(NOTISNULL))){
				pst.setString(++idx, referenceText);
			}
		}
		if (!isnull(labRepitemUnitCode)) {
			if(!(labRepitemUnitCodeOper.equals(ISNULL) ||labRepitemUnitCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepitemUnitCode);
			}
		}
		if (!isnull(labRepitemUnit)) {
			if(!(labRepitemUnitOper.equals(ISNULL) ||labRepitemUnitOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepitemUnit);
			}
		}
		if (!isnull(dangerFlag)) {
			if(!(dangerFlagOper.equals(ISNULL) ||dangerFlagOper.equals(NOTISNULL))){
				pst.setString(++idx, dangerFlag);
			}
		}
		if (!isnull(changeFlag)) {
			if(!(changeFlagOper.equals(ISNULL) ||changeFlagOper.equals(NOTISNULL))){
				pst.setString(++idx, changeFlag);
			}
		}
		return pst;
	}

	/**
	 * Method fetchCommonCode.
	 * 将使用SELECT得到的结果集里的值传到当前对象的对应属性中
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchLabreportiteminfo(ResultSet rs) throws SQLException {
		recorditemflow = rs.getString("RecordItemFlow"); //子表记录流水号 必填	key
		recordflow = rs.getString("RecordFlow"); //对应的主表记录流水号 必填
		labItemRcdFlow = rs.getString("LAB_ITEM_RCD_FLOW"); //检验项目值记录流水号必填
		labFlow = rs.getString("LAB_FLOW"); //检验流水号必填
		pid = rs.getString("PID"); //病人ID
		ipid = rs.getString("IPID"); //住院流水号
		labRepitemCode = rs.getString("LAB_REPITEM_CODE"); //检验报告项目代码
		labRepitemName = rs.getString("LAB_REPITEM_NAME"); //检验报告项目名称
		labRepitemOtherName = rs.getString("LAB_REPITEM_OTHER_NAME"); //检验项目其它名称
		resultType = rs.getString("RESULT_TYPE"); //结果值类型【N：数值；O：选项；T：文本】
		resultNum = rs.getString("RESULT_NUM"); //结果值_数值
		resultText = rs.getString("RESULT_TEXT"); //结果值_文本【：一定有内容】
		lowerLimit1 = rs.getString("LOWER_LIMIT1"); //参考组1_最小值
		upperLimit1 = rs.getString("UPPER_LIMIT1"); //参考组1_最大值
		referenceText = rs.getString("REFERENCE_TEXT"); //参考文本【：最大值最小值拼在一起或阴性、阳性等】
		labRepitemUnitCode = rs.getString("LAB_REPITEM_UNIT_CODE"); //检验项目单位代码
		labRepitemUnit = rs.getString("LAB_REPITEM_UNIT"); //检验项目单位
		dangerFlag = rs.getString("DANGER_FLAG"); //危急值标志【N：否；Y：是】
		changeFlag = rs.getString("CHANGE_FLAG"); //变化标志【：上箭头或下箭头】
	}

	/**
	 * Method makeCountItemSql.
	 * 生成已设置过值的属性为查询条件计算数据条数的sql语句
	 * @return String
	 */
	public String makeCountItemSql() {
		String sql = "select count(*) from LabReportItemInfo";
		String par = "";
		String temp = null;
		if (!isnull(recorditemflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordItemFlow" + recorditemflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recorditemflow, "'", "''"));
			par += temp;
		}
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(labItemRcdFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_ITEM_RCD_FLOW" + labItemRcdFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labItemRcdFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(labFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_FLOW" + labFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PID" + pidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(pid, "'", "''"));
			par += temp;
		}
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IPID" + ipidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(ipid, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_CODE" + labRepitemCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_NAME" + labRepitemNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemName, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemOtherName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_OTHER_NAME" + labRepitemOtherNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemOtherName, "'", "''"));
			par += temp;
		}
		if (!isnull(resultType)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_TYPE" + resultTypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultType, "'", "''"));
			par += temp;
		}
		if (!isnull(resultNum)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_NUM" + resultNumOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultNum, "'", "''"));
			par += temp;
		}
		if (!isnull(resultText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RESULT_TEXT" + resultTextOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultText, "'", "''"));
			par += temp;
		}
		if (!isnull(lowerLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LOWER_LIMIT1" + lowerLimit1Oper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(lowerLimit1, "'", "''"));
			par += temp;
		}
		if (!isnull(upperLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "UPPER_LIMIT1" + upperLimit1Oper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(upperLimit1, "'", "''"));
			par += temp;
		}
		if (!isnull(referenceText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "REFERENCE_TEXT" + referenceTextOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(referenceText, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemUnitCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_UNIT_CODE" + labRepitemUnitCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemUnitCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemUnit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REPITEM_UNIT" + labRepitemUnitOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemUnit, "'", "''"));
			par += temp;
		}
		if (!isnull(dangerFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DANGER_FLAG" + dangerFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dangerFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(changeFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CHANGE_FLAG" + changeFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(changeFlag, "'", "''"));
			par += temp;
		}
		if (par.length() > 0)
			sql += " WHERE " + par;
		return sql;
	}

	/**
	 * Method makeWhereSql.
	 * 生成已设置过值的属性为查询条件的sql语句，只含WHERE后面，不包括SELECT
	 * @return String
	 */
	public String makeWhereSql(String tablerealias) {
		if(tablerealias == null || tablerealias.trim().length() == 0) {
			tablerealias = "LabReportItemInfo";
		}
		String par = "";
		String temp = null;
		if (!isnull(recorditemflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RecordItemFlow" + recorditemflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recorditemflow, "'", "''"));
			par += temp;
		}
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(labItemRcdFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_ITEM_RCD_FLOW" + labItemRcdFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labItemRcdFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(labFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_FLOW" + labFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PID" + pidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(pid, "'", "''"));
			par += temp;
		}
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".IPID" + ipidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(ipid, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REPITEM_CODE" + labRepitemCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REPITEM_NAME" + labRepitemNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemName, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemOtherName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REPITEM_OTHER_NAME" + labRepitemOtherNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemOtherName, "'", "''"));
			par += temp;
		}
		if (!isnull(resultType)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RESULT_TYPE" + resultTypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultType, "'", "''"));
			par += temp;
		}
		if (!isnull(resultNum)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RESULT_NUM" + resultNumOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultNum, "'", "''"));
			par += temp;
		}
		if (!isnull(resultText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RESULT_TEXT" + resultTextOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(resultText, "'", "''"));
			par += temp;
		}
		if (!isnull(lowerLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LOWER_LIMIT1" + lowerLimit1Oper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(lowerLimit1, "'", "''"));
			par += temp;
		}
		if (!isnull(upperLimit1)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".UPPER_LIMIT1" + upperLimit1Oper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(upperLimit1, "'", "''"));
			par += temp;
		}
		if (!isnull(referenceText)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".REFERENCE_TEXT" + referenceTextOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(referenceText, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemUnitCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REPITEM_UNIT_CODE" + labRepitemUnitCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemUnitCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepitemUnit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REPITEM_UNIT" + labRepitemUnitOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepitemUnit, "'", "''"));
			par += temp;
		}
		if (!isnull(dangerFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DANGER_FLAG" + dangerFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dangerFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(changeFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".CHANGE_FLAG" + changeFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(changeFlag, "'", "''"));
			par += temp;
		}
		return par;
	}

	/**
	 * Method buildLabreportiteminfo，静态方法.
	 * 将struct中的父类对象转成当前子类对象
	 * @param labreportiteminfo 父类对象
	 * @return 子类对象
	 */
	public static Labreportiteminfo buildLabreportiteminfo(com.haitaiinc.struct.Labreportiteminfo labreportiteminfo) {
		Labreportiteminfo newLabreportiteminfo = new Labreportiteminfo();
		newLabreportiteminfo.setRecorditemflow(labreportiteminfo.getRecorditemflow());
		newLabreportiteminfo.setRecorditemflowOper(labreportiteminfo.getRecorditemflowOper());
		newLabreportiteminfo.setRecordflow(labreportiteminfo.getRecordflow());
		newLabreportiteminfo.setRecordflowOper(labreportiteminfo.getRecordflowOper());
		newLabreportiteminfo.setLabItemRcdFlow(labreportiteminfo.getLabItemRcdFlow());
		newLabreportiteminfo.setLabItemRcdFlowOper(labreportiteminfo.getLabItemRcdFlowOper());
		newLabreportiteminfo.setLabFlow(labreportiteminfo.getLabFlow());
		newLabreportiteminfo.setLabFlowOper(labreportiteminfo.getLabFlowOper());
		newLabreportiteminfo.setPid(labreportiteminfo.getPid());
		newLabreportiteminfo.setPidOper(labreportiteminfo.getPidOper());
		newLabreportiteminfo.setIpid(labreportiteminfo.getIpid());
		newLabreportiteminfo.setIpidOper(labreportiteminfo.getIpidOper());
		newLabreportiteminfo.setLabRepitemCode(labreportiteminfo.getLabRepitemCode());
		newLabreportiteminfo.setLabRepitemCodeOper(labreportiteminfo.getLabRepitemCodeOper());
		newLabreportiteminfo.setLabRepitemName(labreportiteminfo.getLabRepitemName());
		newLabreportiteminfo.setLabRepitemNameOper(labreportiteminfo.getLabRepitemNameOper());
		newLabreportiteminfo.setLabRepitemOtherName(labreportiteminfo.getLabRepitemOtherName());
		newLabreportiteminfo.setLabRepitemOtherNameOper(labreportiteminfo.getLabRepitemOtherNameOper());
		newLabreportiteminfo.setResultType(labreportiteminfo.getResultType());
		newLabreportiteminfo.setResultTypeOper(labreportiteminfo.getResultTypeOper());
		newLabreportiteminfo.setResultNum(labreportiteminfo.getResultNum());
		newLabreportiteminfo.setResultNumOper(labreportiteminfo.getResultNumOper());
		newLabreportiteminfo.setResultText(labreportiteminfo.getResultText());
		newLabreportiteminfo.setResultTextOper(labreportiteminfo.getResultTextOper());
		newLabreportiteminfo.setLowerLimit1(labreportiteminfo.getLowerLimit1());
		newLabreportiteminfo.setLowerLimit1Oper(labreportiteminfo.getLowerLimit1Oper());
		newLabreportiteminfo.setUpperLimit1(labreportiteminfo.getUpperLimit1());
		newLabreportiteminfo.setUpperLimit1Oper(labreportiteminfo.getUpperLimit1Oper());
		newLabreportiteminfo.setReferenceText(labreportiteminfo.getReferenceText());
		newLabreportiteminfo.setReferenceTextOper(labreportiteminfo.getReferenceTextOper());
		newLabreportiteminfo.setLabRepitemUnitCode(labreportiteminfo.getLabRepitemUnitCode());
		newLabreportiteminfo.setLabRepitemUnitCodeOper(labreportiteminfo.getLabRepitemUnitCodeOper());
		newLabreportiteminfo.setLabRepitemUnit(labreportiteminfo.getLabRepitemUnit());
		newLabreportiteminfo.setLabRepitemUnitOper(labreportiteminfo.getLabRepitemUnitOper());
		newLabreportiteminfo.setDangerFlag(labreportiteminfo.getDangerFlag());
		newLabreportiteminfo.setDangerFlagOper(labreportiteminfo.getDangerFlagOper());
		newLabreportiteminfo.setChangeFlag(labreportiteminfo.getChangeFlag());
		newLabreportiteminfo.setChangeFlagOper(labreportiteminfo.getChangeFlagOper());
		newLabreportiteminfo.setOrderByStr(labreportiteminfo.getOrderByStr());
		return newLabreportiteminfo;
	}
}
