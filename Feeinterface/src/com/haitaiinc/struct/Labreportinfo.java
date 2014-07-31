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

	//��¼��ˮ�� ����	key
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//������ˮ�ű���
	protected String labFlow;
	protected String labFlowOper = EQUAL;

	//����ID
	protected String pid;
	protected String pidOper = EQUAL;

	//סԺ��ˮ��
	protected String ipid;
	protected String ipidOper = EQUAL;

	//סԺ�����ǡ�i��סԺ��o�����
	protected String inoutFlag;
	protected String inoutFlagOper = EQUAL;

	//���鵥����
	protected String labRepCode;
	protected String labRepCodeOper = EQUAL;

	//���鵥����
	protected String labRepName;
	protected String labRepNameOper = EQUAL;

	//��������ʱ��
	protected String labApplyTime;
	protected String labApplyTimeOper = EQUAL;

	//���������˴���
	protected String labApplierCode;
	protected String labApplierCodeOper = EQUAL;

	//��������������
	protected String labApplierName;
	protected String labApplierNameOper = EQUAL;

	//�걾�ύʱ��
	protected String sampleSubmitTime;
	protected String sampleSubmitTimeOper = EQUAL;

	//�걾�ύ�˴���
	protected String sampleSubmiterCode;
	protected String sampleSubmiterCodeOper = EQUAL;

	//�걾�ύ������
	protected String sampleSubmiterName;
	protected String sampleSubmiterNameOper = EQUAL;

	//������Ҵ���
	protected String applierDeptCode;
	protected String applierDeptCodeOper = EQUAL;

	//�������
	protected String applierDept;
	protected String applierDeptOper = EQUAL;

	//�걾����
	protected String sampleCode;
	protected String sampleCodeOper = EQUAL;

	//�걾
	protected String sample;
	protected String sampleOper = EQUAL;

	//�Ӽ���־��N�����Ӽ���Y���Ӽ���
	protected String isUrgent;
	protected String isUrgentOper = EQUAL;

	//����״̬
	protected String labStatus;
	protected String labStatusOper = EQUAL;

	//����ʱ��
	protected String labTime;
	protected String labTimeOper = EQUAL;

	//������ID��
	protected String labRecorderId;
	protected String labRecorderIdOper = EQUAL;

	//������
	protected String labRecorder;
	protected String labRecorderOper = EQUAL;

	//�����ID��
	protected String auditUserId;
	protected String auditUserIdOper = EQUAL;

	//���������
	protected String auditUserName;
	protected String auditUserNameOper = EQUAL;

	//��������
	protected String labInstrument;
	protected String labInstrumentOper = EQUAL;

	//������Ҵ���
	protected String labDeptCode;
	protected String labDeptCodeOper = EQUAL;

	//�����������
	protected String labDeptName;
	protected String labDeptNameOper = EQUAL;

	//�걾����ʱ��
	protected String sampleRecvTime;
	protected String sampleRecvTimeOper = EQUAL;

	//�걾������id
	protected String sampleReceiverId;
	protected String sampleReceiverIdOper = EQUAL;

	//�걾������
	protected String sampleReceiver;
	protected String sampleReceiverOper = EQUAL;

	//����
	protected String age;
	protected String ageOper = EQUAL;

	//����
	protected String bedNo;
	protected String bedNoOper = EQUAL;

	//�����־
	protected String isBacilli;
	protected String isBacilliOper = EQUAL;

	//Σ��ֵ����
	protected String dangerDescribe;
	protected String dangerDescribeOper = EQUAL;

	//���������־
	protected String labOtherFlag;
	protected String labOtherFlagOper = EQUAL;

	//��ע
	protected String remark;
	protected String remarkOper = EQUAL;

	//�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
	protected String impflag;
	protected String impflagOper = EQUAL;

	//����˵��
	protected String returndesc;
	protected String returndescOper = EQUAL;

	//�����ַ���
	protected String orderByStr = null;
	
	protected int SectionNo;
	protected int TestTypeNo;
	protected String SampleNo;
	protected String PatNo;

	/**
	 * ��¼��ˮ�� ����	key��Get����
	 */
	public String getRecordflow() {
		return recordflow;
	}

	/**
	 * ��¼��ˮ�� ����	key��Set����
	 * @param Recordflow
	 */
	public void setRecordflow(String recordflow) {
		this.recordflow = recordflow;
	}

	/**
	 * ��¼��ˮ�� ����	key��Set��ѯ����������
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
	 * ��¼��ˮ�� ����	key��Get��ѯ����������
	 */
	public String getRecordflowOper() {
		return recordflowOper;
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
	 * ���鵥�����Get����
	 */
	public String getLabRepCode() {
		return labRepCode;
	}

	/**
	 * ���鵥�����Set����
	 * @param LabRepCode
	 */
	public void setLabRepCode(String labRepCode) {
		this.labRepCode = labRepCode;
	}

	/**
	 * ���鵥�����Set��ѯ����������
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
	 * ���鵥�����Get��ѯ����������
	 */
	public String getLabRepCodeOper() {
		return labRepCodeOper;
	}

	/**
	 * ���鵥���Ƶ�Get����
	 */
	public String getLabRepName() {
		return labRepName;
	}

	/**
	 * ���鵥���Ƶ�Set����
	 * @param LabRepName
	 */
	public void setLabRepName(String labRepName) {
		this.labRepName = labRepName;
	}

	/**
	 * ���鵥���Ƶ�Set��ѯ����������
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
	 * ���鵥���Ƶ�Get��ѯ����������
	 */
	public String getLabRepNameOper() {
		return labRepNameOper;
	}

	/**
	 * ��������ʱ���Get����
	 */
	public String getLabApplyTime() {
		return labApplyTime;
	}

	/**
	 * ��������ʱ���Set����
	 * @param LabApplyTime
	 */
	public void setLabApplyTime(String labApplyTime) {
		this.labApplyTime = labApplyTime;
	}

	/**
	 * ��������ʱ���Set��ѯ����������
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
	 * ��������ʱ���Get��ѯ����������
	 */
	public String getLabApplyTimeOper() {
		return labApplyTimeOper;
	}

	/**
	 * ���������˴����Get����
	 */
	public String getLabApplierCode() {
		return labApplierCode;
	}

	/**
	 * ���������˴����Set����
	 * @param LabApplierCode
	 */
	public void setLabApplierCode(String labApplierCode) {
		this.labApplierCode = labApplierCode;
	}

	/**
	 * ���������˴����Set��ѯ����������
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
	 * ���������˴����Get��ѯ����������
	 */
	public String getLabApplierCodeOper() {
		return labApplierCodeOper;
	}

	/**
	 * ����������������Get����
	 */
	public String getLabApplierName() {
		return labApplierName;
	}

	/**
	 * ����������������Set����
	 * @param LabApplierName
	 */
	public void setLabApplierName(String labApplierName) {
		this.labApplierName = labApplierName;
	}

	/**
	 * ����������������Set��ѯ����������
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
	 * ����������������Get��ѯ����������
	 */
	public String getLabApplierNameOper() {
		return labApplierNameOper;
	}

	/**
	 * �걾�ύʱ���Get����
	 */
	public String getSampleSubmitTime() {
		return sampleSubmitTime;
	}

	/**
	 * �걾�ύʱ���Set����
	 * @param SampleSubmitTime
	 */
	public void setSampleSubmitTime(String sampleSubmitTime) {
		this.sampleSubmitTime = sampleSubmitTime;
	}

	/**
	 * �걾�ύʱ���Set��ѯ����������
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
	 * �걾�ύʱ���Get��ѯ����������
	 */
	public String getSampleSubmitTimeOper() {
		return sampleSubmitTimeOper;
	}

	/**
	 * �걾�ύ�˴����Get����
	 */
	public String getSampleSubmiterCode() {
		return sampleSubmiterCode;
	}

	/**
	 * �걾�ύ�˴����Set����
	 * @param SampleSubmiterCode
	 */
	public void setSampleSubmiterCode(String sampleSubmiterCode) {
		this.sampleSubmiterCode = sampleSubmiterCode;
	}

	/**
	 * �걾�ύ�˴����Set��ѯ����������
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
	 * �걾�ύ�˴����Get��ѯ����������
	 */
	public String getSampleSubmiterCodeOper() {
		return sampleSubmiterCodeOper;
	}

	/**
	 * �걾�ύ��������Get����
	 */
	public String getSampleSubmiterName() {
		return sampleSubmiterName;
	}

	/**
	 * �걾�ύ��������Set����
	 * @param SampleSubmiterName
	 */
	public void setSampleSubmiterName(String sampleSubmiterName) {
		this.sampleSubmiterName = sampleSubmiterName;
	}

	/**
	 * �걾�ύ��������Set��ѯ����������
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
	 * �걾�ύ��������Get��ѯ����������
	 */
	public String getSampleSubmiterNameOper() {
		return sampleSubmiterNameOper;
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
	 * �걾�����Get����
	 */
	public String getSampleCode() {
		return sampleCode;
	}

	/**
	 * �걾�����Set����
	 * @param SampleCode
	 */
	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}

	/**
	 * �걾�����Set��ѯ����������
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
	 * �걾�����Get��ѯ����������
	 */
	public String getSampleCodeOper() {
		return sampleCodeOper;
	}

	/**
	 * �걾��Get����
	 */
	public String getSample() {
		return sample;
	}

	/**
	 * �걾��Set����
	 * @param Sample
	 */
	public void setSample(String sample) {
		this.sample = sample;
	}

	/**
	 * �걾��Set��ѯ����������
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
	 * �걾��Get��ѯ����������
	 */
	public String getSampleOper() {
		return sampleOper;
	}

	/**
	 * �Ӽ���־��N�����Ӽ���Y���Ӽ�����Get����
	 */
	public String getIsUrgent() {
		return isUrgent;
	}

	/**
	 * �Ӽ���־��N�����Ӽ���Y���Ӽ�����Set����
	 * @param IsUrgent
	 */
	public void setIsUrgent(String isUrgent) {
		this.isUrgent = isUrgent;
	}

	/**
	 * �Ӽ���־��N�����Ӽ���Y���Ӽ�����Set��ѯ����������
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
	 * �Ӽ���־��N�����Ӽ���Y���Ӽ�����Get��ѯ����������
	 */
	public String getIsUrgentOper() {
		return isUrgentOper;
	}

	/**
	 * ����״̬��Get����
	 */
	public String getLabStatus() {
		return labStatus;
	}

	/**
	 * ����״̬��Set����
	 * @param LabStatus
	 */
	public void setLabStatus(String labStatus) {
		this.labStatus = labStatus;
	}

	/**
	 * ����״̬��Set��ѯ����������
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
	 * ����״̬��Get��ѯ����������
	 */
	public String getLabStatusOper() {
		return labStatusOper;
	}

	/**
	 * ����ʱ���Get����
	 */
	public String getLabTime() {
		return labTime;
	}

	/**
	 * ����ʱ���Set����
	 * @param LabTime
	 */
	public void setLabTime(String labTime) {
		this.labTime = labTime;
	}

	/**
	 * ����ʱ���Set��ѯ����������
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
	 * ����ʱ���Get��ѯ����������
	 */
	public String getLabTimeOper() {
		return labTimeOper;
	}

	/**
	 * ������ID�ŵ�Get����
	 */
	public String getLabRecorderId() {
		return labRecorderId;
	}

	/**
	 * ������ID�ŵ�Set����
	 * @param LabRecorderId
	 */
	public void setLabRecorderId(String labRecorderId) {
		this.labRecorderId = labRecorderId;
	}

	/**
	 * ������ID�ŵ�Set��ѯ����������
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
	 * ������ID�ŵ�Get��ѯ����������
	 */
	public String getLabRecorderIdOper() {
		return labRecorderIdOper;
	}

	/**
	 * �����˵�Get����
	 */
	public String getLabRecorder() {
		return labRecorder;
	}

	/**
	 * �����˵�Set����
	 * @param LabRecorder
	 */
	public void setLabRecorder(String labRecorder) {
		this.labRecorder = labRecorder;
	}

	/**
	 * �����˵�Set��ѯ����������
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
	 * �����˵�Get��ѯ����������
	 */
	public String getLabRecorderOper() {
		return labRecorderOper;
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
	 * ����������Get����
	 */
	public String getLabInstrument() {
		return labInstrument;
	}

	/**
	 * ����������Set����
	 * @param LabInstrument
	 */
	public void setLabInstrument(String labInstrument) {
		this.labInstrument = labInstrument;
	}

	/**
	 * ����������Set��ѯ����������
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
	 * ����������Get��ѯ����������
	 */
	public String getLabInstrumentOper() {
		return labInstrumentOper;
	}

	/**
	 * ������Ҵ����Get����
	 */
	public String getLabDeptCode() {
		return labDeptCode;
	}

	/**
	 * ������Ҵ����Set����
	 * @param LabDeptCode
	 */
	public void setLabDeptCode(String labDeptCode) {
		this.labDeptCode = labDeptCode;
	}

	/**
	 * ������Ҵ����Set��ѯ����������
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
	 * ������Ҵ����Get��ѯ����������
	 */
	public String getLabDeptCodeOper() {
		return labDeptCodeOper;
	}

	/**
	 * ����������Ƶ�Get����
	 */
	public String getLabDeptName() {
		return labDeptName;
	}

	/**
	 * ����������Ƶ�Set����
	 * @param LabDeptName
	 */
	public void setLabDeptName(String labDeptName) {
		this.labDeptName = labDeptName;
	}

	/**
	 * ����������Ƶ�Set��ѯ����������
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
	 * ����������Ƶ�Get��ѯ����������
	 */
	public String getLabDeptNameOper() {
		return labDeptNameOper;
	}

	/**
	 * �걾����ʱ���Get����
	 */
	public String getSampleRecvTime() {
		return sampleRecvTime;
	}

	/**
	 * �걾����ʱ���Set����
	 * @param SampleRecvTime
	 */
	public void setSampleRecvTime(String sampleRecvTime) {
		this.sampleRecvTime = sampleRecvTime;
	}

	/**
	 * �걾����ʱ���Set��ѯ����������
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
	 * �걾����ʱ���Get��ѯ����������
	 */
	public String getSampleRecvTimeOper() {
		return sampleRecvTimeOper;
	}

	/**
	 * �걾������id��Get����
	 */
	public String getSampleReceiverId() {
		return sampleReceiverId;
	}

	/**
	 * �걾������id��Set����
	 * @param SampleReceiverId
	 */
	public void setSampleReceiverId(String sampleReceiverId) {
		this.sampleReceiverId = sampleReceiverId;
	}

	/**
	 * �걾������id��Set��ѯ����������
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
	 * �걾������id��Get��ѯ����������
	 */
	public String getSampleReceiverIdOper() {
		return sampleReceiverIdOper;
	}

	/**
	 * �걾�����˵�Get����
	 */
	public String getSampleReceiver() {
		return sampleReceiver;
	}

	/**
	 * �걾�����˵�Set����
	 * @param SampleReceiver
	 */
	public void setSampleReceiver(String sampleReceiver) {
		this.sampleReceiver = sampleReceiver;
	}

	/**
	 * �걾�����˵�Set��ѯ����������
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
	 * �걾�����˵�Get��ѯ����������
	 */
	public String getSampleReceiverOper() {
		return sampleReceiverOper;
	}

	/**
	 * �����Get����
	 */
	public String getAge() {
		return age;
	}

	/**
	 * �����Set����
	 * @param Age
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * �����Set��ѯ����������
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
	 * �����Get��ѯ����������
	 */
	public String getAgeOper() {
		return ageOper;
	}

	/**
	 * ���ŵ�Get����
	 */
	public String getBedNo() {
		return bedNo;
	}

	/**
	 * ���ŵ�Set����
	 * @param BedNo
	 */
	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}

	/**
	 * ���ŵ�Set��ѯ����������
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
	 * ���ŵ�Get��ѯ����������
	 */
	public String getBedNoOper() {
		return bedNoOper;
	}

	/**
	 * �����־��Get����
	 */
	public String getIsBacilli() {
		return isBacilli;
	}

	/**
	 * �����־��Set����
	 * @param IsBacilli
	 */
	public void setIsBacilli(String isBacilli) {
		this.isBacilli = isBacilli;
	}

	/**
	 * �����־��Set��ѯ����������
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
	 * �����־��Get��ѯ����������
	 */
	public String getIsBacilliOper() {
		return isBacilliOper;
	}

	/**
	 * Σ��ֵ������Get����
	 */
	public String getDangerDescribe() {
		return dangerDescribe;
	}

	/**
	 * Σ��ֵ������Set����
	 * @param DangerDescribe
	 */
	public void setDangerDescribe(String dangerDescribe) {
		this.dangerDescribe = dangerDescribe;
	}

	/**
	 * Σ��ֵ������Set��ѯ����������
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
	 * Σ��ֵ������Get��ѯ����������
	 */
	public String getDangerDescribeOper() {
		return dangerDescribeOper;
	}

	/**
	 * ���������־��Get����
	 */
	public String getLabOtherFlag() {
		return labOtherFlag;
	}

	/**
	 * ���������־��Set����
	 * @param LabOtherFlag
	 */
	public void setLabOtherFlag(String labOtherFlag) {
		this.labOtherFlag = labOtherFlag;
	}

	/**
	 * ���������־��Set��ѯ����������
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
	 * ���������־��Get��ѯ����������
	 */
	public String getLabOtherFlagOper() {
		return labOtherFlagOper;
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
	 * ���ɼ�¼log���ַ���
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
