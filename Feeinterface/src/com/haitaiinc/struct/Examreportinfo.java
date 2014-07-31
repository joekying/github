package com.haitaiinc.struct;


/**
 * @author haitaiinc
 * ExamReportInfo
 */
public class Examreportinfo {
	public static final String TABLENAME = "ExamReportInfo";
	public static final String EQUAL = "='[i]' ";
	public static final String NOTEQUAL = "<>'[i]' ";
	public static final String ISNULL = " is null ";
	public static final String NOTISNULL = " is not null ";
	public static final String LARGERTHAN = ">'[i]' ";
	public static final String LESSTHAN = "<'[i]' ";
	public static final String LARGEREQTHAN = ">='[i]' ";
	public static final String LESSEQTHAN = "<='[i]' ";
	public static final String NMEQUAL = "=[i] ";
	public static final String NMNOTEQUAL = "<>[i] ";
	public static final String NMLARGERTHAN = ">[i] ";
	public static final String NMLESSTHAN = "<=[i] ";
	public static final String NMLARGEREQTHAN = ">=[i] ";
	public static final String NMLESSEQTHAN = "<=[i] ";
	public static final String LEFTLIKE = " like '[i]%' ";
	public static final String RIGHTLIKE = " like '%[i]' ";
	public static final String LIKE = " like '%[i]%' ";

	public boolean isnull(String str){
		if(str==null||str.length()==0){
			return true;
		}
		return false;
	}

	//��¼��ˮ��	key
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//��鱨����ˮ��
	protected String examRptFlow;
	protected String examRptFlowOper = EQUAL;

	//��Ӧ��ҽ����ˮ��
	protected String orderSn;
	protected String orderSnOper = EQUAL;

	//����ID
	protected String pid;
	protected String pidOper = EQUAL;

	//סԺ�����ǡ�i��סԺ��o�����
	protected String inoutFlag;
	protected String inoutFlagOper = EQUAL;

	//����סԺ��������ˮ��
	protected String ipid;
	protected String ipidOper = EQUAL;

	//���������
	protected String examCode;
	protected String examCodeOper = EQUAL;

	//����������
	protected String examName;
	protected String examNameOper = EQUAL;

	//ִ�п��Ҵ���
	protected String performedDeptCode;
	protected String performedDeptCodeOper = EQUAL;

	//ִ�п���
	protected String performedDept;
	protected String performedDeptOper = EQUAL;

	//���ҽ����Ŀ����
	protected String examOrderName;
	protected String examOrderNameOper = EQUAL;

	//�����ۣ���ϣ�
	protected String examDiagnose;
	protected String examDiagnoseOper = EQUAL;

	//��鱨����ϸ����
	protected String examRptCont;
	protected String examRptContOper = EQUAL;

	//�����ID
	protected String examReporterCode;
	protected String examReporterCodeOper = EQUAL;

	//���������
	protected String examReporter;
	protected String examReporterOper = EQUAL;

	//���ʱ��
	protected String examTime;
	protected String examTimeOper = EQUAL;

	//���״̬
	protected String auditStatus;
	protected String auditStatusOper = EQUAL;

	//�����ID��
	protected String auditUserId;
	protected String auditUserIdOper = EQUAL;

	//���������
	protected String auditUserName;
	protected String auditUserNameOper = EQUAL;

	//���ʱ��
	protected String auditTime;
	protected String auditTimeOper = EQUAL;

	//Σ��ֵ��־��N����Y���ǡ�
	protected String dangerFlag;
	protected String dangerFlagOper = EQUAL;

	//��ע
	protected String remark;
	protected String remarkOper = EQUAL;

	//�����˴���
	protected String applierId;
	protected String applierIdOper = EQUAL;

	//������
	protected String applier;
	protected String applierOper = EQUAL;

	//������Ҵ���
	protected String applierDeptCode;
	protected String applierDeptCodeOper = EQUAL;

	//�������
	protected String applierDept;
	protected String applierDeptOper = EQUAL;

	//����ʱ��
	protected String applyTime;
	protected String applyTimeOper = EQUAL;

	//�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
	protected String impflag;
	protected String impflagOper = EQUAL;

