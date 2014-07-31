package com.haitaiinc.struct;

public class Temperature {
	protected Integer recordflow;//记录流水号
	protected String ipid;//住院流水号 key
	protected String measureDate;//测量日期 key
	protected String createTime;//创建时间
	protected String creator;//创建人
	protected String modifyTime;//修改时间
	protected String modifier;//修改人
	protected String postoperativeDays;//术后日数
	protected Double intakeValue;//摄入值
	protected String intakeUnit;//摄入单位
	protected String stoolTimes;//大便次数
	protected Double urineVolume;//尿量
	protected Double dischargeValue;//排出值
	protected String dischargeUnit;//排出单位
	protected Integer diastolicPressure;//舒张压
	protected Integer systolicPressure;//收缩压
	protected Double weight;//体重
	protected Double height;//身高
	protected Double abdominalCircumference;//腹围
	protected String skinTestResult;//皮试结果（阴性/阳性）
	protected String otherDesc;//其它描述
	protected Double allDischargeValue;//总出量
	protected String allDischargeUnit;//总出量单位
	protected String deptCode;//部门(科室)代码
	protected String deptName;//部门(科室)名称
	protected String wardCode;//病区代码
	protected String wardName;//病区名称
	protected String md5Content;//md5编码
	protected String pid;//病人ID
	protected Integer inHospitalDay;//住院天数
	protected String intakeUnitCode;//摄入量代码
	protected String dischargeUnitCode;//排除单位代码
	protected String allDischargeUnitCode;//所有排出单位代码
	protected Double waistCircumference;//腰围
	protected String definedItemCodes;//自定义项目代码集合
	protected String weightDesc;//体重描述
	protected String stoolTimesDesc;//大便次数描述
	protected String urineVolumeDesc;//尿量描述
	protected String manageType;//处理类型（1-新增 2-修改 3-删除）
	protected String eleID;//附加项 2--血压2  3-血压3
	protected String eleValue;//附加项的值

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
