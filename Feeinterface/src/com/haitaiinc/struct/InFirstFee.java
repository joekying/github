package com.haitaiinc.struct;

public class InFirstFee {

	protected Integer flowID;//��¼��ˮ��PK�����ݿ��Զ����ɣ�
	protected String inPatientFlow;//������ˮ��  
	protected String mrID;//������ 
	protected String totalValue;//������
	protected String ordinaryMedicalServiceFee;//һ��ҽ�Ʒ����
	protected String ordinaryTreatOperateFee;//һ�����Ʋ�����
	protected String nurseFee;//�����
	protected String otherFee1;//��������(�ۺ�ҽ�Ʒ���������)
	protected String medicalDiagnoseFee;//������Ϸ�
	protected String labFee;//ʵ������Ϸ�
	protected String fileFee;//Ӱ��ѧ��Ϸ�
	protected String clinicalDiagnoseFee;//�ٴ������Ŀ��
	protected String notOperationFee;//������������Ŀ��
	protected String clinicalPhysicalFee;//�ٴ��������Ʒ�
	protected String operationTreatFee;//�������Ʒ�
	protected String anaesthesiaFei;//�����
	protected String operationFee;//������
	protected String kangfuFee;//������
	protected String westMedicineFee;//��ҩ��
	protected String kjywFee;//����ҩ����
	protected String chineseMedicineFee;//�г�ҩ��
	protected String zcyfFee;//�в�ҩ��
	protected String bloodFee;//Ѫ��
	protected String bdblzpFee;//�׵�������Ʒ��
	protected String qdblzpFee;//�򵰰�����Ʒ��
	protected String nxyzlzpFee;//��Ѫ��������Ʒ��
	protected String xbyzilFee;//ϸ����������Ʒ��
	protected String checkMedicalFee;//�����һ����ҽ�ò��Ϸ�
	protected String treatUseMedicalFee;//������һ����ҽ�ò��Ϸ�
	protected String operationUseFee;//������һ����ҽ�ò��Ϸ�
	protected String otherFee2;//�������������������
	protected String selfPayFee;//�Ը�����
	protected String dialecticalDiscussFee;//��ҽ��֤���η�
	protected String dialecticalHuizhenFee;//��ҽ��֤���λ����
	protected String chineseDiagnoseFee;//��ҽ���
	protected String chineseTreatFee;//��ҽ����
	protected String chineseOutsidetreatFee;//��ҽ����
	protected String chineseBoneHurt;//��ҽ����
	protected String acupunctureFee;//�����ķ�
	protected String chineseTuinaFee;//��ҽ��������
	protected String chineseGctreatFee;//��ҽ�س�����
	protected String chineseSpecialFee;//��ҽ��������
	protected String chineseOtherFee;//��ҽ����
	protected String chineseTsdpjgFee;//��ҩ�������ӹ�
	protected String dialecticalDiaet;//��֤ʩ��
	protected String medicalAgencyFee;//ҽ�ƻ�����ҩ�Ƽ���
	protected String caseType;//�����־
	protected String insertFlag; //����/�޸ı�־��1��������2���޸�
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
