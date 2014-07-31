package com.haitaiinc.struct;


/**
 * @author haitaiinc
 * PatientInfo
 */
public class Patientinfo {
	public static final String TABLENAME = "PatientInfo";
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

	//病人ID必填
	protected String pid;
	protected String pidOper = EQUAL;

	//病人医保号
	protected String insuranceno;
	protected String insurancenoOper = EQUAL;

	//病人姓名
	protected String patientname;
	protected String patientnameOper = EQUAL;

	//临时用名标志（正式、临时）
	protected String tmpflag;
	protected String tmpflagOper = EQUAL;

	//病人姓氏
	protected String lastname;
	protected String lastnameOper = EQUAL;

	//病人名
	protected String firstname;
	protected String firstnameOper = EQUAL;

	//病人姓名拼音码
	protected String py;
	protected String pyOper = EQUAL;

	//病人姓名五笔码
	protected String wb;
	protected String wbOper = EQUAL;

	//病人性别代码
	protected String sexcode;
	protected String sexcodeOper = EQUAL;

	//病人性别
	protected String sex;
	protected String sexOper = EQUAL;

	//病人出生日期（格式：yyyyMMdd）
	protected String dateofbirth;
	protected String dateofbirthOper = EQUAL;

	//病人出生时间（格式：hhmmss）
	protected String timeofbirth;
	protected String timeofbirthOper = EQUAL;

	//病人婚姻状况代码
	protected String marriagestatuscode;
	protected String marriagestatuscodeOper = EQUAL;

	//病人婚姻状况
	protected String marriagestatus;
	protected String marriagestatusOper = EQUAL;

	//病人职业代码
	protected String occupationcode;
	protected String occupationcodeOper = EQUAL;

	//病人职业
	protected String occupation;
	protected String occupationOper = EQUAL;

	//病人民族代码
	protected String nationalitycode;
	protected String nationalitycodeOper = EQUAL;

	//病人民族
	protected String nationality;
	protected String nationalityOper = EQUAL;

	//病人国籍代码
	protected String countrycode;
	protected String countrycodeOper = EQUAL;

	//病人国籍
	protected String country;
	protected String countryOper = EQUAL;

	//病人文化水平代码
	protected String formalschoolingcode;
	protected String formalschoolingcodeOper = EQUAL;

	//病人文化水平
	protected String formalschooling;
	protected String formalschoolingOper = EQUAL;

	//病人宗教信仰
	protected String religion;
	protected String religionOper = EQUAL;

	//病人出生地代码
	protected String birthplacecode;
	protected String birthplacecodeOper = EQUAL;

	//病人出生地
	protected String birthplace;
	protected String birthplaceOper = EQUAL;

	//病人籍贯代码
	protected String nativeplacecode;
	protected String nativeplacecodeOper = EQUAL;

	//病人籍贯
	protected String nativeplace;
	protected String nativeplaceOper = EQUAL;

	//病人血型
	protected String bloodtype;
	protected String bloodtypeOper = EQUAL;

	//病人证件类型代码
	protected String certtypecode;
	protected String certtypecodeOper = EQUAL;

	//病人证件类型
	protected String certtype;
	protected String certtypeOper = EQUAL;

	//病人证件号
	protected String certno;
	protected String certnoOper = EQUAL;

	//病人身份代码
	protected String patientclasscode;
	protected String patientclasscodeOper = EQUAL;

	//病人身份
	protected String patientclass;
	protected String patientclassOper = EQUAL;

	//病人费用类型代码
	protected String feetypecode;
	protected String feetypecodeOper = EQUAL;

	//病人费用类型
	protected String feetype;
	protected String feetypeOper = EQUAL;

	//病人工作单位
	protected String company;
	protected String companyOper = EQUAL;

	//病人医疗证号
	protected String publicexpenseno;
	protected String publicexpensenoOper = EQUAL;

	//合同单位代码
	protected String contractunitcode;
	protected String contractunitcodeOper = EQUAL;

	//合同单位
	protected String contractunit;
	protected String contractunitOper = EQUAL;

	//病人工作单位地址代码
	protected String businessaddresscode;
	protected String businessaddresscodeOper = EQUAL;

	//病人工作单位地址
	protected String businessaddress;
	protected String businessaddressOper = EQUAL;

	//病人工作单位邮编
	protected String businesspostcode;
	protected String businesspostcodeOper = EQUAL;

	//病人工作单位电话
	protected String businessphone;
	protected String businessphoneOper = EQUAL;

	//病人家庭住址代码
	protected String homeaddresscode;
	protected String homeaddresscodeOper = EQUAL;

	//病人家庭住址
	protected String homeaddress;
	protected String homeaddressOper = EQUAL;

	//病人家庭地址邮编
	protected String homepostcode;
	protected String homepostcodeOper = EQUAL;

	//病人手机号
	protected String mobilephone;
	protected String mobilephoneOper = EQUAL;

	//联系人
	protected String contact;
	protected String contactOper = EQUAL;

	//联系人关系代码
	protected String relationcode;
	protected String relationcodeOper = EQUAL;

	//联系人关系
	protected String relation;
	protected String relationOper = EQUAL;

	//联系邮箱
	protected String contactemail;
	protected String contactemailOper = EQUAL;

	//联系方式
	protected String contactmethod;
	protected String contactmethodOper = EQUAL;

	//重点病人类型
	protected String viptype;
	protected String viptypeOper = EQUAL;

	//经办人ID
	protected String operatorid;
	protected String operatoridOper = EQUAL;

	//经办人
	protected String operator;
	protected String operatorOper = EQUAL;

	//办理时间（格式：yyyyMMddHHmmss）
	protected String operatortime;
	protected String operatortimeOper = EQUAL;

	//可用标志（Y-可用 N-停用）
	protected String available;
	protected String availableOper = EQUAL;

	//处理类型（1-新增 2-修改 3-删除） 必填
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
	 * 病人ID必填的Get方法
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * 病人ID必填的Set方法
	 * @param Pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * 病人ID必填的Set查询操作符方法
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
	 * 病人ID必填的Get查询操作符方法
	 */
	public String getPidOper() {
		return pidOper;
	}