	//����˵��
	protected String returndesc;
	protected String returndescOper = EQUAL;

	//�����ַ���
	protected String orderByStr = null;

	/**
	 * ��¼��ˮ��	key��Get����
	 */
	public String getRecordflow() {
		return recordflow;
	}

	/**
	 * ��¼��ˮ��	key��Set����
	 * @param Recordflow
	 */
	public void setRecordflow(String recordflow) {
		this.recordflow = recordflow;
	}

	/**
	 * ��¼��ˮ��	key��Set��ѯ����������
	 * @param RecordflowOper
	 */
	public void setRecordflowOper(String recordflowOper) {
		if (recordflowOper == null || recordflowOper.trim().length() == 0) {
			recordflowOper = EQUAL;
		}
		else {
			this.recordflowOper = recordflowOper;
		}
	}

	/**
	 * ��¼��ˮ��	key��Get��ѯ����������
	 */
	public String getRecordflowOper() {
		return recordflowOper;
	}

	/**
	 * ��鱨����ˮ�ŵ�Get����
	 */
	public String getExamRptFlow() {
		return examRptFlow;
	}

	/**
	 * ��鱨����ˮ�ŵ�Set����
	 * @param ExamRptFlow
	 */
	public void setExamRptFlow(String examRptFlow) {
		this.examRptFlow = examRptFlow;
	}

	/**
	 * ��鱨����ˮ�ŵ�Set��ѯ����������
	 * @param ExamRptFlowOper
	 */
	public void setExamRptFlowOper(String examRptFlowOper) {
		if (examRptFlowOper == null || examRptFlowOper.trim().length() == 0) {
			examRptFlowOper = EQUAL;
		}
		else {
			this.examRptFlowOper = examRptFlowOper;
		}
	}

	/**
	 * ��鱨����ˮ�ŵ�Get��ѯ����������
	 */
	public String getExamRptFlowOper() {
		return examRptFlowOper;
	}

	/**
	 * ��Ӧ��ҽ����ˮ�ŵ�Get����
	 */
	public String getOrderSn() {
		return orderSn;
	}

	/**
	 * ��Ӧ��ҽ����ˮ�ŵ�Set����
	 * @param OrderSn
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	/**
	 * ��Ӧ��ҽ����ˮ�ŵ�Set��ѯ����������
	 * @param OrderSnOper
	 */
	public void setOrderSnOper(String orderSnOper) {
		if (orderSnOper == null || orderSnOper.trim().length() == 0) {
			orderSnOper = EQUAL;
		}
		else {
			this.orderSnOper = orderSnOper;
		}
	}

	/**
	 * ��Ӧ��ҽ����ˮ�ŵ�Get��ѯ����������
	 */
	public String getOrderSnOper() {
		return orderSnOper;
	}

	/**
	 * ����ID��Get����
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * ����ID��Set����
	 * @param Pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * ����ID��Set��ѯ����������
	 * @param PidOper
	 */
	public void setPidOper(String pidOper) {
		if (pidOper == null || pidOper.trim().length() == 0) {
			pidOper = EQUAL;
		}
		else {
			this.pidOper = pidOper;
		}
	}

	/**
	 * ����ID��Get��ѯ����������
	 */
	public String getPidOper() {
		return pidOper;
	}

	/**
	 * סԺ�����ǡ�i��סԺ��o�������Get����
	 */
	public String getInoutFlag() {
		return inoutFlag;
	}

	/**
	 * סԺ�����ǡ�i��סԺ��o�������Set����
	 * @param InoutFlag
	 */
	public void setInoutFlag(String inoutFlag) {
		this.inoutFlag = inoutFlag;
	}

	/**
	 * סԺ�����ǡ�i��סԺ��o�������Set��ѯ����������
	 * @param InoutFlagOper
	 */
	public void setInoutFlagOper(String inoutFlagOper) {
		if (inoutFlagOper == null || inoutFlagOper.trim().length() == 0) {
			inoutFlagOper = EQUAL;
		}
		else {
			this.inoutFlagOper = inoutFlagOper;
		}
	}

