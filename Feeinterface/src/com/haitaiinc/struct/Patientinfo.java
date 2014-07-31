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

	//��¼��ˮ��	key
	protected String recordflow;
	protected String recordflowOper = EQUAL;

	//����ID����
	protected String pid;
	protected String pidOper = EQUAL;

	//����ҽ����
	protected String insuranceno;
	protected String insurancenoOper = EQUAL;

	//��������
	protected String patientname;
	protected String patientnameOper = EQUAL;

	//��ʱ������־����ʽ����ʱ��
	protected String tmpflag;
	protected String tmpflagOper = EQUAL;

	//��������
	protected String lastname;
	protected String lastnameOper = EQUAL;

	//������
	protected String firstname;
	protected String firstnameOper = EQUAL;

	//��������ƴ����
	protected String py;
	protected String pyOper = EQUAL;

	//�������������
	protected String wb;
	protected String wbOper = EQUAL;

	//�����Ա����
	protected String sexcode;
	protected String sexcodeOper = EQUAL;

	//�����Ա�
	protected String sex;
	protected String sexOper = EQUAL;

	//���˳������ڣ���ʽ��yyyyMMdd��
	protected String dateofbirth;
	protected String dateofbirthOper = EQUAL;

	//���˳���ʱ�䣨��ʽ��hhmmss��
	protected String timeofbirth;
	protected String timeofbirthOper = EQUAL;

	//���˻���״������
	protected String marriagestatuscode;
	protected String marriagestatuscodeOper = EQUAL;

	//���˻���״��
	protected String marriagestatus;
	protected String marriagestatusOper = EQUAL;

	//����ְҵ����
	protected String occupationcode;
	protected String occupationcodeOper = EQUAL;

	//����ְҵ
	protected String occupation;
	protected String occupationOper = EQUAL;

	//�����������
	protected String nationalitycode;
	protected String nationalitycodeOper = EQUAL;

	//��������
	protected String nationality;
	protected String nationalityOper = EQUAL;

	//���˹�������
	protected String countrycode;
	protected String countrycodeOper = EQUAL;

	//���˹���
	protected String country;
	protected String countryOper = EQUAL;

	//�����Ļ�ˮƽ����
	protected String formalschoolingcode;
	protected String formalschoolingcodeOper = EQUAL;

	//�����Ļ�ˮƽ
	protected String formalschooling;
	protected String formalschoolingOper = EQUAL;

	//�����ڽ�����
	protected String religion;
	protected String religionOper = EQUAL;

	//���˳����ش���
	protected String birthplacecode;
	protected String birthplacecodeOper = EQUAL;

	//���˳�����
	protected String birthplace;
	protected String birthplaceOper = EQUAL;

	//���˼������
	protected String nativeplacecode;
	protected String nativeplacecodeOper = EQUAL;

	//���˼���
	protected String nativeplace;
	protected String nativeplaceOper = EQUAL;

	//����Ѫ��
	protected String bloodtype;
	protected String bloodtypeOper = EQUAL;

	//����֤�����ʹ���
	protected String certtypecode;
	protected String certtypecodeOper = EQUAL;

	//����֤������
	protected String certtype;
	protected String certtypeOper = EQUAL;

	//����֤����
	protected String certno;
	protected String certnoOper = EQUAL;

	//������ݴ���
	protected String patientclasscode;
	protected String patientclasscodeOper = EQUAL;

	//�������
	protected String patientclass;
	protected String patientclassOper = EQUAL;

	//���˷������ʹ���
	protected String feetypecode;
	protected String feetypecodeOper = EQUAL;

	//���˷�������
	protected String feetype;
	protected String feetypeOper = EQUAL;

	//���˹�����λ
	protected String company;
	protected String companyOper = EQUAL;

	//����ҽ��֤��
	protected String publicexpenseno;
	protected String publicexpensenoOper = EQUAL;

	//��ͬ��λ����
	protected String contractunitcode;
	protected String contractunitcodeOper = EQUAL;

	//��ͬ��λ
	protected String contractunit;
	protected String contractunitOper = EQUAL;

	//���˹�����λ��ַ����
	protected String businessaddresscode;
	protected String businessaddresscodeOper = EQUAL;

	//���˹�����λ��ַ
	protected String businessaddress;
	protected String businessaddressOper = EQUAL;

	//���˹�����λ�ʱ�
	protected String businesspostcode;
	protected String businesspostcodeOper = EQUAL;

	//���˹�����λ�绰
	protected String businessphone;
	protected String businessphoneOper = EQUAL;

	//���˼�ͥסַ����
	protected String homeaddresscode;
	protected String homeaddresscodeOper = EQUAL;

	//���˼�ͥסַ
	protected String homeaddress;
	protected String homeaddressOper = EQUAL;

	//���˼�ͥ��ַ�ʱ�
	protected String homepostcode;
	protected String homepostcodeOper = EQUAL;

	//�����ֻ���
	protected String mobilephone;
	protected String mobilephoneOper = EQUAL;

	//��ϵ��
	protected String contact;
	protected String contactOper = EQUAL;

	//��ϵ�˹�ϵ����
	protected String relationcode;
	protected String relationcodeOper = EQUAL;

	//��ϵ�˹�ϵ
	protected String relation;
	protected String relationOper = EQUAL;

	//��ϵ����
	protected String contactemail;
	protected String contactemailOper = EQUAL;

	//��ϵ��ʽ
	protected String contactmethod;
	protected String contactmethodOper = EQUAL;

	//�ص㲡������
	protected String viptype;
	protected String viptypeOper = EQUAL;

	//������ID
	protected String operatorid;
	protected String operatoridOper = EQUAL;

	//������
	protected String operator;
	protected String operatorOper = EQUAL;

	//����ʱ�䣨��ʽ��yyyyMMddHHmmss��
	protected String operatortime;
	protected String operatortimeOper = EQUAL;

	//���ñ�־��Y-���� N-ͣ�ã�
	protected String available;
	protected String availableOper = EQUAL;

	//�������ͣ�1-���� 2-�޸� 3-ɾ���� ����
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
	 * ����ID�����Get����
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * ����ID�����Set����
	 * @param Pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * ����ID�����Set��ѯ����������
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
	 * ����ID�����Get��ѯ����������
	 */
	public String getPidOper() {
		return pidOper;
	}

	/**
	 * ����ҽ���ŵ�Get����
	 */
	public String getInsuranceno() {
		return insuranceno;
	}

	/**
	 * ����ҽ���ŵ�Set����
	 * @param Insuranceno
	 */
	public void setInsuranceno(String insuranceno) {
		this.insuranceno = insuranceno;
	}

	/**
	 * ����ҽ���ŵ�Set��ѯ����������
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
	 * ����ҽ���ŵ�Get��ѯ����������
	 */
	public String getInsurancenoOper() {
		return insurancenoOper;
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
	 * ��ʱ������־����ʽ����ʱ����Get����
	 */
	public String getTmpflag() {
		return tmpflag;
	}

	/**
	 * ��ʱ������־����ʽ����ʱ����Set����
	 * @param Tmpflag
	 */
	public void setTmpflag(String tmpflag) {
		this.tmpflag = tmpflag;
	}

	/**
	 * ��ʱ������־����ʽ����ʱ����Set��ѯ����������
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
	 * ��ʱ������־����ʽ����ʱ����Get��ѯ����������
	 */
	public String getTmpflagOper() {
		return tmpflagOper;
	}

	/**
	 * �������ϵ�Get����
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * �������ϵ�Set����
	 * @param Lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * �������ϵ�Set��ѯ����������
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
	 * �������ϵ�Get��ѯ����������
	 */
	public String getLastnameOper() {
		return lastnameOper;
	}

	/**
	 * ��������Get����
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * ��������Set����
	 * @param Firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * ��������Set��ѯ����������
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
	 * ��������Get��ѯ����������
	 */
	public String getFirstnameOper() {
		return firstnameOper;
	}

	/**
	 * ��������ƴ�����Get����
	 */
	public String getPy() {
		return py;
	}

	/**
	 * ��������ƴ�����Set����
	 * @param Py
	 */
	public void setPy(String py) {
		this.py = py;
	}

	/**
	 * ��������ƴ�����Set��ѯ����������
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
	 * ��������ƴ�����Get��ѯ����������
	 */
	public String getPyOper() {
		return pyOper;
	}

	/**
	 * ��������������Get����
	 */
	public String getWb() {
		return wb;
	}

	/**
	 * ��������������Set����
	 * @param Wb
	 */
	public void setWb(String wb) {
		this.wb = wb;
	}

	/**
	 * ��������������Set��ѯ����������
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
	 * ��������������Get��ѯ����������
	 */
	public String getWbOper() {
		return wbOper;
	}

	/**
	 * �����Ա�����Get����
	 */
	public String getSexcode() {
		return sexcode;
	}

	/**
	 * �����Ա�����Set����
	 * @param Sexcode
	 */
	public void setSexcode(String sexcode) {
		this.sexcode = sexcode;
	}

	/**
	 * �����Ա�����Set��ѯ����������
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
	 * �����Ա�����Get��ѯ����������
	 */
	public String getSexcodeOper() {
		return sexcodeOper;
	}

	/**
	 * �����Ա��Get����
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * �����Ա��Set����
	 * @param Sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * �����Ա��Set��ѯ����������
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
	 * �����Ա��Get��ѯ����������
	 */
	public String getSexOper() {
		return sexOper;
	}

	/**
	 * ���˳������ڣ���ʽ��yyyyMMdd����Get����
	 */
	public String getDateofbirth() {
		return dateofbirth;
	}

	/**
	 * ���˳������ڣ���ʽ��yyyyMMdd����Set����
	 * @param Dateofbirth
	 */
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	/**
	 * ���˳������ڣ���ʽ��yyyyMMdd����Set��ѯ����������
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
	 * ���˳������ڣ���ʽ��yyyyMMdd����Get��ѯ����������
	 */
	public String getDateofbirthOper() {
		return dateofbirthOper;
	}

	/**
	 * ���˳���ʱ�䣨��ʽ��hhmmss����Get����
	 */
	public String getTimeofbirth() {
		return timeofbirth;
	}

	/**
	 * ���˳���ʱ�䣨��ʽ��hhmmss����Set����
	 * @param Timeofbirth
	 */
	public void setTimeofbirth(String timeofbirth) {
		this.timeofbirth = timeofbirth;
	}

	/**
	 * ���˳���ʱ�䣨��ʽ��hhmmss����Set��ѯ����������
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
	 * ���˳���ʱ�䣨��ʽ��hhmmss����Get��ѯ����������
	 */
	public String getTimeofbirthOper() {
		return timeofbirthOper;
	}

	/**
	 * ���˻���״�������Get����
	 */
	public String getMarriagestatuscode() {
		return marriagestatuscode;
	}

	/**
	 * ���˻���״�������Set����
	 * @param Marriagestatuscode
	 */
	public void setMarriagestatuscode(String marriagestatuscode) {
		this.marriagestatuscode = marriagestatuscode;
	}

	/**
	 * ���˻���״�������Set��ѯ����������
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
	 * ���˻���״�������Get��ѯ����������
	 */
	public String getMarriagestatuscodeOper() {
		return marriagestatuscodeOper;
	}

	/**
	 * ���˻���״����Get����
	 */
	public String getMarriagestatus() {
		return marriagestatus;
	}

	/**
	 * ���˻���״����Set����
	 * @param Marriagestatus
	 */
	public void setMarriagestatus(String marriagestatus) {
		this.marriagestatus = marriagestatus;
	}

	/**
	 * ���˻���״����Set��ѯ����������
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
	 * ���˻���״����Get��ѯ����������
	 */
	public String getMarriagestatusOper() {
		return marriagestatusOper;
	}

	/**
	 * ����ְҵ�����Get����
	 */
	public String getOccupationcode() {
		return occupationcode;
	}

	/**
	 * ����ְҵ�����Set����
	 * @param Occupationcode
	 */
	public void setOccupationcode(String occupationcode) {
		this.occupationcode = occupationcode;
	}

	/**
	 * ����ְҵ�����Set��ѯ����������
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
	 * ����ְҵ�����Get��ѯ����������
	 */
	public String getOccupationcodeOper() {
		return occupationcodeOper;
	}

	/**
	 * ����ְҵ��Get����
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * ����ְҵ��Set����
	 * @param Occupation
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * ����ְҵ��Set��ѯ����������
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
	 * ����ְҵ��Get��ѯ����������
	 */
	public String getOccupationOper() {
		return occupationOper;
	}

	/**
	 * ������������Get����
	 */
	public String getNationalitycode() {
		return nationalitycode;
	}

	/**
	 * ������������Set����
	 * @param Nationalitycode
	 */
	public void setNationalitycode(String nationalitycode) {
		this.nationalitycode = nationalitycode;
	}

	/**
	 * ������������Set��ѯ����������
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
	 * ������������Get��ѯ����������
	 */
	public String getNationalitycodeOper() {
		return nationalitycodeOper;
	}

	/**
	 * ���������Get����
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * ���������Set����
	 * @param Nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * ���������Set��ѯ����������
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
	 * ���������Get��ѯ����������
	 */
	public String getNationalityOper() {
		return nationalityOper;
	}

	/**
	 * ���˹��������Get����
	 */
	public String getCountrycode() {
		return countrycode;
	}

	/**
	 * ���˹��������Set����
	 * @param Countrycode
	 */
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	/**
	 * ���˹��������Set��ѯ����������
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
	 * ���˹��������Get��ѯ����������
	 */
	public String getCountrycodeOper() {
		return countrycodeOper;
	}

	/**
	 * ���˹�����Get����
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * ���˹�����Set����
	 * @param Country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * ���˹�����Set��ѯ����������
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
	 * ���˹�����Get��ѯ����������
	 */
	public String getCountryOper() {
		return countryOper;
	}

	/**
	 * �����Ļ�ˮƽ�����Get����
	 */
	public String getFormalschoolingcode() {
		return formalschoolingcode;
	}

	/**
	 * �����Ļ�ˮƽ�����Set����
	 * @param Formalschoolingcode
	 */
	public void setFormalschoolingcode(String formalschoolingcode) {
		this.formalschoolingcode = formalschoolingcode;
	}

	/**
	 * �����Ļ�ˮƽ�����Set��ѯ����������
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
	 * �����Ļ�ˮƽ�����Get��ѯ����������
	 */
	public String getFormalschoolingcodeOper() {
		return formalschoolingcodeOper;
	}

	/**
	 * �����Ļ�ˮƽ��Get����
	 */
	public String getFormalschooling() {
		return formalschooling;
	}

	/**
	 * �����Ļ�ˮƽ��Set����
	 * @param Formalschooling
	 */
	public void setFormalschooling(String formalschooling) {
		this.formalschooling = formalschooling;
	}

	/**
	 * �����Ļ�ˮƽ��Set��ѯ����������
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
	 * �����Ļ�ˮƽ��Get��ѯ����������
	 */
	public String getFormalschoolingOper() {
		return formalschoolingOper;
	}

	/**
	 * �����ڽ�������Get����
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * �����ڽ�������Set����
	 * @param Religion
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}

	/**
	 * �����ڽ�������Set��ѯ����������
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
	 * �����ڽ�������Get��ѯ����������
	 */
	public String getReligionOper() {
		return religionOper;
	}

	/**
	 * ���˳����ش����Get����
	 */
	public String getBirthplacecode() {
		return birthplacecode;
	}

	/**
	 * ���˳����ش����Set����
	 * @param Birthplacecode
	 */
	public void setBirthplacecode(String birthplacecode) {
		this.birthplacecode = birthplacecode;
	}

	/**
	 * ���˳����ش����Set��ѯ����������
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
	 * ���˳����ش����Get��ѯ����������
	 */
	public String getBirthplacecodeOper() {
		return birthplacecodeOper;
	}

	/**
	 * ���˳����ص�Get����
	 */
	public String getBirthplace() {
		return birthplace;
	}

	/**
	 * ���˳����ص�Set����
	 * @param Birthplace
	 */
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	/**
	 * ���˳����ص�Set��ѯ����������
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
	 * ���˳����ص�Get��ѯ����������
	 */
	public String getBirthplaceOper() {
		return birthplaceOper;
	}

	/**
	 * ���˼�������Get����
	 */
	public String getNativeplacecode() {
		return nativeplacecode;
	}

	/**
	 * ���˼�������Set����
	 * @param Nativeplacecode
	 */
	public void setNativeplacecode(String nativeplacecode) {
		this.nativeplacecode = nativeplacecode;
	}

	/**
	 * ���˼�������Set��ѯ����������
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
	 * ���˼�������Get��ѯ����������
	 */
	public String getNativeplacecodeOper() {
		return nativeplacecodeOper;
	}

	/**
	 * ���˼����Get����
	 */
	public String getNativeplace() {
		return nativeplace;
	}

	/**
	 * ���˼����Set����
	 * @param Nativeplace
	 */
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	/**
	 * ���˼����Set��ѯ����������
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
	 * ���˼����Get��ѯ����������
	 */
	public String getNativeplaceOper() {
		return nativeplaceOper;
	}

	/**
	 * ����Ѫ�͵�Get����
	 */
	public String getBloodtype() {
		return bloodtype;
	}

	/**
	 * ����Ѫ�͵�Set����
	 * @param Bloodtype
	 */
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	/**
	 * ����Ѫ�͵�Set��ѯ����������
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
	 * ����Ѫ�͵�Get��ѯ����������
	 */
	public String getBloodtypeOper() {
		return bloodtypeOper;
	}

	/**
	 * ����֤�����ʹ����Get����
	 */
	public String getCerttypecode() {
		return certtypecode;
	}

	/**
	 * ����֤�����ʹ����Set����
	 * @param Certtypecode
	 */
	public void setCerttypecode(String certtypecode) {
		this.certtypecode = certtypecode;
	}

	/**
	 * ����֤�����ʹ����Set��ѯ����������
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
	 * ����֤�����ʹ����Get��ѯ����������
	 */
	public String getCerttypecodeOper() {
		return certtypecodeOper;
	}

	/**
	 * ����֤�����͵�Get����
	 */
	public String getCerttype() {
		return certtype;
	}

	/**
	 * ����֤�����͵�Set����
	 * @param Certtype
	 */
	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}

	/**
	 * ����֤�����͵�Set��ѯ����������
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
	 * ����֤�����͵�Get��ѯ����������
	 */
	public String getCerttypeOper() {
		return certtypeOper;
	}

	/**
	 * ����֤���ŵ�Get����
	 */
	public String getCertno() {
		return certno;
	}

	/**
	 * ����֤���ŵ�Set����
	 * @param Certno
	 */
	public void setCertno(String certno) {
		this.certno = certno;
	}

	/**
	 * ����֤���ŵ�Set��ѯ����������
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
	 * ����֤���ŵ�Get��ѯ����������
	 */
	public String getCertnoOper() {
		return certnoOper;
	}

	/**
	 * ������ݴ����Get����
	 */
	public String getPatientclasscode() {
		return patientclasscode;
	}

	/**
	 * ������ݴ����Set����
	 * @param Patientclasscode
	 */
	public void setPatientclasscode(String patientclasscode) {
		this.patientclasscode = patientclasscode;
	}

	/**
	 * ������ݴ����Set��ѯ����������
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
	 * ������ݴ����Get��ѯ����������
	 */
	public String getPatientclasscodeOper() {
		return patientclasscodeOper;
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
	 * ���˷������ʹ����Get����
	 */
	public String getFeetypecode() {
		return feetypecode;
	}

	/**
	 * ���˷������ʹ����Set����
	 * @param Feetypecode
	 */
	public void setFeetypecode(String feetypecode) {
		this.feetypecode = feetypecode;
	}

	/**
	 * ���˷������ʹ����Set��ѯ����������
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
	 * ���˷������ʹ����Get��ѯ����������
	 */
	public String getFeetypecodeOper() {
		return feetypecodeOper;
	}

	/**
	 * ���˷������͵�Get����
	 */
	public String getFeetype() {
		return feetype;
	}

	/**
	 * ���˷������͵�Set����
	 * @param Feetype
	 */
	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}

	/**
	 * ���˷������͵�Set��ѯ����������
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
	 * ���˷������͵�Get��ѯ����������
	 */
	public String getFeetypeOper() {
		return feetypeOper;
	}

	/**
	 * ���˹�����λ��Get����
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * ���˹�����λ��Set����
	 * @param Company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * ���˹�����λ��Set��ѯ����������
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
	 * ���˹�����λ��Get��ѯ����������
	 */
	public String getCompanyOper() {
		return companyOper;
	}

	/**
	 * ����ҽ��֤�ŵ�Get����
	 */
	public String getPublicexpenseno() {
		return publicexpenseno;
	}

	/**
	 * ����ҽ��֤�ŵ�Set����
	 * @param Publicexpenseno
	 */
	public void setPublicexpenseno(String publicexpenseno) {
		this.publicexpenseno = publicexpenseno;
	}

	/**
	 * ����ҽ��֤�ŵ�Set��ѯ����������
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
	 * ����ҽ��֤�ŵ�Get��ѯ����������
	 */
	public String getPublicexpensenoOper() {
		return publicexpensenoOper;
	}

	/**
	 * ��ͬ��λ�����Get����
	 */
	public String getContractunitcode() {
		return contractunitcode;
	}

	/**
	 * ��ͬ��λ�����Set����
	 * @param Contractunitcode
	 */
	public void setContractunitcode(String contractunitcode) {
		this.contractunitcode = contractunitcode;
	}

	/**
	 * ��ͬ��λ�����Set��ѯ����������
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
	 * ��ͬ��λ�����Get��ѯ����������
	 */
	public String getContractunitcodeOper() {
		return contractunitcodeOper;
	}

	/**
	 * ��ͬ��λ��Get����
	 */
	public String getContractunit() {
		return contractunit;
	}

	/**
	 * ��ͬ��λ��Set����
	 * @param Contractunit
	 */
	public void setContractunit(String contractunit) {
		this.contractunit = contractunit;
	}

	/**
	 * ��ͬ��λ��Set��ѯ����������
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
	 * ��ͬ��λ��Get��ѯ����������
	 */
	public String getContractunitOper() {
		return contractunitOper;
	}

	/**
	 * ���˹�����λ��ַ�����Get����
	 */
	public String getBusinessaddresscode() {
		return businessaddresscode;
	}

	/**
	 * ���˹�����λ��ַ�����Set����
	 * @param Businessaddresscode
	 */
	public void setBusinessaddresscode(String businessaddresscode) {
		this.businessaddresscode = businessaddresscode;
	}

	/**
	 * ���˹�����λ��ַ�����Set��ѯ����������
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
	 * ���˹�����λ��ַ�����Get��ѯ����������
	 */
	public String getBusinessaddresscodeOper() {
		return businessaddresscodeOper;
	}

	/**
	 * ���˹�����λ��ַ��Get����
	 */
	public String getBusinessaddress() {
		return businessaddress;
	}

	/**
	 * ���˹�����λ��ַ��Set����
	 * @param Businessaddress
	 */
	public void setBusinessaddress(String businessaddress) {
		this.businessaddress = businessaddress;
	}

	/**
	 * ���˹�����λ��ַ��Set��ѯ����������
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
	 * ���˹�����λ��ַ��Get��ѯ����������
	 */
	public String getBusinessaddressOper() {
		return businessaddressOper;
	}

	/**
	 * ���˹�����λ�ʱ��Get����
	 */
	public String getBusinesspostcode() {
		return businesspostcode;
	}

	/**
	 * ���˹�����λ�ʱ��Set����
	 * @param Businesspostcode
	 */
	public void setBusinesspostcode(String businesspostcode) {
		this.businesspostcode = businesspostcode;
	}

	/**
	 * ���˹�����λ�ʱ��Set��ѯ����������
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
	 * ���˹�����λ�ʱ��Get��ѯ����������
	 */
	public String getBusinesspostcodeOper() {
		return businesspostcodeOper;
	}

	/**
	 * ���˹�����λ�绰��Get����
	 */
	public String getBusinessphone() {
		return businessphone;
	}

	/**
	 * ���˹�����λ�绰��Set����
	 * @param Businessphone
	 */
	public void setBusinessphone(String businessphone) {
		this.businessphone = businessphone;
	}

	/**
	 * ���˹�����λ�绰��Set��ѯ����������
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
	 * ���˹�����λ�绰��Get��ѯ����������
	 */
	public String getBusinessphoneOper() {
		return businessphoneOper;
	}

	/**
	 * ���˼�ͥסַ�����Get����
	 */
	public String getHomeaddresscode() {
		return homeaddresscode;
	}

	/**
	 * ���˼�ͥסַ�����Set����
	 * @param Homeaddresscode
	 */
	public void setHomeaddresscode(String homeaddresscode) {
		this.homeaddresscode = homeaddresscode;
	}

	/**
	 * ���˼�ͥסַ�����Set��ѯ����������
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
	 * ���˼�ͥסַ�����Get��ѯ����������
	 */
	public String getHomeaddresscodeOper() {
		return homeaddresscodeOper;
	}

	/**
	 * ���˼�ͥסַ��Get����
	 */
	public String getHomeaddress() {
		return homeaddress;
	}

	/**
	 * ���˼�ͥסַ��Set����
	 * @param Homeaddress
	 */
	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	/**
	 * ���˼�ͥסַ��Set��ѯ����������
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
	 * ���˼�ͥסַ��Get��ѯ����������
	 */
	public String getHomeaddressOper() {
		return homeaddressOper;
	}

	/**
	 * ���˼�ͥ��ַ�ʱ��Get����
	 */
	public String getHomepostcode() {
		return homepostcode;
	}

	/**
	 * ���˼�ͥ��ַ�ʱ��Set����
	 * @param Homepostcode
	 */
	public void setHomepostcode(String homepostcode) {
		this.homepostcode = homepostcode;
	}

	/**
	 * ���˼�ͥ��ַ�ʱ��Set��ѯ����������
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
	 * ���˼�ͥ��ַ�ʱ��Get��ѯ����������
	 */
	public String getHomepostcodeOper() {
		return homepostcodeOper;
	}

	/**
	 * �����ֻ��ŵ�Get����
	 */
	public String getMobilephone() {
		return mobilephone;
	}

	/**
	 * �����ֻ��ŵ�Set����
	 * @param Mobilephone
	 */
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	/**
	 * �����ֻ��ŵ�Set��ѯ����������
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
	 * �����ֻ��ŵ�Get��ѯ����������
	 */
	public String getMobilephoneOper() {
		return mobilephoneOper;
	}

	/**
	 * ��ϵ�˵�Get����
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * ��ϵ�˵�Set����
	 * @param Contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * ��ϵ�˵�Set��ѯ����������
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
	 * ��ϵ�˵�Get��ѯ����������
	 */
	public String getContactOper() {
		return contactOper;
	}

	/**
	 * ��ϵ�˹�ϵ�����Get����
	 */
	public String getRelationcode() {
		return relationcode;
	}

	/**
	 * ��ϵ�˹�ϵ�����Set����
	 * @param Relationcode
	 */
	public void setRelationcode(String relationcode) {
		this.relationcode = relationcode;
	}

	/**
	 * ��ϵ�˹�ϵ�����Set��ѯ����������
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
	 * ��ϵ�˹�ϵ�����Get��ѯ����������
	 */
	public String getRelationcodeOper() {
		return relationcodeOper;
	}

	/**
	 * ��ϵ�˹�ϵ��Get����
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * ��ϵ�˹�ϵ��Set����
	 * @param Relation
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	/**
	 * ��ϵ�˹�ϵ��Set��ѯ����������
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
	 * ��ϵ�˹�ϵ��Get��ѯ����������
	 */
	public String getRelationOper() {
		return relationOper;
	}

	/**
	 * ��ϵ�����Get����
	 */
	public String getContactemail() {
		return contactemail;
	}

	/**
	 * ��ϵ�����Set����
	 * @param Contactemail
	 */
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	/**
	 * ��ϵ�����Set��ѯ����������
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
	 * ��ϵ�����Get��ѯ����������
	 */
	public String getContactemailOper() {
		return contactemailOper;
	}

	/**
	 * ��ϵ��ʽ��Get����
	 */
	public String getContactmethod() {
		return contactmethod;
	}

	/**
	 * ��ϵ��ʽ��Set����
	 * @param Contactmethod
	 */
	public void setContactmethod(String contactmethod) {
		this.contactmethod = contactmethod;
	}

	/**
	 * ��ϵ��ʽ��Set��ѯ����������
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
	 * ��ϵ��ʽ��Get��ѯ����������
	 */
	public String getContactmethodOper() {
		return contactmethodOper;
	}

	/**
	 * �ص㲡�����͵�Get����
	 */
	public String getViptype() {
		return viptype;
	}

	/**
	 * �ص㲡�����͵�Set����
	 * @param Viptype
	 */
	public void setViptype(String viptype) {
		this.viptype = viptype;
	}

	/**
	 * �ص㲡�����͵�Set��ѯ����������
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
	 * �ص㲡�����͵�Get��ѯ����������
	 */
	public String getViptypeOper() {
		return viptypeOper;
	}

	/**
	 * ������ID��Get����
	 */
	public String getOperatorid() {
		return operatorid;
	}

	/**
	 * ������ID��Set����
	 * @param Operatorid
	 */
	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}

	/**
	 * ������ID��Set��ѯ����������
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
	 * ������ID��Get��ѯ����������
	 */
	public String getOperatoridOper() {
		return operatoridOper;
	}

	/**
	 * �����˵�Get����
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * �����˵�Set����
	 * @param Operator
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * �����˵�Set��ѯ����������
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
	 * �����˵�Get��ѯ����������
	 */
	public String getOperatorOper() {
		return operatorOper;
	}

	/**
	 * ����ʱ�䣨��ʽ��yyyyMMddHHmmss����Get����
	 */
	public String getOperatortime() {
		return operatortime;
	}

	/**
	 * ����ʱ�䣨��ʽ��yyyyMMddHHmmss����Set����
	 * @param Operatortime
	 */
	public void setOperatortime(String operatortime) {
		this.operatortime = operatortime;
	}

	/**
	 * ����ʱ�䣨��ʽ��yyyyMMddHHmmss����Set��ѯ����������
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
	 * ����ʱ�䣨��ʽ��yyyyMMddHHmmss����Get��ѯ����������
	 */
	public String getOperatortimeOper() {
		return operatortimeOper;
	}

	/**
	 * ���ñ�־��Y-���� N-ͣ�ã���Get����
	 */
	public String getAvailable() {
		return available;
	}

	/**
	 * ���ñ�־��Y-���� N-ͣ�ã���Set����
	 * @param Available
	 */
	public void setAvailable(String available) {
		this.available = available;
	}

	/**
	 * ���ñ�־��Y-���� N-ͣ�ã���Set��ѯ����������
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
	 * ���ñ�־��Y-���� N-ͣ�ã���Get��ѯ����������
	 */
	public String getAvailableOper() {
		return availableOper;
	}

	/**
	 * �������ͣ�1-���� 2-�޸� 3-ɾ���� �����Get����
	 */
	public String getManagetype() {
		return managetype;
	}

	/**
	 * �������ͣ�1-���� 2-�޸� 3-ɾ���� �����Set����
	 * @param Managetype
	 */
	public void setManagetype(String managetype) {
		this.managetype = managetype;
	}

	/**
	 * �������ͣ�1-���� 2-�޸� 3-ɾ���� �����Set��ѯ����������
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
	 * �������ͣ�1-���� 2-�޸� 3-ɾ���� �����Get��ѯ����������
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
	 * ���ɼ�¼log���ַ���
	 * @return String
	 */
	public String toLogsStr() {
		String ret="";
		return ret;
	}

	/**
	 * ����Patientinfo�������־��¼
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
