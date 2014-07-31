package com.haitaiinc.struct;

import com.haitaiinc.utils.DateUtil;

/**
 * @author haitaiinc
 * LabReportInfo
 */
public class Labreportinfo {
	public static final String TABLENAME = "LabReportInfo";
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

	//记录流水号 必填	key
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//检验流水号必填
	protected String labFlow;
	protected String labFlowOper = EQUAL;

	//病人ID
	protected String pid;
	protected String pidOper = EQUAL;

	//住院流水号
	protected String ipid;
	protected String ipidOper = EQUAL;

	//住院门诊标记【i：住院；o：门诊】
	protected String inoutFlag;
	protected String inoutFlagOper = EQUAL;

	//检验单代码
	protected String labRepCode;
	protected String labRepCodeOper = EQUAL;

	//检验单名称
	protected String labRepName;
	protected String labRepNameOper = EQUAL;

	//检验申请时间
	protected String labApplyTime;
	protected String labApplyTimeOper = EQUAL;

	//检验申请人代码
	protected String labApplierCode;
	protected String labApplierCodeOper = EQUAL;

	//检验申请人姓名
	protected String labApplierName;
	protected String labApplierNameOper = EQUAL;

	//标本提交时间
	protected String sampleSubmitTime;
	protected String sampleSubmitTimeOper = EQUAL;

	//标本提交人代码
	protected String sampleSubmiterCode;
	protected String sampleSubmiterCodeOper = EQUAL;

	//标本提交人姓名
	protected String sampleSubmiterName;
	protected String sampleSubmiterNameOper = EQUAL;

	//申请科室代码
	protected String applierDeptCode;
	protected String applierDeptCodeOper = EQUAL;

	//申请科室
	protected String applierDept;
	protected String applierDeptOper = EQUAL;

	//标本代码
	protected String sampleCode;
	protected String sampleCodeOper = EQUAL;

	//标本
	protected String sample;
	protected String sampleOper = EQUAL;

	//加急标志【N：不加急；Y：加急】
	protected String isUrgent;
	protected String isUrgentOper = EQUAL;

	//检验状态
	protected String labStatus;
	protected String labStatusOper = EQUAL;

	//检验时间
	protected String labTime;
	protected String labTimeOper = EQUAL;

	//检验人ID号
	protected String labRecorderId;
	protected String labRecorderIdOper = EQUAL;

	//检验人
	protected String labRecorder;
	protected String labRecorderOper = EQUAL;

	//审核人ID号
	protected String auditUserId;
	protected String auditUserIdOper = EQUAL;

	//审核人姓名
	protected String auditUserName;
	protected String auditUserNameOper = EQUAL;

	//检验仪器
	protected String labInstrument;
	protected String labInstrumentOper = EQUAL;

	//检验科室代码
	protected String labDeptCode;
	protected String labDeptCodeOper = EQUAL;

	//检验科室名称
	protected String labDeptName;
	protected String labDeptNameOper = EQUAL;

	//标本核收时间
	protected String sampleRecvTime;
	protected String sampleRecvTimeOper = EQUAL;

	//标本接收人id
	protected String sampleReceiverId;
	protected String sampleReceiverIdOper = EQUAL;

	//标本接收人
	protected String sampleReceiver;
	protected String sampleReceiverOper = EQUAL;

	//年龄
	protected String age;
	protected String ageOper = EQUAL;

	//床号
	protected String bedNo;
	protected String bedNoOper = EQUAL;

	//菌检标志
	protected String isBacilli;
	protected String isBacilliOper = EQUAL;

	//危急值描述
	protected String dangerDescribe;
	protected String dangerDescribeOper = EQUAL;

	//检验其余标志
	protected String labOtherFlag;
	protected String labOtherFlagOper = EQUAL;

	//备注
	protected String remark;
	protected String remarkOper = EQUAL;

	//接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
	protected String impflag;
	protected String impflagOper = EQUAL;

	//反馈说明
	protected String returndesc;
	protected String returndescOper = EQUAL;

	//排序字符串
	protected String orderByStr = null;
	
	protected int SectionNo;
	protected int TestTypeNo;
	protected String SampleNo;
	protected String PatNo;

	/**
	 * 记录流水号 必填	key的Get方法
	 */
	public String getRecordflow() {
		return recordflow;
	}

