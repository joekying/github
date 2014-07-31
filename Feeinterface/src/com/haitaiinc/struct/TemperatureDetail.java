package com.haitaiinc.struct;

public class TemperatureDetail {
	protected Integer recordflow;//记录流水号
	protected String ipid;//住院流水号 key
	protected String measureDate;//测量日期 key
	protected String measureTime;//测量时间 key
	protected String pid;//病人ID
	protected Double temper;//体温
	protected String temperType;//体温类型【E：耳温；G：肛温；K：口温（默认）；Y：腋温】
	protected Double temperAgain;//复试体温
	protected Double temperDown;//降温后体温
	protected Double temperUp;//发热的体温
	protected String isMeasure;//是否是正常测量【N：否；Y：是】
	protected Integer pulse;//脉搏
	protected String pulseFlag;//脉搏短绌标志【N：否（默认）；Y：是】
	protected Integer breath;//呼吸
	protected String breathFlag;//呼吸机注释位【N：否（默认）；Y：是】
	protected Integer hr;//心率
	protected String hrFlag;//起搏心率标志【N：否（默认）；Y：是】
	protected String topRemarks;//上注释
	protected String bottomRemarks;//下注释
	protected String deptCode;//部门(科室)代码
	protected String deptName;//部门(科室)名称
	protected String wardCode;//病区代码
	protected String wardName;//病区名称
	protected String manageType; //处理类型（1-新增 2-修改 3-删除）
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
	public String getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(String measureTime) {
		this.measureTime = measureTime;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Double getTemper() {
		return temper;
	}
	public void setTemper(Double temper) {
		this.temper = temper;
	}
	public String getTemperType() {
		return temperType;
	}
	public void setTemperType(String temperType) {
		this.temperType = temperType;
	}
	public Double getTemperAgain() {
		return temperAgain;
	}
	public void setTemperAgain(Double temperAgain) {
		this.temperAgain = temperAgain;
	}
	public Double getTemperDown() {
		return temperDown;
	}
	public void setTemperDown(Double temperDown) {
		this.temperDown = temperDown;
	}
	public Double getTemperUp() {
		return temperUp;
	}
	public void setTemperUp(Double temperUp) {
		this.temperUp = temperUp;
	}
	public String getIsMeasure() {
		return isMeasure;
	}
	public void setIsMeasure(String isMeasure) {
		this.isMeasure = isMeasure;
	}
	public Integer getPulse() {
		return pulse;
	}
	public void setPulse(Integer pulse) {
		this.pulse = pulse;
	}
	public String getPulseFlag() {
		return pulseFlag;
	}
	public void setPulseFlag(String pulseFlag) {
		this.pulseFlag = pulseFlag;
	}
	public Integer getBreath() {
		return breath;
	}
	public void setBreath(Integer breath) {
		this.breath = breath;
	}
	public String getBreathFlag() {
		return breathFlag;
	}
	public void setBreathFlag(String breathFlag) {
		this.breathFlag = breathFlag;
	}
	public Integer getHr() {
		return hr;
	}
	public void setHr(Integer hr) {
		this.hr = hr;
	}
	public String getHrFlag() {
		return hrFlag;
	}
	public void setHrFlag(String hrFlag) {
		this.hrFlag = hrFlag;
	}
	public String getTopRemarks() {
		return topRemarks;
	}
	public void setTopRemarks(String topRemarks) {
		this.topRemarks = topRemarks;
	}
	public String getBottomRemarks() {
		return bottomRemarks;
	}
	public void setBottomRemarks(String bottomRemarks) {
		this.bottomRemarks = bottomRemarks;
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
	public String getManageType() {
		return manageType;
	}
	public void setManageType(String manageType) {
		this.manageType = manageType;
	}


}
