package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.haitaiinc.utils.StringUtil;

/**
 * @author haitaiinc
 * LabReportInfo
 */
public class Labreportinfo
		extends com.haitaiinc.struct.Labreportinfo{

	public static final String INSERT =
		"insert into LabReportInfo(RecordFlow,LAB_FLOW,PID,IPID,INOUT_FLAG,LAB_REP_CODE,LAB_REP_NAME,LAB_APPLY_TIME,LAB_APPLIER_CODE,LAB_APPLIER_NAME,SAMPLE_SUBMIT_TIME,SAMPLE_SUBMITER_CODE,SAMPLE_SUBMITER_NAME,APPLIER_DEPT_CODE,APPLIER_DEPT,SAMPLE_CODE,SAMPLE,IS_URGENT,LAB_STATUS,LAB_TIME,LAB_RECORDER_ID,LAB_RECORDER,AUDIT_USER_ID,AUDIT_USER_NAME,LAB_INSTRUMENT,LAB_DEPT_CODE,LAB_DEPT_NAME,SAMPLE_RECV_TIME,SAMPLE_RECEIVER_ID,SAMPLE_RECEIVER,AGE,BED_NO,IS_BACILLI,DANGER_DESCRIBE,LAB_OTHER_FLAG,REMARK,ImpFlag,ReturnDesc)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String UPDATE =
		"update LabReportInfo set LAB_FLOW=?,PID=?,IPID=?,INOUT_FLAG=?,LAB_REP_CODE=?,LAB_REP_NAME=?,LAB_APPLY_TIME=?,LAB_APPLIER_CODE=?,LAB_APPLIER_NAME=?,SAMPLE_SUBMIT_TIME=?,SAMPLE_SUBMITER_CODE=?,SAMPLE_SUBMITER_NAME=?,APPLIER_DEPT_CODE=?,APPLIER_DEPT=?,SAMPLE_CODE=?,SAMPLE=?,IS_URGENT=?,LAB_STATUS=?,LAB_TIME=?,LAB_RECORDER_ID=?,LAB_RECORDER=?,AUDIT_USER_ID=?,AUDIT_USER_NAME=?,LAB_INSTRUMENT=?,LAB_DEPT_CODE=?,LAB_DEPT_NAME=?,SAMPLE_RECV_TIME=?,SAMPLE_RECEIVER_ID=?,SAMPLE_RECEIVER=?,AGE=?,BED_NO=?,IS_BACILLI=?,DANGER_DESCRIBE=?,LAB_OTHER_FLAG=?,REMARK=?,ImpFlag=?,ReturnDesc=? where RecordFlow=?";

	public static final String SELECT =
		"select top 200 RecordFlow,LAB_FLOW,PID,IPID,INOUT_FLAG,LAB_REP_CODE,LAB_REP_NAME,LAB_APPLY_TIME,LAB_APPLIER_CODE,LAB_APPLIER_NAME,SAMPLE_SUBMIT_TIME,SAMPLE_SUBMITER_CODE,SAMPLE_SUBMITER_NAME,APPLIER_DEPT_CODE,APPLIER_DEPT,SAMPLE_CODE,SAMPLE,IS_URGENT,LAB_STATUS,LAB_TIME,LAB_RECORDER_ID,LAB_RECORDER,AUDIT_USER_ID,AUDIT_USER_NAME,LAB_INSTRUMENT,LAB_DEPT_CODE,LAB_DEPT_NAME,SAMPLE_RECV_TIME,SAMPLE_RECEIVER_ID,SAMPLE_RECEIVER,AGE,BED_NO,IS_BACILLI,DANGER_DESCRIBE,LAB_OTHER_FLAG,REMARK,ImpFlag,ReturnDesc,SectionNo,TestTypeNo,jydxtc,jydx from LabReportInfo";

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
		pst.setString(++index, recordflow); //��¼��ˮ�� ����	key
		pst.setString(++index, labFlow); //������ˮ�ű���
		pst.setString(++index, pid); //����ID
		pst.setString(++index, ipid); //סԺ��ˮ��
		pst.setString(++index, inoutFlag); //סԺ�����ǡ�i��סԺ��o�����
		pst.setString(++index, labRepCode); //���鵥����
		pst.setString(++index, labRepName); //���鵥����
		pst.setString(++index, labApplyTime); //��������ʱ��
		pst.setString(++index, labApplierCode); //���������˴���
		pst.setString(++index, labApplierName); //��������������
		pst.setString(++index, sampleSubmitTime); //�걾�ύʱ��
		pst.setString(++index, sampleSubmiterCode); //�걾�ύ�˴���
		pst.setString(++index, sampleSubmiterName); //�걾�ύ������
		pst.setString(++index, applierDeptCode); //������Ҵ���
		pst.setString(++index, applierDept); //�������
		pst.setString(++index, sampleCode); //�걾����
		pst.setString(++index, sample); //�걾
		pst.setString(++index, isUrgent); //�Ӽ���־��N�����Ӽ���Y���Ӽ���
		pst.setString(++index, labStatus); //����״̬
		pst.setString(++index, labTime); //����ʱ��
		pst.setString(++index, labRecorderId); //������ID��
		pst.setString(++index, labRecorder); //������
		pst.setString(++index, auditUserId); //�����ID��
		pst.setString(++index, auditUserName); //���������
		pst.setString(++index, labInstrument); //��������
		pst.setString(++index, labDeptCode); //������Ҵ���
		pst.setString(++index, labDeptName); //�����������
		pst.setString(++index, sampleRecvTime); //�걾����ʱ��
		pst.setString(++index, sampleReceiverId); //�걾������id
		pst.setString(++index, sampleReceiver); //�걾������
		pst.setString(++index, age); //����
		pst.setString(++index, bedNo); //����
		pst.setString(++index, isBacilli); //�����־
		pst.setString(++index, dangerDescribe); //Σ��ֵ����
		pst.setString(++index, labOtherFlag); //���������־
		pst.setString(++index, remark); //��ע
		pst.setString(++index, impflag); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		pst.setString(++index, returndesc); //����˵��
		return pst;
	}

	/**
	 * Method makeUpdSt.
	 * �����޸Ĳ�����PreparedStatement
	 * @param pst ʹ��UPDATEԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, labFlow); //������ˮ�ű���
		pst.setString(++index, pid); //����ID
		pst.setString(++index, ipid); //סԺ��ˮ��
		pst.setString(++index, inoutFlag); //סԺ�����ǡ�i��סԺ��o�����
		pst.setString(++index, labRepCode); //���鵥����
		pst.setString(++index, labRepName); //���鵥����
		pst.setString(++index, labApplyTime); //��������ʱ��
		pst.setString(++index, labApplierCode); //���������˴���
		pst.setString(++index, labApplierName); //��������������
		pst.setString(++index, sampleSubmitTime); //�걾�ύʱ��
		pst.setString(++index, sampleSubmiterCode); //�걾�ύ�˴���
		pst.setString(++index, sampleSubmiterName); //�걾�ύ������
		pst.setString(++index, applierDeptCode); //������Ҵ���
		pst.setString(++index, applierDept); //�������
		pst.setString(++index, sampleCode); //�걾����
		pst.setString(++index, sample); //�걾
		pst.setString(++index, isUrgent); //�Ӽ���־��N�����Ӽ���Y���Ӽ���
		pst.setString(++index, labStatus); //����״̬
		pst.setString(++index, labTime); //����ʱ��
		pst.setString(++index, labRecorderId); //������ID��
		pst.setString(++index, labRecorder); //������
		pst.setString(++index, auditUserId); //�����ID��
		pst.setString(++index, auditUserName); //���������
		pst.setString(++index, labInstrument); //��������
		pst.setString(++index, labDeptCode); //������Ҵ���
		pst.setString(++index, labDeptName); //�����������
		pst.setString(++index, sampleRecvTime); //�걾����ʱ��
		pst.setString(++index, sampleReceiverId); //�걾������id
		pst.setString(++index, sampleReceiver); //�걾������
		pst.setString(++index, age); //����
		pst.setString(++index, bedNo); //����
		pst.setString(++index, isBacilli); //�����־
		pst.setString(++index, dangerDescribe); //Σ��ֵ����
		pst.setString(++index, labOtherFlag); //���������־
		pst.setString(++index, remark); //��ע
		pst.setString(++index, impflag); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		pst.setString(++index, returndesc); //����˵��
		pst.setString(++index, recordflow); //��¼��ˮ�� ����	key
		return pst;
	}

	/**
	 * Method makeSearchSql.
	 * ���������ù�ֵ������Ϊ��ѯ������ɵ�sql���
	 * @return String
	 */
	public String makeSearchSql() {
		String sql=SELECT;
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(inoutFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REP_CODE" + labRepCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REP_NAME" + labRepNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepName, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLY_TIME" + labApplyTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplyTime, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplierCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLIER_CODE" + labApplierCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplierCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplierName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLIER_NAME" + labApplierNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplierName, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmitTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMIT_TIME" + sampleSubmitTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmitTime, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmiterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMITER_CODE" + sampleSubmiterCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmiterCode, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmiterName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMITER_NAME" + sampleSubmiterNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmiterName, "'", "''"));
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
		if (!isnull(sampleCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_CODE" + sampleCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleCode, "'", "''"));
			par += temp;
		}
		if (!isnull(sample)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE" + sampleOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sample, "'", "''"));
			par += temp;
		}
		if (!isnull(isUrgent)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IS_URGENT" + isUrgentOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(isUrgent, "'", "''"));
			par += temp;
		}
		if (!isnull(labStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_STATUS" + labStatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labStatus, "'", "''"));
			par += temp;
		}
		if (!isnull(labTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_TIME" + labTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labTime, "'", "''"));
			par += temp;
		}
		if (!isnull(labRecorderId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_RECORDER_ID" + labRecorderIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRecorderId, "'", "''"));
			par += temp;
		}
		if (!isnull(labRecorder)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_RECORDER" + labRecorderOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRecorder, "'", "''"));
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
		if (!isnull(labInstrument)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_INSTRUMENT" + labInstrumentOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labInstrument, "'", "''"));
			par += temp;
		}
		if (!isnull(labDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_DEPT_CODE" + labDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labDeptName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_DEPT_NAME" + labDeptNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labDeptName, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleRecvTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECV_TIME" + sampleRecvTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleRecvTime, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleReceiverId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECEIVER_ID" + sampleReceiverIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleReceiverId, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleReceiver)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECEIVER" + sampleReceiverOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleReceiver, "'", "''"));
			par += temp;
		}
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AGE" + ageOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(age, "'", "''"));
			par += temp;
		}
		if (!isnull(bedNo)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BED_NO" + bedNoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedNo, "'", "''"));
			par += temp;
		}
		if (!isnull(isBacilli)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IS_BACILLI" + isBacilliOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(isBacilli, "'", "''"));
			par += temp;
		}
		if (!isnull(dangerDescribe)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DANGER_DESCRIBE" + dangerDescribeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dangerDescribe, "'", "''"));
			par += temp;
		}
		if (!isnull(labOtherFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_OTHER_FLAG" + labOtherFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labOtherFlag, "'", "''"));
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
	 * ���������ù�ֵ������Ϊ��ѯ������ɵ�pst
	 * @param conn ���ݿ�����
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REP_CODE" + labRepCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRepName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REP_NAME" + labRepNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labApplyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLY_TIME" + labApplyTimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labApplierCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLIER_CODE" + labApplierCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labApplierName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLIER_NAME" + labApplierNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sampleSubmitTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMIT_TIME" + sampleSubmitTimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sampleSubmiterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMITER_CODE" + sampleSubmiterCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sampleSubmiterName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMITER_NAME" + sampleSubmiterNameOper;
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
		if (!isnull(sampleCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_CODE" + sampleCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sample)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE" + sampleOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(isUrgent)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IS_URGENT" + isUrgentOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_STATUS" + labStatusOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_TIME" + labTimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRecorderId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_RECORDER_ID" + labRecorderIdOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labRecorder)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_RECORDER" + labRecorderOper;
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
		if (!isnull(labInstrument)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_INSTRUMENT" + labInstrumentOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_DEPT_CODE" + labDeptCodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labDeptName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_DEPT_NAME" + labDeptNameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sampleRecvTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECV_TIME" + sampleRecvTimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sampleReceiverId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECEIVER_ID" + sampleReceiverIdOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sampleReceiver)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECEIVER" + sampleReceiverOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AGE" + ageOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(bedNo)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BED_NO" + bedNoOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(isBacilli)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IS_BACILLI" + isBacilliOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(dangerDescribe)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DANGER_DESCRIBE" + dangerDescribeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(labOtherFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_OTHER_FLAG" + labOtherFlagOper;
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
		if (!isnull(inoutFlag)) {
			if(!(inoutFlagOper.equals(ISNULL) ||inoutFlagOper.equals(NOTISNULL))){
				pst.setString(++idx, inoutFlag);
			}
		}
		if (!isnull(labRepCode)) {
			if(!(labRepCodeOper.equals(ISNULL) ||labRepCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepCode);
			}
		}
		if (!isnull(labRepName)) {
			if(!(labRepNameOper.equals(ISNULL) ||labRepNameOper.equals(NOTISNULL))){
				pst.setString(++idx, labRepName);
			}
		}
		if (!isnull(labApplyTime)) {
			if(!(labApplyTimeOper.equals(ISNULL) ||labApplyTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, labApplyTime);
			}
		}
		if (!isnull(labApplierCode)) {
			if(!(labApplierCodeOper.equals(ISNULL) ||labApplierCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, labApplierCode);
			}
		}
		if (!isnull(labApplierName)) {
			if(!(labApplierNameOper.equals(ISNULL) ||labApplierNameOper.equals(NOTISNULL))){
				pst.setString(++idx, labApplierName);
			}
		}
		if (!isnull(sampleSubmitTime)) {
			if(!(sampleSubmitTimeOper.equals(ISNULL) ||sampleSubmitTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleSubmitTime);
			}
		}
		if (!isnull(sampleSubmiterCode)) {
			if(!(sampleSubmiterCodeOper.equals(ISNULL) ||sampleSubmiterCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleSubmiterCode);
			}
		}
		if (!isnull(sampleSubmiterName)) {
			if(!(sampleSubmiterNameOper.equals(ISNULL) ||sampleSubmiterNameOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleSubmiterName);
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
		if (!isnull(sampleCode)) {
			if(!(sampleCodeOper.equals(ISNULL) ||sampleCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleCode);
			}
		}
		if (!isnull(sample)) {
			if(!(sampleOper.equals(ISNULL) ||sampleOper.equals(NOTISNULL))){
				pst.setString(++idx, sample);
			}
		}
		if (!isnull(isUrgent)) {
			if(!(isUrgentOper.equals(ISNULL) ||isUrgentOper.equals(NOTISNULL))){
				pst.setString(++idx, isUrgent);
			}
		}
		if (!isnull(labStatus)) {
			if(!(labStatusOper.equals(ISNULL) ||labStatusOper.equals(NOTISNULL))){
				pst.setString(++idx, labStatus);
			}
		}
		if (!isnull(labTime)) {
			if(!(labTimeOper.equals(ISNULL) ||labTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, labTime);
			}
		}
		if (!isnull(labRecorderId)) {
			if(!(labRecorderIdOper.equals(ISNULL) ||labRecorderIdOper.equals(NOTISNULL))){
				pst.setString(++idx, labRecorderId);
			}
		}
		if (!isnull(labRecorder)) {
			if(!(labRecorderOper.equals(ISNULL) ||labRecorderOper.equals(NOTISNULL))){
				pst.setString(++idx, labRecorder);
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
		if (!isnull(labInstrument)) {
			if(!(labInstrumentOper.equals(ISNULL) ||labInstrumentOper.equals(NOTISNULL))){
				pst.setString(++idx, labInstrument);
			}
		}
		if (!isnull(labDeptCode)) {
			if(!(labDeptCodeOper.equals(ISNULL) ||labDeptCodeOper.equals(NOTISNULL))){
				pst.setString(++idx, labDeptCode);
			}
		}
		if (!isnull(labDeptName)) {
			if(!(labDeptNameOper.equals(ISNULL) ||labDeptNameOper.equals(NOTISNULL))){
				pst.setString(++idx, labDeptName);
			}
		}
		if (!isnull(sampleRecvTime)) {
			if(!(sampleRecvTimeOper.equals(ISNULL) ||sampleRecvTimeOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleRecvTime);
			}
		}
		if (!isnull(sampleReceiverId)) {
			if(!(sampleReceiverIdOper.equals(ISNULL) ||sampleReceiverIdOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleReceiverId);
			}
		}
		if (!isnull(sampleReceiver)) {
			if(!(sampleReceiverOper.equals(ISNULL) ||sampleReceiverOper.equals(NOTISNULL))){
				pst.setString(++idx, sampleReceiver);
			}
		}
		if (!isnull(age)) {
			if(!(ageOper.equals(ISNULL) ||ageOper.equals(NOTISNULL))){
				pst.setString(++idx, age);
			}
		}
		if (!isnull(bedNo)) {
			if(!(bedNoOper.equals(ISNULL) ||bedNoOper.equals(NOTISNULL))){
				pst.setString(++idx, bedNo);
			}
		}
		if (!isnull(isBacilli)) {
			if(!(isBacilliOper.equals(ISNULL) ||isBacilliOper.equals(NOTISNULL))){
				pst.setString(++idx, isBacilli);
			}
		}
		if (!isnull(dangerDescribe)) {
			if(!(dangerDescribeOper.equals(ISNULL) ||dangerDescribeOper.equals(NOTISNULL))){
				pst.setString(++idx, dangerDescribe);
			}
		}
		if (!isnull(labOtherFlag)) {
			if(!(labOtherFlagOper.equals(ISNULL) ||labOtherFlagOper.equals(NOTISNULL))){
				pst.setString(++idx, labOtherFlag);
			}
		}
		if (!isnull(remark)) {
			if(!(remarkOper.equals(ISNULL) ||remarkOper.equals(NOTISNULL))){
				pst.setString(++idx, remark);
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
	 * ��ʹ��SELECT�õ��Ľ�������ֵ������ǰ����Ķ�Ӧ������
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchLabreportinfo(ResultSet rs) throws SQLException {
		recordflow = rs.getString("RecordFlow"); //��¼��ˮ�� ����	key
		labFlow = rs.getString("LAB_FLOW"); //������ˮ�ű���
		pid = rs.getString("PID"); //����ID
		ipid = rs.getString("IPID"); //סԺ��ˮ��
		inoutFlag = rs.getString("INOUT_FLAG"); //סԺ�����ǡ�i��סԺ��o�����
		labRepCode = rs.getString("LAB_REP_CODE"); //���鵥����
		if(rs.getString("jydxtc")!=null&&rs.getString("jydxtc").length()>0){
			labRepName = rs.getString("jydxtc"); //���鵥����
		}else{
			labRepName = rs.getString("jydx"); //���鵥����
		}
		
		labApplyTime = rs.getString("LAB_APPLY_TIME"); //��������ʱ��
		labApplierCode = rs.getString("LAB_APPLIER_CODE"); //���������˴���
		labApplierName = rs.getString("LAB_APPLIER_NAME"); //��������������
		sampleSubmitTime = rs.getString("SAMPLE_SUBMIT_TIME"); //�걾�ύʱ��
		sampleSubmiterCode = rs.getString("SAMPLE_SUBMITER_CODE"); //�걾�ύ�˴���
		sampleSubmiterName = rs.getString("SAMPLE_SUBMITER_NAME"); //�걾�ύ������
		applierDeptCode = rs.getString("APPLIER_DEPT_CODE"); //������Ҵ���
		applierDept = rs.getString("APPLIER_DEPT"); //�������
		sampleCode = rs.getString("SAMPLE_CODE"); //�걾����
		sample = rs.getString("SAMPLE"); //�걾
		isUrgent = rs.getString("IS_URGENT"); //�Ӽ���־��N�����Ӽ���Y���Ӽ���
		labStatus = rs.getString("LAB_STATUS"); //����״̬
		labTime = rs.getString("LAB_TIME"); //����ʱ��
		labRecorderId = rs.getString("LAB_RECORDER_ID"); //������ID��
		labRecorder = rs.getString("LAB_RECORDER"); //������
		auditUserId = rs.getString("AUDIT_USER_ID"); //�����ID��
		auditUserName = rs.getString("AUDIT_USER_NAME"); //���������
		labInstrument = rs.getString("LAB_INSTRUMENT"); //��������
		labDeptCode = rs.getString("LAB_DEPT_CODE"); //������Ҵ���
		labDeptName = rs.getString("LAB_DEPT_NAME"); //�����������
		sampleRecvTime = rs.getString("SAMPLE_RECV_TIME"); //�걾����ʱ��
		sampleReceiverId = rs.getString("SAMPLE_RECEIVER_ID"); //�걾������id
		sampleReceiver = rs.getString("SAMPLE_RECEIVER"); //�걾������
		age = rs.getString("AGE"); //����
		bedNo = rs.getString("BED_NO"); //����
		isBacilli = rs.getString("IS_BACILLI"); //�����־
		dangerDescribe = rs.getString("DANGER_DESCRIBE"); //Σ��ֵ����
		labOtherFlag = rs.getString("LAB_OTHER_FLAG"); //���������־
		remark = rs.getString("REMARK"); //��ע
		impflag = rs.getString("ImpFlag"); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		returndesc = rs.getString("ReturnDesc"); //����˵��
		SectionNo = rs.getInt("SectionNo");
		TestTypeNo = rs.getInt("TestTypeNo");
		SampleNo = rs.getString("IPID");
		PatNo = rs.getString("PID");
	}

	/**
	 * Method makeCountItemSql.
	 * ���������ù�ֵ������Ϊ��ѯ������������������sql���
	 * @return String
	 */
	public String makeCountItemSql() {
		String sql = "select count(*) from LabReportInfo";
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(inoutFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REP_CODE" + labRepCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_REP_NAME" + labRepNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepName, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLY_TIME" + labApplyTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplyTime, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplierCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLIER_CODE" + labApplierCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplierCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplierName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_APPLIER_NAME" + labApplierNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplierName, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmitTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMIT_TIME" + sampleSubmitTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmitTime, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmiterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMITER_CODE" + sampleSubmiterCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmiterCode, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmiterName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_SUBMITER_NAME" + sampleSubmiterNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmiterName, "'", "''"));
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
		if (!isnull(sampleCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_CODE" + sampleCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleCode, "'", "''"));
			par += temp;
		}
		if (!isnull(sample)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE" + sampleOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sample, "'", "''"));
			par += temp;
		}
		if (!isnull(isUrgent)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IS_URGENT" + isUrgentOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(isUrgent, "'", "''"));
			par += temp;
		}
		if (!isnull(labStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_STATUS" + labStatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labStatus, "'", "''"));
			par += temp;
		}
		if (!isnull(labTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_TIME" + labTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labTime, "'", "''"));
			par += temp;
		}
		if (!isnull(labRecorderId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_RECORDER_ID" + labRecorderIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRecorderId, "'", "''"));
			par += temp;
		}
		if (!isnull(labRecorder)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_RECORDER" + labRecorderOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRecorder, "'", "''"));
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
		if (!isnull(labInstrument)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_INSTRUMENT" + labInstrumentOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labInstrument, "'", "''"));
			par += temp;
		}
		if (!isnull(labDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_DEPT_CODE" + labDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labDeptName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_DEPT_NAME" + labDeptNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labDeptName, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleRecvTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECV_TIME" + sampleRecvTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleRecvTime, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleReceiverId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECEIVER_ID" + sampleReceiverIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleReceiverId, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleReceiver)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SAMPLE_RECEIVER" + sampleReceiverOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleReceiver, "'", "''"));
			par += temp;
		}
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AGE" + ageOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(age, "'", "''"));
			par += temp;
		}
		if (!isnull(bedNo)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BED_NO" + bedNoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedNo, "'", "''"));
			par += temp;
		}
		if (!isnull(isBacilli)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IS_BACILLI" + isBacilliOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(isBacilli, "'", "''"));
			par += temp;
		}
		if (!isnull(dangerDescribe)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DANGER_DESCRIBE" + dangerDescribeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dangerDescribe, "'", "''"));
			par += temp;
		}
		if (!isnull(labOtherFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LAB_OTHER_FLAG" + labOtherFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labOtherFlag, "'", "''"));
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
	 * ���������ù�ֵ������Ϊ��ѯ������sql��䣬ֻ��WHERE���棬������SELECT
	 * @return String
	 */
	public String makeWhereSql(String tablerealias) {
		if(tablerealias == null || tablerealias.trim().length() == 0) {
			tablerealias = "LabReportInfo";
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
		if (!isnull(inoutFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".INOUT_FLAG" + inoutFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(inoutFlag, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REP_CODE" + labRepCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labRepName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_REP_NAME" + labRepNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRepName, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplyTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_APPLY_TIME" + labApplyTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplyTime, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplierCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_APPLIER_CODE" + labApplierCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplierCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labApplierName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_APPLIER_NAME" + labApplierNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labApplierName, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmitTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_SUBMIT_TIME" + sampleSubmitTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmitTime, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmiterCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_SUBMITER_CODE" + sampleSubmiterCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmiterCode, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleSubmiterName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_SUBMITER_NAME" + sampleSubmiterNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleSubmiterName, "'", "''"));
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
		if (!isnull(sampleCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_CODE" + sampleCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleCode, "'", "''"));
			par += temp;
		}
		if (!isnull(sample)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE" + sampleOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sample, "'", "''"));
			par += temp;
		}
		if (!isnull(isUrgent)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".IS_URGENT" + isUrgentOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(isUrgent, "'", "''"));
			par += temp;
		}
		if (!isnull(labStatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_STATUS" + labStatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labStatus, "'", "''"));
			par += temp;
		}
		if (!isnull(labTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_TIME" + labTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labTime, "'", "''"));
			par += temp;
		}
		if (!isnull(labRecorderId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_RECORDER_ID" + labRecorderIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRecorderId, "'", "''"));
			par += temp;
		}
		if (!isnull(labRecorder)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_RECORDER" + labRecorderOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labRecorder, "'", "''"));
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
		if (!isnull(labInstrument)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_INSTRUMENT" + labInstrumentOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labInstrument, "'", "''"));
			par += temp;
		}
		if (!isnull(labDeptCode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_DEPT_CODE" + labDeptCodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labDeptCode, "'", "''"));
			par += temp;
		}
		if (!isnull(labDeptName)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_DEPT_NAME" + labDeptNameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labDeptName, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleRecvTime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_RECV_TIME" + sampleRecvTimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleRecvTime, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleReceiverId)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_RECEIVER_ID" + sampleReceiverIdOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleReceiverId, "'", "''"));
			par += temp;
		}
		if (!isnull(sampleReceiver)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SAMPLE_RECEIVER" + sampleReceiverOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sampleReceiver, "'", "''"));
			par += temp;
		}
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AGE" + ageOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(age, "'", "''"));
			par += temp;
		}
		if (!isnull(bedNo)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BED_NO" + bedNoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedNo, "'", "''"));
			par += temp;
		}
		if (!isnull(isBacilli)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".IS_BACILLI" + isBacilliOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(isBacilli, "'", "''"));
			par += temp;
		}
		if (!isnull(dangerDescribe)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DANGER_DESCRIBE" + dangerDescribeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dangerDescribe, "'", "''"));
			par += temp;
		}
		if (!isnull(labOtherFlag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LAB_OTHER_FLAG" + labOtherFlagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(labOtherFlag, "'", "''"));
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
	 * Method buildLabreportinfo����̬����.
	 * ��struct�еĸ������ת�ɵ�ǰ�������
	 * @param labreportinfo �������
	 * @return �������
	 */
	public static Labreportinfo buildLabreportinfo(com.haitaiinc.struct.Labreportinfo labreportinfo) {
		Labreportinfo newLabreportinfo = new Labreportinfo();
		newLabreportinfo.setRecordflow(labreportinfo.getRecordflow());
		newLabreportinfo.setRecordflowOper(labreportinfo.getRecordflowOper());
		newLabreportinfo.setLabFlow(labreportinfo.getLabFlow());
		newLabreportinfo.setLabFlowOper(labreportinfo.getLabFlowOper());
		newLabreportinfo.setPid(labreportinfo.getPid());
		newLabreportinfo.setPidOper(labreportinfo.getPidOper());
		newLabreportinfo.setIpid(labreportinfo.getIpid());
		newLabreportinfo.setIpidOper(labreportinfo.getIpidOper());
		newLabreportinfo.setInoutFlag(labreportinfo.getInoutFlag());
		newLabreportinfo.setInoutFlagOper(labreportinfo.getInoutFlagOper());
		newLabreportinfo.setLabRepCode(labreportinfo.getLabRepCode());
		newLabreportinfo.setLabRepCodeOper(labreportinfo.getLabRepCodeOper());
		newLabreportinfo.setLabRepName(labreportinfo.getLabRepName());
		newLabreportinfo.setLabRepNameOper(labreportinfo.getLabRepNameOper());
		newLabreportinfo.setLabApplyTime(labreportinfo.getLabApplyTime());
		newLabreportinfo.setLabApplyTimeOper(labreportinfo.getLabApplyTimeOper());
		newLabreportinfo.setLabApplierCode(labreportinfo.getLabApplierCode());
		newLabreportinfo.setLabApplierCodeOper(labreportinfo.getLabApplierCodeOper());
		newLabreportinfo.setLabApplierName(labreportinfo.getLabApplierName());
		newLabreportinfo.setLabApplierNameOper(labreportinfo.getLabApplierNameOper());
		newLabreportinfo.setSampleSubmitTime(labreportinfo.getSampleSubmitTime());
		newLabreportinfo.setSampleSubmitTimeOper(labreportinfo.getSampleSubmitTimeOper());
		newLabreportinfo.setSampleSubmiterCode(labreportinfo.getSampleSubmiterCode());
		newLabreportinfo.setSampleSubmiterCodeOper(labreportinfo.getSampleSubmiterCodeOper());
		newLabreportinfo.setSampleSubmiterName(labreportinfo.getSampleSubmiterName());
		newLabreportinfo.setSampleSubmiterNameOper(labreportinfo.getSampleSubmiterNameOper());
		newLabreportinfo.setApplierDeptCode(labreportinfo.getApplierDeptCode());
		newLabreportinfo.setApplierDeptCodeOper(labreportinfo.getApplierDeptCodeOper());
		newLabreportinfo.setApplierDept(labreportinfo.getApplierDept());
		newLabreportinfo.setApplierDeptOper(labreportinfo.getApplierDeptOper());
		newLabreportinfo.setSampleCode(labreportinfo.getSampleCode());
		newLabreportinfo.setSampleCodeOper(labreportinfo.getSampleCodeOper());
		newLabreportinfo.setSample(labreportinfo.getSample());
		newLabreportinfo.setSampleOper(labreportinfo.getSampleOper());
		newLabreportinfo.setIsUrgent(labreportinfo.getIsUrgent());
		newLabreportinfo.setIsUrgentOper(labreportinfo.getIsUrgentOper());
		newLabreportinfo.setLabStatus(labreportinfo.getLabStatus());
		newLabreportinfo.setLabStatusOper(labreportinfo.getLabStatusOper());
		newLabreportinfo.setLabTime(labreportinfo.getLabTime());
		newLabreportinfo.setLabTimeOper(labreportinfo.getLabTimeOper());
		newLabreportinfo.setLabRecorderId(labreportinfo.getLabRecorderId());
		newLabreportinfo.setLabRecorderIdOper(labreportinfo.getLabRecorderIdOper());
		newLabreportinfo.setLabRecorder(labreportinfo.getLabRecorder());
		newLabreportinfo.setLabRecorderOper(labreportinfo.getLabRecorderOper());
		newLabreportinfo.setAuditUserId(labreportinfo.getAuditUserId());
		newLabreportinfo.setAuditUserIdOper(labreportinfo.getAuditUserIdOper());
		newLabreportinfo.setAuditUserName(labreportinfo.getAuditUserName());
		newLabreportinfo.setAuditUserNameOper(labreportinfo.getAuditUserNameOper());
		newLabreportinfo.setLabInstrument(labreportinfo.getLabInstrument());
		newLabreportinfo.setLabInstrumentOper(labreportinfo.getLabInstrumentOper());
		newLabreportinfo.setLabDeptCode(labreportinfo.getLabDeptCode());
		newLabreportinfo.setLabDeptCodeOper(labreportinfo.getLabDeptCodeOper());
		newLabreportinfo.setLabDeptName(labreportinfo.getLabDeptName());
		newLabreportinfo.setLabDeptNameOper(labreportinfo.getLabDeptNameOper());
		newLabreportinfo.setSampleRecvTime(labreportinfo.getSampleRecvTime());
		newLabreportinfo.setSampleRecvTimeOper(labreportinfo.getSampleRecvTimeOper());
		newLabreportinfo.setSampleReceiverId(labreportinfo.getSampleReceiverId());
		newLabreportinfo.setSampleReceiverIdOper(labreportinfo.getSampleReceiverIdOper());
		newLabreportinfo.setSampleReceiver(labreportinfo.getSampleReceiver());
		newLabreportinfo.setSampleReceiverOper(labreportinfo.getSampleReceiverOper());
		newLabreportinfo.setAge(labreportinfo.getAge());
		newLabreportinfo.setAgeOper(labreportinfo.getAgeOper());
		newLabreportinfo.setBedNo(labreportinfo.getBedNo());
		newLabreportinfo.setBedNoOper(labreportinfo.getBedNoOper());
		newLabreportinfo.setIsBacilli(labreportinfo.getIsBacilli());
		newLabreportinfo.setIsBacilliOper(labreportinfo.getIsBacilliOper());
		newLabreportinfo.setDangerDescribe(labreportinfo.getDangerDescribe());
		newLabreportinfo.setDangerDescribeOper(labreportinfo.getDangerDescribeOper());
		newLabreportinfo.setLabOtherFlag(labreportinfo.getLabOtherFlag());
		newLabreportinfo.setLabOtherFlagOper(labreportinfo.getLabOtherFlagOper());
		newLabreportinfo.setRemark(labreportinfo.getRemark());
		newLabreportinfo.setRemarkOper(labreportinfo.getRemarkOper());
		newLabreportinfo.setImpflag(labreportinfo.getImpflag());
		newLabreportinfo.setImpflagOper(labreportinfo.getImpflagOper());
		newLabreportinfo.setReturndesc(labreportinfo.getReturndesc());
		newLabreportinfo.setReturndescOper(labreportinfo.getReturndescOper());
		newLabreportinfo.setOrderByStr(labreportinfo.getOrderByStr());
		return newLabreportinfo;
	}
}