	/**
	 * 病人医保号的Get方法
	 */
	public String getInsuranceno() {
		return insuranceno;
	}

	/**
	 * 病人医保号的Set方法
	 * @param Insuranceno
	 */
	public void setInsuranceno(String insuranceno) {
		this.insuranceno = insuranceno;
	}

	/**
	 * 病人医保号的Set查询操作符方法
	 * @param InsurancenoOper
	 */
	public void setInsurancenoOper(String insurancenoOper) {
		if (insurancenoOper == null || insurancenoOper.trim().length() == 0) {
			insurancenoOper = EQUAL;
		}
		else {
			this.insurancenoOper = insurancenoOper;
		}
	}

	/**
	 * 病人医保号的Get查询操作符方法
	 */
	public String getInsurancenoOper() {
		return insurancenoOper;
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
	 * 临时用名标志（正式、临时）的Get方法
	 */
	public String getTmpflag() {
		return tmpflag;
	}

	/**
	 * 临时用名标志（正式、临时）的Set方法
	 * @param Tmpflag
	 */
	public void setTmpflag(String tmpflag) {
		this.tmpflag = tmpflag;
	}

	/**
	 * 临时用名标志（正式、临时）的Set查询操作符方法
	 * @param TmpflagOper
	 */
	public void setTmpflagOper(String tmpflagOper) {
		if (tmpflagOper == null || tmpflagOper.trim().length() == 0) {
			tmpflagOper = EQUAL;
		}
		else {
			this.tmpflagOper = tmpflagOper;
		}
	}

	/**
	 * 临时用名标志（正式、临时）的Get查询操作符方法
	 */
	public String getTmpflagOper() {
		return tmpflagOper;
	}

	/**
	 * 病人姓氏的Get方法
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * 病人姓氏的Set方法
	 * @param Lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * 病人姓氏的Set查询操作符方法
	 * @param LastnameOper
	 */
	public void setLastnameOper(String lastnameOper) {
		if (lastnameOper == null || lastnameOper.trim().length() == 0) {
			lastnameOper = EQUAL;
		}
		else {
			this.lastnameOper = lastnameOper;
		}
	}

	/**
	 * 病人姓氏的Get查询操作符方法
	 */
	public String getLastnameOper() {
		return lastnameOper;
	}

	/**
	 * 病人名的Get方法
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * 病人名的Set方法
	 * @param Firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * 病人名的Set查询操作符方法
	 * @param FirstnameOper
	 */
	public void setFirstnameOper(String firstnameOper) {
		if (firstnameOper == null || firstnameOper.trim().length() == 0) {
			firstnameOper = EQUAL;
		}
		else {
			this.firstnameOper = firstnameOper;
		}
	}

	/**
	 * 病人名的Get查询操作符方法
	 */
	public String getFirstnameOper() {
		return firstnameOper;
	}

	/**
	 * 病人姓名拼音码的Get方法
	 */
	public String getPy() {
		return py;
	}

	/**
	 * 病人姓名拼音码的Set方法
	 * @param Py
	 */
	public void setPy(String py) {
		this.py = py;
	}

	/**
	 * 病人姓名拼音码的Set查询操作符方法
	 * @param PyOper
	 */
	public void setPyOper(String pyOper) {
		if (pyOper == null || pyOper.trim().length() == 0) {
			pyOper = EQUAL;
		}
		else {
			this.pyOper = pyOper;
		}
	}

	/**
	 * 病人姓名拼音码的Get查询操作符方法
	 */
	public String getPyOper() {
		return pyOper;
	}

	/**
	 * 病人姓名五笔码的Get方法
	 */
	public String getWb() {
		return wb;
	}

	/**
	 * 病人姓名五笔码的Set方法
	 * @param Wb
	 */
	public void setWb(String wb) {
		this.wb = wb;
	}

	/**
	 * 病人姓名五笔码的Set查询操作符方法
	 * @param WbOper
	 */
	public void setWbOper(String wbOper) {
		if (wbOper == null || wbOper.trim().length() == 0) {
			wbOper = EQUAL;
		}
		else {
			this.wbOper = wbOper;
		}
	}

	/**
	 * 病人姓名五笔码的Get查询操作符方法
	 */
	public String getWbOper() {
		return wbOper;
	}

	/**
	 * 病人性别代码的Get方法
	 */
	public String getSexcode() {
		return sexcode;
	}

	/**
	 * 病人性别代码的Set方法
	 * @param Sexcode
	 */
	public void setSexcode(String sexcode) {
		this.sexcode = sexcode;
	}

	/**
	 * 病人性别代码的Set查询操作符方法
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
	 * 病人性别代码的Get查询操作符方法
	 */
	public String getSexcodeOper() {
		return sexcodeOper;
	}

	/**
	 * 病人性别的Get方法
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 病人性别的Set方法
	 * @param Sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 病人性别的Set查询操作符方法
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
	 * 病人性别的Get查询操作符方法
	 */
	public String getSexOper() {
		return sexOper;
	}

	/**
	 * 病人出生日期（格式：yyyyMMdd）的Get方法
	 */
	public String getDateofbirth() {
		return dateofbirth;
	}

	/**
	 * 病人出生日期（格式：yyyyMMdd）的Set方法
	 * @param Dateofbirth
	 */
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * 病人出生日期（格式：yyyyMMdd）的Set查询操作符方法
	 * @param DateofbirthOper
	 */
	public void setDateofbirthOper(String dateofbirthOper) {
		if (dateofbirthOper == null || dateofbirthOper.trim().length() == 0) {
			dateofbirthOper = EQUAL;
		}
		else {
			this.dateofbirthOper = dateofbirthOper;
		}
	}

	/**
	 * 病人出生日期（格式：yyyyMMdd）的Get查询操作符方法
	 */
	public String getDateofbirthOper() {
		return dateofbirthOper;
	}

	/**
	 * 病人出生时间（格式：hhmmss）的Get方法
	 */
	public String getTimeofbirth() {
		return timeofbirth;
	}

	/**
	 * 病人出生时间（格式：hhmmss）的Set方法
	 * @param Timeofbirth
	 */
	public void setTimeofbirth(String timeofbirth) {
		this.timeofbirth = timeofbirth;
	}

	/**
	 * 病人出生时间（格式：hhmmss）的Set查询操作符方法
	 * @param TimeofbirthOper
	 */
	public void setTimeofbirthOper(String timeofbirthOper) {
		if (timeofbirthOper == null || timeofbirthOper.trim().length() == 0) {
			timeofbirthOper = EQUAL;
		}
		else {
			this.timeofbirthOper = timeofbirthOper;
		}
	}

	/**
	 * 病人出生时间（格式：hhmmss）的Get查询操作符方法
	 */
	public String getTimeofbirthOper() {
		return timeofbirthOper;
	}

	/**
	 * 病人婚姻状况代码的Get方法
	 */
	public String getMarriagestatuscode() {
		return marriagestatuscode;
	}

	/**
	 * 病人婚姻状况代码的Set方法
	 * @param Marriagestatuscode
	 */
	public void setMarriagestatuscode(String marriagestatuscode) {
		this.marriagestatuscode = marriagestatuscode;
	}

	/**
	 * 病人婚姻状况代码的Set查询操作符方法
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
	 * 病人婚姻状况代码的Get查询操作符方法
	 */
	public String getMarriagestatuscodeOper() {
		return marriagestatuscodeOper;
	}

	/**
	 * 病人婚姻状况的Get方法
	 */
	public String getMarriagestatus() {
		return marriagestatus;
	}

	/**
	 * 病人婚姻状况的Set方法
	 * @param Marriagestatus
	 */
	public void setMarriagestatus(String marriagestatus) {
		this.marriagestatus = marriagestatus;
	}

	/**
	 * 病人婚姻状况的Set查询操作符方法
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
	 * 病人婚姻状况的Get查询操作符方法
	 */
	public String getMarriagestatusOper() {
		return marriagestatusOper;
	}

	/**
	 * 病人职业代码的Get方法
	 */
	public String getOccupationcode() {
		return occupationcode;
	}

	/**
	 * 病人职业代码的Set方法
	 * @param Occupationcode
	 */
	public void setOccupationcode(String occupationcode) {
		this.occupationcode = occupationcode;
	}

	/**
	 * 病人职业代码的Set查询操作符方法
	 * @param OccupationcodeOper
	 */
	public void setOccupationcodeOper(String occupationcodeOper) {
		if (occupationcodeOper == null || occupationcodeOper.trim().length() == 0) {
			occupationcodeOper = EQUAL;
		}
		else {
			this.occupationcodeOper = occupationcodeOper;
		}
	}

	/**
	 * 病人职业代码的Get查询操作符方法
	 */
	public String getOccupationcodeOper() {
		return occupationcodeOper;
	}

	/**
	 * 病人职业的Get方法
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * 病人职业的Set方法
	 * @param Occupation
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * 病人职业的Set查询操作符方法
	 * @param OccupationOper
	 */
	public void setOccupationOper(String occupationOper) {
		if (occupationOper == null || occupationOper.trim().length() == 0) {
			occupationOper = EQUAL;
		}
		else {
			this.occupationOper = occupationOper;
		}
	}

	/**
	 * 病人职业的Get查询操作符方法
	 */
	public String getOccupationOper() {
		return occupationOper;
	}

	/**
	 * 病人民族代码的Get方法
	 */
	public String getNationalitycode() {
		return nationalitycode;
	}

	/**
	 * 病人民族代码的Set方法
	 * @param Nationalitycode
	 */
	public void setNationalitycode(String nationalitycode) {
		this.nationalitycode = nationalitycode;
	}

	/**
	 * 病人民族代码的Set查询操作符方法
	 * @param NationalitycodeOper
	 */
	public void setNationalitycodeOper(String nationalitycodeOper) {
		if (nationalitycodeOper == null || nationalitycodeOper.trim().length() == 0) {
			nationalitycodeOper = EQUAL;
		}
		else {
			this.nationalitycodeOper = nationalitycodeOper;
		}
	}

	/**
	 * 病人民族代码的Get查询操作符方法
	 */
	public String getNationalitycodeOper() {
		return nationalitycodeOper;
	}

	/**
	 * 病人民族的Get方法
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * 病人民族的Set方法
	 * @param Nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * 病人民族的Set查询操作符方法
	 * @param NationalityOper
	 */
	public void setNationalityOper(String nationalityOper) {
		if (nationalityOper == null || nationalityOper.trim().length() == 0) {
			nationalityOper = EQUAL;
		}
		else {
			this.nationalityOper = nationalityOper;
		}
	}

	/**
	 * 病人民族的Get查询操作符方法
	 */
	public String getNationalityOper() {
		return nationalityOper;
	}

	/**
	 * 病人国籍代码的Get方法
	 */
	public String getCountrycode() {
		return countrycode;
	}

	/**
	 * 病人国籍代码的Set方法
	 * @param Countrycode
	 */
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	/**
	 * 病人国籍代码的Set查询操作符方法
	 * @param CountrycodeOper
	 */
	public void setCountrycodeOper(String countrycodeOper) {
		if (countrycodeOper == null || countrycodeOper.trim().length() == 0) {
			countrycodeOper = EQUAL;
		}
		else {
			this.countrycodeOper = countrycodeOper;
		}
	}

	/**
	 * 病人国籍代码的Get查询操作符方法
	 */
	public String getCountrycodeOper() {
		return countrycodeOper;
	}

	/**
	 * 病人国籍的Get方法
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 病人国籍的Set方法
	 * @param Country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 病人国籍的Set查询操作符方法
	 * @param CountryOper
	 */
	public void setCountryOper(String countryOper) {
		if (countryOper == null || countryOper.trim().length() == 0) {
			countryOper = EQUAL;
		}
		else {
			this.countryOper = countryOper;
		}
	}

	/**
	 * 病人国籍的Get查询操作符方法
	 */
	public String getCountryOper() {
		return countryOper;
	}

	/**
	 * 病人文化水平代码的Get方法
	 */
	public String getFormalschoolingcode() {
		return formalschoolingcode;
	}

	/**
	 * 病人文化水平代码的Set方法
	 * @param Formalschoolingcode
	 */
	public void setFormalschoolingcode(String formalschoolingcode) {
		this.formalschoolingcode = formalschoolingcode;
	}

	/**
	 * 病人文化水平代码的Set查询操作符方法
	 * @param FormalschoolingcodeOper
	 */
	public void setFormalschoolingcodeOper(String formalschoolingcodeOper) {
		if (formalschoolingcodeOper == null || formalschoolingcodeOper.trim().length() == 0) {
			formalschoolingcodeOper = EQUAL;
		}
		else {
			this.formalschoolingcodeOper = formalschoolingcodeOper;
		}
	}

	/**
	 * 病人文化水平代码的Get查询操作符方法
	 */
	public String getFormalschoolingcodeOper() {
		return formalschoolingcodeOper;
	}

	/**
	 * 病人文化水平的Get方法
	 */
	public String getFormalschooling() {
		return formalschooling;
	}

	/**
	 * 病人文化水平的Set方法
	 * @param Formalschooling
	 */
	public void setFormalschooling(String formalschooling) {
		this.formalschooling = formalschooling;
	}

	/**
	 * 病人文化水平的Set查询操作符方法
	 * @param FormalschoolingOper
	 */
	public void setFormalschoolingOper(String formalschoolingOper) {
		if (formalschoolingOper == null || formalschoolingOper.trim().length() == 0) {
			formalschoolingOper = EQUAL;
		}
		else {
			this.formalschoolingOper = formalschoolingOper;
		}
	}

	/**
	 * 病人文化水平的Get查询操作符方法
	 */
	public String getFormalschoolingOper() {
		return formalschoolingOper;
	}

	/**
	 * 病人宗教信仰的Get方法
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * 病人宗教信仰的Set方法
	 * @param Religion
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}

	/**
	 * 病人宗教信仰的Set查询操作符方法
	 * @param ReligionOper
	 */
	public void setReligionOper(String religionOper) {
		if (religionOper == null || religionOper.trim().length() == 0) {
			religionOper = EQUAL;
		}
		else {
			this.religionOper = religionOper;
		}
	}

	/**
	 * 病人宗教信仰的Get查询操作符方法
	 */
	public String getReligionOper() {
		return religionOper;
	}

	/**
	 * 病人出生地代码的Get方法
	 */
	public String getBirthplacecode() {
		return birthplacecode;
	}

	/**
	 * 病人出生地代码的Set方法
	 * @param Birthplacecode
	 */
	public void setBirthplacecode(String birthplacecode) {
		this.birthplacecode = birthplacecode;
	}

	/**
	 * 病人出生地代码的Set查询操作符方法
	 * @param BirthplacecodeOper
	 */
	public void setBirthplacecodeOper(String birthplacecodeOper) {
		if (birthplacecodeOper == null || birthplacecodeOper.trim().length() == 0) {
			birthplacecodeOper = EQUAL;
		}
		else {
			this.birthplacecodeOper = birthplacecodeOper;
		}
	}

	/**
	 * 病人出生地代码的Get查询操作符方法
	 */
	public String getBirthplacecodeOper() {
		return birthplacecodeOper;
	}

	/**
	 * 病人出生地的Get方法
	 */
	public String getBirthplace() {
		return birthplace;
	}

	/**
	 * 病人出生地的Set方法
	 * @param Birthplace
	 */
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	/**
	 * 病人出生地的Set查询操作符方法
	 * @param BirthplaceOper
	 */
	public void setBirthplaceOper(String birthplaceOper) {
		if (birthplaceOper == null || birthplaceOper.trim().length() == 0) {
			birthplaceOper = EQUAL;
		}
		else {
			this.birthplaceOper = birthplaceOper;
		}
	}

	/**
	 * 病人出生地的Get查询操作符方法
	 */
	public String getBirthplaceOper() {
		return birthplaceOper;
	}

	/**
	 * 病人籍贯代码的Get方法
	 */
	public String getNativeplacecode() {
		return nativeplacecode;
	}

	/**
	 * 病人籍贯代码的Set方法
	 * @param Nativeplacecode
	 */
	public void setNativeplacecode(String nativeplacecode) {
		this.nativeplacecode = nativeplacecode;
	}

	/**
	 * 病人籍贯代码的Set查询操作符方法
	 * @param NativeplacecodeOper
	 */
	public void setNativeplacecodeOper(String nativeplacecodeOper) {
		if (nativeplacecodeOper == null || nativeplacecodeOper.trim().length() == 0) {
			nativeplacecodeOper = EQUAL;
		}
		else {
			this.nativeplacecodeOper = nativeplacecodeOper;
		}
	}

	/**
	 * 病人籍贯代码的Get查询操作符方法
	 */
	public String getNativeplacecodeOper() {
		return nativeplacecodeOper;
	}

	/**
	 * 病人籍贯的Get方法
	 */
	public String getNativeplace() {
		return nativeplace;
	}

	/**
	 * 病人籍贯的Set方法
	 * @param Nativeplace
	 */
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	/**
	 * 病人籍贯的Set查询操作符方法
	 * @param NativeplaceOper
	 */
	public void setNativeplaceOper(String nativeplaceOper) {
		if (nativeplaceOper == null || nativeplaceOper.trim().length() == 0) {
			nativeplaceOper = EQUAL;
		}
		else {
			this.nativeplaceOper = nativeplaceOper;
		}
	}

	/**
	 * 病人籍贯的Get查询操作符方法
	 */
	public String getNativeplaceOper() {
		return nativeplaceOper;
	}

	/**
	 * 病人血型的Get方法
	 */
	public String getBloodtype() {
		return bloodtype;
	}

	/**
	 * 病人血型的Set方法
	 * @param Bloodtype
	 */
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	/**
	 * 病人血型的Set查询操作符方法
	 * @param BloodtypeOper
	 */
	public void setBloodtypeOper(String bloodtypeOper) {
		if (bloodtypeOper == null || bloodtypeOper.trim().length() == 0) {
			bloodtypeOper = EQUAL;
		}
		else {
			this.bloodtypeOper = bloodtypeOper;
		}
	}

	/**
	 * 病人血型的Get查询操作符方法
	 */
	public String getBloodtypeOper() {
		return bloodtypeOper;
	}

	/**
	 * 病人证件类型代码的Get方法
	 */
	public String getCerttypecode() {
		return certtypecode;
	}

	/**
	 * 病人证件类型代码的Set方法
	 * @param Certtypecode
	 */
	public void setCerttypecode(String certtypecode) {
		this.certtypecode = certtypecode;
	}

	/**
	 * 病人证件类型代码的Set查询操作符方法
	 * @param CerttypecodeOper
	 */
	public void setCerttypecodeOper(String certtypecodeOper) {
		if (certtypecodeOper == null || certtypecodeOper.trim().length() == 0) {
			certtypecodeOper = EQUAL;
		}
		else {
			this.certtypecodeOper = certtypecodeOper;
		}
	}

	/**
	 * 病人证件类型代码的Get查询操作符方法
	 */
	public String getCerttypecodeOper() {
		return certtypecodeOper;
	}

	/**
	 * 病人证件类型的Get方法
	 */
	public String getCerttype() {
		return certtype;
	}

	/**
	 * 病人证件类型的Set方法
	 * @param Certtype
	 */
	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}

