package com.haitaiinc.struct;

import com.haitaiinc.utils.*;

/**
 * @author haitaiinc
 * LabReportItemInfo
 */
public class Labreportiteminfo {
	public static final String TABLENAME = "LabReportItemInfo";
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

	//子表记录流水号 必填	key
	protected String recorditemflow;
	protected String recorditemflowOper = EQUAL;

	//对应的主表记录流水号 必填
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//检验项目值记录流水号必填
	protected String labItemRcdFlow;
	protected String labItemRcdFlowOper = EQUAL;

	//检验流水号必填
	protected String labFlow;
	protected String labFlowOper = EQUAL;

	//病人ID
	protected String pid;
	protected String pidOper = EQUAL;

	//住院流水号
	protected String ipid;
	protected String ipidOper = EQUAL;

	//检验报告项目代码
	protected String labRepitemCode;
	protected String labRepitemCodeOper = EQUAL;

	//检验报告项目名称
	protected String labRepitemName;
	protected String labRepitemNameOper = EQUAL;

	//检验项目其它名称
	protected String labRepitemOtherName;
	protected String labRepitemOtherNameOper = EQUAL;

	//结果值类型【N：数值；O：选项；T：文本】
	protected String resultType;
	protected String resultTypeOper = EQUAL;

	//结果值_数值
	protected String resultNum;
	protected String resultNumOper = NMEQUAL;

	//结果值_文本【：一定有内容】
	protected String resultText;
	protected String resultTextOper = EQUAL;

	//参考组1_最小值
	protected String lowerLimit1;
	protected String lowerLimit1Oper = NMEQUAL;

	//参考组1_最大值
	protected String upperLimit1;
	protected String upperLimit1Oper = NMEQUAL;

	//参考文本【：最大值最小值拼在一起或阴性、阳性等】
	protected String referenceText;
	protected String referenceTextOper = EQUAL;

	//检验项目单位代码
	protected String labRepitemUnitCode;
	protected String labRepitemUnitCodeOper = EQUAL;

	//检验项目单位
	protected String labRepitemUnit;
	protected String labRepitemUnitOper = EQUAL;

	//危急值标志【N：否；Y：是】
	protected String dangerFlag;
	protected String dangerFlagOper = EQUAL;

	//变化标志【：上箭头或下箭头】
	protected String changeFlag;
	protected String changeFlagOper = EQUAL;

	//排序字符串
	protected String orderByStr = null;

	/**
	 * 子表记录流水号 必填	key的Get方法
	 */
	public String getRecorditemflow() {
		return recorditemflow;
	}

	/**
	 * 子表记录流水号 必填	key的Set方法
	 * @param Recorditemflow
	 */
	public void setRecorditemflow(String recorditemflow) {
		this.recorditemflow = recorditemflow;
	}

	/**
	 * 子表记录流水号 必填	key的Set查询操作符方法
	 * @param RecorditemflowOper
	 */
	public void setRecorditemflowOper(String recorditemflowOper) {
		if (recorditemflowOper == null || recorditemflowOper.trim().length() == 0) {
			recorditemflowOper = EQUAL;
		}
		else {
			this.recorditemflowOper = recorditemflowOper;
		}
	}

	/**
	 * 子表记录流水号 必填	key的Get查询操作符方法
	 */
	public String getRecorditemflowOper() {
		return recorditemflowOper;
	}

	/**
	 * 对应的主表记录流水号 必填的Get方法
	 */
	public String getRecordflow() {
		return recordflow;
	}

	/**
	 * 对应的主表记录流水号 必填的Set方法
	 * @param Recordflow
	 */
	public void setRecordflow(String recordflow) {
		this.recordflow = recordflow;
	}

	/**
	 * 对应的主表记录流水号 必填的Set查询操作符方法
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
	 * 对应的主表记录流水号 必填的Get查询操作符方法
	 */
	public String getRecordflowOper() {
		return recordflowOper;
	}

	/**
	 * 检验项目值记录流水号必填的Get方法
	 */
	public String getLabItemRcdFlow() {
		return labItemRcdFlow;
	}

	/**
	 * 检验项目值记录流水号必填的Set方法
	 * @param LabItemRcdFlow
	 */
	public void setLabItemRcdFlow(String labItemRcdFlow) {
		this.labItemRcdFlow = labItemRcdFlow;
	}