	/**
	 * 记录流水号 必填	key的Set方法
	 * @param Recordflow
	 */
	public void setRecordflow(String recordflow) {
		this.recordflow = recordflow;
	}

	/**
	 * 记录流水号 必填	key的Set查询操作符方法
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
	 * 记录流水号 必填	key的Get查询操作符方法
	 */
	public String getRecordflowOper() {
		return recordflowOper;
	}

	/**
	 * 检验流水号必填的Get方法
	 */
	public String getLabFlow() {
		return labFlow;
	}

	/**
	 * 检验流水号必填的Set方法
	 * @param LabFlow
	 */
	public void setLabFlow(String labFlow) {
		this.labFlow = labFlow;
	}

	/**
	 * 检验流水号必填的Set查询操作符方法
	 * @param LabFlowOper
	 */
	public void setLabFlowOper(String labFlowOper) {
		if (labFlowOper == null || labFlowOper.trim().length() == 0) {
			labFlowOper = EQUAL;
		}
		else {
			this.labFlowOper = labFlowOper;
		}
	}

	/**
	 * 检验流水号必填的Get查询操作符方法
	 */
	public String getLabFlowOper() {
		return labFlowOper;
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
	 * 住院流水号的Get方法
	 */
	public String getIpid() {
		return ipid;
	}

	/**
	 * 住院流水号的Set方法
	 * @param Ipid
	 */
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	/**
	 * 住院流水号的Set查询操作符方法
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
	 * 住院流水号的Get查询操作符方法
	 */
	public String getIpidOper() {
		return ipidOper;
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
	 * 检验单代码的Get方法
	 */
	public String getLabRepCode() {
		return labRepCode;
	}

	/**
	 * 检验单代码的Set方法
	 * @param LabRepCode
	 */
	public void setLabRepCode(String labRepCode) {
		this.labRepCode = labRepCode;
	}

	/**
	 * 检验单代码的Set查询操作符方法
	 * @param LabRepCodeOper
	 */
	public void setLabRepCodeOper(String labRepCodeOper) {
		if (labRepCodeOper == null || labRepCodeOper.trim().length() == 0) {
			labRepCodeOper = EQUAL;
		}
		else {
			this.labRepCodeOper = labRepCodeOper;
		}
	}

	/**
	 * 检验单代码的Get查询操作符方法
	 */
	public String getLabRepCodeOper() {
		return labRepCodeOper;
	}

	/**
	 * 检验单名称的Get方法
	 */
	public String getLabRepName() {
		return labRepName;
	}

	/**
	 * 检验单名称的Set方法
	 * @param LabRepName
	 */
	public void setLabRepName(String labRepName) {
		this.labRepName = labRepName;
	}

	/**
	 * 检验单名称的Set查询操作符方法
	 * @param LabRepNameOper
	 */
	public void setLabRepNameOper(String labRepNameOper) {
		if (labRepNameOper == null || labRepNameOper.trim().length() == 0) {
			labRepNameOper = EQUAL;
		}
		else {
			this.labRepNameOper = labRepNameOper;
		}
	}

	/**
	 * 检验单名称的Get查询操作符方法
	 */
	public String getLabRepNameOper() {
		return labRepNameOper;
	}

	/**
	 * 检验申请时间的Get方法
	 */
	public String getLabApplyTime() {
		return labApplyTime;
	}

	/**
	 * 检验申请时间的Set方法
	 * @param LabApplyTime
	 */
	public void setLabApplyTime(String labApplyTime) {
		this.labApplyTime = labApplyTime;
	}

	/**
	 * 检验申请时间的Set查询操作符方法
	 * @param LabApplyTimeOper
	 */
	public void setLabApplyTimeOper(String labApplyTimeOper) {
		if (labApplyTimeOper == null || labApplyTimeOper.trim().length() == 0) {
			labApplyTimeOper = EQUAL;
		}
		else {
			this.labApplyTimeOper = labApplyTimeOper;
		}
	}

	/**
	 * 检验申请时间的Get查询操作符方法
	 */
	public String getLabApplyTimeOper() {
		return labApplyTimeOper;
	}

	/**
	 * 检验申请人代码的Get方法
	 */
	public String getLabApplierCode() {
		return labApplierCode;
	}

	/**
	 * 检验申请人代码的Set方法
	 * @param LabApplierCode
	 */
	public void setLabApplierCode(String labApplierCode) {
		this.labApplierCode = labApplierCode;
	}

	/**
	 * 检验申请人代码的Set查询操作符方法
	 * @param LabApplierCodeOper
	 */
	public void setLabApplierCodeOper(String labApplierCodeOper) {
		if (labApplierCodeOper == null || labApplierCodeOper.trim().length() == 0) {
			labApplierCodeOper = EQUAL;
		}
		else {
			this.labApplierCodeOper = labApplierCodeOper;
		}
	}

	/**
	 * 检验申请人代码的Get查询操作符方法
	 */
	public String getLabApplierCodeOper() {
		return labApplierCodeOper;
	}

	/**
	 * 检验申请人姓名的Get方法
	 */
	public String getLabApplierName() {
		return labApplierName;
	}

	/**
	 * 检验申请人姓名的Set方法
	 * @param LabApplierName
	 */
	public void setLabApplierName(String labApplierName) {
		this.labApplierName = labApplierName;
	}

	/**
	 * 检验申请人姓名的Set查询操作符方法
	 * @param LabApplierNameOper
	 */
	public void setLabApplierNameOper(String labApplierNameOper) {
		if (labApplierNameOper == null || labApplierNameOper.trim().length() == 0) {
			labApplierNameOper = EQUAL;
		}
		else {
			this.labApplierNameOper = labApplierNameOper;
		}
	}

	/**
	 * 检验申请人姓名的Get查询操作符方法
	 */
	public String getLabApplierNameOper() {
		return labApplierNameOper;
	}

	/**
	 * 标本提交时间的Get方法
	 */
	public String getSampleSubmitTime() {
		return sampleSubmitTime;
	}

	/**
	 * 标本提交时间的Set方法
	 * @param SampleSubmitTime
	 */
	public void setSampleSubmitTime(String sampleSubmitTime) {
		this.sampleSubmitTime = sampleSubmitTime;
	}

	/**
	 * 标本提交时间的Set查询操作符方法
	 * @param SampleSubmitTimeOper
	 */
	public void setSampleSubmitTimeOper(String sampleSubmitTimeOper) {
		if (sampleSubmitTimeOper == null || sampleSubmitTimeOper.trim().length() == 0) {
			sampleSubmitTimeOper = EQUAL;
		}
		else {
			this.sampleSubmitTimeOper = sampleSubmitTimeOper;
		}
	}

	/**
	 * 标本提交时间的Get查询操作符方法
	 */
	public String getSampleSubmitTimeOper() {
		return sampleSubmitTimeOper;
	}

	/**
	 * 标本提交人代码的Get方法
	 */
	public String getSampleSubmiterCode() {
		return sampleSubmiterCode;
	}

	/**
	 * 标本提交人代码的Set方法
	 * @param SampleSubmiterCode
	 */
	public void setSampleSubmiterCode(String sampleSubmiterCode) {
		this.sampleSubmiterCode = sampleSubmiterCode;
	}

	/**
	 * 标本提交人代码的Set查询操作符方法
	 * @param SampleSubmiterCodeOper
	 */
	public void setSampleSubmiterCodeOper(String sampleSubmiterCodeOper) {
		if (sampleSubmiterCodeOper == null || sampleSubmiterCodeOper.trim().length() == 0) {
			sampleSubmiterCodeOper = EQUAL;
		}
		else {
			this.sampleSubmiterCodeOper = sampleSubmiterCodeOper;
		}
	}

	/**
	 * 标本提交人代码的Get查询操作符方法
	 */
	public String getSampleSubmiterCodeOper() {
		return sampleSubmiterCodeOper;
	}

	/**
	 * 标本提交人姓名的Get方法
	 */
	public String getSampleSubmiterName() {
		return sampleSubmiterName;
	}

	/**
	 * 标本提交人姓名的Set方法
	 * @param SampleSubmiterName
	 */
	public void setSampleSubmiterName(String sampleSubmiterName) {
		this.sampleSubmiterName = sampleSubmiterName;
	}

	/**
	 * 标本提交人姓名的Set查询操作符方法
	 * @param SampleSubmiterNameOper
	 */
	public void setSampleSubmiterNameOper(String sampleSubmiterNameOper) {
		if (sampleSubmiterNameOper == null || sampleSubmiterNameOper.trim().length() == 0) {
			sampleSubmiterNameOper = EQUAL;
		}
		else {
			this.sampleSubmiterNameOper = sampleSubmiterNameOper;
		}
	}

	/**
	 * 标本提交人姓名的Get查询操作符方法
	 */
	public String getSampleSubmiterNameOper() {
		return sampleSubmiterNameOper;
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
	 * 标本代码的Get方法
	 */
	public String getSampleCode() {
		return sampleCode;
	}

	/**
	 * 标本代码的Set方法
	 * @param SampleCode
	 */
	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	/**
	 * 标本代码的Set查询操作符方法
	 * @param SampleCodeOper
	 */
	public void setSampleCodeOper(String sampleCodeOper) {
		if (sampleCodeOper == null || sampleCodeOper.trim().length() == 0) {
			sampleCodeOper = EQUAL;
		}
		else {
			this.sampleCodeOper = sampleCodeOper;
		}
	}

	/**
	 * 标本代码的Get查询操作符方法
	 */
	public String getSampleCodeOper() {
		return sampleCodeOper;
	}

	/**
	 * 标本的Get方法
	 */
	public String getSample() {
		return sample;
	}

	/**
	 * 标本的Set方法
	 * @param Sample
	 */
	public void setSample(String sample) {
		this.sample = sample;
	}

	/**
	 * 标本的Set查询操作符方法
	 * @param SampleOper
	 */
	public void setSampleOper(String sampleOper) {
		if (sampleOper == null || sampleOper.trim().length() == 0) {
			sampleOper = EQUAL;
		}
		else {
			this.sampleOper = sampleOper;
		}
	}

	/**
	 * 标本的Get查询操作符方法
	 */
	public String getSampleOper() {
		return sampleOper;
	}

	/**
	 * 加急标志【N：不加急；Y：加急】的Get方法
	 */
	public String getIsUrgent() {
		return isUrgent;
	}

	/**
	 * 加急标志【N：不加急；Y：加急】的Set方法
	 * @param IsUrgent
	 */
	public void setIsUrgent(String isUrgent) {
		this.isUrgent = isUrgent;
	}

	/**
	 * 加急标志【N：不加急；Y：加急】的Set查询操作符方法
	 * @param IsUrgentOper
	 */
	public void setIsUrgentOper(String isUrgentOper) {
		if (isUrgentOper == null || isUrgentOper.trim().length() == 0) {
			isUrgentOper = EQUAL;
		}
		else {
			this.isUrgentOper = isUrgentOper;
		}
	}

	/**
	 * 加急标志【N：不加急；Y：加急】的Get查询操作符方法
	 */
	public String getIsUrgentOper() {
		return isUrgentOper;
	}

	/**
	 * 检验状态的Get方法
	 */
	public String getLabStatus() {
		return labStatus;
	}

	/**
	 * 检验状态的Set方法
	 * @param LabStatus
	 */
	public void setLabStatus(String labStatus) {
		this.labStatus = labStatus;
	}

	/**
	 * 检验状态的Set查询操作符方法
	 * @param LabStatusOper
	 */
	public void setLabStatusOper(String labStatusOper) {
		if (labStatusOper == null || labStatusOper.trim().length() == 0) {
			labStatusOper = EQUAL;
		}
		else {
			this.labStatusOper = labStatusOper;
		}
	}

	/**
	 * 检验状态的Get查询操作符方法
	 */
	public String getLabStatusOper() {
		return labStatusOper;
	}

	/**
	 * 检验时间的Get方法
	 */
	public String getLabTime() {
		return labTime;
	}

	/**
	 * 检验时间的Set方法
	 * @param LabTime
	 */
	public void setLabTime(String labTime) {
		this.labTime = labTime;
	}

	/**
	 * 检验时间的Set查询操作符方法
	 * @param LabTimeOper
	 */
	public void setLabTimeOper(String labTimeOper) {
		if (labTimeOper == null || labTimeOper.trim().length() == 0) {
			labTimeOper = EQUAL;
		}
		else {
			this.labTimeOper = labTimeOper;
		}
	}

	/**
	 * 检验时间的Get查询操作符方法
	 */
	public String getLabTimeOper() {
		return labTimeOper;
	}

	/**
	 * 检验人ID号的Get方法
	 */
	public String getLabRecorderId() {
		return labRecorderId;
	}

	/**
	 * 检验人ID号的Set方法
	 * @param LabRecorderId
	 */
	public void setLabRecorderId(String labRecorderId) {
		this.labRecorderId = labRecorderId;
	}

	/**
	 * 检验人ID号的Set查询操作符方法
	 * @param LabRecorderIdOper
	 */
	public void setLabRecorderIdOper(String labRecorderIdOper) {
		if (labRecorderIdOper == null || labRecorderIdOper.trim().length() == 0) {
			labRecorderIdOper = EQUAL;
		}
		else {
			this.labRecorderIdOper = labRecorderIdOper;
		}
	}

	/**
	 * 检验人ID号的Get查询操作符方法
	 */
	public String getLabRecorderIdOper() {
		return labRecorderIdOper;
	}

	/**
	 * 检验人的Get方法
	 */
	public String getLabRecorder() {
		return labRecorder;
	}

	/**
	 * 检验人的Set方法
	 * @param LabRecorder
	 */
	public void setLabRecorder(String labRecorder) {
		this.labRecorder = labRecorder;
	}

	/**
	 * 检验人的Set查询操作符方法
	 * @param LabRecorderOper
	 */
	public void setLabRecorderOper(String labRecorderOper) {
		if (labRecorderOper == null || labRecorderOper.trim().length() == 0) {
			labRecorderOper = EQUAL;
		}
		else {
			this.labRecorderOper = labRecorderOper;
		}
	}

	/**
	 * 检验人的Get查询操作符方法
	 */
	public String getLabRecorderOper() {
		return labRecorderOper;
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
	 * 检验仪器的Get方法
	 */
	public String getLabInstrument() {
		return labInstrument;
	}

	/**
	 * 检验仪器的Set方法
	 * @param LabInstrument
	 */
	public void setLabInstrument(String labInstrument) {
		this.labInstrument = labInstrument;
	}

	/**
	 * 检验仪器的Set查询操作符方法
	 * @param LabInstrumentOper
	 */
	public void setLabInstrumentOper(String labInstrumentOper) {
		if (labInstrumentOper == null || labInstrumentOper.trim().length() == 0) {
			labInstrumentOper = EQUAL;
		}
		else {
			this.labInstrumentOper = labInstrumentOper;
		}
	}

	/**
	 * 检验仪器的Get查询操作符方法
	 */
	public String getLabInstrumentOper() {
		return labInstrumentOper;
	}

	/**
	 * 检验科室代码的Get方法
	 */
	public String getLabDeptCode() {
		return labDeptCode;
	}

	/**
	 * 检验科室代码的Set方法
	 * @param LabDeptCode
	 */
	public void setLabDeptCode(String labDeptCode) {
		this.labDeptCode = labDeptCode;
	}

	/**
	 * 检验科室代码的Set查询操作符方法
	 * @param LabDeptCodeOper
	 */
	public void setLabDeptCodeOper(String labDeptCodeOper) {
		if (labDeptCodeOper == null || labDeptCodeOper.trim().length() == 0) {
			labDeptCodeOper = EQUAL;
		}
		else {
			this.labDeptCodeOper = labDeptCodeOper;
		}
	}

	/**
	 * 检验科室代码的Get查询操作符方法
	 */
	public String getLabDeptCodeOper() {
		return labDeptCodeOper;
	}

	/**
	 * 检验科室名称的Get方法
	 */
	public String getLabDeptName() {
		return labDeptName;
	}

	/**
	 * 检验科室名称的Set方法
	 * @param LabDeptName
	 */
	public void setLabDeptName(String labDeptName) {
		this.labDeptName = labDeptName;
	}

	/**
	 * 检验科室名称的Set查询操作符方法
	 * @param LabDeptNameOper
	 */
	public void setLabDeptNameOper(String labDeptNameOper) {
		if (labDeptNameOper == null || labDeptNameOper.trim().length() == 0) {
			labDeptNameOper = EQUAL;
		}
		else {
			this.labDeptNameOper = labDeptNameOper;
		}
	}

	/**
	 * 检验科室名称的Get查询操作符方法
	 */
	public String getLabDeptNameOper() {
		return labDeptNameOper;
	}

	/**
	 * 标本核收时间的Get方法
	 */
	public String getSampleRecvTime() {
		return sampleRecvTime;
	}

	/**
	 * 标本核收时间的Set方法
	 * @param SampleRecvTime
	 */
	public void setSampleRecvTime(String sampleRecvTime) {
		this.sampleRecvTime = sampleRecvTime;
	}

	/**
	 * 标本核收时间的Set查询操作符方法
	 * @param SampleRecvTimeOper
	 */
	public void setSampleRecvTimeOper(String sampleRecvTimeOper) {
		if (sampleRecvTimeOper == null || sampleRecvTimeOper.trim().length() == 0) {
			sampleRecvTimeOper = EQUAL;
		}
		else {
			this.sampleRecvTimeOper = sampleRecvTimeOper;
		}
	}

	/**
	 * 标本核收时间的Get查询操作符方法
	 */
	public String getSampleRecvTimeOper() {
		return sampleRecvTimeOper;
	}

	/**
	 * 标本接收人id的Get方法
	 */
	public String getSampleReceiverId() {
		return sampleReceiverId;
	}

	/**
	 * 标本接收人id的Set方法
	 * @param SampleReceiverId
	 */
	public void setSampleReceiverId(String sampleReceiverId) {
		this.sampleReceiverId = sampleReceiverId;
	}

	/**
	 * 标本接收人id的Set查询操作符方法
	 * @param SampleReceiverIdOper
	 */
	public void setSampleReceiverIdOper(String sampleReceiverIdOper) {
		if (sampleReceiverIdOper == null || sampleReceiverIdOper.trim().length() == 0) {
			sampleReceiverIdOper = EQUAL;
		}
		else {
			this.sampleReceiverIdOper = sampleReceiverIdOper;
		}
	}

	/**
	 * 标本接收人id的Get查询操作符方法
	 */
	public String getSampleReceiverIdOper() {
		return sampleReceiverIdOper;
	}

	/**
	 * 标本接收人的Get方法
	 */
	public String getSampleReceiver() {
		return sampleReceiver;
	}

	/**
	 * 标本接收人的Set方法
	 * @param SampleReceiver
	 */
	public void setSampleReceiver(String sampleReceiver) {
		this.sampleReceiver = sampleReceiver;
	}

	/**
	 * 标本接收人的Set查询操作符方法
	 * @param SampleReceiverOper
	 */
	public void setSampleReceiverOper(String sampleReceiverOper) {
		if (sampleReceiverOper == null || sampleReceiverOper.trim().length() == 0) {
			sampleReceiverOper = EQUAL;
		}
		else {
			this.sampleReceiverOper = sampleReceiverOper;
		}
	}

	/**
	 * 标本接收人的Get查询操作符方法
	 */
	public String getSampleReceiverOper() {
		return sampleReceiverOper;
	}

	/**
	 * 年龄的Get方法
	 */
	public String getAge() {
		return age;
	}

	/**
	 * 年龄的Set方法
	 * @param Age
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * 年龄的Set查询操作符方法
	 * @param AgeOper
	 */
	public void setAgeOper(String ageOper) {
		if (ageOper == null || ageOper.trim().length() == 0) {
			ageOper = EQUAL;
		}
		else {
			this.ageOper = ageOper;
		}
	}

	/**
	 * 年龄的Get查询操作符方法
	 */
	public String getAgeOper() {
		return ageOper;
	}

	/**
	 * 床号的Get方法
	 */
	public String getBedNo() {
		return bedNo;
	}

	/**
	 * 床号的Set方法
	 * @param BedNo
	 */
	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}

	/**
	 * 床号的Set查询操作符方法
	 * @param BedNoOper
	 */
	public void setBedNoOper(String bedNoOper) {
		if (bedNoOper == null || bedNoOper.trim().length() == 0) {
			bedNoOper = EQUAL;
		}
		else {
			this.bedNoOper = bedNoOper;
		}
	}

	/**
	 * 床号的Get查询操作符方法
	 */
	public String getBedNoOper() {
		return bedNoOper;
	}

	/**
	 * 菌检标志的Get方法
	 */
	public String getIsBacilli() {
		return isBacilli;
	}

	/**
	 * 菌检标志的Set方法
	 * @param IsBacilli
	 */
	public void setIsBacilli(String isBacilli) {
		this.isBacilli = isBacilli;
	}

	/**
	 * 菌检标志的Set查询操作符方法
	 * @param IsBacilliOper
	 */
	public void setIsBacilliOper(String isBacilliOper) {
		if (isBacilliOper == null || isBacilliOper.trim().length() == 0) {
			isBacilliOper = EQUAL;
		}
		else {
			this.isBacilliOper = isBacilliOper;
		}
	}

	/**
	 * 菌检标志的Get查询操作符方法
	 */
	public String getIsBacilliOper() {
		return isBacilliOper;
	}

	/**
	 * 危急值描述的Get方法
	 */
	public String getDangerDescribe() {
		return dangerDescribe;
	}

	/**
	 * 危急值描述的Set方法
	 * @param DangerDescribe
	 */
	public void setDangerDescribe(String dangerDescribe) {
		this.dangerDescribe = dangerDescribe;
	}

	/**
	 * 危急值描述的Set查询操作符方法
	 * @param DangerDescribeOper
	 */
	public void setDangerDescribeOper(String dangerDescribeOper) {
		if (dangerDescribeOper == null || dangerDescribeOper.trim().length() == 0) {
			dangerDescribeOper = EQUAL;
		}
		else {
			this.dangerDescribeOper = dangerDescribeOper;
		}
	}

	/**
	 * 危急值描述的Get查询操作符方法
	 */
	public String getDangerDescribeOper() {
		return dangerDescribeOper;
	}

	/**
	 * 检验其余标志的Get方法
	 */
	public String getLabOtherFlag() {
		return labOtherFlag;
	}

	/**
	 * 检验其余标志的Set方法
	 * @param LabOtherFlag
	 */
	public void setLabOtherFlag(String labOtherFlag) {
		this.labOtherFlag = labOtherFlag;
	}

	/**
	 * 检验其余标志的Set查询操作符方法
	 * @param LabOtherFlagOper
	 */
	public void setLabOtherFlagOper(String labOtherFlagOper) {
		if (labOtherFlagOper == null || labOtherFlagOper.trim().length() == 0) {
			labOtherFlagOper = EQUAL;
		}
		else {
			this.labOtherFlagOper = labOtherFlagOper;
		}
	}

	/**
	 * 检验其余标志的Get查询操作符方法
	 */
	public String getLabOtherFlagOper() {
		return labOtherFlagOper;
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
			+ ",labFlow="
			+ labFlow
			+ ",pid="
			+ pid
			+ ",ipid="
			+ ipid
			+ ",inoutFlag="
			+ inoutFlag
			+ ",labRepCode="
			+ labRepCode
			+ ",labRepName="
			+ labRepName
			+ ",labApplyTime="
			+ labApplyTime
			+ ",labApplierCode="
			+ labApplierCode
			+ ",labApplierName="
			+ labApplierName
			+ ",sampleSubmitTime="
			+ sampleSubmitTime
			+ ",sampleSubmiterCode="
			+ sampleSubmiterCode
			+ ",sampleSubmiterName="
			+ sampleSubmiterName
			+ ",applierDeptCode="
			+ applierDeptCode
			+ ",applierDept="
			+ applierDept
			+ ",sampleCode="
			+ sampleCode
			+ ",sample="
			+ sample
			+ ",isUrgent="
			+ isUrgent
			+ ",labStatus="
			+ labStatus
			+ ",labTime="
			+ labTime
			+ ",labRecorderId="
			+ labRecorderId
			+ ",labRecorder="
			+ labRecorder
			+ ",auditUserId="
			+ auditUserId
			+ ",auditUserName="
			+ auditUserName
			+ ",labInstrument="
			+ labInstrument
			+ ",labDeptCode="
			+ labDeptCode
			+ ",labDeptName="
			+ labDeptName
			+ ",sampleRecvTime="
			+ sampleRecvTime
			+ ",sampleReceiverId="
			+ sampleReceiverId
			+ ",sampleReceiver="
			+ sampleReceiver
			+ ",age="
			+ age
			+ ",bedNo="
			+ bedNo
			+ ",isBacilli="
			+ isBacilli
			+ ",dangerDescribe="
			+ dangerDescribe
			+ ",labOtherFlag="
			+ labOtherFlag
			+ ",remark="
			+ remark
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

	public int getSectionNo() {
		return SectionNo;
	}

	public void setSectionNo(int sectionNo) {
		SectionNo = sectionNo;
	}

	public int getTestTypeNo() {
		return TestTypeNo;
	}

	public void setTestTypeNo(int testTypeNo) {
		TestTypeNo = testTypeNo;
	}

	public String getSampleNo() {
		return SampleNo;
	}

	public void setSampleNo(String sampleNo) {
		SampleNo = sampleNo;
	}

	public String getPatNo() {
		return PatNo;
	}

	public void setPatNo(String patNo) {
		PatNo = patNo;
	}

	
}
