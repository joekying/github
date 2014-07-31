package com.haitaiinc.struct;

public class Temperature {
	protected Integer recordflow;//��¼��ˮ��
	protected String ipid;//סԺ��ˮ�� key
	protected String measureDate;//�������� key
	protected String createTime;//����ʱ��
	protected String creator;//������
	protected String modifyTime;//�޸�ʱ��
	protected String modifier;//�޸���
	protected String postoperativeDays;//��������
	protected Double intakeValue;//����ֵ
	protected String intakeUnit;//���뵥λ
	protected String stoolTimes;//������
	protected Double urineVolume;//����
	protected Double dischargeValue;//�ų�ֵ
	protected String dischargeUnit;//�ų���λ
	protected Integer diastolicPressure;//����ѹ
	protected Integer systolicPressure;//����ѹ
	protected Double weight;//����
	protected Double height;//���
	protected Double abdominalCircumference;//��Χ
	protected String skinTestResult;//Ƥ�Խ��������/���ԣ�
	protected String otherDesc;//��������
	protected Double allDischargeValue;//�ܳ���
	protected String allDischargeUnit;//�ܳ�����λ
	protected String deptCode;//����(����)����
	protected String deptName;//����(����)����
	protected String wardCode;//��������
	protected String wardName;//��������
	protected String md5Content;//md5����
	protected String pid;//����ID
	protected Integer inHospitalDay;//סԺ����
	protected String intakeUnitCode;//����������
	protected String dischargeUnitCode;//�ų���λ����
	protected String allDischargeUnitCode;//�����ų���λ����
	protected Double waistCircumference;//��Χ
	protected String definedItemCodes;//�Զ�����Ŀ���뼯��
	protected String weightDesc;//��������
	protected String stoolTimesDesc;//����������
	protected String urineVolumeDesc;//��������
	protected String manageType;//�������ͣ�1-���� 2-�޸� 3-ɾ����
	protected String eleID;//������ 2--Ѫѹ2  3-Ѫѹ3
	protected String eleValue;//�������ֵ

	public Integer getRecordflow() {
		return recordflow;
	}
	public void setRecordflow(Integer recordflow) {
		this.recordflow = recordflow;
	}
	public String getIpid() {
		return ipid;
	}
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}
	public String getMeasureDate() {
		return measureDate;
	}
	public void setMeasureDate(String measureDate) {
		this.measureDate = measureDate;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getPostoperativeDays() {
		return postoperativeDays;
	}
	public void setPostoperativeDays(String postoperativeDays) {
		this.postoperativeDays = postoperativeDays;
	}
	public Double getIntakeValue() {
		return intakeValue;
	}
	public void setIntakeValue(Double intakeValue) {
		this.intakeValue = intakeValue;
	}
	public String getIntakeUnit() {
		return intakeUnit;
	}
	public void setIntakeUnit(String intakeUnit) {
		this.intakeUnit = intakeUnit;
	}
	public String getStoolTimes() {
		return stoolTimes;
	}
	public void setStoolTimes(String stoolTimes) {
		this.stoolTimes = stoolTimes;
	}
	public Double getUrineVolume() {
		return urineVolume;
	}
	public void setUrineVolume(Double urineVolume) {
		this.urineVolume = urineVolume;
	}
	public Double getDischargeValue() {
		return dischargeValue;
	}
	public void setDischargeValue(Double dischargeValue) {
		this.dischargeValue = dischargeValue;
	}
	public String getDischargeUnit() {
		return dischargeUnit;
	}
	public void setDischargeUnit(String dischargeUnit) {
		this.dischargeUnit = dischargeUnit;
	}
	public Integer getDiastolicPressure() {
		return diastolicPressure;
	}
	public void setDiastolicPressure(Integer diastolicPressure) {
		this.diastolicPressure = diastolicPressure;
	}
	public Integer getSystolicPressure() {
		return systolicPressure;
	}
	public void setSystolicPressure(Integer systolicPressure) {
		this.systolicPressure = systolicPressure;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getAbdominalCircumference() {
		return abdominalCircumference;
	}
	public void setAbdominalCircumference(Double abdominalCircumference) {
		this.abdominalCircumference = abdominalCircumference;
	}
	public String getSkinTestResult() {
		return skinTestResult;
	}
	public void setSkinTestResult(String skinTestResult) {
		this.skinTestResult = skinTestResult;
	}
	public String getOtherDesc() {
		return otherDesc;
	}
	public void setOtherDesc(String otherDesc) {
		this.otherDesc = otherDesc;
	}
	public Double getAllDischargeValue() {
		return allDischargeValue;
	}
	public void setAllDischargeValue(Double allDischargeValue) {
		this.allDischargeValue = allDischargeValue;
	}
	public String getAllDischargeUnit() {
		return allDischargeUnit;
	}
	public void setAllDischargeUnit(String allDischargeUnit) {
		this.allDischargeUnit = allDischargeUnit;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getWardCode() {
		return wardCode;
	}
	public void setWardCode(String wardCode) {
		this.wardCode = wardCode;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getMd5Content() {
		return md5Content;
	}
	public void setMd5Content(String md5Content) {
		this.md5Content = md5Content;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getInHospitalDay() {
		return inHospitalDay;
	}
	public void setInHospitalDay(Integer inHospitalDay) {
		this.inHospitalDay = inHospitalDay;
	}
	public String getIntakeUnitCode() {
		return intakeUnitCode;
	}
	public void setIntakeUnitCode(String intakeUnitCode) {
		this.intakeUnitCode = intakeUnitCode;
	}
	public String getDischargeUnitCode() {
		return dischargeUnitCode;
	}
	public void setDischargeUnitCode(String dischargeUnitCode) {
		this.dischargeUnitCode = dischargeUnitCode;
	}
	public String getAllDischargeUnitCode() {
		return allDischargeUnitCode;
	}
	public void setAllDischargeUnitCode(String allDischargeUnitCode) {
		this.allDischargeUnitCode = allDischargeUnitCode;
	}
	public Double getWaistCircumference() {
		return waistCircumference;
	}
	public void setWaistCircumference(Double waistCircumference) {
		this.waistCircumference = waistCircumference;
	}
	public String getDefinedItemCodes() {
		return definedItemCodes;
	}
	public void setDefinedItemCodes(String definedItemCodes) {
		this.definedItemCodes = definedItemCodes;
	}
	public String getWeightDesc() {
		return weightDesc;
	}
	public void setWeightDesc(String weightDesc) {
		this.weightDesc = weightDesc;
	}
	public String getStoolTimesDesc() {
		return stoolTimesDesc;
	}
	public void setStoolTimesDesc(String stoolTimesDesc) {
		this.stoolTimesDesc = stoolTimesDesc;
	}
	public String getUrineVolumeDesc() {
		return urineVolumeDesc;
	}
	public void setUrineVolumeDesc(String urineVolumeDesc) {
		this.urineVolumeDesc = urineVolumeDesc;
	}
	public String getManageType() {
		return manageType;
	}
	public void setManageType(String manageType) {
		this.manageType = manageType;
	}
	public String getEleID() {
		return eleID;
	}
	public void setEleID(String eleID) {
		this.eleID = eleID;
	}
	public String getEleValue() {
		return eleValue;
	}
	public void setEleValue(String eleValue) {
		this.eleValue = eleValue;
	}

	
	
	
}