	/**
	 * סԺ�����ǡ�i��סԺ��o�������Get��ѯ����������
	 */
	public String getInoutFlagOper() {
		return inoutFlagOper;
	}

	/**
	 * ����סԺ��������ˮ�ŵ�Get����
	 */
	public String getIpid() {
		return ipid;
	}

	/**
	 * ����סԺ��������ˮ�ŵ�Set����
	 * @param Ipid
	 */
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	/**
	 * ����סԺ��������ˮ�ŵ�Set��ѯ����������
	 * @param IpidOper
	 */
	public void setIpidOper(String ipidOper) {
		if (ipidOper == null || ipidOper.trim().length() == 0) {
			ipidOper = EQUAL;
		}
		else {
			this.ipidOper = ipidOper;
		}
	}

	/**
	 * ����סԺ��������ˮ�ŵ�Get��ѯ����������
	 */
	public String getIpidOper() {
		return ipidOper;
	}

	/**
	 * ����������Get����
	 */
	public String getExamCode() {
		return examCode;
	}

	/**
	 * ����������Set����
	 * @param ExamCode
	 */
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	/**
	 * ����������Set��ѯ����������
	 * @param ExamCodeOper
	 */
	public void setExamCodeOper(String examCodeOper) {
		if (examCodeOper == null || examCodeOper.trim().length() == 0) {
			examCodeOper = EQUAL;
		}
		else {
			this.examCodeOper = examCodeOper;
		}
	}

	/**
	 * ����������Get��ѯ����������
	 */
	public String getExamCodeOper() {
		return examCodeOper;
	}

	/**
	 * ���������Ƶ�Get����
	 */
	public String getExamName() {
		return examName;
	}

	/**
	 * ���������Ƶ�Set����
	 * @param ExamName
	 */
	public void setExamName(String examName) {
		this.examName = examName;
	}

	/**
	 * ���������Ƶ�Set��ѯ����������
	 * @param ExamNameOper
	 */
	public void setExamNameOper(String examNameOper) {
		if (examNameOper == null || examNameOper.trim().length() == 0) {
			examNameOper = EQUAL;
		}
		else {
			this.examNameOper = examNameOper;
		}
	}

	/**
	 * ���������Ƶ�Get��ѯ����������
	 */
	public String getExamNameOper() {
		return examNameOper;
	}

	/**
	 * ִ�п��Ҵ����Get����
	 */
	public String getPerformedDeptCode() {
		return performedDeptCode;
	}

	/**
	 * ִ�п��Ҵ����Set����
	 * @param PerformedDeptCode
	 */
	public void setPerformedDeptCode(String performedDeptCode) {
		this.performedDeptCode = performedDeptCode;
	}

	/**
	 * ִ�п��Ҵ����Set��ѯ����������
	 * @param PerformedDeptCodeOper
	 */
	public void setPerformedDeptCodeOper(String performedDeptCodeOper) {
		if (performedDeptCodeOper == null || performedDeptCodeOper.trim().length() == 0) {
			performedDeptCodeOper = EQUAL;
		}
		else {
			this.performedDeptCodeOper = performedDeptCodeOper;
		}
	}

	/**
	 * ִ�п��Ҵ����Get��ѯ����������
	 */
	public String getPerformedDeptCodeOper() {
		return performedDeptCodeOper;
	}

	/**
	 * ִ�п��ҵ�Get����
	 */
	public String getPerformedDept() {
		return performedDept;
	}

	/**
	 * ִ�п��ҵ�Set����
	 * @param PerformedDept
	 */
	public void setPerformedDept(String performedDept) {
		this.performedDept = performedDept;
	}

	/**
	 * ִ�п��ҵ�Set��ѯ����������
	 * @param PerformedDeptOper
	 */
	public void setPerformedDeptOper(String performedDeptOper) {
		if (performedDeptOper == null || performedDeptOper.trim().length() == 0) {
			performedDeptOper = EQUAL;
		}
		else {
			this.performedDeptOper = performedDeptOper;
		}
	}

	/**
	 * ִ�п��ҵ�Get��ѯ����������
	 */
	public String getPerformedDeptOper() {
		return performedDeptOper;
	}