	/**
	 * 病人证件类型的Set查询操作符方法
	 * @param CerttypeOper
	 */
	public void setCerttypeOper(String certtypeOper) {
		if (certtypeOper == null || certtypeOper.trim().length() == 0) {
			certtypeOper = EQUAL;
		}
		else {
			this.certtypeOper = certtypeOper;
		}
	}

	/**
	 * 病人证件类型的Get查询操作符方法
	 */
	public String getCerttypeOper() {
		return certtypeOper;
	}

	/**
	 * 病人证件号的Get方法
	 */
	public String getCertno() {
		return certno;
	}

	/**
	 * 病人证件号的Set方法
	 * @param Certno
	 */
	public void setCertno(String certno) {
		this.certno = certno;
	}

	/**
	 * 病人证件号的Set查询操作符方法
	 * @param CertnoOper
	 */
	public void setCertnoOper(String certnoOper) {
		if (certnoOper == null || certnoOper.trim().length() == 0) {
			certnoOper = EQUAL;
		}
		else {
			this.certnoOper = certnoOper;
		}
	}

	/**
	 * 病人证件号的Get查询操作符方法
	 */
	public String getCertnoOper() {
		return certnoOper;
	}

	/**
	 * 病人身份代码的Get方法
	 */
	public String getPatientclasscode() {
		return patientclasscode;
	}

