package com.haitaiinc.interfaceserver;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InFirstFee extends com.haitaiinc.struct.InFirstFee {
	
	public static final String INSERT ="insert into IN_FIRST_FEE (IN_PATIENT_FLOW,MR_ID,TOTAL_VALUE,ORDINARY_MEDICAL_SERVICE_FEE,ORDINARY_TREAT_OPERATE_FEE,NURSE_FEE,OTHERFEE1,MEDICAL_DIAGNOSE_FEE,LAB_FEE,FILE_FEE,CLINICAL_DIAGNOSE_FEE,NOT_OPERATION_FEE,CLINICAL_PHYSICAL_FEE,OPERATION_TREAT_FEE,ANAESTHESIA_FEI,OPERATION_FEE,KANGFU_FEE,WEST_MEDICINE_FEE,KJYW_FEE,CHINESE_MEDICINE_FEE,ZCYF_FEE,BLOOD_FEE,BDBLZP_FEE,QDBLZP_FEE,NXYZLZP_FEE,XBYZIL_FEE,CHECK_MEDICAL_FEE,TREAT_USE_MEDICAL_FEE,OPEARATION_USE_FEE,OHTER_FEE2,SELF_PAY_FEE,DIALECTICAL_DISCUSS_FEE,DIALECTICAL_HUIZHEN_FEE,CHINESE_DIAGNOSE_FEE,CHINESE_TREAT_FEE,CHINESE_OUTSIDETREAT_FEE,CHINESE_BONE_HURT,ACUPUNCTURE_FEE,CHINESE_TUINA_FEE,CHINESE_GCTREAT_FEE,CHINESE_SPECIAL_FEE,CHINESE_OTHER_FEE,CHINESE_TSDPJG_FEE,DIALECTICAL_DIAET,MEDICAL_AGENCY_FEE)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String UPDATE ="update IN_FIRST_FEE  set MR_ID=?,TOTAL_VALUE=?,ORDINARY_MEDICAL_SERVICE_FEE=?,ORDINARY_TREAT_OPERATE_FEE=?,NURSE_FEE=?,OTHERFEE1=?,MEDICAL_DIAGNOSE_FEE=?,LAB_FEE=?,FILE_FEE=?,CLINICAL_DIAGNOSE_FEE=?,NOT_OPERATION_FEE=?,CLINICAL_PHYSICAL_FEE=?,OPERATION_TREAT_FEE=?,ANAESTHESIA_FEI=?,OPERATION_FEE=?,KANGFU_FEE=?,WEST_MEDICINE_FEE=?,KJYW_FEE=?,CHINESE_MEDICINE_FEE=?,ZCYF_FEE=?,BLOOD_FEE=?,BDBLZP_FEE=?,QDBLZP_FEE=?,NXYZLZP_FEE=?,XBYZIL_FEE=?,CHECK_MEDICAL_FEE=?,TREAT_USE_MEDICAL_FEE=?,OPEARATION_USE_FEE=?,OHTER_FEE2=?,SELF_PAY_FEE=?,DIALECTICAL_DISCUSS_FEE=?,DIALECTICAL_HUIZHEN_FEE=?,CHINESE_DIAGNOSE_FEE=?,CHINESE_TREAT_FEE=?,CHINESE_OUTSIDETREAT_FEE=?,CHINESE_BONE_HURT=?,ACUPUNCTURE_FEE=?,CHINESE_TUINA_FEE=?,CHINESE_GCTREAT_FEE=?,CHINESE_SPECIAL_FEE=?,CHINESE_OTHER_FEE=?,CHINESE_TSDPJG_FEE=?,DIALECTICAL_DIAET=?,MEDICAL_AGENCY_FEE=? where  IN_PATIENT_FLOW=?";
	public static final String SELECT ="select FLOWID,IN_PATIENT_FLOW,MR_ID,TOTAL_VALUE,ORDINARY_MEDICAL_SERVICE_FEE,ORDINARY_TREAT_OPERATE_FEE,NURSE_FEE,OTHERFEE1,MEDICAL_DIAGNOSE_FEE,LAB_FEE,FILE_FEE,CLINICAL_DIAGNOSE_FEE,NOT_OPERATION_FEE,CLINICAL_PHYSICAL_FEE,OPERATION_TREAT_FEE,ANAESTHESIA_FEI,OPERATION_FEE,KANGFU_FEE,WEST_MEDICINE_FEE,KJYW_FEE,CHINESE_MEDICINE_FEE,ZCYF_FEE,BLOOD_FEE,BDBLZP_FEE,QDBLZP_FEE,NXYZLZP_FEE,XBYZIL_FEE,CHECK_MEDICAL_FEE,TREAT_USE_MEDICAL_FEE,OPEARATION_USE_FEE,OHTER_FEE2,SELF_PAY_FEE,DIALECTICAL_DISCUSS_FEE,DIALECTICAL_HUIZHEN_FEE,CHINESE_DIAGNOSE_FEE,CHINESE_TREAT_FEE,CHINESE_OUTSIDETREAT_FEE,CHINESE_BONE_HURT,ACUPUNCTURE_FEE,CHINESE_TUINA_FEE,CHINESE_GCTREAT_FEE,CHINESE_SPECIAL_FEE,CHINESE_OTHER_FEE,CHINESE_TSDPJG_FEE,DIALECTICAL_DIAET,MEDICAL_AGENCY_FEE,CASE_TYPE,INSERTFLAG from IN_FIRST_FEE ";
	public static final String DELETE="delete from IN_FIRST_PAGE_FEE where IN_PATIENT_FLOW=? ";
	
	
	public void fetchInFirstFee(ResultSet rs)throws Exception{
		flowID = rs.getInt("FLOWID");
		inPatientFlow = rs.getString("IN_PATIENT_FLOW");
		mrID = rs.getString("MR_ID");
		totalValue = rs.getString("TOTAL_VALUE");
		ordinaryMedicalServiceFee = rs.getString("ORDINARY_MEDICAL_SERVICE_FEE");
		ordinaryTreatOperateFee = rs.getString("ORDINARY_TREAT_OPERATE_FEE");
		nurseFee = rs.getString("NURSE_FEE");
		otherFee1 = rs.getString("OTHERFEE1");
		medicalDiagnoseFee = rs.getString("MEDICAL_DIAGNOSE_FEE");
		labFee = rs.getString("LAB_FEE");
		fileFee = rs.getString("FILE_FEE");
		clinicalDiagnoseFee = rs.getString("CLINICAL_DIAGNOSE_FEE");
		notOperationFee = rs.getString("NOT_OPERATION_FEE");
		clinicalPhysicalFee = rs.getString("CLINICAL_PHYSICAL_FEE");
		operationTreatFee = rs.getString("OPERATION_TREAT_FEE");
		anaesthesiaFei = rs.getString("ANAESTHESIA_FEI");
		operationFee = rs.getString("OPERATION_FEE");
		kangfuFee = rs.getString("KANGFU_FEE");
		westMedicineFee = rs.getString("WEST_MEDICINE_FEE");
		kjywFee = rs.getString("KJYW_FEE");
		chineseMedicineFee = rs.getString("CHINESE_MEDICINE_FEE");
		zcyfFee = rs.getString("ZCYF_FEE");
		bloodFee = rs.getString("BLOOD_FEE");
		bdblzpFee = rs.getString("BDBLZP_FEE");
		qdblzpFee = rs.getString("QDBLZP_FEE");
		nxyzlzpFee = rs.getString("NXYZLZP_FEE");
		xbyzilFee = rs.getString("XBYZIL_FEE");
		checkMedicalFee = rs.getString("CHECK_MEDICAL_FEE");
		treatUseMedicalFee = rs.getString("TREAT_USE_MEDICAL_FEE");
		operationUseFee = rs.getString("OPEARATION_USE_FEE");
		otherFee2 = rs.getString("OHTER_FEE2");
		selfPayFee = rs.getString("SELF_PAY_FEE");
		dialecticalDiscussFee = rs.getString("DIALECTICAL_DISCUSS_FEE");
		dialecticalHuizhenFee = rs.getString("DIALECTICAL_HUIZHEN_FEE");
		chineseDiagnoseFee = rs.getString("CHINESE_DIAGNOSE_FEE");
		chineseTreatFee = rs.getString("CHINESE_TREAT_FEE");
		chineseOutsidetreatFee = rs.getString("CHINESE_OUTSIDETREAT_FEE");
		chineseBoneHurt = rs.getString("CHINESE_BONE_HURT");
		acupunctureFee = rs.getString("ACUPUNCTURE_FEE");
		chineseTuinaFee = rs.getString("CHINESE_TUINA_FEE");
		chineseGctreatFee = rs.getString("CHINESE_GCTREAT_FEE");
		chineseSpecialFee = rs.getString("CHINESE_SPECIAL_FEE");
		chineseOtherFee = rs.getString("CHINESE_OTHER_FEE");
		chineseTsdpjgFee = rs.getString("CHINESE_TSDPJG_FEE");
		dialecticalDiaet = rs.getString("DIALECTICAL_DIAET");
		medicalAgencyFee = rs.getString("MEDICAL_AGENCY_FEE");
		caseType = rs.getString("CASE_TYPE");
		insertFlag = rs.getString("INSERTFLAG");

		
	}
	
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
		pst.setString(++index, inPatientFlow); 
		pst.setString(++index, mrID); 
		pst.setString(++index, totalValue);
		pst.setString(++index, ordinaryMedicalServiceFee); 
		pst.setString(++index, ordinaryTreatOperateFee);
		pst.setString(++index, nurseFee);
		pst.setString(++index, otherFee1);
		pst.setString(++index, medicalDiagnoseFee);
		pst.setString(++index, labFee);
		pst.setString(++index, fileFee);
		pst.setString(++index, clinicalDiagnoseFee);
		pst.setString(++index, notOperationFee);
		pst.setString(++index, clinicalPhysicalFee);
		pst.setString(++index, operationTreatFee);
		pst.setString(++index, anaesthesiaFei);
		pst.setString(++index, operationFee);
		pst.setString(++index, kangfuFee);
		pst.setString(++index, westMedicineFee);
		pst.setString(++index, kjywFee);
		pst.setString(++index, chineseMedicineFee);
		pst.setString(++index, zcyfFee);
		pst.setString(++index, bloodFee);
		pst.setString(++index, bdblzpFee);
		pst.setString(++index, qdblzpFee);
		pst.setString(++index, nxyzlzpFee);
		pst.setString(++index, xbyzilFee);
		pst.setString(++index, checkMedicalFee);
		pst.setString(++index, treatUseMedicalFee);
		pst.setString(++index, operationUseFee);
		pst.setString(++index, otherFee2);
		pst.setString(++index, selfPayFee);
		pst.setString(++index, dialecticalDiscussFee);
		pst.setString(++index, dialecticalHuizhenFee);
		pst.setString(++index, chineseDiagnoseFee);
		pst.setString(++index, chineseTreatFee);
		pst.setString(++index, chineseOutsidetreatFee);
		pst.setString(++index, chineseBoneHurt);
		pst.setString(++index, acupunctureFee);
		pst.setString(++index, chineseTuinaFee);
		pst.setString(++index, chineseGctreatFee);
		pst.setString(++index, chineseSpecialFee);
		pst.setString(++index, chineseOtherFee);
		pst.setString(++index, chineseTsdpjgFee);
		pst.setString(++index, dialecticalDiaet);
		pst.setString(++index, medicalAgencyFee);
		
		return pst;
	}
	
	/**
	 * Method makeUpdSt.
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用UPDATE预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		
		
		pst.setString(++index, mrID); 
		pst.setString(++index, totalValue);
		pst.setString(++index, ordinaryMedicalServiceFee); 
		pst.setString(++index, ordinaryTreatOperateFee);
		pst.setString(++index, nurseFee);
		pst.setString(++index, otherFee1);
		pst.setString(++index, medicalDiagnoseFee);
		pst.setString(++index, labFee);
		pst.setString(++index, fileFee);
		pst.setString(++index, clinicalDiagnoseFee);
		pst.setString(++index, notOperationFee);
		pst.setString(++index, clinicalPhysicalFee);
		pst.setString(++index, operationTreatFee);
		pst.setString(++index, anaesthesiaFei);
		pst.setString(++index, operationFee);
		pst.setString(++index, kangfuFee);
		pst.setString(++index, westMedicineFee);
		pst.setString(++index, kjywFee);
		pst.setString(++index, chineseMedicineFee);
		pst.setString(++index, zcyfFee);
		pst.setString(++index, bloodFee);
		pst.setString(++index, bdblzpFee);
		pst.setString(++index, qdblzpFee);
		pst.setString(++index, nxyzlzpFee);
		pst.setString(++index, xbyzilFee);
		pst.setString(++index, checkMedicalFee);
		pst.setString(++index, treatUseMedicalFee);
		pst.setString(++index, operationUseFee);
		pst.setString(++index, otherFee2);
		pst.setString(++index, selfPayFee);
		pst.setString(++index, dialecticalDiscussFee);
		pst.setString(++index, dialecticalHuizhenFee);
		pst.setString(++index, chineseDiagnoseFee);
		pst.setString(++index, chineseTreatFee);
		pst.setString(++index, chineseOutsidetreatFee);
		pst.setString(++index, chineseBoneHurt);
		pst.setString(++index, acupunctureFee);
		pst.setString(++index, chineseTuinaFee);
		pst.setString(++index, chineseGctreatFee);
		pst.setString(++index, chineseSpecialFee);
		pst.setString(++index, chineseOtherFee);
		pst.setString(++index, chineseTsdpjgFee);
		pst.setString(++index, dialecticalDiaet);
		pst.setString(++index, medicalAgencyFee);
		pst.setString(++index, inPatientFlow); 
		return pst;
	}
	/**
	 * 删除
	 * @param pst
	 * @return
	 * @throws SQLException
	 */
	public PreparedStatement makeDelSt(PreparedStatement pst)
	throws SQLException {
		int index = 0;
		pst.setString(++index, inPatientFlow);
		
		return pst;
	}

	
	public String makeUpdate(){
		String sql="update IN_FIRST_FEE   set ";
		if(mrID!=null||!mrID.equals("")){
			sql+=" MR_ID='"+mrID+"',";		
		}
		if(totalValue!=null||!totalValue.equals("")){
			sql+=" TOTAL_VALUE='"+totalValue+"',";		
		}
		if(ordinaryMedicalServiceFee!=null||!ordinaryMedicalServiceFee.equals("")){
			sql+=" ORDINARY_MEDICAL_SERVICE_FEE='"+ordinaryMedicalServiceFee+"',";		
		}
		if(ordinaryTreatOperateFee!=null||!ordinaryTreatOperateFee.equals("")){
			sql+=" ORDINARY_TREAT_OPERATE_FEE='"+ordinaryTreatOperateFee+"',";		
		}
		if(nurseFee!=null||!nurseFee.equals("")){
			sql+=" NURSE_FEE='"+nurseFee+"',";		
		}
		if(otherFee1!=null||!otherFee1.equals("")){
			sql+=" OTHERFEE1='"+otherFee1+"',";		
		}
		if(medicalDiagnoseFee!=null||!medicalDiagnoseFee.equals("")){
			sql+=" MEDICAL_DIAGNOSE_FEE='"+medicalDiagnoseFee+"',";		
		}
		if(labFee!=null||!labFee.equals("")){
			sql+=" LAB_FEE='"+labFee+"',";		
		}
		if(fileFee!=null||!fileFee.equals("")){
			sql+=" FILE_FEE='"+fileFee+"',";		
		}
		if(clinicalDiagnoseFee!=null||!clinicalDiagnoseFee.equals("")){
			sql+=" CLINICAL_DIAGNOSE_FEE='"+clinicalDiagnoseFee+"',";		
		}
		if(notOperationFee!=null||!notOperationFee.equals("")){
			sql+=" NOT_OPERATION_FEE='"+notOperationFee+"',";		
		}
		if(clinicalPhysicalFee!=null||!clinicalPhysicalFee.equals("")){
			sql+=" CLINICAL_PHYSICAL_FEE='"+clinicalPhysicalFee+"',";		
		}
		if(operationTreatFee!=null||!operationTreatFee.equals("")){
			sql+=" OPERATION_TREAT_FEE='"+operationTreatFee+"',";		
		}
		if(anaesthesiaFei!=null||!anaesthesiaFei.equals("")){
			sql+=" ANAESTHESIA_FEI='"+anaesthesiaFei+"',";		
		}
		if(operationFee!=null||!operationFee.equals("")){
			sql+=" OPERATION_FEE='"+operationFee+"',";		
		}
		if(kangfuFee!=null||!kangfuFee.equals("")){
			sql+=" KANGFU_FEE='"+kangfuFee+"',";		
		}
		if(westMedicineFee!=null||!westMedicineFee.equals("")){
			sql+=" WEST_MEDICINE_FEE='"+westMedicineFee+"',";		
		}
		if(kjywFee!=null||!kjywFee.equals("")){
			sql+=" KJYW_FEE='"+kjywFee+"',";		
		}
		if(chineseMedicineFee!=null||!chineseMedicineFee.equals("")){
			sql+=" CHINESE_MEDICINE_FEE='"+chineseMedicineFee+"',";		
		}
		if(zcyfFee!=null||!zcyfFee.equals("")){
			sql+=" ZCYF_FEE='"+zcyfFee+"',";		
		}
		if(bloodFee!=null||!bloodFee.equals("")){
			sql+=" BLOOD_FEE='"+bloodFee+"',";		
		}
		if(bdblzpFee!=null||!bdblzpFee.equals("")){
			sql+=" BDBLZP_FEE='"+bdblzpFee+"',";		
		}
		if(qdblzpFee!=null||!qdblzpFee.equals("")){
			sql+=" QDBLZP_FEE='"+qdblzpFee+"',";		
		}
		if(nxyzlzpFee!=null||!nxyzlzpFee.equals("")){
			sql+=" NXYZLZP_FEE='"+nxyzlzpFee+"',";		
		}
		if(xbyzilFee!=null||!xbyzilFee.equals("")){
			sql+=" XBYZIL_FEE='"+xbyzilFee+"',";		
		}
		if(checkMedicalFee!=null||!checkMedicalFee.equals("")){
			sql+=" CHECK_MEDICAL_FEE='"+checkMedicalFee+"',";		
		}
		if(treatUseMedicalFee!=null||!treatUseMedicalFee.equals("")){
			sql+=" TREAT_USE_MEDICAL_FEE='"+treatUseMedicalFee+"',";		
		}
		if(operationUseFee!=null||!operationUseFee.equals("")){
			sql+=" OPEARATION_USE_FEE='"+operationUseFee+"',";		
		}
		if(otherFee2!=null||!otherFee2.equals("")){
			sql+=" OHTER_FEE2='"+otherFee2+"',";		
		}
		if(selfPayFee!=null||!selfPayFee.equals("")){
			sql+=" SELF_PAY_FEE='"+selfPayFee+"',";		
		}
		if(dialecticalDiscussFee!=null||!dialecticalDiscussFee.equals("")){
			sql+=" DIALECTICAL_DISCUSS_FEE='"+dialecticalDiscussFee+"',";		
		}
		if(dialecticalHuizhenFee!=null||!dialecticalHuizhenFee.equals("")){
			sql+=" DIALECTICAL_HUIZHEN_FEE='"+dialecticalHuizhenFee+"',";		
		}
		if(chineseDiagnoseFee!=null||!chineseDiagnoseFee.equals("")){
			sql+=" CHINESE_DIAGNOSE_FEE='"+chineseDiagnoseFee+"',";		
		}
		if(chineseTreatFee!=null||!chineseTreatFee.equals("")){
			sql+=" CHINESE_TREAT_FEE='"+chineseTreatFee+"',";		
		}
		if(chineseOutsidetreatFee!=null||!chineseOutsidetreatFee.equals("")){
			sql+=" CHINESE_OUTSIDETREAT_FEE='"+chineseOutsidetreatFee+"',";		
		}
		if(chineseBoneHurt!=null||!chineseBoneHurt.equals("")){
			sql+=" CHINESE_BONE_HURT='"+chineseBoneHurt+"',";		
		}
		if(acupunctureFee!=null||!acupunctureFee.equals("")){
			sql+=" ACUPUNCTURE_FEE='"+acupunctureFee+"',";		
		}
		if(chineseTuinaFee!=null||!chineseTuinaFee.equals("")){
			sql+=" CHINESE_TUINA_FEE='"+chineseTuinaFee+"',";		
		}
		if(chineseGctreatFee!=null||!chineseGctreatFee.equals("")){
			sql+=" CHINESE_GCTREAT_FEE='"+chineseGctreatFee+"',";		
		}
		if(chineseSpecialFee!=null||!chineseSpecialFee.equals("")){
			sql+=" CHINESE_SPECIAL_FEE='"+chineseSpecialFee+"',";		
		}
		if(chineseOtherFee!=null||!chineseOtherFee.equals("")){
			sql+=" CHINESE_OTHER_FEE='"+chineseOtherFee+"',";		
		}
		if(chineseTsdpjgFee!=null||!chineseTsdpjgFee.equals("")){
			sql+=" CHINESE_TSDPJG_FEE='"+chineseTsdpjgFee+"',";		
		}
		if(dialecticalDiaet!=null||!dialecticalDiaet.equals("")){
			sql+=" DIALECTICAL_DIAET='"+dialecticalDiaet+"',";		
		}
		if(medicalAgencyFee!=null||!medicalAgencyFee.equals("")){
			sql+=" MEDICAL_AGENCY_FEE='"+medicalAgencyFee+"',";		
		}

		sql=sql.substring(0,sql.length()-1);
		sql+=" where IN_PATIENT_FLOW='"+inPatientFlow+"'";
		
		return sql;
	}

}