	/**
	 * ���ҽ����Ŀ���Ƶ�Get����
	 */
	public String getExamOrderName() {
		return examOrderName;
	}

	/**
	 * ���ҽ����Ŀ���Ƶ�Set����
	 * @param ExamOrderName
	 */
	public void setExamOrderName(String examOrderName) {
		this.examOrderName = examOrderName;
	}

	/**
	 * ���ҽ����Ŀ���Ƶ�Set��ѯ����������
	 * @param ExamOrderNameOper
	 */
	public void setExamOrderNameOper(String examOrderNameOper) {
		if (examOrderNameOper == null || examOrderNameOper.trim().length() == 0) {
			examOrderNameOper = EQUAL;
		}
		else {
			this.examOrderNameOper = examOrderNameOper;
		}
	}

	/**
	 * ���ҽ����Ŀ���Ƶ�Get��ѯ����������
	 */
	public String getExamOrderNameOper() {
		return examOrderNameOper;
	}

	/**
	 * �����ۣ���ϣ���Get����
	 */
	public String getExamDiagnose() {
		return examDiagnose;
	}

	/**
	 * �����ۣ���ϣ���Set����
	 * @param ExamDiagnose
	 */
	public void setExamDiagnose(String examDiagnose) {
		this.examDiagnose = examDiagnose;
	}

	/**
	 * �����ۣ���ϣ���Set��ѯ����������
	 * @param ExamDiagnoseOper
	 */
	public void setExamDiagnoseOper(String examDiagnoseOper) {
		if (examDiagnoseOper == null || examDiagnoseOper.trim().length() == 0) {
			examDiagnoseOper = EQUAL;
		}
		else {
			this.examDiagnoseOper = examDiagnoseOper;
		}
	}

	/**
	 * �����ۣ���ϣ���Get��ѯ����������
	 */
	public String getExamDiagnoseOper() {
		return examDiagnoseOper;
	}

	/**
	 * ��鱨����ϸ���ݵ�Get����
	 */
	public String getExamRptCont() {
		return examRptCont;
	}

	/**
	 * ��鱨����ϸ���ݵ�Set����
	 * @param ExamRptCont
	 */
	public void setExamRptCont(String examRptCont) {
		this.examRptCont = examRptCont;
	}

	/**
	 * ��鱨����ϸ���ݵ�Set��ѯ����������
	 * @param ExamRptContOper
	 */
	public void setExamRptContOper(String examRptContOper) {
		if (examRptContOper == null || examRptContOper.trim().length() == 0) {
			examRptContOper = EQUAL;
		}
		else {
			this.examRptContOper = examRptContOper;
		}
	}

	/**
	 * ��鱨����ϸ���ݵ�Get��ѯ����������
	 */
	public String getExamRptContOper() {
		return examRptContOper;
	}

	/**
	 * �����ID��Get����
	 */
	public String getExamReporterCode() {
		return examReporterCode;
	}

	/**
	 * �����ID��Set����
	 * @param ExamReporterCode
	 */
	public void setExamReporterCode(String examReporterCode) {
		this.examReporterCode = examReporterCode;
	}

	/**
	 * �����ID��Set��ѯ����������
	 * @param ExamReporterCodeOper
	 */
	public void setExamReporterCodeOper(String examReporterCodeOper) {
		if (examReporterCodeOper == null || examReporterCodeOper.trim().length() == 0) {
			examReporterCodeOper = EQUAL;
		}
		else {
			this.examReporterCodeOper = examReporterCodeOper;
		}
	}

	/**
	 * �����ID��Get��ѯ����������
	 */
	public String getExamReporterCodeOper() {
		return examReporterCodeOper;
	}

	/**
	 * �����������Get����
	 */
	public String getExamReporter() {
		return examReporter;
	}

	/**
	 * �����������Set����
	 * @param ExamReporter
	 */
	public void setExamReporter(String examReporter) {
		this.examReporter = examReporter;
	}

	/**
	 * �����������Set��ѯ����������
	 * @param ExamReporterOper
	 */
	public void setExamReporterOper(String examReporterOper) {
		if (examReporterOper == null || examReporterOper.trim().length() == 0) {
			examReporterOper = EQUAL;
		}
		else {
			this.examReporterOper = examReporterOper;
		}
	}

