package com.haitaiinc.interfaceserver;

import java.sql.*;

import com.haitaiinc.utils.StringUtil;

/**
 * @author haitaiinc
 * InPatientInfo
 */
public class Inpatientinfo
		extends com.haitaiinc.struct.Inpatientinfo{

	public static final String INSERT =
		"insert into InPatientInfo(RecordFlow,IPID,PID,AdminissionNo,AdmissionTimes,PatientName,SexCode,Sex,Age,AgeDesc,MarriageStatusCode,MarriageStatus,FeeTypeCode,FeeTypeName,PatientClass,AdmissionRegisterTime,AdmissionWay,AdmissionPurpose,AdmissionHospital,AdmissionDeptCode,AdmissionDept,AdmissionWardCode,AdmissionWard,Hospital,DeptCode,DeptName,WardCode,WardName,DischargeTime,BedNo,BedFeeType,Room,StateOfIllness,DoctorID,Doctor,MedicalFrpCode,MedicalGrp,NursiongLevel,NurseID,Nurse,NursingGrpCode,NursiongGrp,InStatus,MrStatus,DischargeWay,ManageType,ImpFlag,ReturnDesc)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String UPDATE =
		"update InPatientInfo set IPID=?,PID=?,AdminissionNo=?,AdmissionTimes=?,PatientName=?,SexCode=?,Sex=?,Age=?,AgeDesc=?,MarriageStatusCode=?,MarriageStatus=?,FeeTypeCode=?,FeeTypeName=?,PatientClass=?,AdmissionRegisterTime=?,AdmissionWay=?,AdmissionPurpose=?,AdmissionHospital=?,AdmissionDeptCode=?,AdmissionDept=?,AdmissionWardCode=?,AdmissionWard=?,Hospital=?,DeptCode=?,DeptName=?,WardCode=?,WardName=?,DischargeTime=?,BedNo=?,BedFeeType=?,Room=?,StateOfIllness=?,DoctorID=?,Doctor=?,MedicalFrpCode=?,MedicalGrp=?,NursiongLevel=?,NurseID=?,Nurse=?,NursingGrpCode=?,NursiongGrp=?,InStatus=?,MrStatus=?,DischargeWay=?,ManageType=?,ImpFlag=?,ReturnDesc=? where RecordFlow=?";

	public static final String SELECT =
		"select RecordFlow,IPID,PID,AdminissionNo,AdmissionTimes,PatientName,SexCode,Sex,Age,AgeDesc,MarriageStatusCode,MarriageStatus,FeeTypeCode,FeeTypeName,PatientClass,AdmissionRegisterTime,AdmissionTime,AdmissionWay,AdmissionPurpose,AdmissionHospital,AdmissionDeptCode,AdmissionDept,AdmissionWardCode,AdmissionWard,Hospital,DeptCode,DeptName,WardCode,WardName,DischargeTime,BedNo,BedFeeType,Room,StateOfIllness,DoctorID,Doctor,MedicalFrpCode,MedicalGrp,NursiongLevel,NurseID,Nurse,NursingGrpCode,NursiongGrp,InStatus,MrStatus,DischargeWay,ManageType,ImpFlag,ReturnDesc from InPatientInfo ";

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
		pst.setString(++index, ipid); //病人住院流水号 必填
		pst.setString(++index, pid); //病人ID
		pst.setString(++index, adminissionno); //住院号
		pst.setString(++index, admissiontimes); //住院次数
		pst.setString(++index, patientname); //病人姓名
		pst.setString(++index, sexcode); //性别代码
		pst.setString(++index, sex); //性别
		pst.setString(++index, age); //年龄
		pst.setString(++index, agedesc); //年龄说明
		pst.setString(++index, marriagestatuscode); //婚姻状况代码
		pst.setString(++index, marriagestatus); //婚姻状况
		pst.setString(++index, feetypecode); //费别代码
		pst.setString(++index, feetypename); //费别
		pst.setString(++index, patientclass); //病人身份
		pst.setString(++index, admissionregistertime); //入院登记时间（格式：yyyyMMddHHmmss）
		pst.setString(++index, admissionway); //入院方式
		pst.setString(++index, admissionpurpose); //入院目的
		pst.setString(++index, admissionhospital); //入院时院区
		pst.setString(++index, admissiondeptcode); //入院科室代码
		pst.setString(++index, admissiondept); //入院科室
		pst.setString(++index, admissionwardcode); //入院病区代码
		pst.setString(++index, admissionward); //入院病区
		pst.setString(++index, hospital); //当前院区
		pst.setString(++index, deptcode); //当前科室代码
		pst.setString(++index, deptname); //当前科室名称
		pst.setString(++index, wardcode); //当前病区代码
		pst.setString(++index, wardname); //当前病区名称
		pst.setString(++index, dischargetime); //出院时间（格式：yyyyMMddHHmmss）
		pst.setString(++index, bedno); //床号
		pst.setString(++index, bedfeetype); //床位费类型
		pst.setString(++index, room); //病房
		pst.setString(++index, stateofillness); //病情
		pst.setString(++index, doctorid); //管床医生ID
		pst.setString(++index, doctor); //管床医生
		pst.setString(++index, medicalfrpcode); //诊疗组代码
		pst.setString(++index, medicalgrp); //诊疗组
		pst.setString(++index, nursionglevel); //护理等级
		pst.setString(++index, nurseid); //管床护士ID
		pst.setString(++index, nurse); //管床护士
		pst.setString(++index, nursinggrpcode); //护理组代码
		pst.setString(++index, nursionggrp); //护理组
		pst.setString(++index, instatus); //住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】
		pst.setString(++index, mrstatus); //病历状态【i：正常；o：待归档；p：归档】
		pst.setString(++index, dischargeway); //出院方式【SW：死亡；ZC：正常；ZY：转院】
		pst.setString(++index, managetype); //处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填
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
		pst.setString(++index, ipid); //病人住院流水号 必填
		pst.setString(++index, pid); //病人ID
		pst.setString(++index, adminissionno); //住院号
		pst.setString(++index, admissiontimes); //住院次数
		pst.setString(++index, patientname); //病人姓名
		pst.setString(++index, sexcode); //性别代码
		pst.setString(++index, sex); //性别
		pst.setString(++index, age); //年龄
		pst.setString(++index, agedesc); //年龄说明
		pst.setString(++index, marriagestatuscode); //婚姻状况代码
		pst.setString(++index, marriagestatus); //婚姻状况
		pst.setString(++index, feetypecode); //费别代码
		pst.setString(++index, feetypename); //费别
		pst.setString(++index, patientclass); //病人身份
		pst.setString(++index, admissionregistertime); //入院登记时间（格式：yyyyMMddHHmmss）
		pst.setString(++index, admissionway); //入院方式
		pst.setString(++index, admissionpurpose); //入院目的
		pst.setString(++index, admissionhospital); //入院时院区
		pst.setString(++index, admissiondeptcode); //入院科室代码
		pst.setString(++index, admissiondept); //入院科室
		pst.setString(++index, admissionwardcode); //入院病区代码
		pst.setString(++index, admissionward); //入院病区
		pst.setString(++index, hospital); //当前院区
		pst.setString(++index, deptcode); //当前科室代码
		pst.setString(++index, deptname); //当前科室名称
		pst.setString(++index, wardcode); //当前病区代码
		pst.setString(++index, wardname); //当前病区名称
		pst.setString(++index, dischargetime); //出院时间（格式：yyyyMMddHHmmss）
		pst.setString(++index, bedno); //床号
		pst.setString(++index, bedfeetype); //床位费类型
		pst.setString(++index, room); //病房
		pst.setString(++index, stateofillness); //病情
		pst.setString(++index, doctorid); //管床医生ID
		pst.setString(++index, doctor); //管床医生
		pst.setString(++index, medicalfrpcode); //诊疗组代码
		pst.setString(++index, medicalgrp); //诊疗组
		pst.setString(++index, nursionglevel); //护理等级
		pst.setString(++index, nurseid); //管床护士ID
		pst.setString(++index, nurse); //管床护士
		pst.setString(++index, nursinggrpcode); //护理组代码
		pst.setString(++index, nursionggrp); //护理组
		pst.setString(++index, instatus); //住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】
		pst.setString(++index, mrstatus); //病历状态【i：正常；o：待归档；p：归档】
		pst.setString(++index, dischargeway); //出院方式【SW：死亡；ZC：正常；ZY：转院】
		pst.setString(++index, managetype); //处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填
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
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IPID" + ipidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(ipid, "'", "''"));
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
		if (!isnull(adminissionno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdminissionNo" + adminissionnoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(adminissionno, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiontimes)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionTimes" + admissiontimesOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiontimes, "'", "''"));
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
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Age" + ageOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(age, "'", "''"));
			par += temp;
		}
		if (!isnull(agedesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AgeDesc" + agedescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(agedesc, "'", "''"));
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
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(feetypename)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeName" + feetypenameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypename, "'", "''"));
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
		if (!isnull(admissionregistertime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionRegisterTime" + admissionregistertimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionregistertime, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiontime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionTime" + admissiontimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiontime, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWay" + admissionwayOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionway, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionpurpose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionPurpose" + admissionpurposeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionpurpose, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionhospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionHospital" + admissionhospitalOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionhospital, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiondeptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionDeptCode" + admissiondeptcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiondeptcode, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiondept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionDept" + admissiondeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiondept, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionwardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWardCode" + admissionwardcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionwardcode, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionward)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWard" + admissionwardOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionward, "'", "''"));
			par += temp;
		}
		if (!isnull(hospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Hospital" + hospitalOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(hospital, "'", "''"));
			par += temp;
		}
		if (!isnull(deptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DeptCode" + deptcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(deptcode, "'", "''"));
			par += temp;
		}
		if (!isnull(deptname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DeptName" + deptnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(deptname, "'", "''"));
			par += temp;
		}
		if (!isnull(wardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WardCode" + wardcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wardcode, "'", "''"));
			par += temp;
		}
		if (!isnull(wardname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WardName" + wardnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wardname, "'", "''"));
			par += temp;
		}
		if (!isnull(dischargetime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DischargeTime" + dischargetimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dischargetime, "'", "''"));
			par += temp;
		}
		if (!isnull(bedno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BedNo" + bednoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedno, "'", "''"));
			par += temp;
		}
		if (!isnull(bedfeetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BedFeeType" + bedfeetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedfeetype, "'", "''"));
			par += temp;
		}
		if (!isnull(room)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Room" + roomOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(room, "'", "''"));
			par += temp;
		}
		if (!isnull(stateofillness)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "StateOfIllness" + stateofillnessOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(stateofillness, "'", "''"));
			par += temp;
		}
		if (!isnull(doctorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DoctorID" + doctoridOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(doctorid, "'", "''"));
			par += temp;
		}
		if (!isnull(doctor)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Doctor" + doctorOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(doctor, "'", "''"));
			par += temp;
		}
		if (!isnull(medicalfrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MedicalFrpCode" + medicalfrpcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(medicalfrpcode, "'", "''"));
			par += temp;
		}
		if (!isnull(medicalgrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MedicalGrp" + medicalgrpOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(medicalgrp, "'", "''"));
			par += temp;
		}
		if (!isnull(nursionglevel)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursiongLevel" + nursionglevelOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursionglevel, "'", "''"));
			par += temp;
		}
		if (!isnull(nurseid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NurseID" + nurseidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nurseid, "'", "''"));
			par += temp;
		}
		if (!isnull(nurse)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Nurse" + nurseOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nurse, "'", "''"));
			par += temp;
		}
		if (!isnull(nursinggrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursingGrpCode" + nursinggrpcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursinggrpcode, "'", "''"));
			par += temp;
		}
		if (!isnull(nursionggrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursiongGrp" + nursionggrpOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursionggrp, "'", "''"));
			par += temp;
		}
		if (!isnull(instatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "InStatus" + instatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(instatus, "'", "''"));
			par += temp;
		}
		if (!isnull(mrstatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MrStatus" + mrstatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(mrstatus, "'", "''"));
			par += temp;
		}
		if (!isnull(dischargeway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DischargeWay" + dischargewayOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dischargeway, "'", "''"));
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
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IPID" + ipidOper;
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
		if (!isnull(adminissionno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdminissionNo" + adminissionnoOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissiontimes)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionTimes" + admissiontimesOper;
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
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Age" + ageOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(agedesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AgeDesc" + agedescOper;
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
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(feetypename)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeName" + feetypenameOper;
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
		if (!isnull(admissionregistertime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionRegisterTime" + admissionregistertimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissionway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWay" + admissionwayOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissionpurpose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionPurpose" + admissionpurposeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissionhospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionHospital" + admissionhospitalOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissiondeptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionDeptCode" + admissiondeptcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissiondept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionDept" + admissiondeptOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissionwardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWardCode" + admissionwardcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(admissionward)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWard" + admissionwardOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(hospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Hospital" + hospitalOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(deptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DeptCode" + deptcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(deptname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DeptName" + deptnameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(wardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WardCode" + wardcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(wardname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WardName" + wardnameOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(dischargetime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DischargeTime" + dischargetimeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(bedno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BedNo" + bednoOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(bedfeetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BedFeeType" + bedfeetypeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(room)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Room" + roomOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(stateofillness)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "StateOfIllness" + stateofillnessOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(doctorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DoctorID" + doctoridOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(doctor)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Doctor" + doctorOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(medicalfrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MedicalFrpCode" + medicalfrpcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(medicalgrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MedicalGrp" + medicalgrpOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nursionglevel)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursiongLevel" + nursionglevelOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nurseid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NurseID" + nurseidOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nurse)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Nurse" + nurseOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nursinggrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursingGrpCode" + nursinggrpcodeOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(nursionggrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursiongGrp" + nursionggrpOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(instatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "InStatus" + instatusOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(mrstatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MrStatus" + mrstatusOper;
			temp = StringUtil.replace(temp, "'[i]'", "?");
			temp = StringUtil.replace(temp, "[i]", "?");
			par += temp;
		}
		if (!isnull(dischargeway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DischargeWay" + dischargewayOper;
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
		if (!isnull(ipid)) {
			if(!(ipidOper.equals(ISNULL) ||ipidOper.equals(NOTISNULL))){
				pst.setString(++idx, ipid);
			}
		}
		if (!isnull(pid)) {
			if(!(pidOper.equals(ISNULL) ||pidOper.equals(NOTISNULL))){
				pst.setString(++idx, pid);
			}
		}
		if (!isnull(adminissionno)) {
			if(!(adminissionnoOper.equals(ISNULL) ||adminissionnoOper.equals(NOTISNULL))){
				pst.setString(++idx, adminissionno);
			}
		}
		if (!isnull(admissiontimes)) {
			if(!(admissiontimesOper.equals(ISNULL) ||admissiontimesOper.equals(NOTISNULL))){
				pst.setString(++idx, admissiontimes);
			}
		}
		if (!isnull(patientname)) {
			if(!(patientnameOper.equals(ISNULL) ||patientnameOper.equals(NOTISNULL))){
				pst.setString(++idx, patientname);
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
		if (!isnull(age)) {
			if(!(ageOper.equals(ISNULL) ||ageOper.equals(NOTISNULL))){
				pst.setString(++idx, age);
			}
		}
		if (!isnull(agedesc)) {
			if(!(agedescOper.equals(ISNULL) ||agedescOper.equals(NOTISNULL))){
				pst.setString(++idx, agedesc);
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
		if (!isnull(feetypecode)) {
			if(!(feetypecodeOper.equals(ISNULL) ||feetypecodeOper.equals(NOTISNULL))){
				pst.setString(++idx, feetypecode);
			}
		}
		if (!isnull(feetypename)) {
			if(!(feetypenameOper.equals(ISNULL) ||feetypenameOper.equals(NOTISNULL))){
				pst.setString(++idx, feetypename);
			}
		}
		if (!isnull(patientclass)) {
			if(!(patientclassOper.equals(ISNULL) ||patientclassOper.equals(NOTISNULL))){
				pst.setString(++idx, patientclass);
			}
		}
		if (!isnull(admissionregistertime)) {
			if(!(admissionregistertimeOper.equals(ISNULL) ||admissionregistertimeOper.equals(NOTISNULL))){
				pst.setString(++idx, admissionregistertime);
			}
		}
		if (!isnull(admissionway)) {
			if(!(admissionwayOper.equals(ISNULL) ||admissionwayOper.equals(NOTISNULL))){
				pst.setString(++idx, admissionway);
			}
		}
		if (!isnull(admissionpurpose)) {
			if(!(admissionpurposeOper.equals(ISNULL) ||admissionpurposeOper.equals(NOTISNULL))){
				pst.setString(++idx, admissionpurpose);
			}
		}
		if (!isnull(admissionhospital)) {
			if(!(admissionhospitalOper.equals(ISNULL) ||admissionhospitalOper.equals(NOTISNULL))){
				pst.setString(++idx, admissionhospital);
			}
		}
		if (!isnull(admissiondeptcode)) {
			if(!(admissiondeptcodeOper.equals(ISNULL) ||admissiondeptcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, admissiondeptcode);
			}
		}
		if (!isnull(admissiondept)) {
			if(!(admissiondeptOper.equals(ISNULL) ||admissiondeptOper.equals(NOTISNULL))){
				pst.setString(++idx, admissiondept);
			}
		}
		if (!isnull(admissionwardcode)) {
			if(!(admissionwardcodeOper.equals(ISNULL) ||admissionwardcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, admissionwardcode);
			}
		}
		if (!isnull(admissionward)) {
			if(!(admissionwardOper.equals(ISNULL) ||admissionwardOper.equals(NOTISNULL))){
				pst.setString(++idx, admissionward);
			}
		}
		if (!isnull(hospital)) {
			if(!(hospitalOper.equals(ISNULL) ||hospitalOper.equals(NOTISNULL))){
				pst.setString(++idx, hospital);
			}
		}
		if (!isnull(deptcode)) {
			if(!(deptcodeOper.equals(ISNULL) ||deptcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, deptcode);
			}
		}
		if (!isnull(deptname)) {
			if(!(deptnameOper.equals(ISNULL) ||deptnameOper.equals(NOTISNULL))){
				pst.setString(++idx, deptname);
			}
		}
		if (!isnull(wardcode)) {
			if(!(wardcodeOper.equals(ISNULL) ||wardcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, wardcode);
			}
		}
		if (!isnull(wardname)) {
			if(!(wardnameOper.equals(ISNULL) ||wardnameOper.equals(NOTISNULL))){
				pst.setString(++idx, wardname);
			}
		}
		if (!isnull(dischargetime)) {
			if(!(dischargetimeOper.equals(ISNULL) ||dischargetimeOper.equals(NOTISNULL))){
				pst.setString(++idx, dischargetime);
			}
		}
		if (!isnull(bedno)) {
			if(!(bednoOper.equals(ISNULL) ||bednoOper.equals(NOTISNULL))){
				pst.setString(++idx, bedno);
			}
		}
		if (!isnull(bedfeetype)) {
			if(!(bedfeetypeOper.equals(ISNULL) ||bedfeetypeOper.equals(NOTISNULL))){
				pst.setString(++idx, bedfeetype);
			}
		}
		if (!isnull(room)) {
			if(!(roomOper.equals(ISNULL) ||roomOper.equals(NOTISNULL))){
				pst.setString(++idx, room);
			}
		}
		if (!isnull(stateofillness)) {
			if(!(stateofillnessOper.equals(ISNULL) ||stateofillnessOper.equals(NOTISNULL))){
				pst.setString(++idx, stateofillness);
			}
		}
		if (!isnull(doctorid)) {
			if(!(doctoridOper.equals(ISNULL) ||doctoridOper.equals(NOTISNULL))){
				pst.setString(++idx, doctorid);
			}
		}
		if (!isnull(doctor)) {
			if(!(doctorOper.equals(ISNULL) ||doctorOper.equals(NOTISNULL))){
				pst.setString(++idx, doctor);
			}
		}
		if (!isnull(medicalfrpcode)) {
			if(!(medicalfrpcodeOper.equals(ISNULL) ||medicalfrpcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, medicalfrpcode);
			}
		}
		if (!isnull(medicalgrp)) {
			if(!(medicalgrpOper.equals(ISNULL) ||medicalgrpOper.equals(NOTISNULL))){
				pst.setString(++idx, medicalgrp);
			}
		}
		if (!isnull(nursionglevel)) {
			if(!(nursionglevelOper.equals(ISNULL) ||nursionglevelOper.equals(NOTISNULL))){
				pst.setString(++idx, nursionglevel);
			}
		}
		if (!isnull(nurseid)) {
			if(!(nurseidOper.equals(ISNULL) ||nurseidOper.equals(NOTISNULL))){
				pst.setString(++idx, nurseid);
			}
		}
		if (!isnull(nurse)) {
			if(!(nurseOper.equals(ISNULL) ||nurseOper.equals(NOTISNULL))){
				pst.setString(++idx, nurse);
			}
		}
		if (!isnull(nursinggrpcode)) {
			if(!(nursinggrpcodeOper.equals(ISNULL) ||nursinggrpcodeOper.equals(NOTISNULL))){
				pst.setString(++idx, nursinggrpcode);
			}
		}
		if (!isnull(nursionggrp)) {
			if(!(nursionggrpOper.equals(ISNULL) ||nursionggrpOper.equals(NOTISNULL))){
				pst.setString(++idx, nursionggrp);
			}
		}
		if (!isnull(instatus)) {
			if(!(instatusOper.equals(ISNULL) ||instatusOper.equals(NOTISNULL))){
				pst.setString(++idx, instatus);
			}
		}
		if (!isnull(mrstatus)) {
			if(!(mrstatusOper.equals(ISNULL) ||mrstatusOper.equals(NOTISNULL))){
				pst.setString(++idx, mrstatus);
			}
		}
		if (!isnull(dischargeway)) {
			if(!(dischargewayOper.equals(ISNULL) ||dischargewayOper.equals(NOTISNULL))){
				pst.setString(++idx, dischargeway);
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
	public void fetchInpatientinfo(ResultSet rs) throws SQLException {
		recordflow = rs.getString("RecordFlow"); //记录流水号	key
		ipid = rs.getString("IPID"); //病人住院流水号 必填
		pid = rs.getString("PID"); //病人ID
		adminissionno = rs.getString("AdminissionNo"); //住院号
		admissiontimes = rs.getString("AdmissionTimes"); //住院次数
		patientname = rs.getString("PatientName"); //病人姓名
		sexcode = rs.getString("SexCode"); //性别代码
		sex = rs.getString("Sex"); //性别
		age = rs.getString("Age"); //年龄
		agedesc = rs.getString("AgeDesc"); //年龄说明
		marriagestatuscode = rs.getString("MarriageStatusCode"); //婚姻状况代码
		marriagestatus = rs.getString("MarriageStatus"); //婚姻状况
		feetypecode = rs.getString("FeeTypeCode"); //费别代码
		feetypename = rs.getString("FeeTypeName"); //费别
		patientclass = rs.getString("PatientClass"); //病人身份
		admissionregistertime = rs.getString("AdmissionRegisterTime"); //入院登记时间（格式：yyyyMMddHHmmss）
		admissiontime = rs.getString("AdmissionTime"); //入科时间（格式：yyyyMMddHHmmss）
		admissionway = rs.getString("AdmissionWay"); //入院方式
		admissionpurpose = rs.getString("AdmissionPurpose"); //入院目的
		admissionhospital = rs.getString("AdmissionHospital"); //入院时院区
		admissiondeptcode = rs.getString("AdmissionDeptCode"); //入院科室代码
		admissiondept = rs.getString("AdmissionDept"); //入院科室
		admissionwardcode = rs.getString("AdmissionWardCode"); //入院病区代码
		admissionward = rs.getString("AdmissionWard"); //入院病区
		hospital = rs.getString("Hospital"); //当前院区
		deptcode = rs.getString("DeptCode"); //当前科室代码
		deptname = rs.getString("DeptName"); //当前科室名称
		wardcode = rs.getString("WardCode"); //当前病区代码
		wardname = rs.getString("WardName"); //当前病区名称
		dischargetime = rs.getString("DischargeTime"); //出院时间（格式：yyyyMMddHHmmss）
		bedno = rs.getString("BedNo"); //床号
		bedfeetype = rs.getString("BedFeeType"); //床位费类型
		room = rs.getString("Room"); //病房
		stateofillness = rs.getString("StateOfIllness"); //病情
		doctorid = rs.getString("DoctorID"); //管床医生ID
		doctor = rs.getString("Doctor"); //管床医生
		medicalfrpcode = rs.getString("MedicalFrpCode"); //诊疗组代码
		medicalgrp = rs.getString("MedicalGrp"); //诊疗组
		nursionglevel = rs.getString("NursiongLevel"); //护理等级
		nurseid = rs.getString("NurseID"); //管床护士ID
		nurse = rs.getString("Nurse"); //管床护士
		nursinggrpcode = rs.getString("NursingGrpCode"); //护理组代码
		nursionggrp = rs.getString("NursiongGrp"); //护理组
		instatus = rs.getString("InStatus"); //住院状态【0：入院(待入科)；1：在科；2：出科(待入科)；3：待出院；4：出院；5：结算】
		mrstatus = rs.getString("MrStatus"); //病历状态【i：正常；o：待归档；p：归档】
		dischargeway = rs.getString("DischargeWay"); //出院方式【SW：死亡；ZC：正常；ZY：转院】
		managetype = rs.getString("ManageType"); //处理类型（1-新入院 2-出院3-住院信息修改（包括转科、转病区、转床、转诊疗组、转护理组等） 4-退院（删除） 5-出院后召回）必填
		impflag = rs.getString("ImpFlag"); //接口是否处理（0-未处理 1-处理成功 2-处理失败）必填
		returndesc = rs.getString("ReturnDesc"); //反馈说明
	}

	/**
	 * Method makeCountItemSql.
	 * 生成已设置过值的属性为查询条件计算数据条数的sql语句
	 * @return String
	 */
	public String makeCountItemSql() {
		String sql = "select count(*) from InPatientInfo";
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
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "IPID" + ipidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(ipid, "'", "''"));
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
		if (!isnull(adminissionno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdminissionNo" + adminissionnoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(adminissionno, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiontimes)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionTimes" + admissiontimesOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiontimes, "'", "''"));
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
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Age" + ageOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(age, "'", "''"));
			par += temp;
		}
		if (!isnull(agedesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AgeDesc" + agedescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(agedesc, "'", "''"));
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
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(feetypename)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "FeeTypeName" + feetypenameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypename, "'", "''"));
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
		if (!isnull(admissionregistertime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionRegisterTime" + admissionregistertimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionregistertime, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWay" + admissionwayOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionway, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionpurpose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionPurpose" + admissionpurposeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionpurpose, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionhospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionHospital" + admissionhospitalOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionhospital, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiondeptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionDeptCode" + admissiondeptcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiondeptcode, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiondept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionDept" + admissiondeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiondept, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionwardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWardCode" + admissionwardcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionwardcode, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionward)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "AdmissionWard" + admissionwardOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionward, "'", "''"));
			par += temp;
		}
		if (!isnull(hospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Hospital" + hospitalOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(hospital, "'", "''"));
			par += temp;
		}
		if (!isnull(deptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DeptCode" + deptcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(deptcode, "'", "''"));
			par += temp;
		}
		if (!isnull(deptname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DeptName" + deptnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(deptname, "'", "''"));
			par += temp;
		}
		if (!isnull(wardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WardCode" + wardcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wardcode, "'", "''"));
			par += temp;
		}
		if (!isnull(wardname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "WardName" + wardnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wardname, "'", "''"));
			par += temp;
		}
		if (!isnull(dischargetime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DischargeTime" + dischargetimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dischargetime, "'", "''"));
			par += temp;
		}
		if (!isnull(bedno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BedNo" + bednoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedno, "'", "''"));
			par += temp;
		}
		if (!isnull(bedfeetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "BedFeeType" + bedfeetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedfeetype, "'", "''"));
			par += temp;
		}
		if (!isnull(room)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Room" + roomOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(room, "'", "''"));
			par += temp;
		}
		if (!isnull(stateofillness)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "StateOfIllness" + stateofillnessOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(stateofillness, "'", "''"));
			par += temp;
		}
		if (!isnull(doctorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DoctorID" + doctoridOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(doctorid, "'", "''"));
			par += temp;
		}
		if (!isnull(doctor)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Doctor" + doctorOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(doctor, "'", "''"));
			par += temp;
		}
		if (!isnull(medicalfrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MedicalFrpCode" + medicalfrpcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(medicalfrpcode, "'", "''"));
			par += temp;
		}
		if (!isnull(medicalgrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MedicalGrp" + medicalgrpOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(medicalgrp, "'", "''"));
			par += temp;
		}
		if (!isnull(nursionglevel)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursiongLevel" + nursionglevelOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursionglevel, "'", "''"));
			par += temp;
		}
		if (!isnull(nurseid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NurseID" + nurseidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nurseid, "'", "''"));
			par += temp;
		}
		if (!isnull(nurse)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "Nurse" + nurseOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nurse, "'", "''"));
			par += temp;
		}
		if (!isnull(nursinggrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursingGrpCode" + nursinggrpcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursinggrpcode, "'", "''"));
			par += temp;
		}
		if (!isnull(nursionggrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "NursiongGrp" + nursionggrpOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursionggrp, "'", "''"));
			par += temp;
		}
		if (!isnull(instatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "InStatus" + instatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(instatus, "'", "''"));
			par += temp;
		}
		if (!isnull(mrstatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "MrStatus" + mrstatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(mrstatus, "'", "''"));
			par += temp;
		}
		if (!isnull(dischargeway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = "DischargeWay" + dischargewayOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dischargeway, "'", "''"));
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
			tablerealias = "InPatientInfo";
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
		if (!isnull(ipid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".IPID" + ipidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(ipid, "'", "''"));
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
		if (!isnull(adminissionno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdminissionNo" + adminissionnoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(adminissionno, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiontimes)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionTimes" + admissiontimesOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiontimes, "'", "''"));
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
		if (!isnull(age)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Age" + ageOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(age, "'", "''"));
			par += temp;
		}
		if (!isnull(agedesc)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AgeDesc" + agedescOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(agedesc, "'", "''"));
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
		if (!isnull(feetypecode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FeeTypeCode" + feetypecodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypecode, "'", "''"));
			par += temp;
		}
		if (!isnull(feetypename)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".FeeTypeName" + feetypenameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(feetypename, "'", "''"));
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
		if (!isnull(admissionregistertime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionRegisterTime" + admissionregistertimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionregistertime, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionWay" + admissionwayOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionway, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionpurpose)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionPurpose" + admissionpurposeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionpurpose, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionhospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionHospital" + admissionhospitalOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionhospital, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiondeptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionDeptCode" + admissiondeptcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiondeptcode, "'", "''"));
			par += temp;
		}
		if (!isnull(admissiondept)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionDept" + admissiondeptOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissiondept, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionwardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionWardCode" + admissionwardcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionwardcode, "'", "''"));
			par += temp;
		}
		if (!isnull(admissionward)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".AdmissionWard" + admissionwardOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(admissionward, "'", "''"));
			par += temp;
		}
		if (!isnull(hospital)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Hospital" + hospitalOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(hospital, "'", "''"));
			par += temp;
		}
		if (!isnull(deptcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DeptCode" + deptcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(deptcode, "'", "''"));
			par += temp;
		}
		if (!isnull(deptname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DeptName" + deptnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(deptname, "'", "''"));
			par += temp;
		}
		if (!isnull(wardcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".WardCode" + wardcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wardcode, "'", "''"));
			par += temp;
		}
		if (!isnull(wardname)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".WardName" + wardnameOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(wardname, "'", "''"));
			par += temp;
		}
		if (!isnull(dischargetime)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DischargeTime" + dischargetimeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dischargetime, "'", "''"));
			par += temp;
		}
		if (!isnull(bedno)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BedNo" + bednoOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedno, "'", "''"));
			par += temp;
		}
		if (!isnull(bedfeetype)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".BedFeeType" + bedfeetypeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(bedfeetype, "'", "''"));
			par += temp;
		}
		if (!isnull(room)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Room" + roomOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(room, "'", "''"));
			par += temp;
		}
		if (!isnull(stateofillness)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".StateOfIllness" + stateofillnessOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(stateofillness, "'", "''"));
			par += temp;
		}
		if (!isnull(doctorid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DoctorID" + doctoridOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(doctorid, "'", "''"));
			par += temp;
		}
		if (!isnull(doctor)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Doctor" + doctorOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(doctor, "'", "''"));
			par += temp;
		}
		if (!isnull(medicalfrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".MedicalFrpCode" + medicalfrpcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(medicalfrpcode, "'", "''"));
			par += temp;
		}
		if (!isnull(medicalgrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".MedicalGrp" + medicalgrpOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(medicalgrp, "'", "''"));
			par += temp;
		}
		if (!isnull(nursionglevel)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NursiongLevel" + nursionglevelOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursionglevel, "'", "''"));
			par += temp;
		}
		if (!isnull(nurseid)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NurseID" + nurseidOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nurseid, "'", "''"));
			par += temp;
		}
		if (!isnull(nurse)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".Nurse" + nurseOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nurse, "'", "''"));
			par += temp;
		}
		if (!isnull(nursinggrpcode)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NursingGrpCode" + nursinggrpcodeOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursinggrpcode, "'", "''"));
			par += temp;
		}
		if (!isnull(nursionggrp)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".NursiongGrp" + nursionggrpOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(nursionggrp, "'", "''"));
			par += temp;
		}
		if (!isnull(instatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".InStatus" + instatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(instatus, "'", "''"));
			par += temp;
		}
		if (!isnull(mrstatus)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".MrStatus" + mrstatusOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(mrstatus, "'", "''"));
			par += temp;
		}
		if (!isnull(dischargeway)) {
			if (!isnull(par)) {
				par += " AND ";
			}
			temp = tablerealias+".DischargeWay" + dischargewayOper;
			temp = StringUtil.replace(temp, "[i]", StringUtil.replace(dischargeway, "'", "''"));
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
	 * Method buildInpatientinfo，静态方法.
	 * 将struct中的父类对象转成当前子类对象
	 * @param inpatientinfo 父类对象
	 * @return 子类对象
	 */
	public static Inpatientinfo buildInpatientinfo(com.haitaiinc.struct.Inpatientinfo inpatientinfo) {
		Inpatientinfo newInpatientinfo = new Inpatientinfo();
		newInpatientinfo.setRecordflow(inpatientinfo.getRecordflow());
		newInpatientinfo.setRecordflowOper(inpatientinfo.getRecordflowOper());
		newInpatientinfo.setIpid(inpatientinfo.getIpid());
		newInpatientinfo.setIpidOper(inpatientinfo.getIpidOper());
		newInpatientinfo.setPid(inpatientinfo.getPid());
		newInpatientinfo.setPidOper(inpatientinfo.getPidOper());
		newInpatientinfo.setAdminissionno(inpatientinfo.getAdminissionno());
		newInpatientinfo.setAdminissionnoOper(inpatientinfo.getAdminissionnoOper());
		newInpatientinfo.setAdmissiontimes(inpatientinfo.getAdmissiontimes());
		newInpatientinfo.setAdmissiontimesOper(inpatientinfo.getAdmissiontimesOper());
		newInpatientinfo.setPatientname(inpatientinfo.getPatientname());
		newInpatientinfo.setPatientnameOper(inpatientinfo.getPatientnameOper());
		newInpatientinfo.setSexcode(inpatientinfo.getSexcode());
		newInpatientinfo.setSexcodeOper(inpatientinfo.getSexcodeOper());
		newInpatientinfo.setSex(inpatientinfo.getSex());
		newInpatientinfo.setSexOper(inpatientinfo.getSexOper());
		newInpatientinfo.setAge(inpatientinfo.getAge());
		newInpatientinfo.setAgeOper(inpatientinfo.getAgeOper());
		newInpatientinfo.setAgedesc(inpatientinfo.getAgedesc());
		newInpatientinfo.setAgedescOper(inpatientinfo.getAgedescOper());
		newInpatientinfo.setMarriagestatuscode(inpatientinfo.getMarriagestatuscode());
		newInpatientinfo.setMarriagestatuscodeOper(inpatientinfo.getMarriagestatuscodeOper());
		newInpatientinfo.setMarriagestatus(inpatientinfo.getMarriagestatus());
		newInpatientinfo.setMarriagestatusOper(inpatientinfo.getMarriagestatusOper());
		newInpatientinfo.setFeetypecode(inpatientinfo.getFeetypecode());
		newInpatientinfo.setFeetypecodeOper(inpatientinfo.getFeetypecodeOper());
		newInpatientinfo.setFeetypename(inpatientinfo.getFeetypename());
		newInpatientinfo.setFeetypenameOper(inpatientinfo.getFeetypenameOper());
		newInpatientinfo.setPatientclass(inpatientinfo.getPatientclass());
		newInpatientinfo.setPatientclassOper(inpatientinfo.getPatientclassOper());
		newInpatientinfo.setAdmissionregistertime(inpatientinfo.getAdmissionregistertime());
		newInpatientinfo.setAdmissionregistertimeOper(inpatientinfo.getAdmissionregistertimeOper());
		newInpatientinfo.setAdmissionway(inpatientinfo.getAdmissionway());
		newInpatientinfo.setAdmissionwayOper(inpatientinfo.getAdmissionwayOper());
		newInpatientinfo.setAdmissionpurpose(inpatientinfo.getAdmissionpurpose());
		newInpatientinfo.setAdmissionpurposeOper(inpatientinfo.getAdmissionpurposeOper());
		newInpatientinfo.setAdmissionhospital(inpatientinfo.getAdmissionhospital());
		newInpatientinfo.setAdmissionhospitalOper(inpatientinfo.getAdmissionhospitalOper());
		newInpatientinfo.setAdmissiondeptcode(inpatientinfo.getAdmissiondeptcode());
		newInpatientinfo.setAdmissiondeptcodeOper(inpatientinfo.getAdmissiondeptcodeOper());
		newInpatientinfo.setAdmissiondept(inpatientinfo.getAdmissiondept());
		newInpatientinfo.setAdmissiondeptOper(inpatientinfo.getAdmissiondeptOper());
		newInpatientinfo.setAdmissionwardcode(inpatientinfo.getAdmissionwardcode());
		newInpatientinfo.setAdmissionwardcodeOper(inpatientinfo.getAdmissionwardcodeOper());
		newInpatientinfo.setAdmissionward(inpatientinfo.getAdmissionward());
		newInpatientinfo.setAdmissionwardOper(inpatientinfo.getAdmissionwardOper());
		newInpatientinfo.setHospital(inpatientinfo.getHospital());
		newInpatientinfo.setHospitalOper(inpatientinfo.getHospitalOper());
		newInpatientinfo.setDeptcode(inpatientinfo.getDeptcode());
		newInpatientinfo.setDeptcodeOper(inpatientinfo.getDeptcodeOper());
		newInpatientinfo.setDeptname(inpatientinfo.getDeptname());
		newInpatientinfo.setDeptnameOper(inpatientinfo.getDeptnameOper());
		newInpatientinfo.setWardcode(inpatientinfo.getWardcode());
		newInpatientinfo.setWardcodeOper(inpatientinfo.getWardcodeOper());
		newInpatientinfo.setWardname(inpatientinfo.getWardname());
		newInpatientinfo.setWardnameOper(inpatientinfo.getWardnameOper());
		newInpatientinfo.setDischargetime(inpatientinfo.getDischargetime());
		newInpatientinfo.setDischargetimeOper(inpatientinfo.getDischargetimeOper());
		newInpatientinfo.setBedno(inpatientinfo.getBedno());
		newInpatientinfo.setBednoOper(inpatientinfo.getBednoOper());
		newInpatientinfo.setBedfeetype(inpatientinfo.getBedfeetype());
		newInpatientinfo.setBedfeetypeOper(inpatientinfo.getBedfeetypeOper());
		newInpatientinfo.setRoom(inpatientinfo.getRoom());
		newInpatientinfo.setRoomOper(inpatientinfo.getRoomOper());
		newInpatientinfo.setStateofillness(inpatientinfo.getStateofillness());
		newInpatientinfo.setStateofillnessOper(inpatientinfo.getStateofillnessOper());
		newInpatientinfo.setDoctorid(inpatientinfo.getDoctorid());
		newInpatientinfo.setDoctoridOper(inpatientinfo.getDoctoridOper());
		newInpatientinfo.setDoctor(inpatientinfo.getDoctor());
		newInpatientinfo.setDoctorOper(inpatientinfo.getDoctorOper());
		newInpatientinfo.setMedicalfrpcode(inpatientinfo.getMedicalfrpcode());
		newInpatientinfo.setMedicalfrpcodeOper(inpatientinfo.getMedicalfrpcodeOper());
		newInpatientinfo.setMedicalgrp(inpatientinfo.getMedicalgrp());
		newInpatientinfo.setMedicalgrpOper(inpatientinfo.getMedicalgrpOper());
		newInpatientinfo.setNursionglevel(inpatientinfo.getNursionglevel());
		newInpatientinfo.setNursionglevelOper(inpatientinfo.getNursionglevelOper());
		newInpatientinfo.setNurseid(inpatientinfo.getNurseid());
		newInpatientinfo.setNurseidOper(inpatientinfo.getNurseidOper());
		newInpatientinfo.setNurse(inpatientinfo.getNurse());
		newInpatientinfo.setNurseOper(inpatientinfo.getNurseOper());
		newInpatientinfo.setNursinggrpcode(inpatientinfo.getNursinggrpcode());
		newInpatientinfo.setNursinggrpcodeOper(inpatientinfo.getNursinggrpcodeOper());
		newInpatientinfo.setNursionggrp(inpatientinfo.getNursionggrp());
		newInpatientinfo.setNursionggrpOper(inpatientinfo.getNursionggrpOper());
		newInpatientinfo.setInstatus(inpatientinfo.getInstatus());
		newInpatientinfo.setInstatusOper(inpatientinfo.getInstatusOper());
		newInpatientinfo.setMrstatus(inpatientinfo.getMrstatus());
		newInpatientinfo.setMrstatusOper(inpatientinfo.getMrstatusOper());
		newInpatientinfo.setDischargeway(inpatientinfo.getDischargeway());
		newInpatientinfo.setDischargewayOper(inpatientinfo.getDischargewayOper());
		newInpatientinfo.setManagetype(inpatientinfo.getManagetype());
		newInpatientinfo.setManagetypeOper(inpatientinfo.getManagetypeOper());
		newInpatientinfo.setImpflag(inpatientinfo.getImpflag());
		newInpatientinfo.setImpflagOper(inpatientinfo.getImpflagOper());
		newInpatientinfo.setReturndesc(inpatientinfo.getReturndesc());
		newInpatientinfo.setReturndescOper(inpatientinfo.getReturndescOper());
		newInpatientinfo.setOrderByStr(inpatientinfo.getOrderByStr());
		return newInpatientinfo;
	}
}
