package com.haitaiinc.struct;

public class TemperatureEle {

	protected String temperEleSn;//体温单元素流水号 key
	protected String ipid;//住院流水号
	protected String measureDate;//测量日期
	protected String pid;//病人ID
	protected String eleID;//元素ID
	protected String eleName;//元素名
	protected String eleValue;//元素值
	protected String eleFloatValue;//元素数值
	protected String md5Content;//md5编码
	protected String skinTestResult;//皮试结果
	protected String ordinal;//排序码
	public String getTemperEleSn() {
		return temperEleSn;
	}
	public void setTemperEleSn(String temperEleSn) {
		this.temperEleSn = temperEleSn;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getEleID() {
		return eleID;
	}
	public void setEleID(String eleID) {
		this.eleID = eleID;
	}
	public String getEleName() {
		return eleName;
	}
	public void setEleName(String eleName) {
		this.eleName = eleName;
	}
	public String getEleValue() {
		return eleValue;
	}
	public void setEleValue(String eleValue) {
		this.eleValue = eleValue;
	}
	public String getEleFloatValue() {
		return eleFloatValue;
	}
	public void setEleFloatValue(String eleFloatValue) {
		this.eleFloatValue = eleFloatValue;
	}
	public String getMd5Content() {
		return md5Content;
	}
	public void setMd5Content(String md5Content) {
		this.md5Content = md5Content;
	}
	public String getSkinTestResult() {
		return skinTestResult;
	}
	public void setSkinTestResult(String skinTestResult) {
		this.skinTestResult = skinTestResult;
	}
	public String getOrdinal() {
		return ordinal;
	}
	public void setOrdinal(String ordinal) {
		this.ordinal = ordinal;
	}

}