	/**
	 * 病人身份代码的Set方法
	 * @param Patientclasscode
	 */
	public void setPatientclasscode(String patientclasscode) {
		this.patientclasscode = patientclasscode;
	}

	/**
	 * 病人身份代码的Set查询操作符方法
	 * @param PatientclasscodeOper
	 */
	public void setPatientclasscodeOper(String patientclasscodeOper) {
		if (patientclasscodeOper == null || patientclasscodeOper.trim().length() == 0) {
			patientclasscodeOper = EQUAL;
		}
		else {
			this.patientclasscodeOper = patientclasscodeOper;
		}
	}

	/**
	 * 病人身份代码的Get查询操作符方法
	 */
	public String getPatientclasscodeOper() {
		return patientclasscodeOper;
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
	 * 病人费用类型代码的Get方法
	 */
	public String getFeetypecode() {
		return feetypecode;
	}

	/**
	 * 病人费用类型代码的Set方法
	 * @param Feetypecode
	 */
	public void setFeetypecode(String feetypecode) {
		this.feetypecode = feetypecode;
	}

	/**
	 * 病人费用类型代码的Set查询操作符方法
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
	 * 病人费用类型代码的Get查询操作符方法
	 */
	public String getFeetypecodeOper() {
		return feetypecodeOper;
	}

	/**
	 * 病人费用类型的Get方法
	 */
	public String getFeetype() {
		return feetype;
	}

	/**
	 * 病人费用类型的Set方法
	 * @param Feetype
	 */
	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}

