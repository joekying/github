package com.haitaiinc.struct;

public class InFirstFee {

	protected Integer flowID;//记录流水号PK（数据库自动生成）
	protected String inPatientFlow;//病人流水号  
	protected String mrID;//病历号 
	protected String totalValue;//费用总
	protected String ordinaryMedicalServiceFee;//一般医疗服务费
	protected String ordinaryTreatOperateFee;//一般治疗操作费
	protected String nurseFee;//护理费
	protected String otherFee1;//其他费用(综合医疗服务费里面的)
	protected String medicalDiagnoseFee;//病理诊断费
	protected String labFee;//实验室诊断费
	protected String fileFee;//影像学诊断费
	protected String clinicalDiagnoseFee;//临床诊断项目费
	protected String notOperationFee;//非手术治疗项目费
	protected String clinicalPhysicalFee;//临床物理治疗费
	protected String operationTreatFee;//手术治疗费
	protected String anaesthesiaFei;//麻醉费
	protected String operationFee;//手术费
	protected String kangfuFee;//康复费
	protected String westMedicineFee;//西药费
	protected String kjywFee;//抗菌药物类
	protected String chineseMedicineFee;//中成药费
	protected String zcyfFee;//中草药费
	protected String bloodFee;//血费
	protected String bdblzpFee;//白蛋白类制品费
	protected String qdblzpFee;//球蛋白类制品费
	protected String nxyzlzpFee;//凝血因子类制品费
	protected String xbyzilFee;//细胞因子类制品费
	protected String checkMedicalFee;//检查用一次性医用材料费
	protected String treatUseMedicalFee;//治疗用一次性医用材料费
	protected String operationUseFee;//手术用一次性医用材料费
	protected String otherFee2;//其他类里面的其他费用
	protected String selfPayFee;//自付费用
	protected String dialecticalDiscussFee;//中医辨证论治费
	protected String dialecticalHuizhenFee;//中医辨证论治会诊费
	protected String chineseDiagnoseFee;//中医诊断
	protected String chineseTreatFee;//中医治疗
	protected String chineseOutsidetreatFee;//中医外治
	protected String chineseBoneHurt;//中医骨伤
	protected String acupunctureFee;//针刺与灸法
	protected String chineseTuinaFee;//中医推拿治疗
	protected String chineseGctreatFee;//中医肛肠治疗
	protected String chineseSpecialFee;//中医特殊治疗
	protected String chineseOtherFee;//中医其他
	protected String chineseTsdpjgFee;//中药特殊调配加工
	protected String dialecticalDiaet;//辨证施膳
	protected String medicalAgencyFee;//医疗机构中药制剂费
	protected String caseType;//处理标志
	protected String insertFlag; //插入/修改标志，1－新增，2－修改
	public Integer getFlowID() {
		return flowID;
	}
	public void setFlowID(Integer flowID) {
		this.flowID = flowID;
	}
	public String getInPatientFlow() {
		return inPatientFlow;
	}
	public void setInPatientFlow(String inPatientFlow) {
		this.inPatientFlow = inPatientFlow;
	}
	public String getMrID() {
		return mrID;
	}
	public void setMrID(String mrID) {
		this.mrID = mrID;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
	public String getOrdinaryMedicalServiceFee() {
		return ordinaryMedicalServiceFee;
	}
	public void setOrdinaryMedicalServiceFee(String ordinaryMedicalServiceFee) {
		this.ordinaryMedicalServiceFee = ordinaryMedicalServiceFee;
	}
	public String getOrdinaryTreatOperateFee() {
		return ordinaryTreatOperateFee;
	}
	public void setOrdinaryTreatOperateFee(String ordinaryTreatOperateFee) {
		this.ordinaryTreatOperateFee = ordinaryTreatOperateFee;
	}
	public String getNurseFee() {
		return nurseFee;
	}
	public void setNurseFee(String nurseFee) {
		this.nurseFee = nurseFee;
	}
	public String getOtherFee1() {
		return otherFee1;
	}
	public void setOtherFee1(String otherFee1) {
		this.otherFee1 = otherFee1;
	}
	public String getMedicalDiagnoseFee() {
		return medicalDiagnoseFee;
	}
	public void setMedicalDiagnoseFee(String medicalDiagnoseFee) {
		this.medicalDiagnoseFee = medicalDiagnoseFee;
	}
	public String getLabFee() {
		return labFee;
	}
	public void setLabFee(String labFee) {
		this.labFee = labFee;
	}
	public String getFileFee() {
		return fileFee;
	}
	public void setFileFee(String fileFee) {
		this.fileFee = fileFee;
	}
	public String getClinicalDiagnoseFee() {
		return clinicalDiagnoseFee;
	}
	public void setClinicalDiagnoseFee(String clinicalDiagnoseFee) {
		this.clinicalDiagnoseFee = clinicalDiagnoseFee;
	}
	public String getNotOperationFee() {
		return notOperationFee;
	}
	public void setNotOperationFee(String notOperationFee) {
		this.notOperationFee = notOperationFee;
	}
	public String getClinicalPhysicalFee() {
		return clinicalPhysicalFee;
	}
	public void setClinicalPhysicalFee(String clinicalPhysicalFee) {
		this.clinicalPhysicalFee = clinicalPhysicalFee;
	}
	public String getOperationTreatFee() {
		return operationTreatFee;
	}
	public void setOperationTreatFee(String operationTreatFee) {
		this.operationTreatFee = operationTreatFee;
	}
	public String getAnaesthesiaFei() {
		return anaesthesiaFei;
	}
	public void setAnaesthesiaFei(String anaesthesiaFei) {
		this.anaesthesiaFei = anaesthesiaFei;
	}
	public String getOperationFee() {
		return operationFee;
	}
	public void setOperationFee(String operationFee) {
		this.operationFee = operationFee;
	}
	public String getKangfuFee() {
		return kangfuFee;
	}
	public void setKangfuFee(String kangfuFee) {
		this.kangfuFee = kangfuFee;
	}
	public String getWestMedicineFee() {
		return westMedicineFee;
	}
	public void setWestMedicineFee(String westMedicineFee) {
		this.westMedicineFee = westMedicineFee;
	}
	public String getKjywFee() {
		return kjywFee;
	}
	public void setKjywFee(String kjywFee) {
		this.kjywFee = kjywFee;
	}
	public String getChineseMedicineFee() {
		return chineseMedicineFee;
	}
	public void setChineseMedicineFee(String chineseMedicineFee) {
		this.chineseMedicineFee = chineseMedicineFee;
	}
	public String getZcyfFee() {
		return zcyfFee;
	}
	public void setZcyfFee(String zcyfFee) {
		this.zcyfFee = zcyfFee;
	}
	public String getBloodFee() {
		return bloodFee;
	}
	public void setBloodFee(String bloodFee) {
		this.bloodFee = bloodFee;
	}
	public String getBdblzpFee() {
		return bdblzpFee;
	}
	public void setBdblzpFee(String bdblzpFee) {
		this.bdblzpFee = bdblzpFee;
	}
	public String getQdblzpFee() {
		return qdblzpFee;
	}
	public void setQdblzpFee(String qdblzpFee) {
		this.qdblzpFee = qdblzpFee;
	}
	public String getNxyzlzpFee() {
		return nxyzlzpFee;
	}
	public void setNxyzlzpFee(String nxyzlzpFee) {
		this.nxyzlzpFee = nxyzlzpFee;
	}
	public String getXbyzilFee() {
		return xbyzilFee;
	}
	public void setXbyzilFee(String xbyzilFee) {
		this.xbyzilFee = xbyzilFee;
	}
	public String getCheckMedicalFee() {
		return checkMedicalFee;
	}
	public void setCheckMedicalFee(String checkMedicalFee) {
		this.checkMedicalFee = checkMedicalFee;
	}
	public String getTreatUseMedicalFee() {
		return treatUseMedicalFee;
	}
	public void setTreatUseMedicalFee(String treatUseMedicalFee) {
		this.treatUseMedicalFee = treatUseMedicalFee;
	}
	public String getOperationUseFee() {
		return operationUseFee;
	}
	public void setOperationUseFee(String operationUseFee) {
		this.operationUseFee = operationUseFee;
	}
	public String getOtherFee2() {
		return otherFee2;
	}
	public void setOtherFee2(String otherFee2) {
		this.otherFee2 = otherFee2;
	}
	public String getSelfPayFee() {
		return selfPayFee;
	}
	public void setSelfPayFee(String selfPayFee) {
		this.selfPayFee = selfPayFee;
	}
	public String getDialecticalDiscussFee() {
		return dialecticalDiscussFee;
	}
	public void setDialecticalDiscussFee(String dialecticalDiscussFee) {
		this.dialecticalDiscussFee = dialecticalDiscussFee;
	}
	public String getDialecticalHuizhenFee() {
		return dialecticalHuizhenFee;
	}
	public void setDialecticalHuizhenFee(String dialecticalHuizhenFee) {
		this.dialecticalHuizhenFee = dialecticalHuizhenFee;
	}
	public String getChineseDiagnoseFee() {
		return chineseDiagnoseFee;
	}
	public void setChineseDiagnoseFee(String chineseDiagnoseFee) {
		this.chineseDiagnoseFee = chineseDiagnoseFee;
	}
	public String getChineseTreatFee() {
		return chineseTreatFee;
	}
	public void setChineseTreatFee(String chineseTreatFee) {
		this.chineseTreatFee = chineseTreatFee;
	}
	public String getChineseOutsidetreatFee() {
		return chineseOutsidetreatFee;
	}
	public void setChineseOutsidetreatFee(String chineseOutsidetreatFee) {
		this.chineseOutsidetreatFee = chineseOutsidetreatFee;
	}
	public String getChineseBoneHurt() {
		return chineseBoneHurt;
	}
	public void setChineseBoneHurt(String chineseBoneHurt) {
		this.chineseBoneHurt = chineseBoneHurt;
	}
	public String getAcupunctureFee() {
		return acupunctureFee;
	}
	public void setAcupunctureFee(String acupunctureFee) {
		this.acupunctureFee = acupunctureFee;
	}
	public String getChineseTuinaFee() {
		return chineseTuinaFee;
	}
	public void setChineseTuinaFee(String chineseTuinaFee) {
		this.chineseTuinaFee = chineseTuinaFee;
	}
	public String getChineseGctreatFee() {
		return chineseGctreatFee;
	}
	public void setChineseGctreatFee(String chineseGctreatFee) {
		this.chineseGctreatFee = chineseGctreatFee;
	}
	public String getChineseSpecialFee() {
		return chineseSpecialFee;
	}
	public void setChineseSpecialFee(String chineseSpecialFee) {
		this.chineseSpecialFee = chineseSpecialFee;
	}
	public String getChineseOtherFee() {
		return chineseOtherFee;
	}
	public void setChineseOtherFee(String chineseOtherFee) {
		this.chineseOtherFee = chineseOtherFee;
	}
	public String getChineseTsdpjgFee() {
		return chineseTsdpjgFee;
	}
	public void setChineseTsdpjgFee(String chineseTsdpjgFee) {
		this.chineseTsdpjgFee = chineseTsdpjgFee;
	}
	public String getDialecticalDiaet() {
		return dialecticalDiaet;
	}
	public void setDialecticalDiaet(String dialecticalDiaet) {
		this.dialecticalDiaet = dialecticalDiaet;
	}
	public String getMedicalAgencyFee() {
		return medicalAgencyFee;
	}
	public void setMedicalAgencyFee(String medicalAgencyFee) {
		this.medicalAgencyFee = medicalAgencyFee;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getInsertFlag() {
		return insertFlag;
	}
	public void setInsertFlag(String insertFlag) {
		this.insertFlag = insertFlag;
	}
	
	
}
