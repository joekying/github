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

	//记录流水号	key
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//病人住院流水号 必填
	protected String ipid;
	protected String ipidOper = EQUAL;

	//病人ID
	protected String pid;
	protected String pidOper = EQUAL;

	//住院号
	protected String adminissionno;
	protected String adminissionnoOper = EQUAL;

	//住院次数
	protected String admissiontimes;
	protected String admissiontimesOper = EQUAL;

	//病人姓名
	protected String patientname;
	protected String patientnameOper = EQUAL;

	//性别代码
	protected String sexcode;
	protected String sexcodeOper = EQUAL;

	//性别
	protected String sex;
	protected String sexOper = EQUAL;

	//年龄
	protected String age;
	protected String ageOper = EQUAL;

	//年龄说明
	protected String agedesc;
	protected String agedescOper = EQUAL;

	//婚姻状况代码
	protected String marriagestatuscode;
	protected String marriagestatuscodeOper = EQUAL;

	//婚姻状况
	protected String marriagestatus;
	protected String marriagestatusOper = EQUAL;

	//费别代码
	protected String feetypecode;
	protected String feetypecodeOper = EQUAL;

	//费别
	protected String feetypename;
	protected String feetypenameOper = EQUAL;

	//病人身份
	protected String patientclass;
	protected String patientclassOper = EQUAL;

	//入院登记时间（格式：yyyyMMddHHmmss）
	protected String admissionregistertime;
	protected String admissionregistertimeOper = EQUAL;

	//入院登记时间（格式：yyyyMMddHHmmss）
	protected String admissiontime;
	protected String admissiontimeOper = EQUAL;
	
	//入院方式
	protected String admissionway;
	protected String admissionwayOper = EQUAL;

	//入院目的
	protected String admissionpurpose;
	protected String admissionpurposeOper = EQUAL;

	//入院时院区
	protected String admissionhospital;
	protected String admissionhospitalOper = EQUAL;

	//入院科室代码
	protected String admissiondeptcode;
	protected String admissiondeptcodeOper = EQUAL;

	//入院科室
	protected String admissiondept;
	protected String admissiondeptOper = EQUAL;

	//入院病区代码
	protected String admissionwardcode;
	protected String admissionwardcodeOper = EQUAL;

	//入院病区
	protected String admissionward;
	protected String admissionwardOper = EQUAL;

	//当前院区
	protected String hospital;
	protected String hospitalOper = EQUAL;

	//当前科室代码
	protected String deptcode;
	protected String deptcodeOper = EQUAL;

	//当前科室名称
	protected String deptname;
	protected String deptnameOper = EQUAL;

	//当前病区代码
	protected String wardcode;
	protected String wardcodeOper = EQUAL;

	//当前病区名称
	protected String wardname;
	protected String wardnameOper = EQUAL;

	//出院时间（格式：yyyyMMddHHmmss）
	protected String dischargetime;
	protected String dischargetimeOper = EQUAL;

	//床号
	protected String bedno;
	protected String bednoOper = EQUAL;

	//床位费类型
	protected String bedfeetype;
	protected String bedfeetypeOper = EQUAL;

	//病房
	protected String room;
	protected String roomOper = EQUAL;

	//病情
	protected String stateofillness;
	protected String stateofillnessOper = EQUAL;

	//管床医生ID
	protected String doctorid;
	protected String doctoridOper = EQUAL;

	//管床医生
	protected String doctor;
	protected String doctorOper = EQUAL;

	//诊疗组代码
	protected String medicalfrpcode;
	protected String medicalfrpcodeOper = EQUAL;

	//诊疗组
	protected String medicalgrp;
	protected String medicalgrpOper = EQUAL;

	//护理等级
	protected String nursionglevel;
	protected String nursionglevelOper = EQUAL;

	//管床护士ID
	protected String nurseid;
	protected String nurseidOper = EQUAL;

	//管床护士
	protected String nurse;
	protected String nurseOper = EQUAL;

	//护理组代码
	protected String nursinggrpcode;
	protected String nursinggrpcodeOper = EQUAL;

	//护理组
	protected String nursionggrp;
	protected String nursionggrpOper = EQUAL;

	//住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】
	protected String instatus;
	protected String instatusOper = EQUAL;

	//病历状态【i：正常；o：待归档；p：归档】
	protected String mrstatus;
	protected String mrstatusOper = EQUAL;

	//出院方式【SW：死亡；ZC：正常；ZY：转院】
	protected String dischargeway;
	protected String dischargewayOper = EQUAL;

	//处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填
	protected String managetype;
	protected String managetypeOper = EQUAL;

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
	 * 病人住院流水号 必填的Get方法
	 */
	public String getIpid() {
		return ipid;
	}

	/**
	 * 病人住院流水号 必填的Set方法
	 * @param Ipid
	 */
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	/**
	 * 病人住院流水号 必填的Set查询操作符方法
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
	 * 病人住院流水号 必填的Get查询操作符方法
	 */
	public String getIpidOper() {
		return ipidOper;
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
	 * 住院号的Get方法
	 */
	public String getAdminissionno() {
		return adminissionno;
	}

	/**
	 * 住院号的Set方法
	 * @param Adminissionno
	 */
	public void setAdminissionno(String adminissionno) {
		this.adminissionno = adminissionno;
	}

	/**
	 * 住院号的Set查询操作符方法
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
	 * 住院号的Get查询操作符方法
	 */
	public String getAdminissionnoOper() {
		return adminissionnoOper;
	}

	/**
	 * 住院次数的Get方法
	 */
	public String getAdmissiontimes() {
		return admissiontimes;
	}

	/**
	 * 住院次数的Set方法
	 * @param Admissiontimes
	 */
	public void setAdmissiontimes(String admissiontimes) {
		this.admissiontimes = admissiontimes;
	}

	/**
	 * 住院次数的Set查询操作符方法
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
	 * 住院次数的Get查询操作符方法
	 */
	public String getAdmissiontimesOper() {
		return admissiontimesOper;
	}

	/**
	 * 病人姓名的Get方法
	 */
	public String getPatientname() {
		return patientname;
	}

	/**
	 * 病人姓名的Set方法
	 * @param Patientname
	 */
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	/**
	 * 病人姓名的Set查询操作符方法
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
	 * 病人姓名的Get查询操作符方法
	 */
	public String getPatientnameOper() {
		return patientnameOper;
	}

	/**
	 * 性别代码的Get方法
	 */
	public String getSexcode() {
		return sexcode;
	}

	/**
	 * 性别代码的Set方法
	 * @param Sexcode
	 */
	public void setSexcode(String sexcode) {
		this.sexcode = sexcode;
	}

	/**
	 * 性别代码的Set查询操作符方法
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
	 * 性别代码的Get查询操作符方法
	 */
	public String getSexcodeOper() {
		return sexcodeOper;
	}

	/**
	 * 性别的Get方法
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 性别的Set方法
	 * @param Sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 性别的Set查询操作符方法
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
	 * 性别的Get查询操作符方法
	 */
	public String getSexOper() {
		return sexOper;
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
	 * 年龄说明的Get方法
	 */
	public String getAgedesc() {
		return agedesc;
	}

	/**
	 * 年龄说明的Set方法
	 * @param Agedesc
	 */
	public void setAgedesc(String agedesc) {
		this.agedesc = agedesc;
	}

	/**
	 * 年龄说明的Set查询操作符方法
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
	 * 年龄说明的Get查询操作符方法
	 */
	public String getAgedescOper() {
		return agedescOper;
	}

	/**
	 * 婚姻状况代码的Get方法
	 */
	public String getMarriagestatuscode() {
		return marriagestatuscode;
	}

	/**
	 * 婚姻状况代码的Set方法
	 * @param Marriagestatuscode
	 */
	public void setMarriagestatuscode(String marriagestatuscode) {
		this.marriagestatuscode = marriagestatuscode;
	}

	/**
	 * 婚姻状况代码的Set查询操作符方法
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
	 * 婚姻状况代码的Get查询操作符方法
	 */
	public String getMarriagestatuscodeOper() {
		return marriagestatuscodeOper;
	}

	/**
	 * 婚姻状况的Get方法
	 */
	public String getMarriagestatus() {
		return marriagestatus;
	}

	/**
	 * 婚姻状况的Set方法
	 * @param Marriagestatus
	 */
	public void setMarriagestatus(String marriagestatus) {
		this.marriagestatus = marriagestatus;
	}

	/**
	 * 婚姻状况的Set查询操作符方法
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
	 * 婚姻状况的Get查询操作符方法
	 */
	public String getMarriagestatusOper() {
		return marriagestatusOper;
	}

	/**
	 * 费别代码的Get方法
	 */
	public String getFeetypecode() {
		return feetypecode;
	}

	/**
	 * 费别代码的Set方法
	 * @param Feetypecode
	 */
	public void setFeetypecode(String feetypecode) {
		this.feetypecode = feetypecode;
	}

	/**
	 * 费别代码的Set查询操作符方法
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
	 * 费别代码的Get查询操作符方法
	 */
	public String getFeetypecodeOper() {
		return feetypecodeOper;
	}

	/**
	 * 费别的Get方法
	 */
	public String getFeetypename() {
		return feetypename;
	}

	/**
	 * 费别的Set方法
	 * @param Feetypename
	 */
	public void setFeetypename(String feetypename) {
		this.feetypename = feetypename;
	}

	/**
	 * 费别的Set查询操作符方法
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
	 * 费别的Get查询操作符方法
	 */
	public String getFeetypenameOper() {
		return feetypenameOper;
	}

	/**
	 * 病人身份的Get方法
	 */
	public String getPatientclass() {
		return patientclass;
	}

	/**
	 * 病人身份的Set方法
	 * @param Patientclass
	 */
	public void setPatientclass(String patientclass) {
		this.patientclass = patientclass;
	}

	/**
	 * 病人身份的Set查询操作符方法
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
	 * 病人身份的Get查询操作符方法
	 */
	public String getPatientclassOper() {
		return patientclassOper;
	}

	/**
	 * 入院登记时间（格式：yyyyMMddHHmmss）的Get方法
	 */
	public String getAdmissionregistertime() {
		return admissionregistertime;
	}

	/**
	 * 入院登记时间（格式：yyyyMMddHHmmss）的Set方法
	 * @param Admissionregistertime
	 */
	public void setAdmissionregistertime(String admissionregistertime) {
		this.admissionregistertime = admissionregistertime;
	}

	/**
	 * 入院登记时间（格式：yyyyMMddHHmmss）的Set查询操作符方法
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
	 * 入院登记时间（格式：yyyyMMddHHmmss）的Get查询操作符方法
	 */
	public String getAdmissionregistertimeOper() {
		return admissionregistertimeOper;
	}

	/**
	 * 入科时间（格式：yyyyMMddHHmmss）的Get方法
	 */
	public String getAdmissiontime() {
		return admissiontime;
	}

	/**
	 * 入科时间（格式：yyyyMMddHHmmss）的Set方法
	 * @param Admissionregistertime
	 */
	public void setAdmissiontime(String admissiontime) {
		this.admissiontime = admissiontime;
	}

	/**
	 * 入科时间（格式：yyyyMMddHHmmss）的Set查询操作符方法
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
	 * 入科时间（格式：yyyyMMddHHmmss）的Get查询操作符方法
	 */
	public String getAdmissiontimeOper() {
		return admissiontimeOper;
	}
	/**
	 * 入院方式的Get方法
	 */
	public String getAdmissionway() {
		return admissionway;
	}

	/**
	 * 入院方式的Set方法
	 * @param Admissionway
	 */
	public void setAdmissionway(String admissionway) {
		this.admissionway = admissionway;
	}

	/**
	 * 入院方式的Set查询操作符方法
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
	 * 入院方式的Get查询操作符方法
	 */
	public String getAdmissionwayOper() {
		return admissionwayOper;
	}

	/**
	 * 入院目的的Get方法
	 */
	public String getAdmissionpurpose() {
		return admissionpurpose;
	}

	/**
	 * 入院目的的Set方法
	 * @param Admissionpurpose
	 */
	public void setAdmissionpurpose(String admissionpurpose) {
		this.admissionpurpose = admissionpurpose;
	}

	/**
	 * 入院目的的Set查询操作符方法
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
	 * 入院目的的Get查询操作符方法
	 */
	public String getAdmissionpurposeOper() {
		return admissionpurposeOper;
	}

	/**
	 * 入院时院区的Get方法
	 */
	public String getAdmissionhospital() {
		return admissionhospital;
	}

	/**
	 * 入院时院区的Set方法
	 * @param Admissionhospital
	 */
	public void setAdmissionhospital(String admissionhospital) {
		this.admissionhospital = admissionhospital;
	}

	/**
	 * 入院时院区的Set查询操作符方法
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
	 * 入院时院区的Get查询操作符方法
	 */
	public String getAdmissionhospitalOper() {
		return admissionhospitalOper;
	}

	/**
	 * 入院科室代码的Get方法
	 */
	public String getAdmissiondeptcode() {
		return admissiondeptcode;
	}

	/**
	 * 入院科室代码的Set方法
	 * @param Admissiondeptcode
	 */
	public void setAdmissiondeptcode(String admissiondeptcode) {
		this.admissiondeptcode = admissiondeptcode;
	}

	/**
	 * 入院科室代码的Set查询操作符方法
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
	 * 入院科室代码的Get查询操作符方法
	 */
	public String getAdmissiondeptcodeOper() {
		return admissiondeptcodeOper;
	}

	/**
	 * 入院科室的Get方法
	 */
	public String getAdmissiondept() {
		return admissiondept;
	}

	/**
	 * 入院科室的Set方法
	 * @param Admissiondept
	 */
	public void setAdmissiondept(String admissiondept) {
		this.admissiondept = admissiondept;
	}

	/**
	 * 入院科室的Set查询操作符方法
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
	 * 入院科室的Get查询操作符方法
	 */
	public String getAdmissiondeptOper() {
		return admissiondeptOper;
	}

	/**
	 * 入院病区代码的Get方法
	 */
	public String getAdmissionwardcode() {
		return admissionwardcode;
	}

	/**
	 * 入院病区代码的Set方法
	 * @param Admissionwardcode
	 */
	public void setAdmissionwardcode(String admissionwardcode) {
		this.admissionwardcode = admissionwardcode;
	}

	/**
	 * 入院病区代码的Set查询操作符方法
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
	 * 入院病区代码的Get查询操作符方法
	 */
	public String getAdmissionwardcodeOper() {
		return admissionwardcodeOper;
	}

	/**
	 * 入院病区的Get方法
	 */
	public String getAdmissionward() {
		return admissionward;
	}

	/**
	 * 入院病区的Set方法
	 * @param Admissionward
	 */
	public void setAdmissionward(String admissionward) {
		this.admissionward = admissionward;
	}

	/**
	 * 入院病区的Set查询操作符方法
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
	 * 入院病区的Get查询操作符方法
	 */
	public String getAdmissionwardOper() {
		return admissionwardOper;
	}

	/**
	 * 当前院区的Get方法
	 */
	public String getHospital() {
		return hospital;
	}

	/**
	 * 当前院区的Set方法
	 * @param Hospital
	 */
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	/**
	 * 当前院区的Set查询操作符方法
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
	 * 当前院区的Get查询操作符方法
	 */
	public String getHospitalOper() {
		return hospitalOper;
	}

	/**
	 * 当前科室代码的Get方法
	 */
	public String getDeptcode() {
		return deptcode;
	}

	/**
	 * 当前科室代码的Set方法
	 * @param Deptcode
	 */
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	/**
	 * 当前科室代码的Set查询操作符方法
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
	 * 当前科室代码的Get查询操作符方法
	 */
	public String getDeptcodeOper() {
		return deptcodeOper;
	}

	/**
	 * 当前科室名称的Get方法
	 */
	public String getDeptname() {
		return deptname;
	}

	/**
	 * 当前科室名称的Set方法
	 * @param Deptname
	 */
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	/**
	 * 当前科室名称的Set查询操作符方法
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
	 * 当前科室名称的Get查询操作符方法
	 */
	public String getDeptnameOper() {
		return deptnameOper;
	}

	/**
	 * 当前病区代码的Get方法
	 */
	public String getWardcode() {
		return wardcode;
	}

	/**
	 * 当前病区代码的Set方法
	 * @param Wardcode
	 */
	public void setWardcode(String wardcode) {
		this.wardcode = wardcode;
	}

	/**
	 * 当前病区代码的Set查询操作符方法
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
	 * 当前病区代码的Get查询操作符方法
	 */
	public String getWardcodeOper() {
		return wardcodeOper;
	}

	/**
	 * 当前病区名称的Get方法
	 */
	public String getWardname() {
		return wardname;
	}

	/**
	 * 当前病区名称的Set方法
	 * @param Wardname
	 */
	public void setWardname(String wardname) {
		this.wardname = wardname;
	}

	/**
	 * 当前病区名称的Set查询操作符方法
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
	 * 当前病区名称的Get查询操作符方法
	 */
	public String getWardnameOper() {
		return wardnameOper;
	}

	/**
	 * 出院时间（格式：yyyyMMddHHmmss）的Get方法
	 */
	public String getDischargetime() {
		return dischargetime;
	}

	/**
	 * 出院时间（格式：yyyyMMddHHmmss）的Set方法
	 * @param Dischargetime
	 */
	public void setDischargetime(String dischargetime) {
		this.dischargetime = dischargetime;
	}

	/**
	 * 出院时间（格式：yyyyMMddHHmmss）的Set查询操作符方法
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
	 * 出院时间（格式：yyyyMMddHHmmss）的Get查询操作符方法
	 */
	public String getDischargetimeOper() {
		return dischargetimeOper;
	}

	/**
	 * 床号的Get方法
	 */
	public String getBedno() {
		return bedno;
	}

	/**
	 * 床号的Set方法
	 * @param Bedno
	 */
	public void setBedno(String bedno) {
		this.bedno = bedno;
	}

	/**
	 * 床号的Set查询操作符方法
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
	 * 床号的Get查询操作符方法
	 */
	public String getBednoOper() {
		return bednoOper;
	}

	/**
	 * 床位费类型的Get方法
	 */
	public String getBedfeetype() {
		return bedfeetype;
	}

	/**
	 * 床位费类型的Set方法
	 * @param Bedfeetype
	 */
	public void setBedfeetype(String bedfeetype) {
		this.bedfeetype = bedfeetype;
	}

	/**
	 * 床位费类型的Set查询操作符方法
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
	 * 床位费类型的Get查询操作符方法
	 */
	public String getBedfeetypeOper() {
		return bedfeetypeOper;
	}

	/**
	 * 病房的Get方法
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * 病房的Set方法
	 * @param Room
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * 病房的Set查询操作符方法
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
	 * 病房的Get查询操作符方法
	 */
	public String getRoomOper() {
		return roomOper;
	}

	/**
	 * 病情的Get方法
	 */
	public String getStateofillness() {
		return stateofillness;
	}

	/**
	 * 病情的Set方法
	 * @param Stateofillness
	 */
	public void setStateofillness(String stateofillness) {
		this.stateofillness = stateofillness;
	}

	/**
	 * 病情的Set查询操作符方法
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
	 * 病情的Get查询操作符方法
	 */
	public String getStateofillnessOper() {
		return stateofillnessOper;
	}

	/**
	 * 管床医生ID的Get方法
	 */
	public String getDoctorid() {
		return doctorid;
	}

	/**
	 * 管床医生ID的Set方法
	 * @param Doctorid
	 */
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	/**
	 * 管床医生ID的Set查询操作符方法
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
	 * 管床医生ID的Get查询操作符方法
	 */
	public String getDoctoridOper() {
		return doctoridOper;
	}

	/**
	 * 管床医生的Get方法
	 */
	public String getDoctor() {
		return doctor;
	}

	/**
	 * 管床医生的Set方法
	 * @param Doctor
	 */
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	/**
	 * 管床医生的Set查询操作符方法
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
	 * 管床医生的Get查询操作符方法
	 */
	public String getDoctorOper() {
		return doctorOper;
	}

	/**
	 * 诊疗组代码的Get方法
	 */
	public String getMedicalfrpcode() {
		return medicalfrpcode;
	}

	/**
	 * 诊疗组代码的Set方法
	 * @param Medicalfrpcode
	 */
	public void setMedicalfrpcode(String medicalfrpcode) {
		this.medicalfrpcode = medicalfrpcode;
	}

	/**
	 * 诊疗组代码的Set查询操作符方法
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
	 * 诊疗组代码的Get查询操作符方法
	 */
	public String getMedicalfrpcodeOper() {
		return medicalfrpcodeOper;
	}

	/**
	 * 诊疗组的Get方法
	 */
	public String getMedicalgrp() {
		return medicalgrp;
	}

	/**
	 * 诊疗组的Set方法
	 * @param Medicalgrp
	 */
	public void setMedicalgrp(String medicalgrp) {
		this.medicalgrp = medicalgrp;
	}

	/**
	 * 诊疗组的Set查询操作符方法
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
	 * 诊疗组的Get查询操作符方法
	 */
	public String getMedicalgrpOper() {
		return medicalgrpOper;
	}

	/**
	 * 护理等级的Get方法
	 */
	public String getNursionglevel() {
		return nursionglevel;
	}

	/**
	 * 护理等级的Set方法
	 * @param Nursionglevel
	 */
	public void setNursionglevel(String nursionglevel) {
		this.nursionglevel = nursionglevel;
	}

	/**
	 * 护理等级的Set查询操作符方法
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
	 * 护理等级的Get查询操作符方法
	 */
	public String getNursionglevelOper() {
		return nursionglevelOper;
	}

	/**
	 * 管床护士ID的Get方法
	 */
	public String getNurseid() {
		return nurseid;
	}

	/**
	 * 管床护士ID的Set方法
	 * @param Nurseid
	 */
	public void setNurseid(String nurseid) {
		this.nurseid = nurseid;
	}

	/**
	 * 管床护士ID的Set查询操作符方法
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
	 * 管床护士ID的Get查询操作符方法
	 */
	public String getNurseidOper() {
		return nurseidOper;
	}

	/**
	 * 管床护士的Get方法
	 */
	public String getNurse() {
		return nurse;
	}

	/**
	 * 管床护士的Set方法
	 * @param Nurse
	 */
	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	/**
	 * 管床护士的Set查询操作符方法
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
	 * 管床护士的Get查询操作符方法
	 */
	public String getNurseOper() {
		return nurseOper;
	}

	/**
	 * 护理组代码的Get方法
	 */
	public String getNursinggrpcode() {
		return nursinggrpcode;
	}

	/**
	 * 护理组代码的Set方法
	 * @param Nursinggrpcode
	 */
	public void setNursinggrpcode(String nursinggrpcode) {
		this.nursinggrpcode = nursinggrpcode;
	}

	/**
	 * 护理组代码的Set查询操作符方法
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
	 * 护理组代码的Get查询操作符方法
	 */
	public String getNursinggrpcodeOper() {
		return nursinggrpcodeOper;
	}

	/**
	 * 护理组的Get方法
	 */
	public String getNursionggrp() {
		return nursionggrp;
	}

	/**
	 * 护理组的Set方法
	 * @param Nursionggrp
	 */
	public void setNursionggrp(String nursionggrp) {
		this.nursionggrp = nursionggrp;
	}

	/**
	 * 护理组的Set查询操作符方法
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
	 * 护理组的Get查询操作符方法
	 */
	public String getNursionggrpOper() {
		return nursionggrpOper;
	}

	/**
	 * 住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】的Get方法
	 */
	public String getInstatus() {
		return instatus;
	}

	/**
	 * 住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】的Set方法
	 * @param Instatus
	 */
	public void setInstatus(String instatus) {
		this.instatus = instatus;
	}

	/**
	 * 住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】的Set查询操作符方法
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
	 * 住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】的Get查询操作符方法
	 */
	public String getInstatusOper() {
		return instatusOper;
	}

	/**
	 * 病历状态【i：正常；o：待归档；p：归档】的Get方法
	 */
	public String getMrstatus() {
		return mrstatus;
	}

	/**
	 * 病历状态【i：正常；o：待归档；p：归档】的Set方法
	 * @param Mrstatus
	 */
	public void setMrstatus(String mrstatus) {
		this.mrstatus = mrstatus;
	}

	/**
	 * 病历状态【i：正常；o：待归档；p：归档】的Set查询操作符方法
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
	 * 病历状态【i：正常；o：待归档；p：归档】的Get查询操作符方法
	 */
	public String getMrstatusOper() {
		return mrstatusOper;
	}

	/**
	 * 出院方式【SW：死亡；ZC：正常；ZY：转院】的Get方法
	 */
	public String getDischargeway() {
		return dischargeway;
	}

	/**
	 * 出院方式【SW：死亡；ZC：正常；ZY：转院】的Set方法
	 * @param Dischargeway
	 */
	public void setDischargeway(String dischargeway) {
		this.dischargeway = dischargeway;
	}

	/**
	 * 出院方式【SW：死亡；ZC：正常；ZY：转院】的Set查询操作符方法
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
	 * 出院方式【SW：死亡；ZC：正常；ZY：转院】的Get查询操作符方法
	 */
	public String getDischargewayOper() {
		return dischargewayOper;
	}

	/**
	 * 处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填的Get方法
	 */
	public String getManagetype() {
		return managetype;
	}

	/**
	 * 处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填的Set方法
	 * @param Managetype
	 */
	public void setManagetype(String managetype) {
		this.managetype = managetype;
	}

	/**
	 * 处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填的Set查询操作符方法
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
	 * 处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填的Get查询操作符方法
	 */
	public String getManagetypeOper() {
		return managetypeOper;
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
	 * 生成记录log的字符串
	 * @return String
	 */
	public String toLogsStr() {
		String ret="";
		return ret;
	}

	/**
	 * 生成Inpatientinfo对象的日志记录
	 * @param operator 当前操作员
	 * @param oper 当前操作 N新增 M修改 D删除
	 * @return 日志记录对象
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