	/**
	 * �����������Get��ѯ����������
	 */
	public String getExamReporterOper() {
		return examReporterOper;
	}

	/**
	 * ���ʱ���Get����
	 */
	public String getExamTime() {
		return examTime;
	}

	/**
	 * ���ʱ���Set����
	 * @param ExamTime
	 */
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	/**
	 * ���ʱ���Set��ѯ����������
	 * @param ExamTimeOper
	 */
	public void setExamTimeOper(String examTimeOper) {
		if (examTimeOper == null || examTimeOper.trim().length() == 0) {
			examTimeOper = EQUAL;
		}
		else {
			this.examTimeOper = examTimeOper;
		}
	}

	/**
	 * ���ʱ���Get��ѯ����������
	 */
	public String getExamTimeOper() {
		return examTimeOper;
	}

	/**
	 * ���״̬��Get����
	 */
	public String getAuditStatus() {
		return auditStatus;
	}

	/**
	 * ���״̬��Set����
	 * @param AuditStatus
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * ���״̬��Set��ѯ����������
	 * @param AuditStatusOper
	 */
	public void setAuditStatusOper(String auditStatusOper) {
		if (auditStatusOper == null || auditStatusOper.trim().length() == 0) {
			auditStatusOper = EQUAL;
		}
		else {
			this.auditStatusOper = auditStatusOper;
		}
	}

	/**
	 * ���״̬��Get��ѯ����������
	 */
	public String getAuditStatusOper() {
		return auditStatusOper;
	}

	/**
	 * �����ID�ŵ�Get����
	 */
	public String getAuditUserId() {
		return auditUserId;
	}

	/**
	 * �����ID�ŵ�Set����
	 * @param AuditUserId
	 */
	public void setAuditUserId(String auditUserId) {
		this.auditUserId = auditUserId;
	}

	/**
	 * �����ID�ŵ�Set��ѯ����������
	 * @param AuditUserIdOper
	 */
	public void setAuditUserIdOper(String auditUserIdOper) {
		if (auditUserIdOper == null || auditUserIdOper.trim().length() == 0) {
			auditUserIdOper = EQUAL;
		}
		else {
			this.auditUserIdOper = auditUserIdOper;
		}
	}

	/**
	 * �����ID�ŵ�Get��ѯ����������
	 */
	public String getAuditUserIdOper() {
		return auditUserIdOper;
	}

	/**
	 * �����������Get����
	 */
	public String getAuditUserName() {
		return auditUserName;
	}

	/**
	 * �����������Set����
	 * @param AuditUserName
	 */
	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	/**
	 * �����������Set��ѯ����������
	 * @param AuditUserNameOper
	 */
	public void setAuditUserNameOper(String auditUserNameOper) {
		if (auditUserNameOper == null || auditUserNameOper.trim().length() == 0) {
			auditUserNameOper = EQUAL;
		}
		else {
			this.auditUserNameOper = auditUserNameOper;
		}
	}

	/**
	 * �����������Get��ѯ����������
	 */
	public String getAuditUserNameOper() {
		return auditUserNameOper;
	}

	/**
	 * ���ʱ���Get����
	 */
	public String getAuditTime() {
		return auditTime;
	}

	/**
	 * ���ʱ���Set����
	 * @param AuditTime
	 */
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	/**
	 * ���ʱ���Set��ѯ����������
	 * @param AuditTimeOper
	 */
	public void setAuditTimeOper(String auditTimeOper) {
		if (auditTimeOper == null || auditTimeOper.trim().length() == 0) {
			auditTimeOper = EQUAL;
		}
		else {
			this.auditTimeOper = auditTimeOper;
		}
	}

	/**
	 * ���ʱ���Get��ѯ����������
	 */
	public String getAuditTimeOper() {
		return auditTimeOper;
	}

	/**
	 * Σ��ֵ��־��N����Y���ǡ���Get����
	 */
	public String getDangerFlag() {
		return dangerFlag;
	}

	/**
	 * Σ��ֵ��־��N����Y���ǡ���Set����
	 * @param DangerFlag
	 */
	public void setDangerFlag(String dangerFlag) {
		this.dangerFlag = dangerFlag;
	}

