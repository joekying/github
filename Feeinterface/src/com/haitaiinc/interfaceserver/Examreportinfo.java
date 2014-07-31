package com.haitaiinc.interfaceserver;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import oracle.jdbc.OracleResultSet;
import oracle.sql.OPAQUE;
import oracle.xdb.XMLType;

import com.haitaiinc.utils.StringUtil;

/**
 * @author haitaiinc
 * ExamReportInfo
 */
public class Examreportinfo
		extends com.haitaiinc.struct.Examreportinfo{

	public static final String INSERT =
		"insert into ExamReportInfo(RecordFlow,EXAM_RPT_FLOW,ORDER_SN,PID,INOUT_FLAG,IPID,EXAM_CODE,EXAM_NAME,PERFORMED_DEPT_CODE,PERFORMED_DEPT,EXAM_ORDER_NAME,EXAM_DIAGNOSE,EXAM_RPT_CONT,EXAM_REPORTER_CODE,EXAM_REPORTER,EXAM_TIME,AUDIT_STATUS,AUDIT_USER_ID,AUDIT_USER_NAME,AUDIT_TIME,DANGER_FLAG,REMARK,APPLIER_ID,APPLIER,APPLIER_DEPT_CODE,APPLIER_DEPT,APPLY_TIME,ImpFlag,ReturnDesc)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String UPDATE =
		"update ExamReportInfo set EXAM_RPT_FLOW=?,ORDER_SN=?,PID=?,INOUT_FLAG=?,IPID=?,EXAM_CODE=?,EXAM_NAME=?,PERFORMED_DEPT_CODE=?,PERFORMED_DEPT=?,EXAM_ORDER_NAME=?,EXAM_DIAGNOSE=?,EXAM_RPT_CONT=?,EXAM_REPORTER_CODE=?,EXAM_REPORTER=?,EXAM_TIME=?,AUDIT_STATUS=?,AUDIT_USER_ID=?,AUDIT_USER_NAME=?,AUDIT_TIME=?,DANGER_FLAG=?,REMARK=?,APPLIER_ID=?,APPLIER=?,APPLIER_DEPT_CODE=?,APPLIER_DEPT=?,APPLY_TIME=?,ImpFlag=?,ReturnDesc=? where RecordFlow=?";

	public static final String SELECT =
		"select top 200 RecordFlow,EXAM_RPT_FLOW,ORDER_SN,PID,INOUT_FLAG,IPID,EXAM_CODE,EXAM_NAME,PERFORMED_DEPT_CODE,PERFORMED_DEPT,EXAM_ORDER_NAME,EXAM_DIAGNOSE,EXAM_RPT_CONT,EXAM_REPORTER_CODE,EXAM_REPORTER,EXAM_TIME,AUDIT_STATUS,AUDIT_USER_ID,AUDIT_USER_NAME,AUDIT_TIME,DANGER_FLAG,REMARK,APPLIER_ID,APPLIER,APPLIER_DEPT_CODE,APPLIER_DEPT,APPLY_TIME,ImpFlag,ReturnDesc from ExamReportInfo ";

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
		pst.setString(++index, recordflow); //记录流水号	key
		pst.setString(++index, examRptFlow); //检查报告流水号
		pst.setString(++index, orderSn); //对应的医嘱流水号
		pst.setString(++index, pid); //病人ID
		pst.setString(++index, inoutFlag); //住院门诊标记【i：住院；o：门诊】
		pst.setString(++index, ipid); //病人住院或门诊流水号
		pst.setString(++index, examCode); //检查类别代码
		pst.setString(++index, examName); //检查类别名称
		pst.setString(++index, performedDeptCode); //执行科室代码
		pst.setString(++index, performedDept); //执行科室
		pst.setString(++index, examOrderName); //检查医嘱项目名称
		pst.setString(++index, examDiagnose); //检查结论（诊断）
		pst.setString(++index, examRptCont); //检查报告详细内容
		pst.setString(++index, examReporterCode); //检查人ID
		pst.setString(++index, examReporter); //检查人姓名
		pst.setString(++index, examTime); //检查时间
		pst.setString(++index, auditStatus); //审核状态
		pst.setString(++index, auditUserId); //审核人ID号
		pst.setString(++index, auditUserName); //审核人姓名
		pst.setString(++index, auditTime); //审核时间
		pst.setString(++index, dangerFlag); //危急值标志【N：否；Y：是】
		pst.setString(++index, remark); //备注
		pst.setString(++index, applierId); //申请人代码
		pst.setString(++index, applier); //申请人
		pst.setString(++index, applierDeptCode); //申请科室代码
		pst.setString(++index, applierDept); //申请科室
		pst.setString(++index, applyTime); //申请时间
		pst.setString(++index, impflag); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		pst.setString(++index, returndesc); //反馈说明
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
		pst.setString(++index, examRptFlow); //检查报告流水号
		pst.setString(++index, orderSn); //对应的医嘱流水号
		pst.setString(++index, pid); //病人ID
		pst.setString(++index, inoutFlag); //住院门诊标记【i：住院；o：门诊】
		pst.setString(++index, ipid); //病人住院或门诊流水号
		pst.setString(++index, examCode); //检查类别代码
		pst.setString(++index, examName); //检查类别名称
		pst.setString(++index, performedDeptCode); //执行科室代码
		pst.setString(++index, performedDept); //执行科室
		pst.setString(++index, examOrderName); //检查医嘱项目名称
		pst.setString(++index, examDiagnose); //检查结论（诊断）
		pst.setString(++index, examRptCont); //检查报告详细内容
		pst.setString(++index, examReporterCode); //检查人ID
		pst.setString(++index, examReporter); //检查人姓名
		pst.setString(++index, examTime); //检查时间
		pst.setString(++index, auditStatus); //审核状态
		pst.setString(++index, auditUserId); //审核人ID号
		pst.setString(++index, auditUserName); //审核人姓名
		pst.setString(++index, auditTime); //审核时间
		pst.setString(++index, dangerFlag); //危急值标志【N：否；Y：是】
		pst.setString(++index, remark); //备注
		pst.setString(++index, applierId); //申请人代码
		pst.setString(++index, applier); //申请人
		pst.setString(++index, applierDeptCode); //申请科室代码
		pst.setString(++index, applierDept); //申请科室
		pst.setString(++index, applyTime); //申请时间
		pst.setString(++index, impflag); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		pst.setString(++index, returndesc); //反馈说明
		pst.setString(++index, recordflow); //记录流水号	key
		return pst;
	}

	/**
	 * Method makeSearchSql.
	 * 生成已设置过值的属性为查询条件组成的sql语句
	 * @return String
	 */
	public String makeSearchSql() {
		String sql=SELECT;
		String par = " impflag is null or impflag='' ";
		//String par="";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(examRptFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_RPT_FLOW" + examRptFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examRptFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(orderSn)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ORDER_SN" + orderSnOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(orderSn, "'", "''"));
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(inoutFlag, "'", "''"));
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
		if (!isnull(examCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_CODE" + examCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examCode, "'", "''"));
			par += temp;
		}
		if (!isnull(examName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_NAME" + examNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examName, "'", "''"));
			par += temp;
		}
		if (!isnull(performedDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PERFORMED_DEPT_CODE" + performedDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(performedDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(performedDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PERFORMED_DEPT" + performedDeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(performedDept, "'", "''"));
			par += temp;
		}
		if (!isnull(examOrderName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_ORDER_NAME" + examOrderNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examOrderName, "'", "''"));
			par += temp;
		}
		if (!isnull(examDiagnose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_DIAGNOSE" + examDiagnoseOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examDiagnose, "'", "''"));
			par += temp;
		}
		if (!isnull(examRptCont)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_RPT_CONT" + examRptContOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examRptCont, "'", "''"));
			par += temp;
		}
		if (!isnull(examReporterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_REPORTER_CODE" + examReporterCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examReporterCode, "'", "''"));
			par += temp;
		}
		if (!isnull(examReporter)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_REPORTER" + examReporterOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examReporter, "'", "''"));
			par += temp;
		}
		if (!isnull(examTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_TIME" + examTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examTime, "'", "''"));
			par += temp;
		}
		if (!isnull(auditStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_STATUS" + auditStatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditStatus, "'", "''"));
			par += temp;
		}
		if (!isnull(auditUserId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_USER_ID" + auditUserIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditUserId, "'", "''"));
			par += temp;
		}
		if (!isnull(auditUserName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_USER_NAME" + auditUserNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditUserName, "'", "''"));
			par += temp;
		}
		if (!isnull(auditTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_TIME" + auditTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditTime, "'", "''"));
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
		if (!isnull(remark)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "REMARK" + remarkOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(remark, "'", "''"));
			par += temp;
		}
		if (!isnull(applierId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_ID" + applierIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierId, "'", "''"));
			par += temp;
		}
		if (!isnull(applier)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER" + applierOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applier, "'", "''"));
			par += temp;
		}
		if (!isnull(applierDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_DEPT_CODE" + applierDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(applierDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_DEPT" + applierDeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierDept, "'", "''"));
			par += temp;
		}
		if (!isnull(applyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLY_TIME" + applyTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applyTime, "'", "''"));
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(impflag, "'", "''"));
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(returndesc, "'", "''"));
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
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examRptFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_RPT_FLOW" + examRptFlowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(orderSn)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ORDER_SN" + orderSnOper;
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "INOUT_FLAG" + inoutFlagOper;
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
		if (!isnull(examCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_CODE" + examCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_NAME" + examNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(performedDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PERFORMED_DEPT_CODE" + performedDeptCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(performedDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PERFORMED_DEPT" + performedDeptOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examOrderName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_ORDER_NAME" + examOrderNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examDiagnose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_DIAGNOSE" + examDiagnoseOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examRptCont)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_RPT_CONT" + examRptContOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examReporterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_REPORTER_CODE" + examReporterCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examReporter)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_REPORTER" + examReporterOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(examTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_TIME" + examTimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(auditStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_STATUS" + auditStatusOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(auditUserId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_USER_ID" + auditUserIdOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(auditUserName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_USER_NAME" + auditUserNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(auditTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_TIME" + auditTimeOper;
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
		if (!isnull(remark)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "REMARK" + remarkOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(applierId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_ID" + applierIdOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(applier)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER" + applierOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(applierDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_DEPT_CODE" + applierDeptCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(applierDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_DEPT" + applierDeptOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(applyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLY_TIME" + applyTimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ReturnDesc" + returndescOper;
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
		if (!isnull(recordflow)) {
			if(!(recordflowOper.equals(ISNULL) ||recordflowOper.equals(NOTISNULL))){
				pst.setString(++idx, recordflow);
			}
		}
		if (!isnull(examRptFlow)) {
			if(!(examRptFlowOper.equals(ISNULL) ||examRptFlowOper.equals(NOTISNULL))){
				pst.setString(++idx, examRptFlow);
			}
		}
		if (!isnull(orderSn)) {
			if(!(orderSnOper.equals(ISNULL) ||orderSnOper.equals(NOTISNULL))){
				pst.setString(++idx, orderSn);
			}
		}
		if (!isnull(pid)) {
			if(!(pidOper.equals(ISNULL) ||pidOper.equals(NOTISNULL))){
				pst.setString(++idx, pid);
			}
		}
		if (!isnull(inoutFlag)) {
			if(!(inoutFlagOper.equals(ISNULL) ||inoutFlagOper.equals(NOTISNULL))){
				pst.setString(++idx, inoutFlag);
			}
		}
		if (!isnull(ipid)) {
			if(!(ipidOper.equals(ISNULL) ||ipidOper.equals(NOTISNULL))){
				pst.setString(++idx, ipid);
			}
		}
		if (!isnull(examCode)) {
			if(!(examCodeOper.equals(ISNULL) ||examCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, examCode);
			}
		}
		if (!isnull(examName)) {
			if(!(examNameOper.equals(ISNULL) ||examNameOper.equals(NOTISNULL))){
				pst.setString(++idx, examName);
			}
		}
		if (!isnull(performedDeptCode)) {
			if(!(performedDeptCodeOper.equals(ISNULL) ||performedDeptCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, performedDeptCode);
			}
		}
		if (!isnull(performedDept)) {
			if(!(performedDeptOper.equals(ISNULL) ||performedDeptOper.equals(NOTISNULL))){
				pst.setString(++idx, performedDept);
			}
		}
		if (!isnull(examOrderName)) {
			if(!(examOrderNameOper.equals(ISNULL) ||examOrderNameOper.equals(NOTISNULL))){
				pst.setString(++idx, examOrderName);
			}
		}
		if (!isnull(examDiagnose)) {
			if(!(examDiagnoseOper.equals(ISNULL) ||examDiagnoseOper.equals(NOTISNULL))){
				pst.setString(++idx, examDiagnose);
			}
		}
		if (!isnull(examRptCont)) {
			if(!(examRptContOper.equals(ISNULL) ||examRptContOper.equals(NOTISNULL))){
				pst.setString(++idx, examRptCont);
			}
		}
		if (!isnull(examReporterCode)) {
			if(!(examReporterCodeOper.equals(ISNULL) ||examReporterCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, examReporterCode);
			}
		}
		if (!isnull(examReporter)) {
			if(!(examReporterOper.equals(ISNULL) ||examReporterOper.equals(NOTISNULL))){
				pst.setString(++idx, examReporter);
			}
		}
		if (!isnull(examTime)) {
			if(!(examTimeOper.equals(ISNULL) ||examTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, examTime);
			}
		}
		if (!isnull(auditStatus)) {
			if(!(auditStatusOper.equals(ISNULL) ||auditStatusOper.equals(NOTISNULL))){
				pst.setString(++idx, auditStatus);
			}
		}
		if (!isnull(auditUserId)) {
			if(!(auditUserIdOper.equals(ISNULL) ||auditUserIdOper.equals(NOTISNULL))){
				pst.setString(++idx, auditUserId);
			}
		}
		if (!isnull(auditUserName)) {
			if(!(auditUserNameOper.equals(ISNULL) ||auditUserNameOper.equals(NOTISNULL))){
				pst.setString(++idx, auditUserName);
			}
		}
		if (!isnull(auditTime)) {
			if(!(auditTimeOper.equals(ISNULL) ||auditTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, auditTime);
			}
		}
		if (!isnull(dangerFlag)) {
			if(!(dangerFlagOper.equals(ISNULL) ||dangerFlagOper.equals(NOTISNULL))){
				pst.setString(++idx, dangerFlag);
			}
		}
		if (!isnull(remark)) {
			if(!(remarkOper.equals(ISNULL) ||remarkOper.equals(NOTISNULL))){
				pst.setString(++idx, remark);
			}
		}
		if (!isnull(applierId)) {
			if(!(applierIdOper.equals(ISNULL) ||applierIdOper.equals(NOTISNULL))){
				pst.setString(++idx, applierId);
			}
		}
		if (!isnull(applier)) {
			if(!(applierOper.equals(ISNULL) ||applierOper.equals(NOTISNULL))){
				pst.setString(++idx, applier);
			}
		}
		if (!isnull(applierDeptCode)) {
			if(!(applierDeptCodeOper.equals(ISNULL) ||applierDeptCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, applierDeptCode);
			}
		}
		if (!isnull(applierDept)) {
			if(!(applierDeptOper.equals(ISNULL) ||applierDeptOper.equals(NOTISNULL))){
				pst.setString(++idx, applierDept);
			}
		}
		if (!isnull(applyTime)) {
			if(!(applyTimeOper.equals(ISNULL) ||applyTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, applyTime);
			}
		}
		if (!isnull(impflag)) {
			if(!(impflagOper.equals(ISNULL) ||impflagOper.equals(NOTISNULL))){
				pst.setString(++idx, impflag);
			}
		}
		if (!isnull(returndesc)) {
			if(!(returndescOper.equals(ISNULL) ||returndescOper.equals(NOTISNULL))){
				pst.setString(++idx, returndesc);
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
	public void fetchExamreportinfo(ResultSet rs) throws SQLException {
		recordflow = rs.getString("RecordFlow"); //记录流水号	key
		examRptFlow = rs.getString("EXAM_RPT_FLOW"); //检查报告流水号
		orderSn = rs.getString("ORDER_SN"); //对应的医嘱流水号
		pid = rs.getString("PID"); //病人ID
		inoutFlag = rs.getString("INOUT_FLAG"); //住院门诊标记【i：住院；o：门诊】
		ipid = rs.getString("IPID"); //病人住院或门诊流水号
		examCode = rs.getString("EXAM_CODE"); //检查类别代码
		examName = rs.getString("EXAM_NAME"); //检查类别名称
		performedDeptCode = rs.getString("PERFORMED_DEPT_CODE"); //执行科室代码
		performedDept = rs.getString("PERFORMED_DEPT"); //执行科室
		examOrderName = rs.getString("EXAM_ORDER_NAME"); //检查医嘱项目名称
		examDiagnose = rs.getString("EXAM_DIAGNOSE"); //检查结论（诊断）
		examRptCont = rs.getString("EXAM_RPT_CONT"); //检查报告详细内容
		examReporterCode = rs.getString("EXAM_REPORTER_CODE"); //检查人ID
		examReporter = rs.getString("EXAM_REPORTER"); //检查人姓名
		examTime = rs.getString("EXAM_TIME"); //检查时间
		auditStatus = rs.getString("AUDIT_STATUS"); //审核状态
		auditUserId = rs.getString("AUDIT_USER_ID"); //审核人ID号
		auditUserName = rs.getString("AUDIT_USER_NAME"); //审核人姓名
		auditTime = rs.getString("AUDIT_TIME"); //审核时间
		dangerFlag = rs.getString("DANGER_FLAG"); //危急值标志【N：否；Y：是】
		remark = rs.getString("REMARK"); //备注
		applierId = rs.getString("APPLIER_ID"); //申请人代码
		applier = rs.getString("APPLIER"); //申请人
		applierDeptCode = rs.getString("APPLIER_DEPT_CODE"); //申请科室代码
		applierDept = rs.getString("APPLIER_DEPT"); //申请科室
		applyTime = rs.getString("APPLY_TIME"); //申请时间
		impflag = rs.getString("ImpFlag"); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		returndesc = rs.getString("ReturnDesc"); //反馈说明
	}

	/**
	 * Method makeCountItemSql.
	 * 生成已设置过值的属性为查询条件计算数据条数的sql语句
	 * @return String
	 */
	public String makeCountItemSql() {
		String sql = "select count(*) from ExamReportInfo";
		String par = "";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(examRptFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_RPT_FLOW" + examRptFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examRptFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(orderSn)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ORDER_SN" + orderSnOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(orderSn, "'", "''"));
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(inoutFlag, "'", "''"));
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
		if (!isnull(examCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_CODE" + examCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examCode, "'", "''"));
			par += temp;
		}
		if (!isnull(examName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_NAME" + examNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examName, "'", "''"));
			par += temp;
		}
		if (!isnull(performedDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PERFORMED_DEPT_CODE" + performedDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(performedDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(performedDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PERFORMED_DEPT" + performedDeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(performedDept, "'", "''"));
			par += temp;
		}
		if (!isnull(examOrderName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_ORDER_NAME" + examOrderNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examOrderName, "'", "''"));
			par += temp;
		}
		if (!isnull(examDiagnose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_DIAGNOSE" + examDiagnoseOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examDiagnose, "'", "''"));
			par += temp;
		}
		if (!isnull(examRptCont)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_RPT_CONT" + examRptContOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examRptCont, "'", "''"));
			par += temp;
		}
		if (!isnull(examReporterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_REPORTER_CODE" + examReporterCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examReporterCode, "'", "''"));
			par += temp;
		}
		if (!isnull(examReporter)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_REPORTER" + examReporterOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examReporter, "'", "''"));
			par += temp;
		}
		if (!isnull(examTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "EXAM_TIME" + examTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examTime, "'", "''"));
			par += temp;
		}
		if (!isnull(auditStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_STATUS" + auditStatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditStatus, "'", "''"));
			par += temp;
		}
		if (!isnull(auditUserId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_USER_ID" + auditUserIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditUserId, "'", "''"));
			par += temp;
		}
		if (!isnull(auditUserName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_USER_NAME" + auditUserNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditUserName, "'", "''"));
			par += temp;
		}
		if (!isnull(auditTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AUDIT_TIME" + auditTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditTime, "'", "''"));
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
		if (!isnull(remark)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "REMARK" + remarkOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(remark, "'", "''"));
			par += temp;
		}
		if (!isnull(applierId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_ID" + applierIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierId, "'", "''"));
			par += temp;
		}
		if (!isnull(applier)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER" + applierOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applier, "'", "''"));
			par += temp;
		}
		if (!isnull(applierDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_DEPT_CODE" + applierDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(applierDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLIER_DEPT" + applierDeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierDept, "'", "''"));
			par += temp;
		}
		if (!isnull(applyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "APPLY_TIME" + applyTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applyTime, "'", "''"));
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(impflag, "'", "''"));
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(returndesc, "'", "''"));
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
			tablerealias = "ExamReportInfo";
		}
		String par = "";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(examRptFlow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_RPT_FLOW" + examRptFlowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examRptFlow, "'", "''"));
			par += temp;
		}
		if (!isnull(orderSn)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ORDER_SN" + orderSnOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(orderSn, "'", "''"));
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(inoutFlag, "'", "''"));
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
		if (!isnull(examCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_CODE" + examCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examCode, "'", "''"));
			par += temp;
		}
		if (!isnull(examName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_NAME" + examNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examName, "'", "''"));
			par += temp;
		}
		if (!isnull(performedDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PERFORMED_DEPT_CODE" + performedDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(performedDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(performedDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PERFORMED_DEPT" + performedDeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(performedDept, "'", "''"));
			par += temp;
		}
		if (!isnull(examOrderName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_ORDER_NAME" + examOrderNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examOrderName, "'", "''"));
			par += temp;
		}
		if (!isnull(examDiagnose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_DIAGNOSE" + examDiagnoseOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examDiagnose, "'", "''"));
			par += temp;
		}
		if (!isnull(examRptCont)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_RPT_CONT" + examRptContOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examRptCont, "'", "''"));
			par += temp;
		}
		if (!isnull(examReporterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_REPORTER_CODE" + examReporterCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examReporterCode, "'", "''"));
			par += temp;
		}
		if (!isnull(examReporter)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_REPORTER" + examReporterOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examReporter, "'", "''"));
			par += temp;
		}
		if (!isnull(examTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".EXAM_TIME" + examTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(examTime, "'", "''"));
			par += temp;
		}
		if (!isnull(auditStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AUDIT_STATUS" + auditStatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditStatus, "'", "''"));
			par += temp;
		}
		if (!isnull(auditUserId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AUDIT_USER_ID" + auditUserIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditUserId, "'", "''"));
			par += temp;
		}
		if (!isnull(auditUserName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AUDIT_USER_NAME" + auditUserNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditUserName, "'", "''"));
			par += temp;
		}
		if (!isnull(auditTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AUDIT_TIME" + auditTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(auditTime, "'", "''"));
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
		if (!isnull(remark)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".REMARK" + remarkOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(remark, "'", "''"));
			par += temp;
		}
		if (!isnull(applierId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".APPLIER_ID" + applierIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierId, "'", "''"));
			par += temp;
		}
		if (!isnull(applier)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".APPLIER" + applierOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applier, "'", "''"));
			par += temp;
		}
		if (!isnull(applierDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".APPLIER_DEPT_CODE" + applierDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(applierDept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".APPLIER_DEPT" + applierDeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applierDept, "'", "''"));
			par += temp;
		}
		if (!isnull(applyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".APPLY_TIME" + applyTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(applyTime, "'", "''"));
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(impflag, "'", "''"));
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(returndesc, "'", "''"));
			par += temp;
		}
		return par;
	}

	/**
	 * Method buildExamreportinfo，静态方法.
	 * 将struct中的父类对象转成当前子类对象
	 * @param examreportinfo 父类对象
	 * @return 子类对象
	 */
	public static Examreportinfo buildExamreportinfo(com.haitaiinc.struct.Examreportinfo examreportinfo) {
		Examreportinfo newExamreportinfo = new Examreportinfo();
		newExamreportinfo.setRecordflow(examreportinfo.getRecordflow());
		newExamreportinfo.setRecordflowOper(examreportinfo.getRecordflowOper());
		newExamreportinfo.setExamRptFlow(examreportinfo.getExamRptFlow());
		newExamreportinfo.setExamRptFlowOper(examreportinfo.getExamRptFlowOper());
		newExamreportinfo.setOrderSn(examreportinfo.getOrderSn());
		newExamreportinfo.setOrderSnOper(examreportinfo.getOrderSnOper());
		newExamreportinfo.setPid(examreportinfo.getPid());
		newExamreportinfo.setPidOper(examreportinfo.getPidOper());
		newExamreportinfo.setInoutFlag(examreportinfo.getInoutFlag());
		newExamreportinfo.setInoutFlagOper(examreportinfo.getInoutFlagOper());
		newExamreportinfo.setIpid(examreportinfo.getIpid());
		newExamreportinfo.setIpidOper(examreportinfo.getIpidOper());
		newExamreportinfo.setExamCode(examreportinfo.getExamCode());
		newExamreportinfo.setExamCodeOper(examreportinfo.getExamCodeOper());
		newExamreportinfo.setExamName(examreportinfo.getExamName());
		newExamreportinfo.setExamNameOper(examreportinfo.getExamNameOper());
		newExamreportinfo.setPerformedDeptCode(examreportinfo.getPerformedDeptCode());
		newExamreportinfo.setPerformedDeptCodeOper(examreportinfo.getPerformedDeptCodeOper());
		newExamreportinfo.setPerformedDept(examreportinfo.getPerformedDept());
		newExamreportinfo.setPerformedDeptOper(examreportinfo.getPerformedDeptOper());
		newExamreportinfo.setExamOrderName(examreportinfo.getExamOrderName());
		newExamreportinfo.setExamOrderNameOper(examreportinfo.getExamOrderNameOper());
		newExamreportinfo.setExamDiagnose(examreportinfo.getExamDiagnose());
		newExamreportinfo.setExamDiagnoseOper(examreportinfo.getExamDiagnoseOper());
		newExamreportinfo.setExamRptCont(examreportinfo.getExamRptCont());
		newExamreportinfo.setExamRptContOper(examreportinfo.getExamRptContOper());
		newExamreportinfo.setExamReporterCode(examreportinfo.getExamReporterCode());
		newExamreportinfo.setExamReporterCodeOper(examreportinfo.getExamReporterCodeOper());
		newExamreportinfo.setExamReporter(examreportinfo.getExamReporter());
		newExamreportinfo.setExamReporterOper(examreportinfo.getExamReporterOper());
		newExamreportinfo.setExamTime(examreportinfo.getExamTime());
		newExamreportinfo.setExamTimeOper(examreportinfo.getExamTimeOper());
		newExamreportinfo.setAuditStatus(examreportinfo.getAuditStatus());
		newExamreportinfo.setAuditStatusOper(examreportinfo.getAuditStatusOper());
		newExamreportinfo.setAuditUserId(examreportinfo.getAuditUserId());
		newExamreportinfo.setAuditUserIdOper(examreportinfo.getAuditUserIdOper());
		newExamreportinfo.setAuditUserName(examreportinfo.getAuditUserName());
		newExamreportinfo.setAuditUserNameOper(examreportinfo.getAuditUserNameOper());
		newExamreportinfo.setAuditTime(examreportinfo.getAuditTime());
		newExamreportinfo.setAuditTimeOper(examreportinfo.getAuditTimeOper());
		newExamreportinfo.setDangerFlag(examreportinfo.getDangerFlag());
		newExamreportinfo.setDangerFlagOper(examreportinfo.getDangerFlagOper());
		newExamreportinfo.setRemark(examreportinfo.getRemark());
		newExamreportinfo.setRemarkOper(examreportinfo.getRemarkOper());
		newExamreportinfo.setApplierId(examreportinfo.getApplierId());
		newExamreportinfo.setApplierIdOper(examreportinfo.getApplierIdOper());
		newExamreportinfo.setApplier(examreportinfo.getApplier());
		newExamreportinfo.setApplierOper(examreportinfo.getApplierOper());
		newExamreportinfo.setApplierDeptCode(examreportinfo.getApplierDeptCode());
		newExamreportinfo.setApplierDeptCodeOper(examreportinfo.getApplierDeptCodeOper());
		newExamreportinfo.setApplierDept(examreportinfo.getApplierDept());
		newExamreportinfo.setApplierDeptOper(examreportinfo.getApplierDeptOper());
		newExamreportinfo.setApplyTime(examreportinfo.getApplyTime());
		newExamreportinfo.setApplyTimeOper(examreportinfo.getApplyTimeOper());
		newExamreportinfo.setImpflag(examreportinfo.getImpflag());
		newExamreportinfo.setImpflagOper(examreportinfo.getImpflagOper());
		newExamreportinfo.setReturndesc(examreportinfo.getReturndesc());
		newExamreportinfo.setReturndescOper(examreportinfo.getReturndescOper());
		newExamreportinfo.setOrderByStr(examreportinfo.getOrderByStr());
		return newExamreportinfo;
	}
}