	/**
	 * 病人费用类型的Set查询操作符方法
	 * @param FeetypeOper
	 */
	public void setFeetypeOper(String feetypeOper) {
		if (feetypeOper == null || feetypeOper.trim().length() == 0) {
			feetypeOper = EQUAL;
		}
		else {
			this.feetypeOper = feetypeOper;
		}
	}

	/**
	 * 病人费用类型的Get查询操作符方法
	 */
	public String getFeetypeOper() {
		return feetypeOper;
	}

	/**
	 * 病人工作单位的Get方法
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * 病人工作单位的Set方法
	 * @param Company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * 病人工作单位的Set查询操作符方法
	 * @param CompanyOper
	 */
	public void setCompanyOper(String companyOper) {
		if (companyOper == null || companyOper.trim().length() == 0) {
			companyOper = EQUAL;
		}
		else {
			this.companyOper = companyOper;
		}
	}

	/**
	 * 病人工作单位的Get查询操作符方法
	 */
	public String getCompanyOper() {
		return companyOper;
	}

	/**
	 * 病人医疗证号的Get方法
	 */
	public String getPublicexpenseno() {
		return publicexpenseno;
	}

	/**
	 * 病人医疗证号的Set方法
	 * @param Publicexpenseno
	 */
	public void setPublicexpenseno(String publicexpenseno) {
		this.publicexpenseno = publicexpenseno;
	}

	/**
	 * 病人医疗证号的Set查询操作符方法
	 * @param PublicexpensenoOper
	 */
	public void setPublicexpensenoOper(String publicexpensenoOper) {
		if (publicexpensenoOper == null || publicexpensenoOper.trim().length() == 0) {
			publicexpensenoOper = EQUAL;
		}
		else {
			this.publicexpensenoOper = publicexpensenoOper;
		}
	}

	/**
	 * 病人医疗证号的Get查询操作符方法
	 */
	public String getPublicexpensenoOper() {
		return publicexpensenoOper;
	}

	/**
	 * 合同单位代码的Get方法
	 */
	public String getContractunitcode() {
		return contractunitcode;
	}

	/**
	 * 合同单位代码的Set方法
	 * @param Contractunitcode
	 */
	public void setContractunitcode(String contractunitcode) {
		this.contractunitcode = contractunitcode;
	}