	/**
	 * Σ��ֵ��־��N����Y���ǡ���Set��ѯ����������
	 * @param DangerFlagOper
	 */
	public void setDangerFlagOper(String dangerFlagOper) {
		if (dangerFlagOper == null || dangerFlagOper.trim().length() == 0) {
			dangerFlagOper = EQUAL;
		}
		else {
			this.dangerFlagOper = dangerFlagOper;
		}
	}

	/**
	 * Σ��ֵ��־��N����Y���ǡ���Get��ѯ����������
	 */
	public String getDangerFlagOper() {
		return dangerFlagOper;
	}

	/**
	 * ��ע��Get����
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * ��ע��Set����
	 * @param Remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * ��ע��Set��ѯ����������
	 * @param RemarkOper
	 */
	public void setRemarkOper(String remarkOper) {
		if (remarkOper == null || remarkOper.trim().length() == 0) {
			remarkOper = EQUAL;
		}
		else {
			this.remarkOper = remarkOper;
		}
	}

	/**
	 * ��ע��Get��ѯ����������
	 */
	public String getRemarkOper() {
		return remarkOper;
	}

	/**
	 * �����˴����Get����
	 */
	public String getApplierId() {
		return applierId;
	}

	/**
	 * �����˴����Set����
	 * @param ApplierId
	 */
	public void setApplierId(String applierId) {
		this.applierId = applierId;
	}

	/**
	 * �����˴����Set��ѯ����������
	 * @param ApplierIdOper
	 */
	public void setApplierIdOper(String applierIdOper) {
		if (applierIdOper == null || applierIdOper.trim().length() == 0) {
			applierIdOper = EQUAL;
		}
		else {
			this.applierIdOper = applierIdOper;
		}
	}

	/**
	 * �����˴����Get��ѯ����������
	 */
	public String getApplierIdOper() {
		return applierIdOper;
	}

	/**
	 * �����˵�Get����
	 */
	public String getApplier() {
		return applier;
	}

	/**
	 * �����˵�Set����
	 * @param Applier
	 */
	public void setApplier(String applier) {
		this.applier = applier;
	}

	/**
	 * �����˵�Set��ѯ����������
	 * @param ApplierOper
	 */
	public void setApplierOper(String applierOper) {
		if (applierOper == null || applierOper.trim().length() == 0) {
			applierOper = EQUAL;
		}
		else {
			this.applierOper = applierOper;
		}
	}

	/**
	 * �����˵�Get��ѯ����������
	 */
	public String getApplierOper() {
		return applierOper;
	}

	/**
	 * ������Ҵ����Get����
	 */
	public String getApplierDeptCode() {
		return applierDeptCode;
	}

	/**
	 * ������Ҵ����Set����
	 * @param ApplierDeptCode
	 */
	public void setApplierDeptCode(String applierDeptCode) {
		this.applierDeptCode = applierDeptCode;
	}

	/**
	 * ������Ҵ����Set��ѯ����������
	 * @param ApplierDeptCodeOper
	 */
	public void setApplierDeptCodeOper(String applierDeptCodeOper) {
		if (applierDeptCodeOper == null || applierDeptCodeOper.trim().length() == 0) {
			applierDeptCodeOper = EQUAL;
		}
		else {
			this.applierDeptCodeOper = applierDeptCodeOper;
		}
	}

	/**
	 * ������Ҵ����Get��ѯ����������
	 */
	public String getApplierDeptCodeOper() {
		return applierDeptCodeOper;
	}

	/**
	 * ������ҵ�Get����
	 */
	public String getApplierDept() {
		return applierDept;
	}

	/**
	 * ������ҵ�Set����
	 * @param ApplierDept
	 */
	public void setApplierDept(String applierDept) {
		this.applierDept = applierDept;
	}

	/**
	 * ������ҵ�Set��ѯ����������
	 * @param ApplierDeptOper
	 */
	public void setApplierDeptOper(String applierDeptOper) {
		if (applierDeptOper == null || applierDeptOper.trim().length() == 0) {
			applierDeptOper = EQUAL;
		}
		else {
			this.applierDeptOper = applierDeptOper;
		}
	}

