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

	//�ӱ��¼��ˮ�� ����	key
	protected String recorditemflow;
	protected String recorditemflowOper = EQUAL;

	//��Ӧ�������¼��ˮ�� ����
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//������Ŀֵ��¼��ˮ�ű���
	protected String labItemRcdFlow;
	protected String labItemRcdFlowOper = EQUAL;

	//������ˮ�ű���
	protected String labFlow;
	protected String labFlowOper = EQUAL;

	//����ID
	protected String pid;
	protected String pidOper = EQUAL;

	//סԺ��ˮ��
	protected String ipid;
	protected String ipidOper = EQUAL;

	//���鱨����Ŀ����
	protected String labRepitemCode;
	protected String labRepitemCodeOper = EQUAL;

	//���鱨����Ŀ����
	protected String labRepitemName;
	protected String labRepitemNameOper = EQUAL;

	//������Ŀ��������
	protected String labRepitemOtherName;
	protected String labRepitemOtherNameOper = EQUAL;

	//���ֵ���͡�N����ֵ��O��ѡ�T���ı���
	protected String resultType;
	protected String resultTypeOper = EQUAL;

	//���ֵ_��ֵ
	protected String resultNum;
	protected String resultNumOper = NMEQUAL;

	//���ֵ_�ı�����һ�������ݡ�
	protected String resultText;
	protected String resultTextOper = EQUAL;

	//�ο���1_��Сֵ
	protected String lowerLimit1;
	protected String lowerLimit1Oper = NMEQUAL;

	//�ο���1_���ֵ
	protected String upperLimit1;
	protected String upperLimit1Oper = NMEQUAL;

	//�ο��ı��������ֵ��Сֵƴ��һ������ԡ����Եȡ�
	protected String referenceText;
	protected String referenceTextOper = EQUAL;

	//������Ŀ��λ����
	protected String labRepitemUnitCode;
	protected String labRepitemUnitCodeOper = EQUAL;

	//������Ŀ��λ
	protected String labRepitemUnit;
	protected String labRepitemUnitOper = EQUAL;

	//Σ��ֵ��־��N����Y���ǡ�
	protected String dangerFlag;
	protected String dangerFlagOper = EQUAL;

	//�仯��־�����ϼ�ͷ���¼�ͷ��
	protected String changeFlag;
	protected String changeFlagOper = EQUAL;

	//�����ַ���
	protected String orderByStr = null;

	/**
	 * �ӱ��¼��ˮ�� ����	key��Get����
	 */
	public String getRecorditemflow() {
		return recorditemflow;
	}

	/**
	 * �ӱ��¼��ˮ�� ����	key��Set����
	 * @param Recorditemflow
	 */
	public void setRecorditemflow(String recorditemflow) {
		this.recorditemflow = recorditemflow;
	}

	/**
	 * �ӱ��¼��ˮ�� ����	key��Set��ѯ����������
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
	 * �ӱ��¼��ˮ�� ����	key��Get��ѯ����������
	 */
	public String getRecorditemflowOper() {
		return recorditemflowOper;
	}

	/**
	 * ��Ӧ�������¼��ˮ�� �����Get����
	 */
	public String getRecordflow() {
		return recordflow;
	}

	/**
	 * ��Ӧ�������¼��ˮ�� �����Set����
	 * @param Recordflow
	 */
	public void setRecordflow(String recordflow) {
		this.recordflow = recordflow;
	}

	/**
	 * ��Ӧ�������¼��ˮ�� �����Set��ѯ����������
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
	 * ��Ӧ�������¼��ˮ�� �����Get��ѯ����������
	 */
	public String getRecordflowOper() {
		return recordflowOper;
	}

	/**
	 * ������Ŀֵ��¼��ˮ�ű����Get����
	 */
	public String getLabItemRcdFlow() {
		return labItemRcdFlow;
	}

	/**
	 * ������Ŀֵ��¼��ˮ�ű����Set����
	 * @param LabItemRcdFlow
	 */
	public void setLabItemRcdFlow(String labItemRcdFlow) {
		this.labItemRcdFlow = labItemRcdFlow;
	}

	/**
	 * ������Ŀֵ��¼��ˮ�ű����Set��ѯ����������
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
	 * ������Ŀֵ��¼��ˮ�ű����Get��ѯ����������
	 */
	public String getLabItemRcdFlowOper() {
		return labItemRcdFlowOper;
	}

	/**
	 * ������ˮ�ű����Get����
	 */
	public String getLabFlow() {
		return labFlow;
	}

	/**
	 * ������ˮ�ű����Set����
	 * @param LabFlow
	 */
	public void setLabFlow(String labFlow) {
		this.labFlow = labFlow;
	}

	/**
	 * ������ˮ�ű����Set��ѯ����������
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
	 * ������ˮ�ű����Get��ѯ����������
	 */
	public String getLabFlowOper() {
		return labFlowOper;
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
	 * סԺ��ˮ�ŵ�Get����
	 */
	public String getIpid() {
		return ipid;
	}

	/**
	 * סԺ��ˮ�ŵ�Set����
	 * @param Ipid
	 */
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	/**
	 * סԺ��ˮ�ŵ�Set��ѯ����������
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
	 * סԺ��ˮ�ŵ�Get��ѯ����������
	 */
	public String getIpidOper() {
		return ipidOper;
	}

	/**
	 * ���鱨����Ŀ�����Get����
	 */
	public String getLabRepitemCode() {
		return labRepitemCode;
	}

	/**
	 * ���鱨����Ŀ�����Set����
	 * @param LabRepitemCode
	 */
	public void setLabRepitemCode(String labRepitemCode) {
		this.labRepitemCode = labRepitemCode;
	}

	/**
	 * ���鱨����Ŀ�����Set��ѯ����������
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
	 * ���鱨����Ŀ�����Get��ѯ����������
	 */
	public String getLabRepitemCodeOper() {
		return labRepitemCodeOper;
	}

	/**
	 * ���鱨����Ŀ���Ƶ�Get����
	 */
	public String getLabRepitemName() {
		return labRepitemName;
	}

	/**
	 * ���鱨����Ŀ���Ƶ�Set����
	 * @param LabRepitemName
	 */
	public void setLabRepitemName(String labRepitemName) {
		this.labRepitemName = labRepitemName;
	}

	/**
	 * ���鱨����Ŀ���Ƶ�Set��ѯ����������
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
	 * ���鱨����Ŀ���Ƶ�Get��ѯ����������
	 */
	public String getLabRepitemNameOper() {
		return labRepitemNameOper;
	}

	/**
	 * ������Ŀ�������Ƶ�Get����
	 */
	public String getLabRepitemOtherName() {
		return labRepitemOtherName;
	}

	/**
	 * ������Ŀ�������Ƶ�Set����
	 * @param LabRepitemOtherName
	 */
	public void setLabRepitemOtherName(String labRepitemOtherName) {
		this.labRepitemOtherName = labRepitemOtherName;
	}

	/**
	 * ������Ŀ�������Ƶ�Set��ѯ����������
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
	 * ������Ŀ�������Ƶ�Get��ѯ����������
	 */
	public String getLabRepitemOtherNameOper() {
		return labRepitemOtherNameOper;
	}

	/**
	 * ���ֵ���͡�N����ֵ��O��ѡ�T���ı�����Get����
	 */
	public String getResultType() {
		return resultType;
	}

	/**
	 * ���ֵ���͡�N����ֵ��O��ѡ�T���ı�����Set����
	 * @param ResultType
	 */
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	/**
	 * ���ֵ���͡�N����ֵ��O��ѡ�T���ı�����Set��ѯ����������
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
	 * ���ֵ���͡�N����ֵ��O��ѡ�T���ı�����Get��ѯ����������
	 */
	public String getResultTypeOper() {
		return resultTypeOper;
	}

	/**
	 * ���ֵ_��ֵ��Get����
	 */
	public String getResultNum() {
		return resultNum;
	}

	/**
	 * ���ֵ_��ֵ��Set����
	 * @param ResultNum
	 */
	public void setResultNum(String resultNum) {
		this.resultNum = resultNum;
	}

	/**
	 * ���ֵ_��ֵ��Set��ѯ����������
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
	 * ���ֵ_��ֵ��Get��ѯ����������
	 */
	public String getResultNumOper() {
		return resultNumOper;
	}

	/**
	 * ���ֵ_�ı�����һ�������ݡ���Get����
	 */
	public String getResultText() {
		return resultText;
	}

	/**
	 * ���ֵ_�ı�����һ�������ݡ���Set����
	 * @param ResultText
	 */
	public void setResultText(String resultText) {
		this.resultText = resultText;
	}

	/**
	 * ���ֵ_�ı�����һ�������ݡ���Set��ѯ����������
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
	 * ���ֵ_�ı�����һ�������ݡ���Get��ѯ����������
	 */
	public String getResultTextOper() {
		return resultTextOper;
	}

	/**
	 * �ο���1_��Сֵ��Get����
	 */
	public String getLowerLimit1() {
		return lowerLimit1;
	}

	/**
	 * �ο���1_��Сֵ��Set����
	 * @param LowerLimit1
	 */
	public void setLowerLimit1(String lowerLimit1) {
		this.lowerLimit1 = lowerLimit1;
	}

	/**
	 * �ο���1_��Сֵ��Set��ѯ����������
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
	 * �ο���1_��Сֵ��Get��ѯ����������
	 */
	public String getLowerLimit1Oper() {
		return lowerLimit1Oper;
	}

	/**
	 * �ο���1_���ֵ��Get����
	 */
	public String getUpperLimit1() {
		return upperLimit1;
	}

	/**
	 * �ο���1_���ֵ��Set����
	 * @param UpperLimit1
	 */
	public void setUpperLimit1(String upperLimit1) {
		this.upperLimit1 = upperLimit1;
	}

	/**
	 * �ο���1_���ֵ��Set��ѯ����������
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
	 * �ο���1_���ֵ��Get��ѯ����������
	 */
	public String getUpperLimit1Oper() {
		return upperLimit1Oper;
	}

	/**
	 * �ο��ı��������ֵ��Сֵƴ��һ������ԡ����Եȡ���Get����
	 */
	public String getReferenceText() {
		return referenceText;
	}

	/**
	 * �ο��ı��������ֵ��Сֵƴ��һ������ԡ����Եȡ���Set����
	 * @param ReferenceText
	 */
	public void setReferenceText(String referenceText) {
		this.referenceText = referenceText;
	}

	/**
	 * �ο��ı��������ֵ��Сֵƴ��һ������ԡ����Եȡ���Set��ѯ����������
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
	 * �ο��ı��������ֵ��Сֵƴ��һ������ԡ����Եȡ���Get��ѯ����������
	 */
	public String getReferenceTextOper() {
		return referenceTextOper;
	}

	/**
	 * ������Ŀ��λ�����Get����
	 */
	public String getLabRepitemUnitCode() {
		return labRepitemUnitCode;
	}

	/**
	 * ������Ŀ��λ�����Set����
	 * @param LabRepitemUnitCode
	 */
	public void setLabRepitemUnitCode(String labRepitemUnitCode) {
		this.labRepitemUnitCode = labRepitemUnitCode;
	}

	/**
	 * ������Ŀ��λ�����Set��ѯ����������
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
	 * ������Ŀ��λ�����Get��ѯ����������
	 */
	public String getLabRepitemUnitCodeOper() {
		return labRepitemUnitCodeOper;
	}

	/**
	 * ������Ŀ��λ��Get����
	 */
	public String getLabRepitemUnit() {
		return labRepitemUnit;
	}

	/**
	 * ������Ŀ��λ��Set����
	 * @param LabRepitemUnit
	 */
	public void setLabRepitemUnit(String labRepitemUnit) {
		this.labRepitemUnit = labRepitemUnit;
	}

	/**
	 * ������Ŀ��λ��Set��ѯ����������
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
	 * ������Ŀ��λ��Get��ѯ����������
	 */
	public String getLabRepitemUnitOper() {
		return labRepitemUnitOper;
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
	 * �仯��־�����ϼ�ͷ���¼�ͷ����Get����
	 */
	public String getChangeFlag() {
		return changeFlag;
	}

	/**
	 * �仯��־�����ϼ�ͷ���¼�ͷ����Set����
	 * @param ChangeFlag
	 */
	public void setChangeFlag(String changeFlag) {
		this.changeFlag = changeFlag;
	}

	/**
	 * �仯��־�����ϼ�ͷ���¼�ͷ����Set��ѯ����������
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
	 * �仯��־�����ϼ�ͷ���¼�ͷ����Get��ѯ����������
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
	 * ���ɼ�¼log���ַ���
	 * @return String
	 */
	public String toLogsStr() {
		String ret="";
		return ret;
	}

}
