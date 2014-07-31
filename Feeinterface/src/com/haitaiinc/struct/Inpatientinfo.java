package com.haitaiinc.struct;


/**
 * @author haitaiinc
 * InPatientInfo
 */
public class Inpatientinfo {
	public static final String TABLENAME = "InPatientInfo";
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

	//����סԺ��ˮ�� ����
	protected String ipid;
	protected String ipidOper = EQUAL;

	//����ID
	protected String pid;
	protected String pidOper = EQUAL;

	//סԺ��
	protected String adminissionno;
	protected String adminissionnoOper = EQUAL;

	//סԺ����
	protected String admissiontimes;
	protected String admissiontimesOper = EQUAL;

	//��������
	protected String patientname;
	protected String patientnameOper = EQUAL;

	//�Ա����
	protected String sexcode;
	protected String sexcodeOper = EQUAL;

	//�Ա�
	protected String sex;
	protected String sexOper = EQUAL;

	//����
	protected String age;
	protected String ageOper = EQUAL;

	//����˵��
	protected String agedesc;
	protected String agedescOper = EQUAL;

	//����״������
	protected String marriagestatuscode;
	protected String marriagestatuscodeOper = EQUAL;

	//����״��
	protected String marriagestatus;
	protected String marriagestatusOper = EQUAL;

	//�ѱ����
	protected String feetypecode;
	protected String feetypecodeOper = EQUAL;

	//�ѱ�
	protected String feetypename;
	protected String feetypenameOper = EQUAL;

	//�������
	protected String patientclass;
	protected String patientclassOper = EQUAL;

	//��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss��
	protected String admissionregistertime;
	protected String admissionregistertimeOper = EQUAL;

	//��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss��
	protected String admissiontime;
	protected String admissiontimeOper = EQUAL;
	
	//��Ժ��ʽ
	protected String admissionway;
	protected String admissionwayOper = EQUAL;

	//��ԺĿ��
	protected String admissionpurpose;
	protected String admissionpurposeOper = EQUAL;

	//��ԺʱԺ��
	protected String admissionhospital;
	protected String admissionhospitalOper = EQUAL;

	//��Ժ���Ҵ���
	protected String admissiondeptcode;
	protected String admissiondeptcodeOper = EQUAL;

	//��Ժ����
	protected String admissiondept;
	protected String admissiondeptOper = EQUAL;

	//��Ժ��������
	protected String admissionwardcode;
	protected String admissionwardcodeOper = EQUAL;

	//��Ժ����
	protected String admissionward;
	protected String admissionwardOper = EQUAL;

	//��ǰԺ��
	protected String hospital;
	protected String hospitalOper = EQUAL;

	//��ǰ���Ҵ���
	protected String deptcode;
	protected String deptcodeOper = EQUAL;

	//��ǰ��������
	protected String deptname;
	protected String deptnameOper = EQUAL;

	//��ǰ��������
	protected String wardcode;
	protected String wardcodeOper = EQUAL;

	//��ǰ��������
	protected String wardname;
	protected String wardnameOper = EQUAL;

	//��Ժʱ�䣨��ʽ��yyyyMMddHHmmss��
	protected String dischargetime;
	protected String dischargetimeOper = EQUAL;

	//����
	protected String bedno;
	protected String bednoOper = EQUAL;

	//��λ������
	protected String bedfeetype;
	protected String bedfeetypeOper = EQUAL;

	//����
	protected String room;
	protected String roomOper = EQUAL;

	//����
	protected String stateofillness;
	protected String stateofillnessOper = EQUAL;

	//�ܴ�ҽ��ID
	protected String doctorid;
	protected String doctoridOper = EQUAL;

	//�ܴ�ҽ��
	protected String doctor;
	protected String doctorOper = EQUAL;

	//���������
	protected String medicalfrpcode;
	protected String medicalfrpcodeOper = EQUAL;

	//������
	protected String medicalgrp;
	protected String medicalgrpOper = EQUAL;

	//����ȼ�
	protected String nursionglevel;
	protected String nursionglevelOper = EQUAL;

	//�ܴ���ʿID
	protected String nurseid;
	protected String nurseidOper = EQUAL;

	//�ܴ���ʿ
	protected String nurse;
	protected String nurseOper = EQUAL;

	//���������
	protected String nursinggrpcode;
	protected String nursinggrpcodeOper = EQUAL;

	//������
	protected String nursionggrp;
	protected String nursionggrpOper = EQUAL;

	//סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿
	protected String instatus;
	protected String instatusOper = EQUAL;

	//����״̬��i��������o�����鵵��p���鵵��
	protected String mrstatus;
	protected String mrstatusOper = EQUAL;

	//��Ժ��ʽ��SW��������ZC��������ZY��תԺ��
	protected String dischargeway;
	protected String dischargewayOper = EQUAL;

	//�������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ�����
	protected String managetype;
	protected String managetypeOper = EQUAL;

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
	 * ����סԺ��ˮ�� �����Get����
	 */
	public String getIpid() {
		return ipid;
	}