	/**
	 * 合同单位代码的Set查询操作符方法
	 * @param ContractunitcodeOper
	 */
	public void setContractunitcodeOper(String contractunitcodeOper) {
		if (contractunitcodeOper == null || contractunitcodeOper.trim().length() == 0) {
			contractunitcodeOper = EQUAL;
		}
		else {
			this.contractunitcodeOper = contractunitcodeOper;
		}
	}

	/**
	 * 合同单位代码的Get查询操作符方法
	 */
	public String getContractunitcodeOper() {
		return contractunitcodeOper;
	}

	/**
	 * 合同单位的Get方法
	 */
	public String getContractunit() {
		return contractunit;
	}

	/**
	 * 合同单位的Set方法
	 * @param Contractunit
	 */
	public void setContractunit(String contractunit) {
		this.contractunit = contractunit;
	}

	/**
	 * 合同单位的Set查询操作符方法
	 * @param ContractunitOper
	 */
	public void setContractunitOper(String contractunitOper) {
		if (contractunitOper == null || contractunitOper.trim().length() == 0) {
			contractunitOper = EQUAL;
		}
		else {
			this.contractunitOper = contractunitOper;
		}
	}

	/**
	 * 合同单位的Get查询操作符方法
	 */
	public String getContractunitOper() {
		return contractunitOper;
	}

	/**
	 * 病人工作单位地址代码的Get方法
	 */
	public String getBusinessaddresscode() {
		return businessaddresscode;
	}

	/**
	 * 病人工作单位地址代码的Set方法
	 * @param Businessaddresscode
	 */
	public void setBusinessaddresscode(String businessaddresscode) {
		this.businessaddresscode = businessaddresscode;
	}

	/**
	 * 病人工作单位地址代码的Set查询操作符方法
	 * @param BusinessaddresscodeOper
	 */
	public void setBusinessaddresscodeOper(String businessaddresscodeOper) {
		if (businessaddresscodeOper == null || businessaddresscodeOper.trim().length() == 0) {
			businessaddresscodeOper = EQUAL;
		}
		else {
			this.businessaddresscodeOper = businessaddresscodeOper;
		}
	}

	/**
	 * 病人工作单位地址代码的Get查询操作符方法
	 */
	public String getBusinessaddresscodeOper() {
		return businessaddresscodeOper;
	}

	/**
	 * 病人工作单位地址的Get方法
	 */
	public String getBusinessaddress() {
		return businessaddress;
	}

	/**
	 * 病人工作单位地址的Set方法
	 * @param Businessaddress
	 */
	public void setBusinessaddress(String businessaddress) {
		this.businessaddress = businessaddress;
	}

	/**
	 * 病人工作单位地址的Set查询操作符方法
	 * @param BusinessaddressOper
	 */
	public void setBusinessaddressOper(String businessaddressOper) {
		if (businessaddressOper == null || businessaddressOper.trim().length() == 0) {
			businessaddressOper = EQUAL;
		}
		else {
			this.businessaddressOper = businessaddressOper;
		}
	}

	/**
	 * 病人工作单位地址的Get查询操作符方法
	 */
	public String getBusinessaddressOper() {
		return businessaddressOper;
	}

	/**
	 * 病人工作单位邮编的Get方法
	 */
	public String getBusinesspostcode() {
		return businesspostcode;
	}

	/**
	 * 病人工作单位邮编的Set方法
	 * @param Businesspostcode
	 */
	public void setBusinesspostcode(String businesspostcode) {
		this.businesspostcode = businesspostcode;
	}

	/**
	 * 病人工作单位邮编的Set查询操作符方法
	 * @param BusinesspostcodeOper
	 */
	public void setBusinesspostcodeOper(String businesspostcodeOper) {
		if (businesspostcodeOper == null || businesspostcodeOper.trim().length() == 0) {
			businesspostcodeOper = EQUAL;
		}
		else {
			this.businesspostcodeOper = businesspostcodeOper;
		}
	}

	/**
	 * 病人工作单位邮编的Get查询操作符方法
	 */
	public String getBusinesspostcodeOper() {
		return businesspostcodeOper;
	}

	/**
	 * 病人工作单位电话的Get方法
	 */
	public String getBusinessphone() {
		return businessphone;
	}

	/**
	 * 病人工作单位电话的Set方法
	 * @param Businessphone
	 */
	public void setBusinessphone(String businessphone) {
		this.businessphone = businessphone;
	}

	/**
	 * 病人工作单位电话的Set查询操作符方法
	 * @param BusinessphoneOper
	 */
	public void setBusinessphoneOper(String businessphoneOper) {
		if (businessphoneOper == null || businessphoneOper.trim().length() == 0) {
			businessphoneOper = EQUAL;
		}
		else {
			this.businessphoneOper = businessphoneOper;
		}
	}

	/**
	 * 病人工作单位电话的Get查询操作符方法
	 */
	public String getBusinessphoneOper() {
		return businessphoneOper;
	}

	/**
	 * 病人家庭住址代码的Get方法
	 */
	public String getHomeaddresscode() {
		return homeaddresscode;
	}

	/**
	 * 病人家庭住址代码的Set方法
	 * @param Homeaddresscode
	 */
	public void setHomeaddresscode(String homeaddresscode) {
		this.homeaddresscode = homeaddresscode;
	}

	/**
	 * 病人家庭住址代码的Set查询操作符方法
	 * @param HomeaddresscodeOper
	 */
	public void setHomeaddresscodeOper(String homeaddresscodeOper) {
		if (homeaddresscodeOper == null || homeaddresscodeOper.trim().length() == 0) {
			homeaddresscodeOper = EQUAL;
		}
		else {
			this.homeaddresscodeOper = homeaddresscodeOper;
		}
	}

	/**
	 * 病人家庭住址代码的Get查询操作符方法
	 */
	public String getHomeaddresscodeOper() {
		return homeaddresscodeOper;
	}

	/**
	 * 病人家庭住址的Get方法
	 */
	public String getHomeaddress() {
		return homeaddress;
	}

	/**
	 * 病人家庭住址的Set方法
	 * @param Homeaddress
	 */
	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	/**
	 * 病人家庭住址的Set查询操作符方法
	 * @param HomeaddressOper
	 */
	public void setHomeaddressOper(String homeaddressOper) {
		if (homeaddressOper == null || homeaddressOper.trim().length() == 0) {
			homeaddressOper = EQUAL;
		}
		else {
			this.homeaddressOper = homeaddressOper;
		}
	}

