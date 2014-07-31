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

	//记录流水号	key
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//检查报告流水号
	protected String examRptFlow;
	protected String examRptFlowOper = EQUAL;

	//对应的医嘱流水号
	protected String orderSn;
	protected String orderSnOper = EQUAL;

	//病人ID
	protected String pid;
	protected String pidOper = EQUAL;

	//住院门诊标记【i：住院；o：门诊】
	protected String inoutFlag;
	protected String inoutFlagOper = EQUAL;

	//病人住院或门诊流水号
	protected String ipid;
	protected String ipidOper = EQUAL;

	//检查类别代码
	protected String examCode;
	protected String examCodeOper = EQUAL;

	//检查类别名称
	protected String examName;
	protected String examNameOper = EQUAL;

	//执行科室代码
	protected String performedDeptCode;
	protected String performedDeptCodeOper = EQUAL;

	//执行科室
	protected String performedDept;
	protected String performedDeptOper = EQUAL;

	//检查医嘱项目名称
	protected String examOrderName;
	protected String examOrderNameOper = EQUAL;

	//检查结论（诊断）
	protected String examDiagnose;
	protected String examDiagnoseOper = EQUAL;

	//检查报告详细内容
	protected String examRptCont;
	protected String examRptContOper = EQUAL;

	//检查人ID
	protected String examReporterCode;
	protected String examReporterCodeOper = EQUAL;

	//检查人姓名
	protected String examReporter;
	protected String examReporterOper = EQUAL;

	//检查时间
	protected String examTime;
	protected String examTimeOper = EQUAL;

	//审核状态
	protected String auditStatus;
	protected String auditStatusOper = EQUAL;

	//审核人ID号
	protected String auditUserId;
	protected String auditUserIdOper = EQUAL;

	//审核人姓名
	protected String auditUserName;
	protected String auditUserNameOper = EQUAL;

	//审核时间
	protected String auditTime;
	protected String auditTimeOper = EQUAL;

	//危急值标志【N：否；Y：是】
	protected String dangerFlag;
	protected String dangerFlagOper = EQUAL;

	//备注
	protected String remark;
	protected String remarkOper = EQUAL;

	//申请人代码
	protected String applierId;
	protected String applierIdOper = EQUAL;

	//申请人
	protected String applier;
	protected String applierOper = EQUAL;

	//申请科室代码
	protected String applierDeptCode;
	protected String applierDeptCodeOper = EQUAL;

	//申请科室
	protected String applierDept;
	protected String applierDeptOper = EQUAL;

	//申请时间
	protected String applyTime;
	protected String applyTimeOper = EQUAL;

	//接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
	protected String impflag;
	protected String impflagOper = EQUAL;

	//反馈说明
	protected String returndesc;
	protected String returndescOper = EQUAL;

	//排序字符串
	protected String orderByStr = null;

	/**
	 * 记录流水号	key的Get方法
	 */
	public String getRecordflow() {
		return recordflow;
	}

	/**
	 * 记录流水号	key的Set方法
	 * @param Recordflow
	 */
	public void setRecordflow(String recordflow) {
		this.recordflow = recordflow;
	}

	/**
	 * 记录流水号	key的Set查询操作符方法
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
	 * 记录流水号	key的Get查询操作符方法
	 */
	public String getRecordflowOper() {
		return recordflowOper;
	}

	/**
	 * 检查报告流水号的Get方法
	 */
	public String getExamRptFlow() {
		return examRptFlow;
	}

	/**
	 * 检查报告流水号的Set方法
	 * @param ExamRptFlow
	 */
	public void setExamRptFlow(String examRptFlow) {
		this.examRptFlow = examRptFlow;
	}

	/**
	 * 检查报告流水号的Set查询操作符方法
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
	 * 检查报告流水号的Get查询操作符方法
	 */
	public String getExamRptFlowOper() {
		return examRptFlowOper;
	}

	/**
	 * 对应的医嘱流水号的Get方法
	 */
	public String getOrderSn() {
		return orderSn;
	}

	/**
	 * 对应的医嘱流水号的Set方法
	 * @param OrderSn
	 */
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	/**
	 * 对应的医嘱流水号的Set查询操作符方法
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
	 * 对应的医嘱流水号的Get查询操作符方法
	 */
	public String getOrderSnOper() {
		return orderSnOper;
	}

	/**
	 * 病人ID的Get方法
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * 病人ID的Set方法
	 * @param Pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * 病人ID的Set查询操作符方法
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
	 * 病人ID的Get查询操作符方法
	 */
	public String getPidOper() {
		return pidOper;
	}

	/**
	 * 住院门诊标记【i：住院；o：门诊】的Get方法
	 */
	public String getInoutFlag() {
		return inoutFlag;
	}

	/**
	 * 住院门诊标记【i：住院；o：门诊】的Set方法
	 * @param InoutFlag
	 */
	public void setInoutFlag(String inoutFlag) {
		this.inoutFlag = inoutFlag;
	}

	/**
	 * 住院门诊标记【i：住院；o：门诊】的Set查询操作符方法
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
	 * 住院门诊标记【i：住院；o：门诊】的Get查询操作符方法
	 */
	public String getInoutFlagOper() {
		return inoutFlagOper;
	}

	/**
	 * 病人住院或门诊流水号的Get方法
	 */
	public String getIpid() {
		return ipid;
	}

	/**
	 * 病人住院或门诊流水号的Set方法
	 * @param Ipid
	 */
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	/**
	 * 病人住院或门诊流水号的Set查询操作符方法
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
	 * 病人住院或门诊流水号的Get查询操作符方法
	 */
	public String getIpidOper() {
		return ipidOper;
	}

	/**
	 * 检查类别代码的Get方法
	 */
	public String getExamCode() {
		return examCode;
	}

	/**
	 * 检查类别代码的Set方法
	 * @param ExamCode
	 */
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	/**
	 * 检查类别代码的Set查询操作符方法
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
	 * 检查类别代码的Get查询操作符方法
	 */
	public String getExamCodeOper() {
		return examCodeOper;
	}

	/**
	 * 检查类别名称的Get方法
	 */
	public String getExamName() {
		return examName;
	}

	/**
	 * 检查类别名称的Set方法
	 * @param ExamName
	 */
	public void setExamName(String examName) {
		this.examName = examName;
	}

	/**
	 * 检查类别名称的Set查询操作符方法
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
	 * 检查类别名称的Get查询操作符方法
	 */
	public String getExamNameOper() {
		return examNameOper;
	}

	/**
	 * 执行科室代码的Get方法
	 */
	public String getPerformedDeptCode() {
		return performedDeptCode;
	}

	/**
	 * 执行科室代码的Set方法
	 * @param PerformedDeptCode
	 */
	public void setPerformedDeptCode(String performedDeptCode) {
		this.performedDeptCode = performedDeptCode;
	}

	/**
	 * 执行科室代码的Set查询操作符方法
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
	 * 执行科室代码的Get查询操作符方法
	 */
	public String getPerformedDeptCodeOper() {
		return performedDeptCodeOper;
	}

	/**
	 * 执行科室的Get方法
	 */
	public String getPerformedDept() {
		return performedDept;
	}

	/**
	 * 执行科室的Set方法
	 * @param PerformedDept
	 */
	public void setPerformedDept(String performedDept) {
		this.performedDept = performedDept;
	}

	/**
	 * 执行科室的Set查询操作符方法
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
	 * 执行科室的Get查询操作符方法
	 */
	public String getPerformedDeptOper() {
		return performedDeptOper;
	}

	/**
	 * 检查医嘱项目名称的Get方法
	 */
	public String getExamOrderName() {
		return examOrderName;
	}

	/**
	 * 检查医嘱项目名称的Set方法
	 * @param ExamOrderName
	 */
	public void setExamOrderName(String examOrderName) {
		this.examOrderName = examOrderName;
	}

	/**
	 * 检查医嘱项目名称的Set查询操作符方法
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
	 * 检查医嘱项目名称的Get查询操作符方法
	 */
	public String getExamOrderNameOper() {
		return examOrderNameOper;
	}

	/**
	 * 检查结论（诊断）的Get方法
	 */
	public String getExamDiagnose() {
		return examDiagnose;
	}

	/**
	 * 检查结论（诊断）的Set方法
	 * @param ExamDiagnose
	 */
	public void setExamDiagnose(String examDiagnose) {
		this.examDiagnose = examDiagnose;
	}

	/**
	 * 检查结论（诊断）的Set查询操作符方法
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
	 * 检查结论（诊断）的Get查询操作符方法
	 */
	public String getExamDiagnoseOper() {
		return examDiagnoseOper;
	}

	/**
	 * 检查报告详细内容的Get方法
	 */
	public String getExamRptCont() {
		return examRptCont;
	}

	/**
	 * 检查报告详细内容的Set方法
	 * @param ExamRptCont
	 */
	public void setExamRptCont(String examRptCont) {
		this.examRptCont = examRptCont;
	}

	/**
	 * 检查报告详细内容的Set查询操作符方法
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
	 * 检查报告详细内容的Get查询操作符方法
	 */
	public String getExamRptContOper() {
		return examRptContOper;
	}

	/**
	 * 检查人ID的Get方法
	 */
	public String getExamReporterCode() {
		return examReporterCode;
	}

	/**
	 * 检查人ID的Set方法
	 * @param ExamReporterCode
	 */
	public void setExamReporterCode(String examReporterCode) {
		this.examReporterCode = examReporterCode;
	}

	/**
	 * 检查人ID的Set查询操作符方法
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
	 * 检查人ID的Get查询操作符方法
	 */
	public String getExamReporterCodeOper() {
		return examReporterCodeOper;
	}

	/**
	 * 检查人姓名的Get方法
	 */
	public String getExamReporter() {
		return examReporter;
	}

	/**
	 * 检查人姓名的Set方法
	 * @param ExamReporter
	 */
	public void setExamReporter(String examReporter) {
		this.examReporter = examReporter;
	}

	/**
	 * 检查人姓名的Set查询操作符方法
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
	 * 检查人姓名的Get查询操作符方法
	 */
	public String getExamReporterOper() {
		return examReporterOper;
	}

	/**
	 * 检查时间的Get方法
	 */
	public String getExamTime() {
		return examTime;
	}

	/**
	 * 检查时间的Set方法
	 * @param ExamTime
	 */
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	/**
	 * 检查时间的Set查询操作符方法
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
	 * 检查时间的Get查询操作符方法
	 */
	public String getExamTimeOper() {
		return examTimeOper;
	}

	/**
	 * 审核状态的Get方法
	 */
	public String getAuditStatus() {
		return auditStatus;
	}

	/**
	 * 审核状态的Set方法
	 * @param AuditStatus
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * 审核状态的Set查询操作符方法
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
	 * 审核状态的Get查询操作符方法
	 */
	public String getAuditStatusOper() {
		return auditStatusOper;
	}

	/**
	 * 审核人ID号的Get方法
	 */
	public String getAuditUserId() {
		return auditUserId;
	}

	/**
	 * 审核人ID号的Set方法
	 * @param AuditUserId
	 */
	public void setAuditUserId(String auditUserId) {
		this.auditUserId = auditUserId;
	}

	/**
	 * 审核人ID号的Set查询操作符方法
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
	 * 审核人ID号的Get查询操作符方法
	 */
	public String getAuditUserIdOper() {
		return auditUserIdOper;
	}

	/**
	 * 审核人姓名的Get方法
	 */
	public String getAuditUserName() {
		return auditUserName;
	}

	/**
	 * 审核人姓名的Set方法
	 * @param AuditUserName
	 */
	public void setAuditUserName(String auditUserName) {
		this.auditUserName = auditUserName;
	}

	/**
	 * 审核人姓名的Set查询操作符方法
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
	 * 审核人姓名的Get查询操作符方法
	 */
	public String getAuditUserNameOper() {
		return auditUserNameOper;
	}

	/**
	 * 审核时间的Get方法
	 */
	public String getAuditTime() {
		return auditTime;
	}

	/**
	 * 审核时间的Set方法
	 * @param AuditTime
	 */
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

	/**
	 * 审核时间的Set查询操作符方法
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
	 * 审核时间的Get查询操作符方法
	 */
	public String getAuditTimeOper() {
		return auditTimeOper;
	}

	/**
	 * 危急值标志【N：否；Y：是】的Get方法
	 */
	public String getDangerFlag() {
		return dangerFlag;
	}

	/**
	 * 危急值标志【N：否；Y：是】的Set方法
	 * @param DangerFlag
	 */
	public void setDangerFlag(String dangerFlag) {
		this.dangerFlag = dangerFlag;
	}

	/**
	 * 危急值标志【N：否；Y：是】的Set查询操作符方法
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
	 * 危急值标志【N：否；Y：是】的Get查询操作符方法
	 */
	public String getDangerFlagOper() {
		return dangerFlagOper;
	}

	/**
	 * 备注的Get方法
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注的Set方法
	 * @param Remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 备注的Set查询操作符方法
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
	 * 备注的Get查询操作符方法
	 */
	public String getRemarkOper() {
		return remarkOper;
	}

	/**
	 * 申请人代码的Get方法
	 */
	public String getApplierId() {
		return applierId;
	}

	/**
	 * 申请人代码的Set方法
	 * @param ApplierId
	 */
	public void setApplierId(String applierId) {
		this.applierId = applierId;
	}

	/**
	 * 申请人代码的Set查询操作符方法
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
	 * 申请人代码的Get查询操作符方法
	 */
	public String getApplierIdOper() {
		return applierIdOper;
	}

	/**
	 * 申请人的Get方法
	 */
	public String getApplier() {
		return applier;
	}

	/**
	 * 申请人的Set方法
	 * @param Applier
	 */
	public void setApplier(String applier) {
		this.applier = applier;
	}

	/**
	 * 申请人的Set查询操作符方法
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
	 * 申请人的Get查询操作符方法
	 */
	public String getApplierOper() {
		return applierOper;
	}

	/**
	 * 申请科室代码的Get方法
	 */
	public String getApplierDeptCode() {
		return applierDeptCode;
	}

	/**
	 * 申请科室代码的Set方法
	 * @param ApplierDeptCode
	 */
	public void setApplierDeptCode(String applierDeptCode) {
		this.applierDeptCode = applierDeptCode;
	}

	/**
	 * 申请科室代码的Set查询操作符方法
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
	 * 申请科室代码的Get查询操作符方法
	 */
	public String getApplierDeptCodeOper() {
		return applierDeptCodeOper;
	}

	/**
	 * 申请科室的Get方法
	 */
	public String getApplierDept() {
		return applierDept;
	}

	/**
	 * 申请科室的Set方法
	 * @param ApplierDept
	 */
	public void setApplierDept(String applierDept) {
		this.applierDept = applierDept;
	}

	/**
	 * 申请科室的Set查询操作符方法
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
	 * 申请科室的Get查询操作符方法
	 */
	public String getApplierDeptOper() {
		return applierDeptOper;
	}

	/**
	 * 申请时间的Get方法
	 */
	public String getApplyTime() {
		return applyTime;
	}

	/**
	 * 申请时间的Set方法
	 * @param ApplyTime
	 */
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * 申请时间的Set查询操作符方法
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
	 * 申请时间的Get查询操作符方法
	 */
	public String getApplyTimeOper() {
		return applyTimeOper;
	}

	/**
	 * 接口是否处理（0-未处理 1-处理成功 2-处理失败）必填的Get方法
	 */
	public String getImpflag() {
		return impflag;
	}

	/**
	 * 接口是否处理（0-未处理 1-处理成功 2-处理失败）必填的Set方法
	 * @param Impflag
	 */
	public void setImpflag(String impflag) {
		this.impflag = impflag;
	}

	/**
	 * 接口是否处理（0-未处理 1-处理成功 2-处理失败）必填的Set查询操作符方法
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
	 * 接口是否处理（0-未处理 1-处理成功 2-处理失败）必填的Get查询操作符方法
	 */
	public String getImpflagOper() {
		return impflagOper;
	}

	/**
	 * 反馈说明的Get方法
	 */
	public String getReturndesc() {
		return returndesc;
	}

	/**
	 * 反馈说明的Set方法
	 * @param Returndesc
	 */
	public void setReturndesc(String returndesc) {
		this.returndesc = returndesc;
	}

	/**
	 * 反馈说明的Set查询操作符方法
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
	 * 反馈说明的Get查询操作符方法
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
	 * 生成记录log的字符串
	 * @return String
	 */
	public String toLogsStr() {
		String ret="";
		return ret;
	}


}