	/**
	 * ����סԺ��ˮ�� �����Set����
	 * @param Ipid
	 */
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	/**
	 * ����סԺ��ˮ�� �����Set��ѯ����������
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
	 * ����סԺ��ˮ�� �����Get��ѯ����������
	 */
	public String getIpidOper() {
		return ipidOper;
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
	 * סԺ�ŵ�Get����
	 */
	public String getAdminissionno() {
		return adminissionno;
	}

	/**
	 * סԺ�ŵ�Set����
	 * @param Adminissionno
	 */
	public void setAdminissionno(String adminissionno) {
		this.adminissionno = adminissionno;
	}

	/**
	 * סԺ�ŵ�Set��ѯ����������
	 * @param AdminissionnoOper
	 */
	public void setAdminissionnoOper(String adminissionnoOper) {
		if (adminissionnoOper == null || adminissionnoOper.trim().length() == 0) {
			adminissionnoOper = EQUAL;
		}
		else {
			this.adminissionnoOper = adminissionnoOper;
		}
	}

	/**
	 * סԺ�ŵ�Get��ѯ����������
	 */
	public String getAdminissionnoOper() {
		return adminissionnoOper;
	}

	/**
	 * סԺ������Get����
	 */
	public String getAdmissiontimes() {
		return admissiontimes;
	}

	/**
	 * סԺ������Set����
	 * @param Admissiontimes
	 */
	public void setAdmissiontimes(String admissiontimes) {
		this.admissiontimes = admissiontimes;
	}

	/**
	 * סԺ������Set��ѯ����������
	 * @param AdmissiontimesOper
	 */
	public void setAdmissiontimesOper(String admissiontimesOper) {
		if (admissiontimesOper == null || admissiontimesOper.trim().length() == 0) {
			admissiontimesOper = EQUAL;
		}
		else {
			this.admissiontimesOper = admissiontimesOper;
		}
	}

	/**
	 * סԺ������Get��ѯ����������
	 */
	public String getAdmissiontimesOper() {
		return admissiontimesOper;
	}

	/**
	 * ����������Get����
	 */
	public String getPatientname() {
		return patientname;
	}

	/**
	 * ����������Set����
	 * @param Patientname
	 */
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	/**
	 * ����������Set��ѯ����������
	 * @param PatientnameOper
	 */
	public void setPatientnameOper(String patientnameOper) {
		if (patientnameOper == null || patientnameOper.trim().length() == 0) {
			patientnameOper = EQUAL;
		}
		else {
			this.patientnameOper = patientnameOper;
		}
	}

	/**
	 * ����������Get��ѯ����������
	 */
	public String getPatientnameOper() {
		return patientnameOper;
	}

	/**
	 * �Ա�����Get����
	 */
	public String getSexcode() {
		return sexcode;
	}

	/**
	 * �Ա�����Set����
	 * @param Sexcode
	 */
	public void setSexcode(String sexcode) {
		this.sexcode = sexcode;
	}

	/**
	 * �Ա�����Set��ѯ����������
	 * @param SexcodeOper
	 */
	public void setSexcodeOper(String sexcodeOper) {
		if (sexcodeOper == null || sexcodeOper.trim().length() == 0) {
			sexcodeOper = EQUAL;
		}
		else {
			this.sexcodeOper = sexcodeOper;
		}
	}

	/**
	 * �Ա�����Get��ѯ����������
	 */
	public String getSexcodeOper() {
		return sexcodeOper;
	}

	/**
	 * �Ա��Get����
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * �Ա��Set����
	 * @param Sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * �Ա��Set��ѯ����������
	 * @param SexOper
	 */
	public void setSexOper(String sexOper) {
		if (sexOper == null || sexOper.trim().length() == 0) {
			sexOper = EQUAL;
		}
		else {
			this.sexOper = sexOper;
		}
	}

	/**
	 * �Ա��Get��ѯ����������
	 */
	public String getSexOper() {
		return sexOper;
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
	 * ����˵����Get����
	 */
	public String getAgedesc() {
		return agedesc;
	}

	/**
	 * ����˵����Set����
	 * @param Agedesc
	 */
	public void setAgedesc(String agedesc) {
		this.agedesc = agedesc;
	}

	/**
	 * ����˵����Set��ѯ����������
	 * @param AgedescOper
	 */
	public void setAgedescOper(String agedescOper) {
		if (agedescOper == null || agedescOper.trim().length() == 0) {
			agedescOper = EQUAL;
		}
		else {
			this.agedescOper = agedescOper;
		}
	}

	/**
	 * ����˵����Get��ѯ����������
	 */
	public String getAgedescOper() {
		return agedescOper;
	}

	/**
	 * ����״�������Get����
	 */
	public String getMarriagestatuscode() {
		return marriagestatuscode;
	}

	/**
	 * ����״�������Set����
	 * @param Marriagestatuscode
	 */
	public void setMarriagestatuscode(String marriagestatuscode) {
		this.marriagestatuscode = marriagestatuscode;
	}

	/**
	 * ����״�������Set��ѯ����������
	 * @param MarriagestatuscodeOper
	 */
	public void setMarriagestatuscodeOper(String marriagestatuscodeOper) {
		if (marriagestatuscodeOper == null || marriagestatuscodeOper.trim().length() == 0) {
			marriagestatuscodeOper = EQUAL;
		}
		else {
			this.marriagestatuscodeOper = marriagestatuscodeOper;
		}
	}

	/**
	 * ����״�������Get��ѯ����������
	 */
	public String getMarriagestatuscodeOper() {
		return marriagestatuscodeOper;
	}

	/**
	 * ����״����Get����
	 */
	public String getMarriagestatus() {
		return marriagestatus;
	}

	/**
	 * ����״����Set����
	 * @param Marriagestatus
	 */
	public void setMarriagestatus(String marriagestatus) {
		this.marriagestatus = marriagestatus;
	}

	/**
	 * ����״����Set��ѯ����������
	 * @param MarriagestatusOper
	 */
	public void setMarriagestatusOper(String marriagestatusOper) {
		if (marriagestatusOper == null || marriagestatusOper.trim().length() == 0) {
			marriagestatusOper = EQUAL;
		}
		else {
			this.marriagestatusOper = marriagestatusOper;
		}
	}

	/**
	 * ����״����Get��ѯ����������
	 */
	public String getMarriagestatusOper() {
		return marriagestatusOper;
	}

	/**
	 * �ѱ�����Get����
	 */
	public String getFeetypecode() {
		return feetypecode;
	}

	/**
	 * �ѱ�����Set����
	 * @param Feetypecode
	 */
	public void setFeetypecode(String feetypecode) {
		this.feetypecode = feetypecode;
	}

	/**
	 * �ѱ�����Set��ѯ����������
	 * @param FeetypecodeOper
	 */
	public void setFeetypecodeOper(String feetypecodeOper) {
		if (feetypecodeOper == null || feetypecodeOper.trim().length() == 0) {
			feetypecodeOper = EQUAL;
		}
		else {
			this.feetypecodeOper = feetypecodeOper;
		}
	}

	/**
	 * �ѱ�����Get��ѯ����������
	 */
	public String getFeetypecodeOper() {
		return feetypecodeOper;
	}

	/**
	 * �ѱ��Get����
	 */
	public String getFeetypename() {
		return feetypename;
	}

	/**
	 * �ѱ��Set����
	 * @param Feetypename
	 */
	public void setFeetypename(String feetypename) {
		this.feetypename = feetypename;
	}

	/**
	 * �ѱ��Set��ѯ����������
	 * @param FeetypenameOper
	 */
	public void setFeetypenameOper(String feetypenameOper) {
		if (feetypenameOper == null || feetypenameOper.trim().length() == 0) {
			feetypenameOper = EQUAL;
		}
		else {
			this.feetypenameOper = feetypenameOper;
		}
	}

	/**
	 * �ѱ��Get��ѯ����������
	 */
	public String getFeetypenameOper() {
		return feetypenameOper;
	}

	/**
	 * ������ݵ�Get����
	 */
	public String getPatientclass() {
		return patientclass;
	}

	/**
	 * ������ݵ�Set����
	 * @param Patientclass
	 */
	public void setPatientclass(String patientclass) {
		this.patientclass = patientclass;
	}

	/**
	 * ������ݵ�Set��ѯ����������
	 * @param PatientclassOper
	 */
	public void setPatientclassOper(String patientclassOper) {
		if (patientclassOper == null || patientclassOper.trim().length() == 0) {
			patientclassOper = EQUAL;
		}
		else {
			this.patientclassOper = patientclassOper;
		}
	}

	/**
	 * ������ݵ�Get��ѯ����������
	 */
	public String getPatientclassOper() {
		return patientclassOper;
	}

	/**
	 * ��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss����Get����
	 */
	public String getAdmissionregistertime() {
		return admissionregistertime;
	}

	/**
	 * ��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss����Set����
	 * @param Admissionregistertime
	 */
	public void setAdmissionregistertime(String admissionregistertime) {
		this.admissionregistertime = admissionregistertime;
	}

	/**
	 * ��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss����Set��ѯ����������
	 * @param AdmissionregistertimeOper
	 */
	public void setAdmissionregistertimeOper(String admissionregistertimeOper) {
		if (admissionregistertimeOper == null || admissionregistertimeOper.trim().length() == 0) {
			admissionregistertimeOper = EQUAL;
		}
		else {
			this.admissionregistertimeOper = admissionregistertimeOper;
		}
	}

	/**
	 * ��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss����Get��ѯ����������
	 */
	public String getAdmissionregistertimeOper() {
		return admissionregistertimeOper;
	}

	/**
	 * ���ʱ�䣨��ʽ��yyyyMMddHHmmss����Get����
	 */
	public String getAdmissiontime() {
		return admissiontime;
	}

	/**
	 * ���ʱ�䣨��ʽ��yyyyMMddHHmmss����Set����
	 * @param Admissionregistertime
	 */
	public void setAdmissiontime(String admissiontime) {
		this.admissiontime = admissiontime;
	}

	/**
	 * ���ʱ�䣨��ʽ��yyyyMMddHHmmss����Set��ѯ����������
	 * @param AdmissiontimeOper
	 */
	public void setAdmissiontimeOper(String admissiontimeOper) {
		if (admissiontimeOper == null || admissiontimeOper.trim().length() == 0) {
			admissiontimeOper = EQUAL;
		}
		else {
			this.admissiontimeOper = admissiontimeOper;
		}
	}

	/**
	 * ���ʱ�䣨��ʽ��yyyyMMddHHmmss����Get��ѯ����������
	 */
	public String getAdmissiontimeOper() {
		return admissiontimeOper;
	}
	/**
	 * ��Ժ��ʽ��Get����
	 */
	public String getAdmissionway() {
		return admissionway;
	}

	/**
	 * ��Ժ��ʽ��Set����
	 * @param Admissionway
	 */
	public void setAdmissionway(String admissionway) {
		this.admissionway = admissionway;
	}

	/**
	 * ��Ժ��ʽ��Set��ѯ����������
	 * @param AdmissionwayOper
	 */
	public void setAdmissionwayOper(String admissionwayOper) {
		if (admissionwayOper == null || admissionwayOper.trim().length() == 0) {
			admissionwayOper = EQUAL;
		}
		else {
			this.admissionwayOper = admissionwayOper;
		}
	}

	/**
	 * ��Ժ��ʽ��Get��ѯ����������
	 */
	public String getAdmissionwayOper() {
		return admissionwayOper;
	}

	/**
	 * ��ԺĿ�ĵ�Get����
	 */
	public String getAdmissionpurpose() {
		return admissionpurpose;
	}

	/**
	 * ��ԺĿ�ĵ�Set����
	 * @param Admissionpurpose
	 */
	public void setAdmissionpurpose(String admissionpurpose) {
		this.admissionpurpose = admissionpurpose;
	}

	/**
	 * ��ԺĿ�ĵ�Set��ѯ����������
	 * @param AdmissionpurposeOper
	 */
	public void setAdmissionpurposeOper(String admissionpurposeOper) {
		if (admissionpurposeOper == null || admissionpurposeOper.trim().length() == 0) {
			admissionpurposeOper = EQUAL;
		}
		else {
			this.admissionpurposeOper = admissionpurposeOper;
		}
	}

	/**
	 * ��ԺĿ�ĵ�Get��ѯ����������
	 */
	public String getAdmissionpurposeOper() {
		return admissionpurposeOper;
	}

	/**
	 * ��ԺʱԺ����Get����
	 */
	public String getAdmissionhospital() {
		return admissionhospital;
	}

	/**
	 * ��ԺʱԺ����Set����
	 * @param Admissionhospital
	 */
	public void setAdmissionhospital(String admissionhospital) {
		this.admissionhospital = admissionhospital;
	}

	/**
	 * ��ԺʱԺ����Set��ѯ����������
	 * @param AdmissionhospitalOper
	 */
	public void setAdmissionhospitalOper(String admissionhospitalOper) {
		if (admissionhospitalOper == null || admissionhospitalOper.trim().length() == 0) {
			admissionhospitalOper = EQUAL;
		}
		else {
			this.admissionhospitalOper = admissionhospitalOper;
		}
	}

	/**
	 * ��ԺʱԺ����Get��ѯ����������
	 */
	public String getAdmissionhospitalOper() {
		return admissionhospitalOper;
	}

	/**
	 * ��Ժ���Ҵ����Get����
	 */
	public String getAdmissiondeptcode() {
		return admissiondeptcode;
	}

	/**
	 * ��Ժ���Ҵ����Set����
	 * @param Admissiondeptcode
	 */
	public void setAdmissiondeptcode(String admissiondeptcode) {
		this.admissiondeptcode = admissiondeptcode;
	}

	/**
	 * ��Ժ���Ҵ����Set��ѯ����������
	 * @param AdmissiondeptcodeOper
	 */
	public void setAdmissiondeptcodeOper(String admissiondeptcodeOper) {
		if (admissiondeptcodeOper == null || admissiondeptcodeOper.trim().length() == 0) {
			admissiondeptcodeOper = EQUAL;
		}
		else {
			this.admissiondeptcodeOper = admissiondeptcodeOper;
		}
	}

	/**
	 * ��Ժ���Ҵ����Get��ѯ����������
	 */
	public String getAdmissiondeptcodeOper() {
		return admissiondeptcodeOper;
	}

	/**
	 * ��Ժ���ҵ�Get����
	 */
	public String getAdmissiondept() {
		return admissiondept;
	}

	/**
	 * ��Ժ���ҵ�Set����
	 * @param Admissiondept
	 */
	public void setAdmissiondept(String admissiondept) {
		this.admissiondept = admissiondept;
	}

	/**
	 * ��Ժ���ҵ�Set��ѯ����������
	 * @param AdmissiondeptOper
	 */
	public void setAdmissiondeptOper(String admissiondeptOper) {
		if (admissiondeptOper == null || admissiondeptOper.trim().length() == 0) {
			admissiondeptOper = EQUAL;
		}
		else {
			this.admissiondeptOper = admissiondeptOper;
		}
	}

	/**
	 * ��Ժ���ҵ�Get��ѯ����������
	 */
	public String getAdmissiondeptOper() {
		return admissiondeptOper;
	}

	/**
	 * ��Ժ���������Get����
	 */
	public String getAdmissionwardcode() {
		return admissionwardcode;
	}

	/**
	 * ��Ժ���������Set����
	 * @param Admissionwardcode
	 */
	public void setAdmissionwardcode(String admissionwardcode) {
		this.admissionwardcode = admissionwardcode;
	}

	/**
	 * ��Ժ���������Set��ѯ����������
	 * @param AdmissionwardcodeOper
	 */
	public void setAdmissionwardcodeOper(String admissionwardcodeOper) {
		if (admissionwardcodeOper == null || admissionwardcodeOper.trim().length() == 0) {
			admissionwardcodeOper = EQUAL;
		}
		else {
			this.admissionwardcodeOper = admissionwardcodeOper;
		}
	}

	/**
	 * ��Ժ���������Get��ѯ����������
	 */
	public String getAdmissionwardcodeOper() {
		return admissionwardcodeOper;
	}

	/**
	 * ��Ժ������Get����
	 */
	public String getAdmissionward() {
		return admissionward;
	}

	/**
	 * ��Ժ������Set����
	 * @param Admissionward
	 */
	public void setAdmissionward(String admissionward) {
		this.admissionward = admissionward;
	}

	/**
	 * ��Ժ������Set��ѯ����������
	 * @param AdmissionwardOper
	 */
	public void setAdmissionwardOper(String admissionwardOper) {
		if (admissionwardOper == null || admissionwardOper.trim().length() == 0) {
			admissionwardOper = EQUAL;
		}
		else {
			this.admissionwardOper = admissionwardOper;
		}
	}

	/**
	 * ��Ժ������Get��ѯ����������
	 */
	public String getAdmissionwardOper() {
		return admissionwardOper;
	}

	/**
	 * ��ǰԺ����Get����
	 */
	public String getHospital() {
		return hospital;
	}

	/**
	 * ��ǰԺ����Set����
	 * @param Hospital
	 */
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	/**
	 * ��ǰԺ����Set��ѯ����������
	 * @param HospitalOper
	 */
	public void setHospitalOper(String hospitalOper) {
		if (hospitalOper == null || hospitalOper.trim().length() == 0) {
			hospitalOper = EQUAL;
		}
		else {
			this.hospitalOper = hospitalOper;
		}
	}

	/**
	 * ��ǰԺ����Get��ѯ����������
	 */
	public String getHospitalOper() {
		return hospitalOper;
	}

	/**
	 * ��ǰ���Ҵ����Get����
	 */
	public String getDeptcode() {
		return deptcode;
	}

	/**
	 * ��ǰ���Ҵ����Set����
	 * @param Deptcode
	 */
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	/**
	 * ��ǰ���Ҵ����Set��ѯ����������
	 * @param DeptcodeOper
	 */
	public void setDeptcodeOper(String deptcodeOper) {
		if (deptcodeOper == null || deptcodeOper.trim().length() == 0) {
			deptcodeOper = EQUAL;
		}
		else {
			this.deptcodeOper = deptcodeOper;
		}
	}

	/**
	 * ��ǰ���Ҵ����Get��ѯ����������
	 */
	public String getDeptcodeOper() {
		return deptcodeOper;
	}

	/**
	 * ��ǰ�������Ƶ�Get����
	 */
	public String getDeptname() {
		return deptname;
	}

	/**
	 * ��ǰ�������Ƶ�Set����
	 * @param Deptname
	 */
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	/**
	 * ��ǰ�������Ƶ�Set��ѯ����������
	 * @param DeptnameOper
	 */
	public void setDeptnameOper(String deptnameOper) {
		if (deptnameOper == null || deptnameOper.trim().length() == 0) {
			deptnameOper = EQUAL;
		}
		else {
			this.deptnameOper = deptnameOper;
		}
	}

	/**
	 * ��ǰ�������Ƶ�Get��ѯ����������
	 */
	public String getDeptnameOper() {
		return deptnameOper;
	}

	/**
	 * ��ǰ���������Get����
	 */
	public String getWardcode() {
		return wardcode;
	}

	/**
	 * ��ǰ���������Set����
	 * @param Wardcode
	 */
	public void setWardcode(String wardcode) {
		this.wardcode = wardcode;
	}

	/**
	 * ��ǰ���������Set��ѯ����������
	 * @param WardcodeOper
	 */
	public void setWardcodeOper(String wardcodeOper) {
		if (wardcodeOper == null || wardcodeOper.trim().length() == 0) {
			wardcodeOper = EQUAL;
		}
		else {
			this.wardcodeOper = wardcodeOper;
		}
	}

	/**
	 * ��ǰ���������Get��ѯ����������
	 */
	public String getWardcodeOper() {
		return wardcodeOper;
	}

	/**
	 * ��ǰ�������Ƶ�Get����
	 */
	public String getWardname() {
		return wardname;
	}

	/**
	 * ��ǰ�������Ƶ�Set����
	 * @param Wardname
	 */
	public void setWardname(String wardname) {
		this.wardname = wardname;
	}

	/**
	 * ��ǰ�������Ƶ�Set��ѯ����������
	 * @param WardnameOper
	 */
	public void setWardnameOper(String wardnameOper) {
		if (wardnameOper == null || wardnameOper.trim().length() == 0) {
			wardnameOper = EQUAL;
		}
		else {
			this.wardnameOper = wardnameOper;
		}
	}

	/**
	 * ��ǰ�������Ƶ�Get��ѯ����������
	 */
	public String getWardnameOper() {
		return wardnameOper;
	}

	/**
	 * ��Ժʱ�䣨��ʽ��yyyyMMddHHmmss����Get����
	 */
	public String getDischargetime() {
		return dischargetime;
	}

	/**
	 * ��Ժʱ�䣨��ʽ��yyyyMMddHHmmss����Set����
	 * @param Dischargetime
	 */
	public void setDischargetime(String dischargetime) {
		this.dischargetime = dischargetime;
	}

	/**
	 * ��Ժʱ�䣨��ʽ��yyyyMMddHHmmss����Set��ѯ����������
	 * @param DischargetimeOper
	 */
	public void setDischargetimeOper(String dischargetimeOper) {
		if (dischargetimeOper == null || dischargetimeOper.trim().length() == 0) {
			dischargetimeOper = EQUAL;
		}
		else {
			this.dischargetimeOper = dischargetimeOper;
		}
	}

	/**
	 * ��Ժʱ�䣨��ʽ��yyyyMMddHHmmss����Get��ѯ����������
	 */
	public String getDischargetimeOper() {
		return dischargetimeOper;
	}

	/**
	 * ���ŵ�Get����
	 */
	public String getBedno() {
		return bedno;
	}

	/**
	 * ���ŵ�Set����
	 * @param Bedno
	 */
	public void setBedno(String bedno) {
		this.bedno = bedno;
	}

	/**
	 * ���ŵ�Set��ѯ����������
	 * @param BednoOper
	 */
	public void setBednoOper(String bednoOper) {
		if (bednoOper == null || bednoOper.trim().length() == 0) {
			bednoOper = EQUAL;
		}
		else {
			this.bednoOper = bednoOper;
		}
	}

	/**
	 * ���ŵ�Get��ѯ����������
	 */
	public String getBednoOper() {
		return bednoOper;
	}

	/**
	 * ��λ�����͵�Get����
	 */
	public String getBedfeetype() {
		return bedfeetype;
	}

	/**
	 * ��λ�����͵�Set����
	 * @param Bedfeetype
	 */
	public void setBedfeetype(String bedfeetype) {
		this.bedfeetype = bedfeetype;
	}

	/**
	 * ��λ�����͵�Set��ѯ����������
	 * @param BedfeetypeOper
	 */
	public void setBedfeetypeOper(String bedfeetypeOper) {
		if (bedfeetypeOper == null || bedfeetypeOper.trim().length() == 0) {
			bedfeetypeOper = EQUAL;
		}
		else {
			this.bedfeetypeOper = bedfeetypeOper;
		}
	}

	/**
	 * ��λ�����͵�Get��ѯ����������
	 */
	public String getBedfeetypeOper() {
		return bedfeetypeOper;
	}

	/**
	 * ������Get����
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * ������Set����
	 * @param Room
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * ������Set��ѯ����������
	 * @param RoomOper
	 */
	public void setRoomOper(String roomOper) {
		if (roomOper == null || roomOper.trim().length() == 0) {
			roomOper = EQUAL;
		}
		else {
			this.roomOper = roomOper;
		}
	}

	/**
	 * ������Get��ѯ����������
	 */
	public String getRoomOper() {
		return roomOper;
	}

	/**
	 * �����Get����
	 */
	public String getStateofillness() {
		return stateofillness;
	}

	/**
	 * �����Set����
	 * @param Stateofillness
	 */
	public void setStateofillness(String stateofillness) {
		this.stateofillness = stateofillness;
	}

	/**
	 * �����Set��ѯ����������
	 * @param StateofillnessOper
	 */
	public void setStateofillnessOper(String stateofillnessOper) {
		if (stateofillnessOper == null || stateofillnessOper.trim().length() == 0) {
			stateofillnessOper = EQUAL;
		}
		else {
			this.stateofillnessOper = stateofillnessOper;
		}
	}

	/**
	 * �����Get��ѯ����������
	 */
	public String getStateofillnessOper() {
		return stateofillnessOper;
	}

	/**
	 * �ܴ�ҽ��ID��Get����
	 */
	public String getDoctorid() {
		return doctorid;
	}

	/**
	 * �ܴ�ҽ��ID��Set����
	 * @param Doctorid
	 */
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	/**
	 * �ܴ�ҽ��ID��Set��ѯ����������
	 * @param DoctoridOper
	 */
	public void setDoctoridOper(String doctoridOper) {
		if (doctoridOper == null || doctoridOper.trim().length() == 0) {
			doctoridOper = EQUAL;
		}
		else {
			this.doctoridOper = doctoridOper;
		}
	}

	/**
	 * �ܴ�ҽ��ID��Get��ѯ����������
	 */
	public String getDoctoridOper() {
		return doctoridOper;
	}

	/**
	 * �ܴ�ҽ����Get����
	 */
	public String getDoctor() {
		return doctor;
	}

	/**
	 * �ܴ�ҽ����Set����
	 * @param Doctor
	 */
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	/**
	 * �ܴ�ҽ����Set��ѯ����������
	 * @param DoctorOper
	 */
	public void setDoctorOper(String doctorOper) {
		if (doctorOper == null || doctorOper.trim().length() == 0) {
			doctorOper = EQUAL;
		}
		else {
			this.doctorOper = doctorOper;
		}
	}

	/**
	 * �ܴ�ҽ����Get��ѯ����������
	 */
	public String getDoctorOper() {
		return doctorOper;
	}

	/**
	 * ����������Get����
	 */
	public String getMedicalfrpcode() {
		return medicalfrpcode;
	}

	/**
	 * ����������Set����
	 * @param Medicalfrpcode
	 */
	public void setMedicalfrpcode(String medicalfrpcode) {
		this.medicalfrpcode = medicalfrpcode;
	}

	/**
	 * ����������Set��ѯ����������
	 * @param MedicalfrpcodeOper
	 */
	public void setMedicalfrpcodeOper(String medicalfrpcodeOper) {
		if (medicalfrpcodeOper == null || medicalfrpcodeOper.trim().length() == 0) {
			medicalfrpcodeOper = EQUAL;
		}
		else {
			this.medicalfrpcodeOper = medicalfrpcodeOper;
		}
	}

	/**
	 * ����������Get��ѯ����������
	 */
	public String getMedicalfrpcodeOper() {
		return medicalfrpcodeOper;
	}

	/**
	 * �������Get����
	 */
	public String getMedicalgrp() {
		return medicalgrp;
	}

	/**
	 * �������Set����
	 * @param Medicalgrp
	 */
	public void setMedicalgrp(String medicalgrp) {
		this.medicalgrp = medicalgrp;
	}

	/**
	 * �������Set��ѯ����������
	 * @param MedicalgrpOper
	 */
	public void setMedicalgrpOper(String medicalgrpOper) {
		if (medicalgrpOper == null || medicalgrpOper.trim().length() == 0) {
			medicalgrpOper = EQUAL;
		}
		else {
			this.medicalgrpOper = medicalgrpOper;
		}
	}

	/**
	 * �������Get��ѯ����������
	 */
	public String getMedicalgrpOper() {
		return medicalgrpOper;
	}

	/**
	 * ����ȼ���Get����
	 */
	public String getNursionglevel() {
		return nursionglevel;
	}

	/**
	 * ����ȼ���Set����
	 * @param Nursionglevel
	 */
	public void setNursionglevel(String nursionglevel) {
		this.nursionglevel = nursionglevel;
	}

	/**
	 * ����ȼ���Set��ѯ����������
	 * @param NursionglevelOper
	 */
	public void setNursionglevelOper(String nursionglevelOper) {
		if (nursionglevelOper == null || nursionglevelOper.trim().length() == 0) {
			nursionglevelOper = EQUAL;
		}
		else {
			this.nursionglevelOper = nursionglevelOper;
		}
	}

	/**
	 * ����ȼ���Get��ѯ����������
	 */
	public String getNursionglevelOper() {
		return nursionglevelOper;
	}

	/**
	 * �ܴ���ʿID��Get����
	 */
	public String getNurseid() {
		return nurseid;
	}

	/**
	 * �ܴ���ʿID��Set����
	 * @param Nurseid
	 */
	public void setNurseid(String nurseid) {
		this.nurseid = nurseid;
	}

	/**
	 * �ܴ���ʿID��Set��ѯ����������
	 * @param NurseidOper
	 */
	public void setNurseidOper(String nurseidOper) {
		if (nurseidOper == null || nurseidOper.trim().length() == 0) {
			nurseidOper = EQUAL;
		}
		else {
			this.nurseidOper = nurseidOper;
		}
	}

	/**
	 * �ܴ���ʿID��Get��ѯ����������
	 */
	public String getNurseidOper() {
		return nurseidOper;
	}

	/**
	 * �ܴ���ʿ��Get����
	 */
	public String getNurse() {
		return nurse;
	}

	/**
	 * �ܴ���ʿ��Set����
	 * @param Nurse
	 */
	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	/**
	 * �ܴ���ʿ��Set��ѯ����������
	 * @param NurseOper
	 */
	public void setNurseOper(String nurseOper) {
		if (nurseOper == null || nurseOper.trim().length() == 0) {
			nurseOper = EQUAL;
		}
		else {
			this.nurseOper = nurseOper;
		}
	}

	/**
	 * �ܴ���ʿ��Get��ѯ����������
	 */
	public String getNurseOper() {
		return nurseOper;
	}

	/**
	 * ����������Get����
	 */
	public String getNursinggrpcode() {
		return nursinggrpcode;
	}

	/**
	 * ����������Set����
	 * @param Nursinggrpcode
	 */
	public void setNursinggrpcode(String nursinggrpcode) {
		this.nursinggrpcode = nursinggrpcode;
	}

	/**
	 * ����������Set��ѯ����������
	 * @param NursinggrpcodeOper
	 */
	public void setNursinggrpcodeOper(String nursinggrpcodeOper) {
		if (nursinggrpcodeOper == null || nursinggrpcodeOper.trim().length() == 0) {
			nursinggrpcodeOper = EQUAL;
		}
		else {
			this.nursinggrpcodeOper = nursinggrpcodeOper;
		}
	}

	/**
	 * ����������Get��ѯ����������
	 */
	public String getNursinggrpcodeOper() {
		return nursinggrpcodeOper;
	}

	/**
	 * �������Get����
	 */
	public String getNursionggrp() {
		return nursionggrp;
	}

	/**
	 * �������Set����
	 * @param Nursionggrp
	 */
	public void setNursionggrp(String nursionggrp) {
		this.nursionggrp = nursionggrp;
	}

	/**
	 * �������Set��ѯ����������
	 * @param NursionggrpOper
	 */
	public void setNursionggrpOper(String nursionggrpOper) {
		if (nursionggrpOper == null || nursionggrpOper.trim().length() == 0) {
			nursionggrpOper = EQUAL;
		}
		else {
			this.nursionggrpOper = nursionggrpOper;
		}
	}

	/**
	 * �������Get��ѯ����������
	 */
	public String getNursionggrpOper() {
		return nursionggrpOper;
	}

	/**
	 * סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿��Get����
	 */
	public String getInstatus() {
		return instatus;
	}

	/**
	 * סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿��Set����
	 * @param Instatus
	 */
	public void setInstatus(String instatus) {
		this.instatus = instatus;
	}

	/**
	 * סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿��Set��ѯ����������
	 * @param InstatusOper
	 */
	public void setInstatusOper(String instatusOper) {
		if (instatusOper == null || instatusOper.trim().length() == 0) {
			instatusOper = EQUAL;
		}
		else {
			this.instatusOper = instatusOper;
		}
	}

	/**
	 * סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿��Get��ѯ����������
	 */
	public String getInstatusOper() {
		return instatusOper;
	}

	/**
	 * ����״̬��i��������o�����鵵��p���鵵����Get����
	 */
	public String getMrstatus() {
		return mrstatus;
	}

	/**
	 * ����״̬��i��������o�����鵵��p���鵵����Set����
	 * @param Mrstatus
	 */
	public void setMrstatus(String mrstatus) {
		this.mrstatus = mrstatus;
	}

	/**
	 * ����״̬��i��������o�����鵵��p���鵵����Set��ѯ����������
	 * @param MrstatusOper
	 */
	public void setMrstatusOper(String mrstatusOper) {
		if (mrstatusOper == null || mrstatusOper.trim().length() == 0) {
			mrstatusOper = EQUAL;
		}
		else {
			this.mrstatusOper = mrstatusOper;
		}
	}

	/**
	 * ����״̬��i��������o�����鵵��p���鵵����Get��ѯ����������
	 */
	public String getMrstatusOper() {
		return mrstatusOper;
	}

	/**
	 * ��Ժ��ʽ��SW��������ZC��������ZY��תԺ����Get����
	 */
	public String getDischargeway() {
		return dischargeway;
	}

	/**
	 * ��Ժ��ʽ��SW��������ZC��������ZY��תԺ����Set����
	 * @param Dischargeway
	 */
	public void setDischargeway(String dischargeway) {
		this.dischargeway = dischargeway;
	}

	/**
	 * ��Ժ��ʽ��SW��������ZC��������ZY��תԺ����Set��ѯ����������
	 * @param DischargewayOper
	 */
	public void setDischargewayOper(String dischargewayOper) {
		if (dischargewayOper == null || dischargewayOper.trim().length() == 0) {
			dischargewayOper = EQUAL;
		}
		else {
			this.dischargewayOper = dischargewayOper;
		}
	}

	/**
	 * ��Ժ��ʽ��SW��������ZC��������ZY��תԺ����Get��ѯ����������
	 */
	public String getDischargewayOper() {
		return dischargewayOper;
	}

	/**
	 * �������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ������Get����
	 */
	public String getManagetype() {
		return managetype;
	}

	/**
	 * �������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ������Set����
	 * @param Managetype
	 */
	public void setManagetype(String managetype) {
		this.managetype = managetype;
	}

	/**
	 * �������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ������Set��ѯ����������
	 * @param ManagetypeOper
	 */
	public void setManagetypeOper(String managetypeOper) {
		if (managetypeOper == null || managetypeOper.trim().length() == 0) {
			managetypeOper = EQUAL;
		}
		else {
			this.managetypeOper = managetypeOper;
		}
	}

	/**
	 * �������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ������Get��ѯ����������
	 */
	public String getManagetypeOper() {
		return managetypeOper;
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
			+ ",ipid="
			+ ipid
			+ ",pid="
			+ pid
			+ ",adminissionno="
			+ adminissionno
			+ ",admissiontimes="
			+ admissiontimes
			+ ",patientname="
			+ patientname
			+ ",sexcode="
			+ sexcode
			+ ",sex="
			+ sex
			+ ",age="
			+ age
			+ ",agedesc="
			+ agedesc
			+ ",marriagestatuscode="
			+ marriagestatuscode
			+ ",marriagestatus="
			+ marriagestatus
			+ ",feetypecode="
			+ feetypecode
			+ ",feetypename="
			+ feetypename
			+ ",patientclass="
			+ patientclass
			+ ",admissionregistertime="
			+ admissionregistertime
			+ ",admissionway="
			+ admissionway
			+ ",admissionpurpose="
			+ admissionpurpose
			+ ",admissionhospital="
			+ admissionhospital
			+ ",admissiondeptcode="
			+ admissiondeptcode
			+ ",admissiondept="
			+ admissiondept
			+ ",admissionwardcode="
			+ admissionwardcode
			+ ",admissionward="
			+ admissionward
			+ ",hospital="
			+ hospital
			+ ",deptcode="
			+ deptcode
			+ ",deptname="
			+ deptname
			+ ",wardcode="
			+ wardcode
			+ ",wardname="
			+ wardname
			+ ",dischargetime="
			+ dischargetime
			+ ",bedno="
			+ bedno
			+ ",bedfeetype="
			+ bedfeetype
			+ ",room="
			+ room
			+ ",stateofillness="
			+ stateofillness
			+ ",doctorid="
			+ doctorid
			+ ",doctor="
			+ doctor
			+ ",medicalfrpcode="
			+ medicalfrpcode
			+ ",medicalgrp="
			+ medicalgrp
			+ ",nursionglevel="
			+ nursionglevel
			+ ",nurseid="
			+ nurseid
			+ ",nurse="
			+ nurse
			+ ",nursinggrpcode="
			+ nursinggrpcode
			+ ",nursionggrp="
			+ nursionggrp
			+ ",instatus="
			+ instatus
			+ ",mrstatus="
			+ mrstatus
			+ ",dischargeway="
			+ dischargeway
			+ ",managetype="
			+ managetype
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

	/**
	 * ����Inpatientinfo�������־��¼
	 * @param operator ��ǰ����Ա
	 * @param oper ��ǰ���� N���� M�޸� Dɾ��
	 * @return ��־��¼����
	 */
//	public InAllLog createInAllLog(OperatorBaseinfo operator,String oper){
//		InAllLog aInAllLog = new InAllLog();
//		aInAllLog.setModifyTime(DateUtil.getCurrDateTime());
//		aInAllLog.setModifierId(operator.getOpId());
//		aInAllLog.setModifier(operator.getOpName());
//		aInAllLog.setOperFlag(oper);
//		aInAllLog.setRecordTable(TABLENAME);
//		aInAllLog.setRecordFlow(TABLENAME + recordflow);
//		aInAllLog.setTxtContent(toLogsStr());
//		aInAllLog.setLogFlow(aInAllLog.getRecordFlow()+aInAllLog.getModifyTime());
//		return aInAllLog;
//	}
}