	/**
	 * 病人家庭住址的Get查询操作符方法
	 */
	public String getHomeaddressOper() {
		return homeaddressOper;
	}

	/**
	 * 病人家庭地址邮编的Get方法
	 */
	public String getHomepostcode() {
		return homepostcode;
	}

	/**
	 * 病人家庭地址邮编的Set方法
	 * @param Homepostcode
	 */
	public void setHomepostcode(String homepostcode) {
		this.homepostcode = homepostcode;
	}

	/**
	 * 病人家庭地址邮编的Set查询操作符方法
	 * @param HomepostcodeOper
	 */
	public void setHomepostcodeOper(String homepostcodeOper) {
		if (homepostcodeOper == null || homepostcodeOper.trim().length() == 0) {
			homepostcodeOper = EQUAL;
		}
		else {
			this.homepostcodeOper = homepostcodeOper;
		}
	}

	/**
	 * 病人家庭地址邮编的Get查询操作符方法
	 */
	public String getHomepostcodeOper() {
		return homepostcodeOper;
	}

	/**
	 * 病人手机号的Get方法
	 */
	public String getMobilephone() {
		return mobilephone;
	}

	/**
	 * 病人手机号的Set方法
	 * @param Mobilephone
	 */
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	/**
	 * 病人手机号的Set查询操作符方法
	 * @param MobilephoneOper
	 */
	public void setMobilephoneOper(String mobilephoneOper) {
		if (mobilephoneOper == null || mobilephoneOper.trim().length() == 0) {
			mobilephoneOper = EQUAL;
		}
		else {
			this.mobilephoneOper = mobilephoneOper;
		}
	}

	/**
	 * 病人手机号的Get查询操作符方法
	 */
	public String getMobilephoneOper() {
		return mobilephoneOper;
	}

	/**
	 * 联系人的Get方法
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * 联系人的Set方法
	 * @param Contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * 联系人的Set查询操作符方法
	 * @param ContactOper
	 */
	public void setContactOper(String contactOper) {
		if (contactOper == null || contactOper.trim().length() == 0) {
			contactOper = EQUAL;
		}
		else {
			this.contactOper = contactOper;
		}
	}

	/**
	 * 联系人的Get查询操作符方法
	 */
	public String getContactOper() {
		return contactOper;
	}

	/**
	 * 联系人关系代码的Get方法
	 */
	public String getRelationcode() {
		return relationcode;
	}

	/**
	 * 联系人关系代码的Set方法
	 * @param Relationcode
	 */
	public void setRelationcode(String relationcode) {
		this.relationcode = relationcode;
	}

	/**
	 * 联系人关系代码的Set查询操作符方法
	 * @param RelationcodeOper
	 */
	public void setRelationcodeOper(String relationcodeOper) {
		if (relationcodeOper == null || relationcodeOper.trim().length() == 0) {
			relationcodeOper = EQUAL;
		}
		else {
			this.relationcodeOper = relationcodeOper;
		}
	}

	/**
	 * 联系人关系代码的Get查询操作符方法
	 */
	public String getRelationcodeOper() {
		return relationcodeOper;
	}

	/**
	 * 联系人关系的Get方法
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * 联系人关系的Set方法
	 * @param Relation
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	/**
	 * 联系人关系的Set查询操作符方法
	 * @param RelationOper
	 */
	public void setRelationOper(String relationOper) {
		if (relationOper == null || relationOper.trim().length() == 0) {
			relationOper = EQUAL;
		}
		else {
			this.relationOper = relationOper;
		}
	}

	/**
	 * 联系人关系的Get查询操作符方法
	 */
	public String getRelationOper() {
		return relationOper;
	}

	/**
	 * 联系邮箱的Get方法
	 */
	public String getContactemail() {
		return contactemail;
	}

	/**
	 * 联系邮箱的Set方法
	 * @param Contactemail
	 */
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	/**
	 * 联系邮箱的Set查询操作符方法
	 * @param ContactemailOper
	 */
	public void setContactemailOper(String contactemailOper) {
		if (contactemailOper == null || contactemailOper.trim().length() == 0) {
			contactemailOper = EQUAL;
		}
		else {
			this.contactemailOper = contactemailOper;
		}
	}

	/**
	 * 联系邮箱的Get查询操作符方法
	 */
	public String getContactemailOper() {
		return contactemailOper;
	}

	/**
	 * 联系方式的Get方法
	 */
	public String getContactmethod() {
		return contactmethod;
	}

	/**
	 * 联系方式的Set方法
	 * @param Contactmethod
	 */
	public void setContactmethod(String contactmethod) {
		this.contactmethod = contactmethod;
	}

	/**
	 * 联系方式的Set查询操作符方法
	 * @param ContactmethodOper
	 */
	public void setContactmethodOper(String contactmethodOper) {
		if (contactmethodOper == null || contactmethodOper.trim().length() == 0) {
			contactmethodOper = EQUAL;
		}
		else {
			this.contactmethodOper = contactmethodOper;
		}
	}

	/**
	 * 联系方式的Get查询操作符方法
	 */
	public String getContactmethodOper() {
		return contactmethodOper;
	}

	/**
	 * 重点病人类型的Get方法
	 */
	public String getViptype() {
		return viptype;
	}

	/**
	 * 重点病人类型的Set方法
	 * @param Viptype
	 */
	public void setViptype(String viptype) {
		this.viptype = viptype;
	}

	/**
	 * 重点病人类型的Set查询操作符方法
	 * @param ViptypeOper
	 */
	public void setViptypeOper(String viptypeOper) {
		if (viptypeOper == null || viptypeOper.trim().length() == 0) {
			viptypeOper = EQUAL;
		}
		else {
			this.viptypeOper = viptypeOper;
		}
	}

	/**
	 * 重点病人类型的Get查询操作符方法
	 */
	public String getViptypeOper() {
		return viptypeOper;
	}

	/**
	 * 经办人ID的Get方法
	 */
	public String getOperatorid() {
		return operatorid;
	}

