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
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用INSERT预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, recordflow); //记录流水号	key
		pst.setString(++index, pid); //病人ID必填
		pst.setString(++index, insuranceno); //病人医保号
		pst.setString(++index, patientname); //病人姓名
		pst.setString(++index, tmpflag); //临时用名标志（正式、临时）
		pst.setString(++index, lastname); //病人姓氏
		pst.setString(++index, firstname); //病人名
		pst.setString(++index, py); //病人姓名拼音码
		pst.setString(++index, wb); //病人姓名五笔码
		pst.setString(++index, sexcode); //病人性别代码
		pst.setString(++index, sex); //病人性别
		pst.setString(++index, dateofbirth); //病人出生日期（格式：yyyyMMdd）
		pst.setString(++index, timeofbirth); //病人出生时间（格式：hhmmss）
		pst.setString(++index, marriagestatuscode); //病人婚姻状况代码
		pst.setString(++index, marriagestatus); //病人婚姻状况
		pst.setString(++index, occupationcode); //病人职业代码
		pst.setString(++index, occupation); //病人职业
		pst.setString(++index, nationalitycode); //病人民族代码
		pst.setString(++index, nationality); //病人民族
		pst.setString(++index, countrycode); //病人国籍代码
		pst.setString(++index, country); //病人国籍
		pst.setString(++index, formalschoolingcode); //病人文化水平代码
		pst.setString(++index, formalschooling); //病人文化水平
		pst.setString(++index, religion); //病人宗教信仰
		pst.setString(++index, birthplacecode); //病人出生地代码
		pst.setString(++index, birthplace); //病人出生地
		pst.setString(++index, nativeplacecode); //病人籍贯代码
		pst.setString(++index, nativeplace); //病人籍贯
		pst.setString(++index, bloodtype); //病人血型
		pst.setString(++index, certtypecode); //病人证件类型代码
		pst.setString(++index, certtype); //病人证件类型
		pst.setString(++index, certno); //病人证件号
		pst.setString(++index, patientclasscode); //病人身份代码
		pst.setString(++index, patientclass); //病人身份
		pst.setString(++index, feetypecode); //病人费用类型代码
		pst.setString(++index, feetype); //病人费用类型
		pst.setString(++index, company); //病人工作单位
		pst.setString(++index, publicexpenseno); //病人医疗证号
		pst.setString(++index, contractunitcode); //合同单位代码
		pst.setString(++index, contractunit); //合同单位
		pst.setString(++index, businessaddresscode); //病人工作单位地址代码
		pst.setString(++index, businessaddress); //病人工作单位地址
		pst.setString(++index, businesspostcode); //病人工作单位邮编
		pst.setString(++index, businessphone); //病人工作单位电话
		pst.setString(++index, homeaddresscode); //病人家庭住址代码
		pst.setString(++index, homeaddress); //病人家庭住址
		pst.setString(++index, homepostcode); //病人家庭地址邮编
		pst.setString(++index, mobilephone); //病人手机号
		pst.setString(++index, contact); //联系人
		pst.setString(++index, relationcode); //联系人关系代码
		pst.setString(++index, relation); //联系人关系
		pst.setString(++index, contactemail); //联系邮箱
		pst.setString(++index, contactmethod); //联系方式
		pst.setString(++index, viptype); //重点病人类型
		pst.setString(++index, operatorid); //经办人ID
		pst.setString(++index, operator); //经办人
		pst.setString(++index, operatortime); //办理时间（格式：yyyyMMddHHmmss）
		pst.setString(++index, available); //可用标志（Y-可用 N-停用）
		pst.setString(++index, managetype); //处理类型（1-新增 2-修改 3-删除） 必填
		pst.setString(++index, impflag); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		pst.setString(++index, returndesc); //反馈说明
		return pst;
	}

	/**
	 * Method makeUpdSt.
	 * 生成修改操作的PreparedStatement
	 * @param pst 使用UPDATE预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, pid); //病人ID必填
		pst.setString(++index, insuranceno); //病人医保号
		pst.setString(++index, patientname); //病人姓名
		pst.setString(++index, tmpflag); //临时用名标志（正式、临时）
		pst.setString(++index, lastname); //病人姓氏
		pst.setString(++index, firstname); //病人名
		pst.setString(++index, py); //病人姓名拼音码
		pst.setString(++index, wb); //病人姓名五笔码
		pst.setString(++index, sexcode); //病人性别代码
		pst.setString(++index, sex); //病人性别
		pst.setString(++index, dateofbirth); //病人出生日期（格式：yyyyMMdd）
		pst.setString(++index, timeofbirth); //病人出生时间（格式：hhmmss）
		pst.setString(++index, marriagestatuscode); //病人婚姻状况代码
		pst.setString(++index, marriagestatus); //病人婚姻状况
		pst.setString(++index, occupationcode); //病人职业代码
		pst.setString(++index, occupation); //病人职业
		pst.setString(++index, nationalitycode); //病人民族代码
		pst.setString(++index, nationality); //病人民族
		pst.setString(++index, countrycode); //病人国籍代码
		pst.setString(++index, country); //病人国籍
		pst.setString(++index, formalschoolingcode); //病人文化水平代码
		pst.setString(++index, formalschooling); //病人文化水平
		pst.setString(++index, religion); //病人宗教信仰
		pst.setString(++index, birthplacecode); //病人出生地代码
		pst.setString(++index, birthplace); //病人出生地
		pst.setString(++index, nativeplacecode); //病人籍贯代码
		pst.setString(++index, nativeplace); //病人籍贯
		pst.setString(++index, bloodtype); //病人血型
		pst.setString(++index, certtypecode); //病人证件类型代码
		pst.setString(++index, certtype); //病人证件类型
		pst.setString(++index, certno); //病人证件号
		pst.setString(++index, patientclasscode); //病人身份代码
		pst.setString(++index, patientclass); //病人身份
		pst.setString(++index, feetypecode); //病人费用类型代码
		pst.setString(++index, feetype); //病人费用类型
		pst.setString(++index, company); //病人工作单位
		pst.setString(++index, publicexpenseno); //病人医疗证号
		pst.setString(++index, contractunitcode); //合同单位代码
		pst.setString(++index, contractunit); //合同单位
		pst.setString(++index, businessaddresscode); //病人工作单位地址代码
		pst.setString(++index, businessaddress); //病人工作单位地址
		pst.setString(++index, businesspostcode); //病人工作单位邮编
		pst.setString(++index, businessphone); //病人工作单位电话
		pst.setString(++index, homeaddresscode); //病人家庭住址代码
		pst.setString(++index, homeaddress); //病人家庭住址
		pst.setString(++index, homepostcode); //病人家庭地址邮编
		pst.setString(++index, mobilephone); //病人手机号
		pst.setString(++index, contact); //联系人
		pst.setString(++index, relationcode); //联系人关系代码
		pst.setString(++index, relation); //联系人关系
		pst.setString(++index, contactemail); //联系邮箱
		pst.setString(++index, contactmethod); //联系方式
		pst.setString(++index, viptype); //重点病人类型
		pst.setString(++index, operatorid); //经办人ID
		pst.setString(++index, operator); //经办人
		pst.setString(++index, operatortime); //办理时间（格式：yyyyMMddHHmmss）
		pst.setString(++index, available); //可用标志（Y-可用 N-停用）
		pst.setString(++index, managetype); //处理类型（1-新增 2-修改 3-删除） 必填
		pst.setString(++index, impflag); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		pst.setString(++index, returndesc); //反馈说明
		pst.setString(++index, recordflow); //记录流水号	key
		return pst;
	}

	/**
	 * Method makeSearchSql.
	 * 生成已设置过值的属性为查询条件组成的sql语句
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
	 * 生成已设置过值的属性为查询条件组成的pst
	 * @param conn 数据库链接
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
	 * 将使用SELECT得到的结果集里的值传到当前对象的对应属性中
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchPatientinfo(ResultSet rs) throws SQLException {
		recordflow = rs.getString("RecordFlow"); //记录流水号	key
		pid = rs.getString("PID"); //病人ID必填
		insuranceno = rs.getString("InsuranceNo"); //病人医保号
		patientname = rs.getString("PatientName"); //病人姓名
		tmpflag = rs.getString("TmpFlag"); //临时用名标志（正式、临时）
		lastname = rs.getString("LastName"); //病人姓氏
		firstname = rs.getString("FirstName"); //病人名
		py = rs.getString("PY"); //病人姓名拼音码
		wb = rs.getString("WB"); //病人姓名五笔码
		sexcode = rs.getString("SexCode"); //病人性别代码
		sex = rs.getString("Sex"); //病人性别
		dateofbirth = rs.getString("DateOfBirth"); //病人出生日期（格式：yyyyMMdd）
		timeofbirth = rs.getString("TimeOfBirth"); //病人出生时间（格式：hhmmss）
		marriagestatuscode = rs.getString("MarriageStatusCode"); //病人婚姻状况代码
		marriagestatus = rs.getString("MarriageStatus"); //病人婚姻状况
		occupationcode = rs.getString("OccupationCode"); //病人职业代码
		occupation = rs.getString("Occupation"); //病人职业
		nationalitycode = rs.getString("NationalityCode"); //病人民族代码
		nationality = rs.getString("Nationality"); //病人民族
		countrycode = rs.getString("CountryCode"); //病人国籍代码
		country = rs.getString("Country"); //病人国籍
		formalschoolingcode = rs.getString("FormalSchoolingCode"); //病人文化水平代码
		formalschooling = rs.getString("FormalSchooling"); //病人文化水平
		religion = rs.getString("Religion"); //病人宗教信仰
		birthplacecode = rs.getString("BirthPlaceCode"); //病人出生地代码
		birthplace = rs.getString("BirthPlace"); //病人出生地
		nativeplacecode = rs.getString("NativePlaceCode"); //病人籍贯代码
		nativeplace = rs.getString("NativePlace"); //病人籍贯
		bloodtype = rs.getString("BloodType"); //病人血型
		certtypecode = rs.getString("CertTypeCode"); //病人证件类型代码
		certtype = rs.getString("CertType"); //病人证件类型
		certno = rs.getString("CertNo"); //病人证件号
		patientclasscode = rs.getString("PatientClassCode"); //病人身份代码
		patientclass = rs.getString("PatientClass"); //病人身份
		feetypecode = rs.getString("FeeTypeCode"); //病人费用类型代码
		feetype = rs.getString("FeeType"); //病人费用类型
		company = rs.getString("Company"); //病人工作单位
		publicexpenseno = rs.getString("PublicExpenseNo"); //病人医疗证号
		contractunitcode = rs.getString("ContractUnitCode"); //合同单位代码
		contractunit = rs.getString("ContractUnit"); //合同单位
		businessaddresscode = rs.getString("BusinessAddressCode"); //病人工作单位地址代码
		businessaddress = rs.getString("BusinessAddress"); //病人工作单位地址
		businesspostcode = rs.getString("BusinessPostCode"); //病人工作单位邮编
		businessphone = rs.getString("BusinessPhone"); //病人工作单位电话
		homeaddresscode = rs.getString("HomeAddressCode"); //病人家庭住址代码
		homeaddress = rs.getString("HomeAddress"); //病人家庭住址
		homepostcode = rs.getString("HomePostCode"); //病人家庭地址邮编
		mobilephone = rs.getString("MobilePhone"); //病人手机号
		contact = rs.getString("Contact"); //联系人
		relationcode = rs.getString("RelationCode"); //联系人关系代码
		relation = rs.getString("Relation"); //联系人关系
		contactemail = rs.getString("ContactEmail"); //联系邮箱
		contactmethod = rs.getString("ContactMethod"); //联系方式
		viptype = rs.getString("VIPType"); //重点病人类型
		operatorid = rs.getString("OperatorID"); //经办人ID
		operator = rs.getString("Operator"); //经办人
		operatortime = rs.getString("OperatorTime"); //办理时间（格式：yyyyMMddHHmmss）
		available = rs.getString("Available"); //可用标志（Y-可用 N-停用）
		managetype = rs.getString("ManageType"); //处理类型（1-新增 2-修改 3-删除） 必填
		impflag = rs.getString("ImpFlag"); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		returndesc = rs.getString("ReturnDesc"); //反馈说明
	}

	/**
	 * Method makeCountItemSql.
	 * 生成已设置过值的属性为查询条件计算数据条数的sql语句
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
	 * 生成已设置过值的属性为查询条件的sql语句，只含WHERE后面，不包括SELECT
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
	 * Method buildPatientinfo，静态方法.
	 * 将struct中的父类对象转成当前子类对象
	 * @param patientinfo 父类对象
	 * @return 子类对象
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