	/**
	 * 检验项目值记录流水号必填的Set查询操作符方法
	 * @param LabItemRcdFlowOper
	 */
	public void setLabItemRcdFlowOper(String labItemRcdFlowOper) {
		if (labItemRcdFlowOper == null || labItemRcdFlowOper.trim().length() == 0) {
			labItemRcdFlowOper = EQUAL;
		}
		else {
			this.labItemRcdFlowOper = labItemRcdFlowOper;
		}
	}

	/**
	 * 检验项目值记录流水号必填的Get查询操作符方法
	 */
	public String getLabItemRcdFlowOper() {
		return labItemRcdFlowOper;
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
	 * 检验报告项目代码的Get方法
	 */
	public String getLabRepitemCode() {
		return labRepitemCode;
	}

	/**
	 * 检验报告项目代码的Set方法
	 * @param LabRepitemCode
	 */
	public void setLabRepitemCode(String labRepitemCode) {
		this.labRepitemCode = labRepitemCode;
	}

	/**
	 * 检验报告项目代码的Set查询操作符方法
	 * @param LabRepitemCodeOper
	 */
	public void setLabRepitemCodeOper(String labRepitemCodeOper) {
		if (labRepitemCodeOper == null || labRepitemCodeOper.trim().length() == 0) {
			labRepitemCodeOper = EQUAL;
		}
		else {
			this.labRepitemCodeOper = labRepitemCodeOper;
		}
	}

	/**
	 * 检验报告项目代码的Get查询操作符方法
	 */
	public String getLabRepitemCodeOper() {
		return labRepitemCodeOper;
	}

	/**
	 * 检验报告项目名称的Get方法
	 */
	public String getLabRepitemName() {
		return labRepitemName;
	}

	/**
	 * 检验报告项目名称的Set方法
	 * @param LabRepitemName
	 */
	public void setLabRepitemName(String labRepitemName) {
		this.labRepitemName = labRepitemName;
	}

	/**
	 * 检验报告项目名称的Set查询操作符方法
	 * @param LabRepitemNameOper
	 */
	public void setLabRepitemNameOper(String labRepitemNameOper) {
		if (labRepitemNameOper == null || labRepitemNameOper.trim().length() == 0) {
			labRepitemNameOper = EQUAL;
		}
		else {
			this.labRepitemNameOper = labRepitemNameOper;
		}
	}

	/**
	 * 检验报告项目名称的Get查询操作符方法
	 */
	public String getLabRepitemNameOper() {
		return labRepitemNameOper;
	}

	/**
	 * 检验项目其它名称的Get方法
	 */
	public String getLabRepitemOtherName() {
		return labRepitemOtherName;
	}

	/**
	 * 检验项目其它名称的Set方法
	 * @param LabRepitemOtherName
	 */
	public void setLabRepitemOtherName(String labRepitemOtherName) {
		this.labRepitemOtherName = labRepitemOtherName;
	}

	/**
	 * 检验项目其它名称的Set查询操作符方法
	 * @param LabRepitemOtherNameOper
	 */
	public void setLabRepitemOtherNameOper(String labRepitemOtherNameOper) {
		if (labRepitemOtherNameOper == null || labRepitemOtherNameOper.trim().length() == 0) {
			labRepitemOtherNameOper = EQUAL;
		}
		else {
			this.labRepitemOtherNameOper = labRepitemOtherNameOper;
		}
	}

	/**
	 * 检验项目其它名称的Get查询操作符方法
	 */
	public String getLabRepitemOtherNameOper() {
		return labRepitemOtherNameOper;
	}

	/**
	 * 结果值类型【N：数值；O：选项；T：文本】的Get方法
	 */
	public String getResultType() {
		return resultType;
	}

	/**
	 * 结果值类型【N：数值；O：选项；T：文本】的Set方法
	 * @param ResultType
	 */
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	/**
	 * 结果值类型【N：数值；O：选项；T：文本】的Set查询操作符方法
	 * @param ResultTypeOper
	 */
	public void setResultTypeOper(String resultTypeOper) {
		if (resultTypeOper == null || resultTypeOper.trim().length() == 0) {
			resultTypeOper = EQUAL;
		}
		else {
			this.resultTypeOper = resultTypeOper;
		}
	}

	/**
	 * 结果值类型【N：数值；O：选项；T：文本】的Get查询操作符方法
	 */
	public String getResultTypeOper() {
		return resultTypeOper;
	}

	/**
	 * 结果值_数值的Get方法
	 */
	public String getResultNum() {
		return resultNum;
	}

	/**
	 * 结果值_数值的Set方法
	 * @param ResultNum
	 */
	public void setResultNum(String resultNum) {
		this.resultNum = resultNum;
	}

	/**
	 * 结果值_数值的Set查询操作符方法
	 * @param ResultNumOper
	 */
	public void setResultNumOper(String resultNumOper) {
		if (resultNumOper == null || resultNumOper.trim().length() == 0) {
			resultNumOper = EQUAL;
		}
		else {
			this.resultNumOper = resultNumOper;
		}
	}

	/**
	 * 结果值_数值的Get查询操作符方法
	 */
	public String getResultNumOper() {
		return resultNumOper;
	}

	/**
	 * 结果值_文本【：一定有内容】的Get方法
	 */
	public String getResultText() {
		return resultText;
	}

	/**
	 * 结果值_文本【：一定有内容】的Set方法
	 * @param ResultText
	 */
	public void setResultText(String resultText) {
		this.resultText = resultText;
	}

	/**
	 * 结果值_文本【：一定有内容】的Set查询操作符方法
	 * @param ResultTextOper
	 */
	public void setResultTextOper(String resultTextOper) {
		if (resultTextOper == null || resultTextOper.trim().length() == 0) {
			resultTextOper = EQUAL;
		}
		else {
			this.resultTextOper = resultTextOper;
		}
	}

	/**
	 * 结果值_文本【：一定有内容】的Get查询操作符方法
	 */
	public String getResultTextOper() {
		return resultTextOper;
	}

	/**
	 * 参考组1_最小值的Get方法
	 */
	public String getLowerLimit1() {
		return lowerLimit1;
	}

	/**
	 * 参考组1_最小值的Set方法
	 * @param LowerLimit1
	 */
	public void setLowerLimit1(String lowerLimit1) {
		this.lowerLimit1 = lowerLimit1;
	}

	/**
	 * 参考组1_最小值的Set查询操作符方法
	 * @param LowerLimit1Oper
	 */
	public void setLowerLimit1Oper(String lowerLimit1Oper) {
		if (lowerLimit1Oper == null || lowerLimit1Oper.trim().length() == 0) {
			lowerLimit1Oper = EQUAL;
		}
		else {
			this.lowerLimit1Oper = lowerLimit1Oper;
		}
	}

	/**
	 * 参考组1_最小值的Get查询操作符方法
	 */
	public String getLowerLimit1Oper() {
		return lowerLimit1Oper;
	}

	/**
	 * 参考组1_最大值的Get方法
	 */
	public String getUpperLimit1() {
		return upperLimit1;
	}

	/**
	 * 参考组1_最大值的Set方法
	 * @param UpperLimit1
	 */
	public void setUpperLimit1(String upperLimit1) {
		this.upperLimit1 = upperLimit1;
	}

	/**
	 * 参考组1_最大值的Set查询操作符方法
	 * @param UpperLimit1Oper
	 */
	public void setUpperLimit1Oper(String upperLimit1Oper) {
		if (upperLimit1Oper == null || upperLimit1Oper.trim().length() == 0) {
			upperLimit1Oper = EQUAL;
		}
		else {
			this.upperLimit1Oper = upperLimit1Oper;
		}
	}

	/**
	 * 参考组1_最大值的Get查询操作符方法
	 */
	public String getUpperLimit1Oper() {
		return upperLimit1Oper;
	}

	/**
	 * 参考文本【：最大值最小值拼在一起或阴性、阳性等】的Get方法
	 */
	public String getReferenceText() {
		return referenceText;
	}

	/**
	 * 参考文本【：最大值最小值拼在一起或阴性、阳性等】的Set方法
	 * @param ReferenceText
	 */
	public void setReferenceText(String referenceText) {
		this.referenceText = referenceText;
	}

	/**
	 * 参考文本【：最大值最小值拼在一起或阴性、阳性等】的Set查询操作符方法
	 * @param ReferenceTextOper
	 */
	public void setReferenceTextOper(String referenceTextOper) {
		if (referenceTextOper == null || referenceTextOper.trim().length() == 0) {
			referenceTextOper = EQUAL;
		}
		else {
			this.referenceTextOper = referenceTextOper;
		}
	}

	/**
	 * 参考文本【：最大值最小值拼在一起或阴性、阳性等】的Get查询操作符方法
	 */
	public String getReferenceTextOper() {
		return referenceTextOper;
	}

	/**
	 * 检验项目单位代码的Get方法
	 */
	public String getLabRepitemUnitCode() {
		return labRepitemUnitCode;
	}

	/**
	 * 检验项目单位代码的Set方法
	 * @param LabRepitemUnitCode
	 */
	public void setLabRepitemUnitCode(String labRepitemUnitCode) {
		this.labRepitemUnitCode = labRepitemUnitCode;
	}

	/**
	 * 检验项目单位代码的Set查询操作符方法
	 * @param LabRepitemUnitCodeOper
	 */
	public void setLabRepitemUnitCodeOper(String labRepitemUnitCodeOper) {
		if (labRepitemUnitCodeOper == null || labRepitemUnitCodeOper.trim().length() == 0) {
			labRepitemUnitCodeOper = EQUAL;
		}
		else {
			this.labRepitemUnitCodeOper = labRepitemUnitCodeOper;
		}
	}

	/**
	 * 检验项目单位代码的Get查询操作符方法
	 */
	public String getLabRepitemUnitCodeOper() {
		return labRepitemUnitCodeOper;
	}

	/**
	 * 检验项目单位的Get方法
	 */
	public String getLabRepitemUnit() {
		return labRepitemUnit;
	}

	/**
	 * 检验项目单位的Set方法
	 * @param LabRepitemUnit
	 */
	public void setLabRepitemUnit(String labRepitemUnit) {
		this.labRepitemUnit = labRepitemUnit;
	}

	/**
	 * 检验项目单位的Set查询操作符方法
	 * @param LabRepitemUnitOper
	 */
	public void setLabRepitemUnitOper(String labRepitemUnitOper) {
		if (labRepitemUnitOper == null || labRepitemUnitOper.trim().length() == 0) {
			labRepitemUnitOper = EQUAL;
		}
		else {
			this.labRepitemUnitOper = labRepitemUnitOper;
		}
	}

	/**
	 * 检验项目单位的Get查询操作符方法
	 */
	public String getLabRepitemUnitOper() {
		return labRepitemUnitOper;
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
	 * 变化标志【：上箭头或下箭头】的Get方法
	 */
	public String getChangeFlag() {
		return changeFlag;
	}

	/**
	 * 变化标志【：上箭头或下箭头】的Set方法
	 * @param ChangeFlag
	 */
	public void setChangeFlag(String changeFlag) {
		this.changeFlag = changeFlag;
	}

	/**
	 * 变化标志【：上箭头或下箭头】的Set查询操作符方法
	 * @param ChangeFlagOper
	 */
	public void setChangeFlagOper(String changeFlagOper) {
		if (changeFlagOper == null || changeFlagOper.trim().length() == 0) {
			changeFlagOper = EQUAL;
		}
		else {
			this.changeFlagOper = changeFlagOper;
		}
	}

	/**
	 * 变化标志【：上箭头或下箭头】的Get查询操作符方法
	 */
	public String getChangeFlagOper() {
		return changeFlagOper;
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
		return "recorditemflow="
			+ recorditemflow
			+ ",recordflow="
			+ recordflow
			+ ",labItemRcdFlow="
			+ labItemRcdFlow
			+ ",labFlow="
			+ labFlow
			+ ",pid="
			+ pid
			+ ",ipid="
			+ ipid
			+ ",labRepitemCode="
			+ labRepitemCode
			+ ",labRepitemName="
			+ labRepitemName
			+ ",labRepitemOtherName="
			+ labRepitemOtherName
			+ ",resultType="
			+ resultType
			+ ",resultNum="
			+ resultNum
			+ ",resultText="
			+ resultText
			+ ",lowerLimit1="
			+ lowerLimit1
			+ ",upperLimit1="
			+ upperLimit1
			+ ",referenceText="
			+ referenceText
			+ ",labRepitemUnitCode="
			+ labRepitemUnitCode
			+ ",labRepitemUnit="
			+ labRepitemUnit
			+ ",dangerFlag="
			+ dangerFlag
			+ ",changeFlag="
			+ changeFlag;
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
