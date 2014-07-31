package com.haitaiinc.interfaceserver;

import java.sql.*;

import com.haitaiinc.utils.StringUtil;

/**
 * @author haitaiinc
 * PatientInfo
 */
public class Patientinfo
		extends com.haitaiinc.struct.Patientinfo{

	public static final String INSERT =
		"insert into PatientInfo(RecordFlow,PID,InsuranceNo,PatientName,TmpFlag,LastName,FirstName,PY,WB,SexCode,Sex,DateOfBirth,TimeOfBirth,MarriageStatusCode,MarriageStatus,OccupationCode,Occupation,NationalityCode,Nationality,CountryCode,Country,FormalSchoolingCode,FormalSchooling,Religion,BirthPlaceCode,BirthPlace,NativePlaceCode,NativePlace,BloodType,CertTypeCode,CertType,CertNo,PatientClassCode,PatientClass,FeeTypeCode,FeeType,Company,PublicExpenseNo,ContractUnitCode,ContractUnit,BusinessAddressCode,BusinessAddress,BusinessPostCode,BusinessPhone,HomeAddressCode,HomeAddress,HomePostCode,MobilePhone,Contact,RelationCode,Relation,ContactEmail,ContactMethod,VIPType,OperatorID,Operator,OperatorTime,Available,ManageType,ImpFlag,ReturnDesc)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String UPDATE =
		"update PatientInfo set PID=?,InsuranceNo=?,PatientName=?,TmpFlag=?,LastName=?,FirstName=?,PY=?,WB=?,SexCode=?,Sex=?,DateOfBirth=?,TimeOfBirth=?,MarriageStatusCode=?,MarriageStatus=?,OccupationCode=?,Occupation=?,NationalityCode=?,Nationality=?,CountryCode=?,Country=?,FormalSchoolingCode=?,FormalSchooling=?,Religion=?,BirthPlaceCode=?,BirthPlace=?,NativePlaceCode=?,NativePlace=?,BloodType=?,CertTypeCode=?,CertType=?,CertNo=?,PatientClassCode=?,PatientClass=?,FeeTypeCode=?,FeeType=?,Company=?,PublicExpenseNo=?,ContractUnitCode=?,ContractUnit=?,BusinessAddressCode=?,BusinessAddress=?,BusinessPostCode=?,BusinessPhone=?,HomeAddressCode=?,HomeAddress=?,HomePostCode=?,MobilePhone=?,Contact=?,RelationCode=?,Relation=?,ContactEmail=?,ContactMethod=?,VIPType=?,OperatorID=?,Operator=?,OperatorTime=?,Available=?,ManageType=?,ImpFlag=?,ReturnDesc=? where RecordFlow=?";

	public static final String SELECT =
		"select RecordFlow,PID,InsuranceNo,PatientName,TmpFlag,LastName,FirstName,PY,WB,SexCode,Sex,DateOfBirth,TimeOfBirth,MarriageStatusCode,MarriageStatus,OccupationCode,Occupation,NationalityCode,Nationality,CountryCode,Country,FormalSchoolingCode,FormalSchooling,Religion,BirthPlaceCode,BirthPlace,NativePlaceCode,NativePlace,BloodType,CertTypeCode,CertType,CertNo,PatientClassCode,PatientClass,FeeTypeCode,FeeType,Company,PublicExpenseNo,ContractUnitCode,ContractUnit,BusinessAddressCode,BusinessAddress,BusinessPostCode,BusinessPhone,HomeAddressCode,HomeAddress,HomePostCode,MobilePhone,Contact,RelationCode,Relation,ContactEmail,ContactMethod,VIPType,OperatorID,Operator,OperatorTime,Available,ManageType,ImpFlag,ReturnDesc from PatientInfo ";

	/**
	 * Method makeInsSt.
	 * ���ɲ��������PreparedStatement
	 * @param pst ʹ��INSERTԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, recordflow); //��¼��ˮ��	key
		pst.setString(++index, pid); //����ID����
		pst.setString(++index, insuranceno); //����ҽ����
		pst.setString(++index, patientname); //��������
		pst.setString(++index, tmpflag); //��ʱ������־����ʽ����ʱ��
		pst.setString(++index, lastname); //��������
		pst.setString(++index, firstname); //������
		pst.setString(++index, py); //��������ƴ����
		pst.setString(++index, wb); //�������������
		pst.setString(++index, sexcode); //�����Ա����
		pst.setString(++index, sex); //�����Ա�
		pst.setString(++index, dateofbirth); //���˳������ڣ���ʽ��yyyyMMdd��
		pst.setString(++index, timeofbirth); //���˳���ʱ�䣨��ʽ��hhmmss��
		pst.setString(++index, marriagestatuscode); //���˻���״������
		pst.setString(++index, marriagestatus); //���˻���״��
		pst.setString(++index, occupationcode); //����ְҵ����
		pst.setString(++index, occupation); //����ְҵ
		pst.setString(++index, nationalitycode); //�����������
		pst.setString(++index, nationality); //��������
		pst.setString(++index, countrycode); //���˹�������
		pst.setString(++index, country); //���˹���
		pst.setString(++index, formalschoolingcode); //�����Ļ�ˮƽ����
		pst.setString(++index, formalschooling); //�����Ļ�ˮƽ
		pst.setString(++index, religion); //�����ڽ�����
		pst.setString(++index, birthplacecode); //���˳����ش���
		pst.setString(++index, birthplace); //���˳�����
		pst.setString(++index, nativeplacecode); //���˼������
		pst.setString(++index, nativeplace); //���˼���
		pst.setString(++index, bloodtype); //����Ѫ��
		pst.setString(++index, certtypecode); //����֤�����ʹ���
		pst.setString(++index, certtype); //����֤������
		pst.setString(++index, certno); //����֤����
		pst.setString(++index, patientclasscode); //������ݴ���
		pst.setString(++index, patientclass); //�������
		pst.setString(++index, feetypecode); //���˷������ʹ���
		pst.setString(++index, feetype); //���˷�������
		pst.setString(++index, company); //���˹�����λ
		pst.setString(++index, publicexpenseno); //����ҽ��֤��
		pst.setString(++index, contractunitcode); //��ͬ��λ����
		pst.setString(++index, contractunit); //��ͬ��λ
		pst.setString(++index, businessaddresscode); //���˹�����λ��ַ����
		pst.setString(++index, businessaddress); //���˹�����λ��ַ
		pst.setString(++index, businesspostcode); //���˹�����λ�ʱ�
		pst.setString(++index, businessphone); //���˹�����λ�绰
		pst.setString(++index, homeaddresscode); //���˼�ͥסַ����
		pst.setString(++index, homeaddress); //���˼�ͥסַ
		pst.setString(++index, homepostcode); //���˼�ͥ��ַ�ʱ�
		pst.setString(++index, mobilephone); //�����ֻ���
		pst.setString(++index, contact); //��ϵ��
		pst.setString(++index, relationcode); //��ϵ�˹�ϵ����
		pst.setString(++index, relation); //��ϵ�˹�ϵ
		pst.setString(++index, contactemail); //��ϵ����
		pst.setString(++index, contactmethod); //��ϵ��ʽ
		pst.setString(++index, viptype); //�ص㲡������
		pst.setString(++index, operatorid); //������ID
		pst.setString(++index, operator); //������
		pst.setString(++index, operatortime); //����ʱ�䣨��ʽ��yyyyMMddHHmmss��
		pst.setString(++index, available); //���ñ�־��Y-���� N-ͣ�ã�
		pst.setString(++index, managetype); //�������ͣ�1-���� 2-�޸� 3-ɾ���� ����
		pst.setString(++index, impflag); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		pst.setString(++index, returndesc); //����˵��
		return pst;
	}

	/**
	 * Method makeUpdSt.
	 * �����޸Ĳ�����PreparedStatement
	 * @param pst ʹ��UPDATEԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, pid); //����ID����
		pst.setString(++index, insuranceno); //����ҽ����
		pst.setString(++index, patientname); //��������
		pst.setString(++index, tmpflag); //��ʱ������־����ʽ����ʱ��
		pst.setString(++index, lastname); //��������
		pst.setString(++index, firstname); //������
		pst.setString(++index, py); //��������ƴ����
		pst.setString(++index, wb); //�������������
		pst.setString(++index, sexcode); //�����Ա����
		pst.setString(++index, sex); //�����Ա�
		pst.setString(++index, dateofbirth); //���˳������ڣ���ʽ��yyyyMMdd��
		pst.setString(++index, timeofbirth); //���˳���ʱ�䣨��ʽ��hhmmss��
		pst.setString(++index, marriagestatuscode); //���˻���״������
		pst.setString(++index, marriagestatus); //���˻���״��
		pst.setString(++index, occupationcode); //����ְҵ����
		pst.setString(++index, occupation); //����ְҵ
		pst.setString(++index, nationalitycode); //�����������
		pst.setString(++index, nationality); //��������
		pst.setString(++index, countrycode); //���˹�������
		pst.setString(++index, country); //���˹���
		pst.setString(++index, formalschoolingcode); //�����Ļ�ˮƽ����
		pst.setString(++index, formalschooling); //�����Ļ�ˮƽ
		pst.setString(++index, religion); //�����ڽ�����
		pst.setString(++index, birthplacecode); //���˳����ش���
		pst.setString(++index, birthplace); //���˳�����
		pst.setString(++index, nativeplacecode); //���˼������
		pst.setString(++index, nativeplace); //���˼���
		pst.setString(++index, bloodtype); //����Ѫ��
		pst.setString(++index, certtypecode); //����֤�����ʹ���
		pst.setString(++index, certtype); //����֤������
		pst.setString(++index, certno); //����֤����
		pst.setString(++index, patientclasscode); //������ݴ���
		pst.setString(++index, patientclass); //�������
		pst.setString(++index, feetypecode); //���˷������ʹ���
		pst.setString(++index, feetype); //���˷�������
		pst.setString(++index, company); //���˹�����λ
		pst.setString(++index, publicexpenseno); //����ҽ��֤��
		pst.setString(++index, contractunitcode); //��ͬ��λ����
		pst.setString(++index, contractunit); //��ͬ��λ
		pst.setString(++index, businessaddresscode); //���˹�����λ��ַ����
		pst.setString(++index, businessaddress); //���˹�����λ��ַ
		pst.setString(++index, businesspostcode); //���˹�����λ�ʱ�
		pst.setString(++index, businessphone); //���˹�����λ�绰
		pst.setString(++index, homeaddresscode); //���˼�ͥסַ����
		pst.setString(++index, homeaddress); //���˼�ͥסַ
		pst.setString(++index, homepostcode); //���˼�ͥ��ַ�ʱ�
		pst.setString(++index, mobilephone); //�����ֻ���
		pst.setString(++index, contact); //��ϵ��
		pst.setString(++index, relationcode); //��ϵ�˹�ϵ����
		pst.setString(++index, relation); //��ϵ�˹�ϵ
		pst.setString(++index, contactemail); //��ϵ����
		pst.setString(++index, contactmethod); //��ϵ��ʽ
		pst.setString(++index, viptype); //�ص㲡������
		pst.setString(++index, operatorid); //������ID
		pst.setString(++index, operator); //������
		pst.setString(++index, operatortime); //����ʱ�䣨��ʽ��yyyyMMddHHmmss��
		pst.setString(++index, available); //���ñ�־��Y-���� N-ͣ�ã�
		pst.setString(++index, managetype); //�������ͣ�1-���� 2-�޸� 3-ɾ���� ����
		pst.setString(++index, impflag); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		pst.setString(++index, returndesc); //����˵��
		pst.setString(++index, recordflow); //��¼��ˮ��	key
		return pst;
	}

	/**
	 * Method makeSearchSql.
	 * ���������ù�ֵ������Ϊ��ѯ������ɵ�sql���
	 * @return String
	 */
	public String makeSearchSql() {
		String sql=SELECT;
		String par = "";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PID" + pidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(pid, "'", "''"));
			par += temp;
		}
		if (!isnull(insuranceno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "InsuranceNo" + insurancenoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(insuranceno, "'", "''"));
			par += temp;
		}
		if (!isnull(patientname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientName" + patientnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientname, "'", "''"));
			par += temp;
		}
		if (!isnull(tmpflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "TmpFlag" + tmpflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(tmpflag, "'", "''"));
			par += temp;
		}
		if (!isnull(lastname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LastName" + lastnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(lastname, "'", "''"));
			par += temp;
		}
		if (!isnull(firstname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FirstName" + firstnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(firstname, "'", "''"));
			par += temp;
		}
		if (!isnull(py)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PY" + pyOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(py, "'", "''"));
			par += temp;
		}
		if (!isnull(wb)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WB" + wbOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wb, "'", "''"));
			par += temp;
		}
		if (!isnull(sexcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SexCode" + sexcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sexcode, "'", "''"));
			par += temp;
		}
		if (!isnull(sex)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Sex" + sexOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sex, "'", "''"));
			par += temp;
		}
		if (!isnull(dateofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DateOfBirth" + dateofbirthOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dateofbirth, "'", "''"));
			par += temp;
		}
		if (!isnull(timeofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "TimeOfBirth" + timeofbirthOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(timeofbirth, "'", "''"));
			par += temp;
		}
		if (!isnull(marriagestatuscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MarriageStatusCode" + marriagestatuscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(marriagestatuscode, "'", "''"));
			par += temp;
		}
		if (!isnull(marriagestatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MarriageStatus" + marriagestatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(marriagestatus, "'", "''"));
			par += temp;
		}
		if (!isnull(occupationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OccupationCode" + occupationcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(occupationcode, "'", "''"));
			par += temp;
		}
		if (!isnull(occupation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Occupation" + occupationOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(occupation, "'", "''"));
			par += temp;
		}
		if (!isnull(nationalitycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NationalityCode" + nationalitycodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nationalitycode, "'", "''"));
			par += temp;
		}
		if (!isnull(nationality)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Nationality" + nationalityOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nationality, "'", "''"));
			par += temp;
		}
		if (!isnull(countrycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CountryCode" + countrycodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(countrycode, "'", "''"));
			par += temp;
		}
		if (!isnull(country)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Country" + countryOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(country, "'", "''"));
			par += temp;
		}
		if (!isnull(formalschoolingcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FormalSchoolingCode" + formalschoolingcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(formalschoolingcode, "'", "''"));
			par += temp;
		}
		if (!isnull(formalschooling)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FormalSchooling" + formalschoolingOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(formalschooling, "'", "''"));
			par += temp;
		}
		if (!isnull(religion)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Religion" + religionOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(religion, "'", "''"));
			par += temp;
		}
		if (!isnull(birthplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BirthPlaceCode" + birthplacecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(birthplacecode, "'", "''"));
			par += temp;
		}
		if (!isnull(birthplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BirthPlace" + birthplaceOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(birthplace, "'", "''"));
			par += temp;
		}
		if (!isnull(nativeplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NativePlaceCode" + nativeplacecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nativeplacecode, "'", "''"));
			par += temp;
		}
		if (!isnull(nativeplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NativePlace" + nativeplaceOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nativeplace, "'", "''"));
			par += temp;
		}
		if (!isnull(bloodtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BloodType" + bloodtypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bloodtype, "'", "''"));
			par += temp;
		}
		if (!isnull(certtypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertTypeCode" + certtypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certtypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(certtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertType" + certtypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certtype, "'", "''"));
			par += temp;
		}
		if (!isnull(certno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertNo" + certnoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certno, "'", "''"));
			par += temp;
		}
		if (!isnull(patientclasscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientClassCode" + patientclasscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientclasscode, "'", "''"));
			par += temp;
		}
		if (!isnull(patientclass)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientClass" + patientclassOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientclass, "'", "''"));
			par += temp;
		}
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(feetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeType" + feetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetype, "'", "''"));
			par += temp;
		}
		if (!isnull(company)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Company" + companyOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(company, "'", "''"));
			par += temp;
		}
		if (!isnull(publicexpenseno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PublicExpenseNo" + publicexpensenoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(publicexpenseno, "'", "''"));
			par += temp;
		}
		if (!isnull(contractunitcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContractUnitCode" + contractunitcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contractunitcode, "'", "''"));
			par += temp;
		}
		if (!isnull(contractunit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContractUnit" + contractunitOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contractunit, "'", "''"));
			par += temp;
		}
		if (!isnull(businessaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessAddressCode" + businessaddresscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessaddresscode, "'", "''"));
			par += temp;
		}
		if (!isnull(businessaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessAddress" + businessaddressOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessaddress, "'", "''"));
			par += temp;
		}
		if (!isnull(businesspostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessPostCode" + businesspostcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businesspostcode, "'", "''"));
			par += temp;
		}
		if (!isnull(businessphone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessPhone" + businessphoneOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessphone, "'", "''"));
			par += temp;
		}
		if (!isnull(homeaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomeAddressCode" + homeaddresscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homeaddresscode, "'", "''"));
			par += temp;
		}
		if (!isnull(homeaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomeAddress" + homeaddressOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homeaddress, "'", "''"));
			par += temp;
		}
		if (!isnull(homepostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomePostCode" + homepostcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homepostcode, "'", "''"));
			par += temp;
		}
		if (!isnull(mobilephone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MobilePhone" + mobilephoneOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(mobilephone, "'", "''"));
			par += temp;
		}
		if (!isnull(contact)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Contact" + contactOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contact, "'", "''"));
			par += temp;
		}
		if (!isnull(relationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RelationCode" + relationcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(relationcode, "'", "''"));
			par += temp;
		}
		if (!isnull(relation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Relation" + relationOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(relation, "'", "''"));
			par += temp;
		}
		if (!isnull(contactemail)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContactEmail" + contactemailOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contactemail, "'", "''"));
			par += temp;
		}
		if (!isnull(contactmethod)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContactMethod" + contactmethodOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contactmethod, "'", "''"));
			par += temp;
		}
		if (!isnull(viptype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "VIPType" + viptypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(viptype, "'", "''"));
			par += temp;
		}
		if (!isnull(operatorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OperatorID" + operatoridOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operatorid, "'", "''"));
			par += temp;
		}
		if (!isnull(operator)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Operator" + operatorOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operator, "'", "''"));
			par += temp;
		}
		if (!isnull(operatortime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OperatorTime" + operatortimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operatortime, "'", "''"));
			par += temp;
		}
		if (!isnull(available)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Available" + availableOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(available, "'", "''"));
			par += temp;
		}
		if (!isnull(managetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ManageType" + managetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(managetype, "'", "''"));
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(impflag, "'", "''"));
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(returndesc, "'", "''"));
			par += temp;
		}
		if (!isnull(par))
			sql += " WHERE " + par;
		if (!isnull(orderByStr))
			sql += " order by " + orderByStr;
		return sql;
	}

	/**
	 * Method makeSearchPst.
	 * ���������ù�ֵ������Ϊ��ѯ������ɵ�pst
	 * @param conn ���ݿ�����
	 * @return pst
	 */
	public PreparedStatement makeSearchPst(Connection conn) throws Exception {
		String sql=SELECT;
		String par = "";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PID" + pidOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(insuranceno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "InsuranceNo" + insurancenoOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(patientname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientName" + patientnameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(tmpflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "TmpFlag" + tmpflagOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(lastname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LastName" + lastnameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(firstname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FirstName" + firstnameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(py)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PY" + pyOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(wb)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WB" + wbOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sexcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SexCode" + sexcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(sex)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Sex" + sexOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(dateofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DateOfBirth" + dateofbirthOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(timeofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "TimeOfBirth" + timeofbirthOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(marriagestatuscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MarriageStatusCode" + marriagestatuscodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(marriagestatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MarriageStatus" + marriagestatusOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(occupationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OccupationCode" + occupationcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(occupation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Occupation" + occupationOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nationalitycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NationalityCode" + nationalitycodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nationality)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Nationality" + nationalityOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(countrycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CountryCode" + countrycodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(country)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Country" + countryOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(formalschoolingcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FormalSchoolingCode" + formalschoolingcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(formalschooling)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FormalSchooling" + formalschoolingOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(religion)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Religion" + religionOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(birthplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BirthPlaceCode" + birthplacecodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(birthplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BirthPlace" + birthplaceOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nativeplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NativePlaceCode" + nativeplacecodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nativeplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NativePlace" + nativeplaceOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(bloodtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BloodType" + bloodtypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(certtypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertTypeCode" + certtypecodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(certtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertType" + certtypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(certno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertNo" + certnoOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(patientclasscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientClassCode" + patientclasscodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(patientclass)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientClass" + patientclassOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(feetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeType" + feetypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(company)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Company" + companyOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(publicexpenseno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PublicExpenseNo" + publicexpensenoOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(contractunitcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContractUnitCode" + contractunitcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(contractunit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContractUnit" + contractunitOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(businessaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessAddressCode" + businessaddresscodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(businessaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessAddress" + businessaddressOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(businesspostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessPostCode" + businesspostcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(businessphone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessPhone" + businessphoneOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(homeaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomeAddressCode" + homeaddresscodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(homeaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomeAddress" + homeaddressOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(homepostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomePostCode" + homepostcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(mobilephone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MobilePhone" + mobilephoneOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(contact)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Contact" + contactOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(relationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RelationCode" + relationcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(relation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Relation" + relationOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(contactemail)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContactEmail" + contactemailOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(contactmethod)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContactMethod" + contactmethodOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(viptype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "VIPType" + viptypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(operatorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OperatorID" + operatoridOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(operator)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Operator" + operatorOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(operatortime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OperatorTime" + operatortimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(available)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Available" + availableOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(managetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ManageType" + managetypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(par))
			sql += " WHERE " + par;
		if (!isnull(orderByStr))
			sql += " order by " + orderByStr;
		PreparedStatement pst = conn.prepareStatement(sql);
		int idx=0;
		if (!isnull(recordflow)) {
			if(!(recordflowOper.equals(ISNULL) ||recordflowOper.equals(NOTISNULL))){
				pst.setString(++idx, recordflow);
			}
		}
		if (!isnull(pid)) {
			if(!(pidOper.equals(ISNULL) ||pidOper.equals(NOTISNULL))){
				pst.setString(++idx, pid);
			}
		}
		if (!isnull(insuranceno)) {
			if(!(insurancenoOper.equals(ISNULL) ||insurancenoOper.equals(NOTISNULL))){
				pst.setString(++idx, insuranceno);
			}
		}
		if (!isnull(patientname)) {
			if(!(patientnameOper.equals(ISNULL) ||patientnameOper.equals(NOTISNULL))){
				pst.setString(++idx, patientname);
			}
		}
		if (!isnull(tmpflag)) {
			if(!(tmpflagOper.equals(ISNULL) ||tmpflagOper.equals(NOTISNULL))){
				pst.setString(++idx, tmpflag);
			}
		}
		if (!isnull(lastname)) {
			if(!(lastnameOper.equals(ISNULL) ||lastnameOper.equals(NOTISNULL))){
				pst.setString(++idx, lastname);
			}
		}
		if (!isnull(firstname)) {
			if(!(firstnameOper.equals(ISNULL) ||firstnameOper.equals(NOTISNULL))){
				pst.setString(++idx, firstname);
			}
		}
		if (!isnull(py)) {
			if(!(pyOper.equals(ISNULL) ||pyOper.equals(NOTISNULL))){
				pst.setString(++idx, py);
			}
		}
		if (!isnull(wb)) {
			if(!(wbOper.equals(ISNULL) ||wbOper.equals(NOTISNULL))){
				pst.setString(++idx, wb);
			}
		}
		if (!isnull(sexcode)) {
			if(!(sexcodeOper.equals(ISNULL) ||sexcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, sexcode);
			}
		}
		if (!isnull(sex)) {
			if(!(sexOper.equals(ISNULL) ||sexOper.equals(NOTISNULL))){
				pst.setString(++idx, sex);
			}
		}
		if (!isnull(dateofbirth)) {
			if(!(dateofbirthOper.equals(ISNULL) ||dateofbirthOper.equals(NOTISNULL))){
				pst.setString(++idx, dateofbirth);
			}
		}
		if (!isnull(timeofbirth)) {
			if(!(timeofbirthOper.equals(ISNULL) ||timeofbirthOper.equals(NOTISNULL))){
				pst.setString(++idx, timeofbirth);
			}
		}
		if (!isnull(marriagestatuscode)) {
			if(!(marriagestatuscodeOper.equals(ISNULL) ||marriagestatuscodeOper.equals(NOTISNULL))){
				pst.setString(++idx, marriagestatuscode);
			}
		}
		if (!isnull(marriagestatus)) {
			if(!(marriagestatusOper.equals(ISNULL) ||marriagestatusOper.equals(NOTISNULL))){
				pst.setString(++idx, marriagestatus);
			}
		}
		if (!isnull(occupationcode)) {
			if(!(occupationcodeOper.equals(ISNULL) ||occupationcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, occupationcode);
			}
		}
		if (!isnull(occupation)) {
			if(!(occupationOper.equals(ISNULL) ||occupationOper.equals(NOTISNULL))){
				pst.setString(++idx, occupation);
			}
		}
		if (!isnull(nationalitycode)) {
			if(!(nationalitycodeOper.equals(ISNULL) ||nationalitycodeOper.equals(NOTISNULL))){
				pst.setString(++idx, nationalitycode);
			}
		}
		if (!isnull(nationality)) {
			if(!(nationalityOper.equals(ISNULL) ||nationalityOper.equals(NOTISNULL))){
				pst.setString(++idx, nationality);
			}
		}
		if (!isnull(countrycode)) {
			if(!(countrycodeOper.equals(ISNULL) ||countrycodeOper.equals(NOTISNULL))){
				pst.setString(++idx, countrycode);
			}
		}
		if (!isnull(country)) {
			if(!(countryOper.equals(ISNULL) ||countryOper.equals(NOTISNULL))){
				pst.setString(++idx, country);
			}
		}
		if (!isnull(formalschoolingcode)) {
			if(!(formalschoolingcodeOper.equals(ISNULL) ||formalschoolingcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, formalschoolingcode);
			}
		}
		if (!isnull(formalschooling)) {
			if(!(formalschoolingOper.equals(ISNULL) ||formalschoolingOper.equals(NOTISNULL))){
				pst.setString(++idx, formalschooling);
			}
		}
		if (!isnull(religion)) {
			if(!(religionOper.equals(ISNULL) ||religionOper.equals(NOTISNULL))){
				pst.setString(++idx, religion);
			}
		}
		if (!isnull(birthplacecode)) {
			if(!(birthplacecodeOper.equals(ISNULL) ||birthplacecodeOper.equals(NOTISNULL))){
				pst.setString(++idx, birthplacecode);
			}
		}
		if (!isnull(birthplace)) {
			if(!(birthplaceOper.equals(ISNULL) ||birthplaceOper.equals(NOTISNULL))){
				pst.setString(++idx, birthplace);
			}
		}
		if (!isnull(nativeplacecode)) {
			if(!(nativeplacecodeOper.equals(ISNULL) ||nativeplacecodeOper.equals(NOTISNULL))){
				pst.setString(++idx, nativeplacecode);
			}
		}
		if (!isnull(nativeplace)) {
			if(!(nativeplaceOper.equals(ISNULL) ||nativeplaceOper.equals(NOTISNULL))){
				pst.setString(++idx, nativeplace);
			}
		}
		if (!isnull(bloodtype)) {
			if(!(bloodtypeOper.equals(ISNULL) ||bloodtypeOper.equals(NOTISNULL))){
				pst.setString(++idx, bloodtype);
			}
		}
		if (!isnull(certtypecode)) {
			if(!(certtypecodeOper.equals(ISNULL) ||certtypecodeOper.equals(NOTISNULL))){
				pst.setString(++idx, certtypecode);
			}
		}
		if (!isnull(certtype)) {
			if(!(certtypeOper.equals(ISNULL) ||certtypeOper.equals(NOTISNULL))){
				pst.setString(++idx, certtype);
			}
		}
		if (!isnull(certno)) {
			if(!(certnoOper.equals(ISNULL) ||certnoOper.equals(NOTISNULL))){
				pst.setString(++idx, certno);
			}
		}
		if (!isnull(patientclasscode)) {
			if(!(patientclasscodeOper.equals(ISNULL) ||patientclasscodeOper.equals(NOTISNULL))){
				pst.setString(++idx, patientclasscode);
			}
		}
		if (!isnull(patientclass)) {
			if(!(patientclassOper.equals(ISNULL) ||patientclassOper.equals(NOTISNULL))){
				pst.setString(++idx, patientclass);
			}
		}
		if (!isnull(feetypecode)) {
			if(!(feetypecodeOper.equals(ISNULL) ||feetypecodeOper.equals(NOTISNULL))){
				pst.setString(++idx, feetypecode);
			}
		}
		if (!isnull(feetype)) {
			if(!(feetypeOper.equals(ISNULL) ||feetypeOper.equals(NOTISNULL))){
				pst.setString(++idx, feetype);
			}
		}
		if (!isnull(company)) {
			if(!(companyOper.equals(ISNULL) ||companyOper.equals(NOTISNULL))){
				pst.setString(++idx, company);
			}
		}
		if (!isnull(publicexpenseno)) {
			if(!(publicexpensenoOper.equals(ISNULL) ||publicexpensenoOper.equals(NOTISNULL))){
				pst.setString(++idx, publicexpenseno);
			}
		}
		if (!isnull(contractunitcode)) {
			if(!(contractunitcodeOper.equals(ISNULL) ||contractunitcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, contractunitcode);
			}
		}
		if (!isnull(contractunit)) {
			if(!(contractunitOper.equals(ISNULL) ||contractunitOper.equals(NOTISNULL))){
				pst.setString(++idx, contractunit);
			}
		}
		if (!isnull(businessaddresscode)) {
			if(!(businessaddresscodeOper.equals(ISNULL) ||businessaddresscodeOper.equals(NOTISNULL))){
				pst.setString(++idx, businessaddresscode);
			}
		}
		if (!isnull(businessaddress)) {
			if(!(businessaddressOper.equals(ISNULL) ||businessaddressOper.equals(NOTISNULL))){
				pst.setString(++idx, businessaddress);
			}
		}
		if (!isnull(businesspostcode)) {
			if(!(businesspostcodeOper.equals(ISNULL) ||businesspostcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, businesspostcode);
			}
		}
		if (!isnull(businessphone)) {
			if(!(businessphoneOper.equals(ISNULL) ||businessphoneOper.equals(NOTISNULL))){
				pst.setString(++idx, businessphone);
			}
		}
		if (!isnull(homeaddresscode)) {
			if(!(homeaddresscodeOper.equals(ISNULL) ||homeaddresscodeOper.equals(NOTISNULL))){
				pst.setString(++idx, homeaddresscode);
			}
		}
		if (!isnull(homeaddress)) {
			if(!(homeaddressOper.equals(ISNULL) ||homeaddressOper.equals(NOTISNULL))){
				pst.setString(++idx, homeaddress);
			}
		}
		if (!isnull(homepostcode)) {
			if(!(homepostcodeOper.equals(ISNULL) ||homepostcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, homepostcode);
			}
		}
		if (!isnull(mobilephone)) {
			if(!(mobilephoneOper.equals(ISNULL) ||mobilephoneOper.equals(NOTISNULL))){
				pst.setString(++idx, mobilephone);
			}
		}
		if (!isnull(contact)) {
			if(!(contactOper.equals(ISNULL) ||contactOper.equals(NOTISNULL))){
				pst.setString(++idx, contact);
			}
		}
		if (!isnull(relationcode)) {
			if(!(relationcodeOper.equals(ISNULL) ||relationcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, relationcode);
			}
		}
		if (!isnull(relation)) {
			if(!(relationOper.equals(ISNULL) ||relationOper.equals(NOTISNULL))){
				pst.setString(++idx, relation);
			}
		}
		if (!isnull(contactemail)) {
			if(!(contactemailOper.equals(ISNULL) ||contactemailOper.equals(NOTISNULL))){
				pst.setString(++idx, contactemail);
			}
		}
		if (!isnull(contactmethod)) {
			if(!(contactmethodOper.equals(ISNULL) ||contactmethodOper.equals(NOTISNULL))){
				pst.setString(++idx, contactmethod);
			}
		}
		if (!isnull(viptype)) {
			if(!(viptypeOper.equals(ISNULL) ||viptypeOper.equals(NOTISNULL))){
				pst.setString(++idx, viptype);
			}
		}
		if (!isnull(operatorid)) {
			if(!(operatoridOper.equals(ISNULL) ||operatoridOper.equals(NOTISNULL))){
				pst.setString(++idx, operatorid);
			}
		}
		if (!isnull(operator)) {
			if(!(operatorOper.equals(ISNULL) ||operatorOper.equals(NOTISNULL))){
				pst.setString(++idx, operator);
			}
		}
		if (!isnull(operatortime)) {
			if(!(operatortimeOper.equals(ISNULL) ||operatortimeOper.equals(NOTISNULL))){
				pst.setString(++idx, operatortime);
			}
		}
		if (!isnull(available)) {
			if(!(availableOper.equals(ISNULL) ||availableOper.equals(NOTISNULL))){
				pst.setString(++idx, available);
			}
		}
		if (!isnull(managetype)) {
			if(!(managetypeOper.equals(ISNULL) ||managetypeOper.equals(NOTISNULL))){
				pst.setString(++idx, managetype);
			}
		}
		if (!isnull(impflag)) {
			if(!(impflagOper.equals(ISNULL) ||impflagOper.equals(NOTISNULL))){
				pst.setString(++idx, impflag);
			}
		}
		if (!isnull(returndesc)) {
			if(!(returndescOper.equals(ISNULL) ||returndescOper.equals(NOTISNULL))){
				pst.setString(++idx, returndesc);
			}
		}
		return pst;
	}

	/**
	 * Method fetchCommonCode.
	 * ��ʹ��SELECT�õ��Ľ�������ֵ������ǰ����Ķ�Ӧ������
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchPatientinfo(ResultSet rs) throws SQLException {
		recordflow = rs.getString("RecordFlow"); //��¼��ˮ��	key
		pid = rs.getString("PID"); //����ID����
		insuranceno = rs.getString("InsuranceNo"); //����ҽ����
		patientname = rs.getString("PatientName"); //��������
		tmpflag = rs.getString("TmpFlag"); //��ʱ������־����ʽ����ʱ��
		lastname = rs.getString("LastName"); //��������
		firstname = rs.getString("FirstName"); //������
		py = rs.getString("PY"); //��������ƴ����
		wb = rs.getString("WB"); //�������������
		sexcode = rs.getString("SexCode"); //�����Ա����
		sex = rs.getString("Sex"); //�����Ա�
		dateofbirth = rs.getString("DateOfBirth"); //���˳������ڣ���ʽ��yyyyMMdd��
		timeofbirth = rs.getString("TimeOfBirth"); //���˳���ʱ�䣨��ʽ��hhmmss��
		marriagestatuscode = rs.getString("MarriageStatusCode"); //���˻���״������
		marriagestatus = rs.getString("MarriageStatus"); //���˻���״��
		occupationcode = rs.getString("OccupationCode"); //����ְҵ����
		occupation = rs.getString("Occupation"); //����ְҵ
		nationalitycode = rs.getString("NationalityCode"); //�����������
		nationality = rs.getString("Nationality"); //��������
		countrycode = rs.getString("CountryCode"); //���˹�������
		country = rs.getString("Country"); //���˹���
		formalschoolingcode = rs.getString("FormalSchoolingCode"); //�����Ļ�ˮƽ����
		formalschooling = rs.getString("FormalSchooling"); //�����Ļ�ˮƽ
		religion = rs.getString("Religion"); //�����ڽ�����
		birthplacecode = rs.getString("BirthPlaceCode"); //���˳����ش���
		birthplace = rs.getString("BirthPlace"); //���˳�����
		nativeplacecode = rs.getString("NativePlaceCode"); //���˼������
		nativeplace = rs.getString("NativePlace"); //���˼���
		bloodtype = rs.getString("BloodType"); //����Ѫ��
		certtypecode = rs.getString("CertTypeCode"); //����֤�����ʹ���
		certtype = rs.getString("CertType"); //����֤������
		certno = rs.getString("CertNo"); //����֤����
		patientclasscode = rs.getString("PatientClassCode"); //������ݴ���
		patientclass = rs.getString("PatientClass"); //�������
		feetypecode = rs.getString("FeeTypeCode"); //���˷������ʹ���
		feetype = rs.getString("FeeType"); //���˷�������
		company = rs.getString("Company"); //���˹�����λ
		publicexpenseno = rs.getString("PublicExpenseNo"); //����ҽ��֤��
		contractunitcode = rs.getString("ContractUnitCode"); //��ͬ��λ����
		contractunit = rs.getString("ContractUnit"); //��ͬ��λ
		businessaddresscode = rs.getString("BusinessAddressCode"); //���˹�����λ��ַ����
		businessaddress = rs.getString("BusinessAddress"); //���˹�����λ��ַ
		businesspostcode = rs.getString("BusinessPostCode"); //���˹�����λ�ʱ�
		businessphone = rs.getString("BusinessPhone"); //���˹�����λ�绰
		homeaddresscode = rs.getString("HomeAddressCode"); //���˼�ͥסַ����
		homeaddress = rs.getString("HomeAddress"); //���˼�ͥסַ
		homepostcode = rs.getString("HomePostCode"); //���˼�ͥ��ַ�ʱ�
		mobilephone = rs.getString("MobilePhone"); //�����ֻ���
		contact = rs.getString("Contact"); //��ϵ��
		relationcode = rs.getString("RelationCode"); //��ϵ�˹�ϵ����
		relation = rs.getString("Relation"); //��ϵ�˹�ϵ
		contactemail = rs.getString("ContactEmail"); //��ϵ����
		contactmethod = rs.getString("ContactMethod"); //��ϵ��ʽ
		viptype = rs.getString("VIPType"); //�ص㲡������
		operatorid = rs.getString("OperatorID"); //������ID
		operator = rs.getString("Operator"); //������
		operatortime = rs.getString("OperatorTime"); //����ʱ�䣨��ʽ��yyyyMMddHHmmss��
		available = rs.getString("Available"); //���ñ�־��Y-���� N-ͣ�ã�
		managetype = rs.getString("ManageType"); //�������ͣ�1-���� 2-�޸� 3-ɾ���� ����
		impflag = rs.getString("ImpFlag"); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		returndesc = rs.getString("ReturnDesc"); //����˵��
	}

	/**
	 * Method makeCountItemSql.
	 * ���������ù�ֵ������Ϊ��ѯ������������������sql���
	 * @return String
	 */
	public String makeCountItemSql() {
		String sql = "select count(*) from PatientInfo";
		String par = "";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PID" + pidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(pid, "'", "''"));
			par += temp;
		}
		if (!isnull(insuranceno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "InsuranceNo" + insurancenoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(insuranceno, "'", "''"));
			par += temp;
		}
		if (!isnull(patientname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientName" + patientnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientname, "'", "''"));
			par += temp;
		}
		if (!isnull(tmpflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "TmpFlag" + tmpflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(tmpflag, "'", "''"));
			par += temp;
		}
		if (!isnull(lastname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "LastName" + lastnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(lastname, "'", "''"));
			par += temp;
		}
		if (!isnull(firstname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FirstName" + firstnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(firstname, "'", "''"));
			par += temp;
		}
		if (!isnull(py)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PY" + pyOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(py, "'", "''"));
			par += temp;
		}
		if (!isnull(wb)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WB" + wbOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wb, "'", "''"));
			par += temp;
		}
		if (!isnull(sexcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "SexCode" + sexcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sexcode, "'", "''"));
			par += temp;
		}
		if (!isnull(sex)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Sex" + sexOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sex, "'", "''"));
			par += temp;
		}
		if (!isnull(dateofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DateOfBirth" + dateofbirthOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dateofbirth, "'", "''"));
			par += temp;
		}
		if (!isnull(timeofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "TimeOfBirth" + timeofbirthOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(timeofbirth, "'", "''"));
			par += temp;
		}
		if (!isnull(marriagestatuscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MarriageStatusCode" + marriagestatuscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(marriagestatuscode, "'", "''"));
			par += temp;
		}
		if (!isnull(marriagestatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MarriageStatus" + marriagestatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(marriagestatus, "'", "''"));
			par += temp;
		}
		if (!isnull(occupationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OccupationCode" + occupationcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(occupationcode, "'", "''"));
			par += temp;
		}
		if (!isnull(occupation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Occupation" + occupationOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(occupation, "'", "''"));
			par += temp;
		}
		if (!isnull(nationalitycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NationalityCode" + nationalitycodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nationalitycode, "'", "''"));
			par += temp;
		}
		if (!isnull(nationality)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Nationality" + nationalityOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nationality, "'", "''"));
			par += temp;
		}
		if (!isnull(countrycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CountryCode" + countrycodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(countrycode, "'", "''"));
			par += temp;
		}
		if (!isnull(country)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Country" + countryOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(country, "'", "''"));
			par += temp;
		}
		if (!isnull(formalschoolingcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FormalSchoolingCode" + formalschoolingcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(formalschoolingcode, "'", "''"));
			par += temp;
		}
		if (!isnull(formalschooling)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FormalSchooling" + formalschoolingOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(formalschooling, "'", "''"));
			par += temp;
		}
		if (!isnull(religion)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Religion" + religionOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(religion, "'", "''"));
			par += temp;
		}
		if (!isnull(birthplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BirthPlaceCode" + birthplacecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(birthplacecode, "'", "''"));
			par += temp;
		}
		if (!isnull(birthplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BirthPlace" + birthplaceOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(birthplace, "'", "''"));
			par += temp;
		}
		if (!isnull(nativeplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NativePlaceCode" + nativeplacecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nativeplacecode, "'", "''"));
			par += temp;
		}
		if (!isnull(nativeplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NativePlace" + nativeplaceOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nativeplace, "'", "''"));
			par += temp;
		}
		if (!isnull(bloodtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BloodType" + bloodtypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bloodtype, "'", "''"));
			par += temp;
		}
		if (!isnull(certtypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertTypeCode" + certtypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certtypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(certtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertType" + certtypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certtype, "'", "''"));
			par += temp;
		}
		if (!isnull(certno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "CertNo" + certnoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certno, "'", "''"));
			par += temp;
		}
		if (!isnull(patientclasscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientClassCode" + patientclasscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientclasscode, "'", "''"));
			par += temp;
		}
		if (!isnull(patientclass)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PatientClass" + patientclassOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientclass, "'", "''"));
			par += temp;
		}
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(feetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeType" + feetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetype, "'", "''"));
			par += temp;
		}
		if (!isnull(company)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Company" + companyOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(company, "'", "''"));
			par += temp;
		}
		if (!isnull(publicexpenseno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "PublicExpenseNo" + publicexpensenoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(publicexpenseno, "'", "''"));
			par += temp;
		}
		if (!isnull(contractunitcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContractUnitCode" + contractunitcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contractunitcode, "'", "''"));
			par += temp;
		}
		if (!isnull(contractunit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContractUnit" + contractunitOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contractunit, "'", "''"));
			par += temp;
		}
		if (!isnull(businessaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessAddressCode" + businessaddresscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessaddresscode, "'", "''"));
			par += temp;
		}
		if (!isnull(businessaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessAddress" + businessaddressOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessaddress, "'", "''"));
			par += temp;
		}
		if (!isnull(businesspostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessPostCode" + businesspostcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businesspostcode, "'", "''"));
			par += temp;
		}
		if (!isnull(businessphone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BusinessPhone" + businessphoneOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessphone, "'", "''"));
			par += temp;
		}
		if (!isnull(homeaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomeAddressCode" + homeaddresscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homeaddresscode, "'", "''"));
			par += temp;
		}
		if (!isnull(homeaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomeAddress" + homeaddressOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homeaddress, "'", "''"));
			par += temp;
		}
		if (!isnull(homepostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "HomePostCode" + homepostcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homepostcode, "'", "''"));
			par += temp;
		}
		if (!isnull(mobilephone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MobilePhone" + mobilephoneOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(mobilephone, "'", "''"));
			par += temp;
		}
		if (!isnull(contact)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Contact" + contactOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contact, "'", "''"));
			par += temp;
		}
		if (!isnull(relationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "RelationCode" + relationcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(relationcode, "'", "''"));
			par += temp;
		}
		if (!isnull(relation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Relation" + relationOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(relation, "'", "''"));
			par += temp;
		}
		if (!isnull(contactemail)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContactEmail" + contactemailOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contactemail, "'", "''"));
			par += temp;
		}
		if (!isnull(contactmethod)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ContactMethod" + contactmethodOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contactmethod, "'", "''"));
			par += temp;
		}
		if (!isnull(viptype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "VIPType" + viptypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(viptype, "'", "''"));
			par += temp;
		}
		if (!isnull(operatorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OperatorID" + operatoridOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operatorid, "'", "''"));
			par += temp;
		}
		if (!isnull(operator)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Operator" + operatorOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operator, "'", "''"));
			par += temp;
		}
		if (!isnull(operatortime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "OperatorTime" + operatortimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operatortime, "'", "''"));
			par += temp;
		}
		if (!isnull(available)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Available" + availableOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(available, "'", "''"));
			par += temp;
		}
		if (!isnull(managetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ManageType" + managetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(managetype, "'", "''"));
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(impflag, "'", "''"));
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(returndesc, "'", "''"));
			par += temp;
		}
		if (par.length() > 0)
			sql += " WHERE " + par;
		return sql;
	}

	/**
	 * Method makeWhereSql.
	 * ���������ù�ֵ������Ϊ��ѯ������sql��䣬ֻ��WHERE���棬������SELECT
	 * @return String
	 */
	public String makeWhereSql(String tablerealias) {
		if(tablerealias == null || tablerealias.trim().length() == 0) {
			tablerealias = "PatientInfo";
		}
		String par = "";
		String temp = null;
		if (!isnull(recordflow)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RecordFlow" + recordflowOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(recordflow, "'", "''"));
			par += temp;
		}
		if (!isnull(pid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PID" + pidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(pid, "'", "''"));
			par += temp;
		}
		if (!isnull(insuranceno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".InsuranceNo" + insurancenoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(insuranceno, "'", "''"));
			par += temp;
		}
		if (!isnull(patientname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PatientName" + patientnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientname, "'", "''"));
			par += temp;
		}
		if (!isnull(tmpflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".TmpFlag" + tmpflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(tmpflag, "'", "''"));
			par += temp;
		}
		if (!isnull(lastname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".LastName" + lastnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(lastname, "'", "''"));
			par += temp;
		}
		if (!isnull(firstname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FirstName" + firstnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(firstname, "'", "''"));
			par += temp;
		}
		if (!isnull(py)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PY" + pyOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(py, "'", "''"));
			par += temp;
		}
		if (!isnull(wb)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".WB" + wbOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wb, "'", "''"));
			par += temp;
		}
		if (!isnull(sexcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".SexCode" + sexcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sexcode, "'", "''"));
			par += temp;
		}
		if (!isnull(sex)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Sex" + sexOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(sex, "'", "''"));
			par += temp;
		}
		if (!isnull(dateofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DateOfBirth" + dateofbirthOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dateofbirth, "'", "''"));
			par += temp;
		}
		if (!isnull(timeofbirth)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".TimeOfBirth" + timeofbirthOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(timeofbirth, "'", "''"));
			par += temp;
		}
		if (!isnull(marriagestatuscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".MarriageStatusCode" + marriagestatuscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(marriagestatuscode, "'", "''"));
			par += temp;
		}
		if (!isnull(marriagestatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".MarriageStatus" + marriagestatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(marriagestatus, "'", "''"));
			par += temp;
		}
		if (!isnull(occupationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".OccupationCode" + occupationcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(occupationcode, "'", "''"));
			par += temp;
		}
		if (!isnull(occupation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Occupation" + occupationOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(occupation, "'", "''"));
			par += temp;
		}
		if (!isnull(nationalitycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NationalityCode" + nationalitycodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nationalitycode, "'", "''"));
			par += temp;
		}
		if (!isnull(nationality)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Nationality" + nationalityOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nationality, "'", "''"));
			par += temp;
		}
		if (!isnull(countrycode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".CountryCode" + countrycodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(countrycode, "'", "''"));
			par += temp;
		}
		if (!isnull(country)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Country" + countryOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(country, "'", "''"));
			par += temp;
		}
		if (!isnull(formalschoolingcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FormalSchoolingCode" + formalschoolingcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(formalschoolingcode, "'", "''"));
			par += temp;
		}
		if (!isnull(formalschooling)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FormalSchooling" + formalschoolingOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(formalschooling, "'", "''"));
			par += temp;
		}
		if (!isnull(religion)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Religion" + religionOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(religion, "'", "''"));
			par += temp;
		}
		if (!isnull(birthplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BirthPlaceCode" + birthplacecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(birthplacecode, "'", "''"));
			par += temp;
		}
		if (!isnull(birthplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BirthPlace" + birthplaceOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(birthplace, "'", "''"));
			par += temp;
		}
		if (!isnull(nativeplacecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NativePlaceCode" + nativeplacecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nativeplacecode, "'", "''"));
			par += temp;
		}
		if (!isnull(nativeplace)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NativePlace" + nativeplaceOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nativeplace, "'", "''"));
			par += temp;
		}
		if (!isnull(bloodtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BloodType" + bloodtypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bloodtype, "'", "''"));
			par += temp;
		}
		if (!isnull(certtypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".CertTypeCode" + certtypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certtypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(certtype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".CertType" + certtypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certtype, "'", "''"));
			par += temp;
		}
		if (!isnull(certno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".CertNo" + certnoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(certno, "'", "''"));
			par += temp;
		}
		if (!isnull(patientclasscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PatientClassCode" + patientclasscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientclasscode, "'", "''"));
			par += temp;
		}
		if (!isnull(patientclass)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PatientClass" + patientclassOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(patientclass, "'", "''"));
			par += temp;
		}
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(feetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FeeType" + feetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetype, "'", "''"));
			par += temp;
		}
		if (!isnull(company)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Company" + companyOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(company, "'", "''"));
			par += temp;
		}
		if (!isnull(publicexpenseno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".PublicExpenseNo" + publicexpensenoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(publicexpenseno, "'", "''"));
			par += temp;
		}
		if (!isnull(contractunitcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ContractUnitCode" + contractunitcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contractunitcode, "'", "''"));
			par += temp;
		}
		if (!isnull(contractunit)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ContractUnit" + contractunitOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contractunit, "'", "''"));
			par += temp;
		}
		if (!isnull(businessaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BusinessAddressCode" + businessaddresscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessaddresscode, "'", "''"));
			par += temp;
		}
		if (!isnull(businessaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BusinessAddress" + businessaddressOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessaddress, "'", "''"));
			par += temp;
		}
		if (!isnull(businesspostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BusinessPostCode" + businesspostcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businesspostcode, "'", "''"));
			par += temp;
		}
		if (!isnull(businessphone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BusinessPhone" + businessphoneOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(businessphone, "'", "''"));
			par += temp;
		}
		if (!isnull(homeaddresscode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".HomeAddressCode" + homeaddresscodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homeaddresscode, "'", "''"));
			par += temp;
		}
		if (!isnull(homeaddress)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".HomeAddress" + homeaddressOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homeaddress, "'", "''"));
			par += temp;
		}
		if (!isnull(homepostcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".HomePostCode" + homepostcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(homepostcode, "'", "''"));
			par += temp;
		}
		if (!isnull(mobilephone)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".MobilePhone" + mobilephoneOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(mobilephone, "'", "''"));
			par += temp;
		}
		if (!isnull(contact)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Contact" + contactOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contact, "'", "''"));
			par += temp;
		}
		if (!isnull(relationcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".RelationCode" + relationcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(relationcode, "'", "''"));
			par += temp;
		}
		if (!isnull(relation)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Relation" + relationOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(relation, "'", "''"));
			par += temp;
		}
		if (!isnull(contactemail)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ContactEmail" + contactemailOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contactemail, "'", "''"));
			par += temp;
		}
		if (!isnull(contactmethod)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ContactMethod" + contactmethodOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(contactmethod, "'", "''"));
			par += temp;
		}
		if (!isnull(viptype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".VIPType" + viptypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(viptype, "'", "''"));
			par += temp;
		}
		if (!isnull(operatorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".OperatorID" + operatoridOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operatorid, "'", "''"));
			par += temp;
		}
		if (!isnull(operator)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Operator" + operatorOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operator, "'", "''"));
			par += temp;
		}
		if (!isnull(operatortime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".OperatorTime" + operatortimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(operatortime, "'", "''"));
			par += temp;
		}
		if (!isnull(available)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Available" + availableOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(available, "'", "''"));
			par += temp;
		}
		if (!isnull(managetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ManageType" + managetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(managetype, "'", "''"));
			par += temp;
		}
		if (!isnull(impflag)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ImpFlag" + impflagOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(impflag, "'", "''"));
			par += temp;
		}
		if (!isnull(returndesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".ReturnDesc" + returndescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(returndesc, "'", "''"));
			par += temp;
		}
		return par;
	}

	/**
	 * Method buildPatientinfo����̬����.
	 * ��struct�еĸ������ת�ɵ�ǰ�������
	 * @param patientinfo �������
	 * @return �������
	 */
	public static Patientinfo buildPatientinfo(com.haitaiinc.struct.Patientinfo patientinfo) {
		Patientinfo newPatientinfo = new Patientinfo();
		newPatientinfo.setRecordflow(patientinfo.getRecordflow());
		newPatientinfo.setRecordflowOper(patientinfo.getRecordflowOper());
		newPatientinfo.setPid(patientinfo.getPid());
		newPatientinfo.setPidOper(patientinfo.getPidOper());
		newPatientinfo.setInsuranceno(patientinfo.getInsuranceno());
		newPatientinfo.setInsurancenoOper(patientinfo.getInsurancenoOper());
		newPatientinfo.setPatientname(patientinfo.getPatientname());
		newPatientinfo.setPatientnameOper(patientinfo.getPatientnameOper());
		newPatientinfo.setTmpflag(patientinfo.getTmpflag());
		newPatientinfo.setTmpflagOper(patientinfo.getTmpflagOper());
		newPatientinfo.setLastname(patientinfo.getLastname());
		newPatientinfo.setLastnameOper(patientinfo.getLastnameOper());
		newPatientinfo.setFirstname(patientinfo.getFirstname());
		newPatientinfo.setFirstnameOper(patientinfo.getFirstnameOper());
		newPatientinfo.setPy(patientinfo.getPy());
		newPatientinfo.setPyOper(patientinfo.getPyOper());
		newPatientinfo.setWb(patientinfo.getWb());
		newPatientinfo.setWbOper(patientinfo.getWbOper());
		newPatientinfo.setSexcode(patientinfo.getSexcode());
		newPatientinfo.setSexcodeOper(patientinfo.getSexcodeOper());
		newPatientinfo.setSex(patientinfo.getSex());
		newPatientinfo.setSexOper(patientinfo.getSexOper());
		newPatientinfo.setDateofbirth(patientinfo.getDateofbirth());
		newPatientinfo.setDateofbirthOper(patientinfo.getDateofbirthOper());
		newPatientinfo.setTimeofbirth(patientinfo.getTimeofbirth());
		newPatientinfo.setTimeofbirthOper(patientinfo.getTimeofbirthOper());
		newPatientinfo.setMarriagestatuscode(patientinfo.getMarriagestatuscode());
		newPatientinfo.setMarriagestatuscodeOper(patientinfo.getMarriagestatuscodeOper());
		newPatientinfo.setMarriagestatus(patientinfo.getMarriagestatus());
		newPatientinfo.setMarriagestatusOper(patientinfo.getMarriagestatusOper());
		newPatientinfo.setOccupationcode(patientinfo.getOccupationcode());
		newPatientinfo.setOccupationcodeOper(patientinfo.getOccupationcodeOper());
		newPatientinfo.setOccupation(patientinfo.getOccupation());
		newPatientinfo.setOccupationOper(patientinfo.getOccupationOper());
		newPatientinfo.setNationalitycode(patientinfo.getNationalitycode());
		newPatientinfo.setNationalitycodeOper(patientinfo.getNationalitycodeOper());
		newPatientinfo.setNationality(patientinfo.getNationality());
		newPatientinfo.setNationalityOper(patientinfo.getNationalityOper());
		newPatientinfo.setCountrycode(patientinfo.getCountrycode());
		newPatientinfo.setCountrycodeOper(patientinfo.getCountrycodeOper());
		newPatientinfo.setCountry(patientinfo.getCountry());
		newPatientinfo.setCountryOper(patientinfo.getCountryOper());
		newPatientinfo.setFormalschoolingcode(patientinfo.getFormalschoolingcode());
		newPatientinfo.setFormalschoolingcodeOper(patientinfo.getFormalschoolingcodeOper());
		newPatientinfo.setFormalschooling(patientinfo.getFormalschooling());
		newPatientinfo.setFormalschoolingOper(patientinfo.getFormalschoolingOper());
		newPatientinfo.setReligion(patientinfo.getReligion());
		newPatientinfo.setReligionOper(patientinfo.getReligionOper());
		newPatientinfo.setBirthplacecode(patientinfo.getBirthplacecode());
		newPatientinfo.setBirthplacecodeOper(patientinfo.getBirthplacecodeOper());
		newPatientinfo.setBirthplace(patientinfo.getBirthplace());
		newPatientinfo.setBirthplaceOper(patientinfo.getBirthplaceOper());
		newPatientinfo.setNativeplacecode(patientinfo.getNativeplacecode());
		newPatientinfo.setNativeplacecodeOper(patientinfo.getNativeplacecodeOper());
		newPatientinfo.setNativeplace(patientinfo.getNativeplace());
		newPatientinfo.setNativeplaceOper(patientinfo.getNativeplaceOper());
		newPatientinfo.setBloodtype(patientinfo.getBloodtype());
		newPatientinfo.setBloodtypeOper(patientinfo.getBloodtypeOper());
		newPatientinfo.setCerttypecode(patientinfo.getCerttypecode());
		newPatientinfo.setCerttypecodeOper(patientinfo.getCerttypecodeOper());
		newPatientinfo.setCerttype(patientinfo.getCerttype());
		newPatientinfo.setCerttypeOper(patientinfo.getCerttypeOper());
		newPatientinfo.setCertno(patientinfo.getCertno());
		newPatientinfo.setCertnoOper(patientinfo.getCertnoOper());
		newPatientinfo.setPatientclasscode(patientinfo.getPatientclasscode());
		newPatientinfo.setPatientclasscodeOper(patientinfo.getPatientclasscodeOper());
		newPatientinfo.setPatientclass(patientinfo.getPatientclass());
		newPatientinfo.setPatientclassOper(patientinfo.getPatientclassOper());
		newPatientinfo.setFeetypecode(patientinfo.getFeetypecode());
		newPatientinfo.setFeetypecodeOper(patientinfo.getFeetypecodeOper());
		newPatientinfo.setFeetype(patientinfo.getFeetype());
		newPatientinfo.setFeetypeOper(patientinfo.getFeetypeOper());
		newPatientinfo.setCompany(patientinfo.getCompany());
		newPatientinfo.setCompanyOper(patientinfo.getCompanyOper());
		newPatientinfo.setPublicexpenseno(patientinfo.getPublicexpenseno());
		newPatientinfo.setPublicexpensenoOper(patientinfo.getPublicexpensenoOper());
		newPatientinfo.setContractunitcode(patientinfo.getContractunitcode());
		newPatientinfo.setContractunitcodeOper(patientinfo.getContractunitcodeOper());
		newPatientinfo.setContractunit(patientinfo.getContractunit());
		newPatientinfo.setContractunitOper(patientinfo.getContractunitOper());
		newPatientinfo.setBusinessaddresscode(patientinfo.getBusinessaddresscode());
		newPatientinfo.setBusinessaddresscodeOper(patientinfo.getBusinessaddresscodeOper());
		newPatientinfo.setBusinessaddress(patientinfo.getBusinessaddress());
		newPatientinfo.setBusinessaddressOper(patientinfo.getBusinessaddressOper());
		newPatientinfo.setBusinesspostcode(patientinfo.getBusinesspostcode());
		newPatientinfo.setBusinesspostcodeOper(patientinfo.getBusinesspostcodeOper());
		newPatientinfo.setBusinessphone(patientinfo.getBusinessphone());
		newPatientinfo.setBusinessphoneOper(patientinfo.getBusinessphoneOper());
		newPatientinfo.setHomeaddresscode(patientinfo.getHomeaddresscode());
		newPatientinfo.setHomeaddresscodeOper(patientinfo.getHomeaddresscodeOper());
		newPatientinfo.setHomeaddress(patientinfo.getHomeaddress());
		newPatientinfo.setHomeaddressOper(patientinfo.getHomeaddressOper());
		newPatientinfo.setHomepostcode(patientinfo.getHomepostcode());
		newPatientinfo.setHomepostcodeOper(patientinfo.getHomepostcodeOper());
		newPatientinfo.setMobilephone(patientinfo.getMobilephone());
		newPatientinfo.setMobilephoneOper(patientinfo.getMobilephoneOper());
		newPatientinfo.setContact(patientinfo.getContact());
		newPatientinfo.setContactOper(patientinfo.getContactOper());
		newPatientinfo.setRelationcode(patientinfo.getRelationcode());
		newPatientinfo.setRelationcodeOper(patientinfo.getRelationcodeOper());
		newPatientinfo.setRelation(patientinfo.getRelation());
		newPatientinfo.setRelationOper(patientinfo.getRelationOper());
		newPatientinfo.setContactemail(patientinfo.getContactemail());
		newPatientinfo.setContactemailOper(patientinfo.getContactemailOper());
		newPatientinfo.setContactmethod(patientinfo.getContactmethod());
		newPatientinfo.setContactmethodOper(patientinfo.getContactmethodOper());
		newPatientinfo.setViptype(patientinfo.getViptype());
		newPatientinfo.setViptypeOper(patientinfo.getViptypeOper());
		newPatientinfo.setOperatorid(patientinfo.getOperatorid());
		newPatientinfo.setOperatoridOper(patientinfo.getOperatoridOper());
		newPatientinfo.setOperator(patientinfo.getOperator());
		newPatientinfo.setOperatorOper(patientinfo.getOperatorOper());
		newPatientinfo.setOperatortime(patientinfo.getOperatortime());
		newPatientinfo.setOperatortimeOper(patientinfo.getOperatortimeOper());
		newPatientinfo.setAvailable(patientinfo.getAvailable());
		newPatientinfo.setAvailableOper(patientinfo.getAvailableOper());
		newPatientinfo.setManagetype(patientinfo.getManagetype());
		newPatientinfo.setManagetypeOper(patientinfo.getManagetypeOper());
		newPatientinfo.setImpflag(patientinfo.getImpflag());
		newPatientinfo.setImpflagOper(patientinfo.getImpflagOper());
		newPatientinfo.setReturndesc(patientinfo.getReturndesc());
		newPatientinfo.setReturndescOper(patientinfo.getReturndescOper());
		newPatientinfo.setOrderByStr(patientinfo.getOrderByStr());
		return newPatientinfo;
	}
}
