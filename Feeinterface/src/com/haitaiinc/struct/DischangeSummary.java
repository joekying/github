package com.haitaiinc.struct;

import java.sql.*;

import oracle.jdbc.OracleResultSet;
import oracle.sql.OPAQUE;
import oracle.xdb.XMLType;

/**
 * @author haitaiinc
 * EXAM_REPORT
 */
public class DischangeSummary {
	//סԺ��ˮ�� key
	protected String ipid;
	//����ID
	protected String pid ;
	//��Ժʱ��
	protected String dischangeTime ;
	//��Ժ��ʽ��SW��������ZC��������ZY��תԺ��
	protected String dischangeWay ;
	//סԺ����
	protected int inHopitalDay ;
	//��ԺС��
	protected String xmlCont ;
	//����ʱ��
	protected String createTime ;
	//�޸�ʱ��
	protected String modifyTime ;
	//�ϴ��޸�ʱ��
	protected String xgsj ;
	//��Ժʱ��
	protected String admissionTime ;
	//����
	protected String Name ;
	//�Ա�
	protected String sex ;
	//����
	protected String age ;
	//����
	protected String bed ;
	//����
	protected String ward ;
	
	public static final String UPDATE =
		"update INPCASE.DISCHARGE_SUMMARY set xgsj=MODIFY_TIME where IPID=?";

	public static final String SELECT =
		"select a.IPID,a.PID,a.DISCHARGE_TIME,a.DISCHARGE_WAY,a.IN_HOPITAL_DAY,a.XML_CONT,a.CREATE_TIME,a.MODIFY_TIME,"+
		"b.ADMISSION_TIME,b.PATIENT_NAME,b.SEX,b.AGE,b.BED_NO,b.WARD_CODE from INPCASE.DISCHARGE_SUMMARY a,ADT.INPATIENT b where a.ipid=b.ipid and (xgsj is null or xgsj<>MODIFY_TIME) ";

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
		System.err.println("pst--"+pst.getClass().getName());
		pst.setString(++index, xgsj);
		pst.setString(++index, ipid); 
		
		return pst;
	}

	/**
	 * Method fetchCommonCode.
	 * ��ʹ��SELECT�õ��Ľ�������ֵ������ǰ����Ķ�Ӧ������
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchDischangeSummary(ResultSet rs) throws SQLException {
		
		ipid = rs.getString("IPID"); 
		pid = rs.getString("PID");
		dischangeTime = rs.getString("DISCHARGE_TIME"); 
		dischangeWay = rs.getString("DISCHARGE_WAY"); 
		inHopitalDay = rs.getInt("IN_HOPITAL_DAY"); 
		xmlCont = rs.getString("XML_CONT");
		OracleResultSet ors = (OracleResultSet) rs;
		OPAQUE op = ors.getOPAQUE("XML_CONT");
		if( op == null ){
			xmlCont="";
		}else{
			XMLType xml = XMLType.createXML(op);
			Clob clob = xml.getClobVal();
			xmlCont = clob.getSubString(1, (int) clob.length());
		}
		createTime = rs.getString("CREATE_TIME"); 
		modifyTime = rs.getString("MODIFY_TIME"); 
		admissionTime = rs.getString("ADMISSION_TIME"); 
		Name = rs.getString("PATIENT_NAME"); 
		sex= rs.getString("SEX"); 
		age = rs.getString("AGE"); 
		bed = rs.getString("BED_NO"); 
		ward = rs.getString("WARD_CODE"); 
	}

	public String getIpid() {
		return ipid;
	}

	public void setIpid(String ipid) {
		this.ipid = ipid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getDischangeTime() {
		return dischangeTime;
	}

	public void setDischangeTime(String dischangeTime) {
		this.dischangeTime = dischangeTime;
	}

	public String getDischangeWay() {
		return dischangeWay;
	}

	public void setDischangeWay(String dischangeWay) {
		this.dischangeWay = dischangeWay;
	}

	public int getInHopitalDay() {
		return inHopitalDay;
	}

	public void setInHopitalDay(int inHopitalDay) {
		this.inHopitalDay = inHopitalDay;
	}

	public String getXmlCont() {
		return xmlCont;
	}

	public void setXmlCont(String xmlCont) {
		this.xmlCont = xmlCont;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getXgsj() {
		return xgsj;
	}

	public void setXgsj(String xgsj) {
		this.xgsj = xgsj;
	}

	public String getAdmissionTime() {
		return admissionTime;
	}

	public void setAdmissionTime(String admissionTime) {
		this.admissionTime = admissionTime;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}
}
