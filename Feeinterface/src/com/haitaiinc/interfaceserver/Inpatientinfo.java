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
		pst.setString(++index, ipid); //����סԺ��ˮ�� ����
		pst.setString(++index, pid); //����ID
		pst.setString(++index, adminissionno); //סԺ��
		pst.setString(++index, admissiontimes); //סԺ����
		pst.setString(++index, patientname); //��������
		pst.setString(++index, sexcode); //�Ա����
		pst.setString(++index, sex); //�Ա�
		pst.setString(++index, age); //����
		pst.setString(++index, agedesc); //����˵��
		pst.setString(++index, marriagestatuscode); //����״������
		pst.setString(++index, marriagestatus); //����״��
		pst.setString(++index, feetypecode); //�ѱ����
		pst.setString(++index, feetypename); //�ѱ�
		pst.setString(++index, patientclass); //�������
		pst.setString(++index, admissionregistertime); //��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss��
		pst.setString(++index, admissionway); //��Ժ��ʽ
		pst.setString(++index, admissionpurpose); //��ԺĿ��
		pst.setString(++index, admissionhospital); //��ԺʱԺ��
		pst.setString(++index, admissiondeptcode); //��Ժ���Ҵ���
		pst.setString(++index, admissiondept); //��Ժ����
		pst.setString(++index, admissionwardcode); //��Ժ��������
		pst.setString(++index, admissionward); //��Ժ����
		pst.setString(++index, hospital); //��ǰԺ��
		pst.setString(++index, deptcode); //��ǰ���Ҵ���
		pst.setString(++index, deptname); //��ǰ��������
		pst.setString(++index, wardcode); //��ǰ��������
		pst.setString(++index, wardname); //��ǰ��������
		pst.setString(++index, dischargetime); //��Ժʱ�䣨��ʽ��yyyyMMddHHmmss��
		pst.setString(++index, bedno); //����
		pst.setString(++index, bedfeetype); //��λ������
		pst.setString(++index, room); //����
		pst.setString(++index, stateofillness); //����
		pst.setString(++index, doctorid); //�ܴ�ҽ��ID
		pst.setString(++index, doctor); //�ܴ�ҽ��
		pst.setString(++index, medicalfrpcode); //���������
		pst.setString(++index, medicalgrp); //������
		pst.setString(++index, nursionglevel); //����ȼ�
		pst.setString(++index, nurseid); //�ܴ���ʿID
		pst.setString(++index, nurse); //�ܴ���ʿ
		pst.setString(++index, nursinggrpcode); //���������
		pst.setString(++index, nursionggrp); //������
		pst.setString(++index, instatus); //סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿
		pst.setString(++index, mrstatus); //����״̬��i��������o�����鵵��p���鵵��
		pst.setString(++index, dischargeway); //��Ժ��ʽ��SW��������ZC��������ZY��תԺ��
		pst.setString(++index, managetype); //�������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ�����
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
		pst.setString(++index, ipid); //����סԺ��ˮ�� ����
		pst.setString(++index, pid); //����ID
		pst.setString(++index, adminissionno); //סԺ��
		pst.setString(++index, admissiontimes); //סԺ����
		pst.setString(++index, patientname); //��������
		pst.setString(++index, sexcode); //�Ա����
		pst.setString(++index, sex); //�Ա�
		pst.setString(++index, age); //����
		pst.setString(++index, agedesc); //����˵��
		pst.setString(++index, marriagestatuscode); //����״������
		pst.setString(++index, marriagestatus); //����״��
		pst.setString(++index, feetypecode); //�ѱ����
		pst.setString(++index, feetypename); //�ѱ�
		pst.setString(++index, patientclass); //�������
		pst.setString(++index, admissionregistertime); //��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss��
		pst.setString(++index, admissionway); //��Ժ��ʽ
		pst.setString(++index, admissionpurpose); //��ԺĿ��
		pst.setString(++index, admissionhospital); //��ԺʱԺ��
		pst.setString(++index, admissiondeptcode); //��Ժ���Ҵ���
		pst.setString(++index, admissiondept); //��Ժ����
		pst.setString(++index, admissionwardcode); //��Ժ��������
		pst.setString(++index, admissionward); //��Ժ����
		pst.setString(++index, hospital); //��ǰԺ��
		pst.setString(++index, deptcode); //��ǰ���Ҵ���
		pst.setString(++index, deptname); //��ǰ��������
		pst.setString(++index, wardcode); //��ǰ��������
		pst.setString(++index, wardname); //��ǰ��������
		pst.setString(++index, dischargetime); //��Ժʱ�䣨��ʽ��yyyyMMddHHmmss��
		pst.setString(++index, bedno); //����
		pst.setString(++index, bedfeetype); //��λ������
		pst.setString(++index, room); //����
		pst.setString(++index, stateofillness); //����
		pst.setString(++index, doctorid); //�ܴ�ҽ��ID
		pst.setString(++index, doctor); //�ܴ�ҽ��
		pst.setString(++index, medicalfrpcode); //���������
		pst.setString(++index, medicalgrp); //������
		pst.setString(++index, nursionglevel); //����ȼ�
		pst.setString(++index, nurseid); //�ܴ���ʿID
		pst.setString(++index, nurse); //�ܴ���ʿ
		pst.setString(++index, nursinggrpcode); //���������
		pst.setString(++index, nursionggrp); //������
		pst.setString(++index, instatus); //סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿
		pst.setString(++index, mrstatus); //����״̬��i��������o�����鵵��p���鵵��
		pst.setString(++index, dischargeway); //��Ժ��ʽ��SW��������ZC��������ZY��תԺ��
		pst.setString(++index, managetype); //�������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ�����
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
	 * ��ʹ��SELECT�õ��Ľ�������ֵ������ǰ����Ķ�Ӧ������
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchInpatientinfo(ResultSet rs) throws SQLException {
		recordflow = rs.getString("RecordFlow"); //��¼��ˮ��	key
		ipid = rs.getString("IPID"); //����סԺ��ˮ�� ����
		pid = rs.getString("PID"); //����ID
		adminissionno = rs.getString("AdminissionNo"); //סԺ��
		admissiontimes = rs.getString("AdmissionTimes"); //סԺ����
		patientname = rs.getString("PatientName"); //��������
		sexcode = rs.getString("SexCode"); //�Ա����
		sex = rs.getString("Sex"); //�Ա�
		age = rs.getString("Age"); //����
		agedesc = rs.getString("AgeDesc"); //����˵��
		marriagestatuscode = rs.getString("MarriageStatusCode"); //����״������
		marriagestatus = rs.getString("MarriageStatus"); //����״��
		feetypecode = rs.getString("FeeTypeCode"); //�ѱ����
		feetypename = rs.getString("FeeTypeName"); //�ѱ�
		patientclass = rs.getString("PatientClass"); //�������
		admissionregistertime = rs.getString("AdmissionRegisterTime"); //��Ժ�Ǽ�ʱ�䣨��ʽ��yyyyMMddHHmmss��
		admissiontime = rs.getString("AdmissionTime"); //���ʱ�䣨��ʽ��yyyyMMddHHmmss��
		admissionway = rs.getString("AdmissionWay"); //��Ժ��ʽ
		admissionpurpose = rs.getString("AdmissionPurpose"); //��ԺĿ��
		admissionhospital = rs.getString("AdmissionHospital"); //��ԺʱԺ��
		admissiondeptcode = rs.getString("AdmissionDeptCode"); //��Ժ���Ҵ���
		admissiondept = rs.getString("AdmissionDept"); //��Ժ����
		admissionwardcode = rs.getString("AdmissionWardCode"); //��Ժ��������
		admissionward = rs.getString("AdmissionWard"); //��Ժ����
		hospital = rs.getString("Hospital"); //��ǰԺ��
		deptcode = rs.getString("DeptCode"); //��ǰ���Ҵ���
		deptname = rs.getString("DeptName"); //��ǰ��������
		wardcode = rs.getString("WardCode"); //��ǰ��������
		wardname = rs.getString("WardName"); //��ǰ��������
		dischargetime = rs.getString("DischargeTime"); //��Ժʱ�䣨��ʽ��yyyyMMddHHmmss��
		bedno = rs.getString("BedNo"); //����
		bedfeetype = rs.getString("BedFeeType"); //��λ������
		room = rs.getString("Room"); //����
		stateofillness = rs.getString("StateOfIllness"); //����
		doctorid = rs.getString("DoctorID"); //�ܴ�ҽ��ID
		doctor = rs.getString("Doctor"); //�ܴ�ҽ��
		medicalfrpcode = rs.getString("MedicalFrpCode"); //���������
		medicalgrp = rs.getString("MedicalGrp"); //������
		nursionglevel = rs.getString("NursiongLevel"); //����ȼ�
		nurseid = rs.getString("NurseID"); //�ܴ���ʿID
		nurse = rs.getString("Nurse"); //�ܴ���ʿ
		nursinggrpcode = rs.getString("NursingGrpCode"); //���������
		nursionggrp = rs.getString("NursiongGrp"); //������
		instatus = rs.getString("InStatus"); //סԺ״̬��0����Ժ(�����)��1���ڿƣ�2������(�����)��3������Ժ��4����Ժ��5�����㡿
		mrstatus = rs.getString("MrStatus"); //����״̬��i��������o�����鵵��p���鵵��
		dischargeway = rs.getString("DischargeWay"); //��Ժ��ʽ��SW��������ZC��������ZY��תԺ��
		managetype = rs.getString("ManageType"); //�������ͣ�1-����Ժ 2-��Ժ3-סԺ��Ϣ�޸ģ�����ת�ơ�ת������ת����ת�����顢ת������ȣ� 4-��Ժ��ɾ���� 5-��Ժ���ٻأ�����
		impflag = rs.getString("ImpFlag"); //�ӿ��Ƿ���0-δ���� 1-����ɹ� 2-����ʧ�ܣ�����
		returndesc = rs.getString("ReturnDesc"); //����˵��
	}

	/**
	 * Method makeCountItemSql.
	 * ���������ù�ֵ������Ϊ��ѯ������������������sql���
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
	 * ���������ù�ֵ������Ϊ��ѯ������sql��䣬ֻ��WHERE���棬������SELECT
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
	 * Method buildInpatientinfo����̬����.
	 * ��struct�еĸ������ת�ɵ�ǰ�������
	 * @param inpatientinfo �������
	 * @return �������
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