	/**
	 * 经办人ID的Set方法
	 * @param Operatorid
	 */
	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}

	/**
	 * 经办人ID的Set查询操作符方法
	 * @param OperatoridOper
	 */
	public void setOperatoridOper(String operatoridOper) {
		if (operatoridOper == null || operatoridOper.trim().length() == 0) {
			operatoridOper = EQUAL;
		}
		else {
			this.operatoridOper = operatoridOper;
		}
	}

	/**
	 * 经办人ID的Get查询操作符方法
	 */
	public String getOperatoridOper() {
		return operatoridOper;
	}

	/**
	 * 经办人的Get方法
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * 经办人的Set方法
	 * @param Operator
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * 经办人的Set查询操作符方法
	 * @param OperatorOper
	 */
	public void setOperatorOper(String operatorOper) {
		if (operatorOper == null || operatorOper.trim().length() == 0) {
			operatorOper = EQUAL;
		}
		else {
			this.operatorOper = operatorOper;
		}
	}

	/**
	 * 经办人的Get查询操作符方法
	 */
	public String getOperatorOper() {
		return operatorOper;
	}

	/**
	 * 办理时间（格式：yyyyMMddHHmmss）的Get方法
	 */
	public String getOperatortime() {
		return operatortime;
	}

	/**
	 * 办理时间（格式：yyyyMMddHHmmss）的Set方法
	 * @param Operatortime
	 */
	public void setOperatortime(String operatortime) {
		this.operatortime = operatortime;
	}

	/**
	 * 办理时间（格式：yyyyMMddHHmmss）的Set查询操作符方法
	 * @param OperatortimeOper
	 */
	public void setOperatortimeOper(String operatortimeOper) {
		if (operatortimeOper == null || operatortimeOper.trim().length() == 0) {
			operatortimeOper = EQUAL;
		}
		else {
			this.operatortimeOper = operatortimeOper;
		}
	}

	/**
	 * 办理时间（格式：yyyyMMddHHmmss）的Get查询操作符方法
	 */
	public String getOperatortimeOper() {
		return operatortimeOper;
	}

	/**
	 * 可用标志（Y-可用 N-停用）的Get方法
	 */
	public String getAvailable() {
		return available;
	}

	/**
	 * 可用标志（Y-可用 N-停用）的Set方法
	 * @param Available
	 */
	public void setAvailable(String available) {
		this.available = available;
	}

	/**
	 * 可用标志（Y-可用 N-停用）的Set查询操作符方法
	 * @param AvailableOper
	 */
	public void setAvailableOper(String availableOper) {
		if (availableOper == null || availableOper.trim().length() == 0) {
			availableOper = EQUAL;
		}
		else {
			this.availableOper = availableOper;
		}
	}

	/**
	 * 可用标志（Y-可用 N-停用）的Get查询操作符方法
	 */
	public String getAvailableOper() {
		return availableOper;
	}

	/**
	 * 处理类型（1-新增 2-修改 3-删除） 必填的Get方法
	 */
	public String getManagetype() {
		return managetype;
	}

	/**
	 * 处理类型（1-新增 2-修改 3-删除） 必填的Set方法
	 * @param Managetype
	 */
	public void setManagetype(String managetype) {
		this.managetype = managetype;
	}

	/**
	 * 处理类型（1-新增 2-修改 3-删除） 必填的Set查询操作符方法
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
	 * 处理类型（1-新增 2-修改 3-删除） 必填的Get查询操作符方法
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
			+ ",pid="
			+ pid
			+ ",insuranceno="
			+ insuranceno
			+ ",patientname="
			+ patientname
			+ ",tmpflag="
			+ tmpflag
			+ ",lastname="
			+ lastname
			+ ",firstname="
			+ firstname
			+ ",py="
			+ py
			+ ",wb="
			+ wb
			+ ",sexcode="
			+ sexcode
			+ ",sex="
			+ sex
			+ ",dateofbirth="
			+ dateofbirth
			+ ",timeofbirth="
			+ timeofbirth
			+ ",marriagestatuscode="
			+ marriagestatuscode
			+ ",marriagestatus="
			+ marriagestatus
			+ ",occupationcode="
			+ occupationcode
			+ ",occupation="
			+ occupation
			+ ",nationalitycode="
			+ nationalitycode
			+ ",nationality="
			+ nationality
			+ ",countrycode="
			+ countrycode
			+ ",country="
			+ country
			+ ",formalschoolingcode="
			+ formalschoolingcode
			+ ",formalschooling="
			+ formalschooling
			+ ",religion="
			+ religion
			+ ",birthplacecode="
			+ birthplacecode
			+ ",birthplace="
			+ birthplace
			+ ",nativeplacecode="
			+ nativeplacecode
			+ ",nativeplace="
			+ nativeplace
			+ ",bloodtype="
			+ bloodtype
			+ ",certtypecode="
			+ certtypecode
			+ ",certtype="
			+ certtype
			+ ",certno="
			+ certno
			+ ",patientclasscode="
			+ patientclasscode
			+ ",patientclass="
			+ patientclass
			+ ",feetypecode="
			+ feetypecode
			+ ",feetype="
			+ feetype
			+ ",company="
			+ company
			+ ",publicexpenseno="
			+ publicexpenseno
			+ ",contractunitcode="
			+ contractunitcode
			+ ",contractunit="
			+ contractunit
			+ ",businessaddresscode="
			+ businessaddresscode
			+ ",businessaddress="
			+ businessaddress
			+ ",businesspostcode="
			+ businesspostcode
			+ ",businessphone="
			+ businessphone
			+ ",homeaddresscode="
			+ homeaddresscode
			+ ",homeaddress="
			+ homeaddress
			+ ",homepostcode="
			+ homepostcode
			+ ",mobilephone="
			+ mobilephone
			+ ",contact="
			+ contact
			+ ",relationcode="
			+ relationcode
			+ ",relation="
			+ relation
			+ ",contactemail="
			+ contactemail
			+ ",contactmethod="
			+ contactmethod
			+ ",viptype="
			+ viptype
			+ ",operatorid="
			+ operatorid
			+ ",operator="
			+ operator
			+ ",operatortime="
			+ operatortime
			+ ",available="
			+ available
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
	 * 生成Patientinfo对象的日志记录
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