	/**
	 * ������ҵ�Get��ѯ����������
	 */
	public String getApplierDeptOper() {
		return applierDeptOper;
	}

	/**
	 * ����ʱ���Get����
	 */
	public String getApplyTime() {
		return applyTime;
	}

	/**
	 * ����ʱ���Set����
	 * @param ApplyTime
	 */
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * ����ʱ���Set��ѯ����������
	 * @param ApplyTimeOper
	 */
	public void setApplyTimeOper(String applyTimeOper) {
		if (applyTimeOper == null || applyTimeOper.trim().length() == 0) {
			applyTimeOper = EQUAL;
		}
		else {
			this.applyTimeOper = applyTimeOper;
		}
	}

	/**
	 * ����ʱ���Get��ѯ����������
	 */
	public String getApplyTimeOper() {
		return applyTimeOper;
	}

	/**
	 * �ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ������Get����
	 */
	public String getImpflag() {
		return impflag;
	}

	/**
	 * �ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ������Set����
	 * @param Impflag
	 */
	public void setImpflag(String impflag) {
		this.impflag = impflag;
	}

	/**
	 * �ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ������Set��ѯ����������
	 * @param ImpflagOper
	 */
	public void setImpflagOper(String impflagOper) {
		if (impflagOper == null || impflagOper.trim().length() == 0) {
			impflagOper = EQUAL;
		}
		else {
			this.impflagOper = impflagOper;
		}
	}

	/**
	 * �ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ������Get��ѯ����������
	 */
	public String getImpflagOper() {
		return impflagOper;
	}

	/**
	 * ����˵����Get����
	 */
	public String getReturndesc() {
		return returndesc;
	}

	/**
	 * ����˵����Set����
	 * @param Returndesc
	 */
	public void setReturndesc(String returndesc) {
		this.returndesc = returndesc;
	}

	/**
	 * ����˵����Set��ѯ����������
	 * @param ReturndescOper
	 */
	public void setReturndescOper(String returndescOper) {
		if (returndescOper == null || returndescOper.trim().length() == 0) {
			returndescOper = EQUAL;
		}
		else {
			this.returndescOper = returndescOper;
		}
	}

	/**
	 * ����˵����Get��ѯ����������
	 */
	public String getReturndescOper() {
		return returndescOper;
	}

	public void setOrderByStr(String orderByStr) {
		this.orderByStr = orderByStr;
	}
	public String getOrderByStr() {
		return orderByStr;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "recordflow="
			+ recordflow
			+ ",examRptFlow="
			+ examRptFlow
			+ ",orderSn="
			+ orderSn
			+ ",pid="
			+ pid
			+ ",inoutFlag="
			+ inoutFlag
			+ ",ipid="
			+ ipid
			+ ",examCode="
			+ examCode
			+ ",examName="
			+ examName
			+ ",performedDeptCode="
			+ performedDeptCode
			+ ",performedDept="
			+ performedDept
			+ ",examOrderName="
			+ examOrderName
			+ ",examDiagnose="
			+ examDiagnose
			+ ",examRptCont="
			+ examRptCont
			+ ",examReporterCode="
			+ examReporterCode
			+ ",examReporter="
			+ examReporter
			+ ",examTime="
			+ examTime
			+ ",auditStatus="
			+ auditStatus
			+ ",auditUserId="
			+ auditUserId
			+ ",auditUserName="
			+ auditUserName
			+ ",auditTime="
			+ auditTime
			+ ",dangerFlag="
			+ dangerFlag
			+ ",remark="
			+ remark
			+ ",applierId="
			+ applierId
			+ ",applier="
			+ applier
			+ ",applierDeptCode="
			+ applierDeptCode
			+ ",applierDept="
			+ applierDept
			+ ",applyTime="
			+ applyTime
			+ ",impflag="
			+ impflag
			+ ",returndesc="
			+ returndesc;
	}

	/**
	 * Method toLogsStr.
	 * ���ɼ�¼log���ַ���
	 * @return String
	 */
	public String toLogsStr() {
		String ret="";
		return ret;
	}


}
