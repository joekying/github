package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import com.haitaiinc.ICommon.DataUtil;
import com.haitaiinc.ICommon.XmlParse;
import com.haitaiinc.htemr.ws.schema.HtResponseDocument;
import com.haitaiinc.htemr.ws.schema.ReturnValue;
import com.haitaiinc.utils.StringUtil;

/**
 * @author W.B.Jiang
 * 2011-10-09
 * 用于从His系统读取病人基本信息、住院信息数据
 */
public class ManageADT {
	private Connection hisdb = null;
	
	public ManageADT(Connection hisdb)throws Exception {
		if (hisdb == null ) {
			throw new Exception("异常参数");
		}
		this.hisdb = hisdb;
	}

	/**
	 *从HIS中间表PatientInfo中读取需要处理的病人基本信息数据，组织好xml调用webservice。
	 */
	public void manageMainMrInfo() throws Exception {
		Patientinfo pi = new Patientinfo();
		pi.setImpflag("0");
		pi.setOrderByStr("RecordFlow");
		
		List piList = new Vector();
		String sql = pi.makeSearchSql();
		System.out.println("sql---"+sql);
		Statement stm = hisdb.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			Patientinfo pi_temp = new Patientinfo();
			pi_temp.fetchPatientinfo(rs);
			piList.add(pi_temp);
		}
		rs.close();
		stm.close();
		
		System.out.println("从HIS中间表PatientInfo中读取需要处理的病人基本信息数据"+piList.size()+"条");

		for(int i=0;i<piList.size();i++){
			pi = (Patientinfo)piList.get(i);
			String xmlStr= 
				"<?xml version=\"1.0\" encoding=\"GBK\"?>"
              + "<HtRequest >"
              + "<PatientInfo>"
              + "<RecordFlow>"+DataUtil.toHtml(pi.getRecordflow())+"</RecordFlow >"
              + "<PID>"+DataUtil.toHtml(pi.getPid())+"</PID>"
              + "<InsuranceNo>"+DataUtil.toHtml(pi.getInsuranceno())+"</InsuranceNo>"
              + "<PatientName>"+DataUtil.toHtml(pi.getPatientname())+"</PatientName>"
              + "<TmpFlag>"+DataUtil.toHtml(pi.getTmpflag())+"</TmpFlag>"
              + "<LastName>"+DataUtil.toHtml(pi.getLastname())+"</LastName>"
              + "<FirstName>"+DataUtil.toHtml(pi.getFirstname())+"</FirstName>"
              + "<PY>"+DataUtil.toHtml(pi.getPy())+"</PY>"
              + "<WB>"+DataUtil.toHtml(pi.getWb())+"</WB>"
              + "<SexCode>"+DataUtil.toHtml(pi.getSexcode())+"</SexCode>"
              + "<Sex>"+DataUtil.toHtml(pi.getSex())+"</Sex>"
              + "<DateOfBirth>"+DataUtil.toHtml(pi.getDateofbirth())+"</DateOfBirth>"
              + "<TimeOfBirth>"+DataUtil.toHtml(pi.getTimeofbirth())+"</TimeOfBirth>"
              + "<MarriageStatusCode>"+DataUtil.toHtml(pi.getMarriagestatuscode())+"</MarriageStatusCode>"
              + "<MarriageStatus>"+DataUtil.toHtml(pi.getMarriagestatus())+"</MarriageStatus>"
              + "<OccupationCode>"+DataUtil.toHtml(pi.getOccupationcode())+"</OccupationCode>"
              + "<Occupation>"+DataUtil.toHtml(pi.getOccupation())+"</Occupation>"
              + "<NationalityCode>"+DataUtil.toHtml(pi.getNationalitycode())+"</NationalityCode>"
              + "<Nationality>"+DataUtil.toHtml(pi.getNationality())+"</Nationality>"
              + "<CountryCode>"+DataUtil.toHtml(pi.getCountrycode())+"</CountryCode>"
              + "<Country>"+DataUtil.toHtml(pi.getCountry())+"</Country>"
              + "<FormalSchoolingCode>"+DataUtil.toHtml(pi.getFormalschoolingcode())+"</FormalSchoolingCode>"
              + "<FormalSchooling>"+DataUtil.toHtml(pi.getFormalschooling())+"</FormalSchooling>"
              + "<Religion>"+DataUtil.toHtml(pi.getRelation())+"</Religion>"
              + "<BirthPlaceCode>"+DataUtil.toHtml(pi.getBirthplacecode())+"</BirthPlaceCode>"
              + "<BirthPlace>"+DataUtil.toHtml(pi.getBirthplace())+"</BirthPlace>"
              + "<NativePlaceCode>"+DataUtil.toHtml(pi.getNativeplacecode())+"</NativePlaceCode>"
              + "<NativePlace>"+DataUtil.toHtml(pi.getNativeplace())+"</NativePlace>"
              + "<BloodType>"+DataUtil.toHtml(pi.getBloodtype())+"</BloodType>"
              + "<CertTypeCode>"+DataUtil.toHtml(pi.getCerttypecode())+"</CertTypeCode>"
              + "<CertType>"+DataUtil.toHtml(pi.getCerttype())+"</CertType>"
              + "<CertNo>"+DataUtil.toHtml(pi.getCertno())+"</CertNo>"
              + "<PatientClassCode>"+DataUtil.toHtml(pi.getPatientclasscode())+"</PatientClassCode>"
              + "<PatientClass>"+DataUtil.toHtml(pi.getPatientclass())+"</PatientClass>"
              + "<FeeTypeCode>"+DataUtil.toHtml(pi.getFeetypecode())+"</FeeTypeCode>"
              + "<FeeType>"+DataUtil.toHtml(pi.getFeetype())+"</FeeType>"
              + "<Company>"+DataUtil.toHtml(pi.getCompany())+"</Company>"
              + "<PublicExpenseNo>"+DataUtil.toHtml(pi.getPublicexpenseno())+"</PublicExpenseNo>"
              + "<ContractUnitCode>"+DataUtil.toHtml(pi.getContractunitcode())+"</ContractUnitCode>"
              + "	<ContractUnit>"+DataUtil.toHtml(pi.getContractunit())+"</ContractUnit>"
              + "<BusinessAddressCode>"+DataUtil.toHtml(pi.getBusinessaddresscode())+"</BusinessAddressCode>"
              + "<BusinessAddress>"+DataUtil.toHtml(pi.getBusinessaddress())+"</BusinessAddress>"
              + "<BusinessPostCode>"+DataUtil.toHtml(pi.getBusinesspostcode())+"</BusinessPostCode>"
              + "<BusinessPhone>"+DataUtil.toHtml(pi.getBusinessphone())+"</BusinessPhone>"
              + "<HomeAddressCode>"+DataUtil.toHtml(pi.getHomeaddresscode())+"</HomeAddressCode>"
              + "<HomeAddress>"+DataUtil.toHtml(pi.getHomeaddress())+"</HomeAddress>"
              + "<HomePostCode>"+DataUtil.toHtml(pi.getHomepostcode())+"</HomePostCode>"
              + "<MobilePhone>"+DataUtil.toHtml(pi.getMobilephone())+"</MobilePhone>"
              + "<Contact>"+DataUtil.toHtml(pi.getContact())+"</Contact>"
              + "<RelationCode>"+DataUtil.toHtml(pi.getRelationcode())+"</RelationCode>"
              + "	<Relation>"+DataUtil.toHtml(pi.getRelation())+"</Relation>"
              + "	<ContactEmail>"+DataUtil.toHtml(pi.getContactemail())+"</ContactEmail>"
              + "<ContactMethod>"+DataUtil.toHtml(pi.getContactmethod())+"</ContactMethod>"
              + "<VIPType>"+DataUtil.toHtml(pi.getViptype())+"</VIPType>"
              + "	<OperatorID>"+DataUtil.toHtml(pi.getOperatorid())+"</OperatorID>"
              + "<Operator>"+DataUtil.toHtml(pi.getOperator())+"</Operator>"
              + "<OperatorTime>"+DataUtil.toHtml(pi.getOperatortime())+"</OperatorTime>"
              + "<Available>"+DataUtil.toHtml(pi.getAvailable())+"</Available>"
              + "<ManageType>"+DataUtil.toHtml(pi.getManagetype())+"</ManageType>"
              + "</PatientInfo>"
              + "</HtRequest>";
			String result = LoadWS1.loadWs("manageAdt", "PatientInfo", xmlStr);
			System.out.println("result-"+result);
			String returnCode = "";
			String returnStr = "";
			try{
				HtResponseDocument doc = HtResponseDocument.Factory.parse(result);
				ReturnValue[] rvs = doc.getHtResponse().getReturnValueArray();
				if(rvs!=null&&rvs.length==1){
					ReturnValue rv = rvs[0];
					returnCode = StringUtil.toHtml(rv.getReturnCode());
					returnStr = StringUtil.toHtml(rv.getReturnStr());
				}
			}catch(Exception e){
				e.printStackTrace();
				returnCode = "2";
				returnStr = "返回值解析错误，请查看接口日志！";
			}
			System.out.println("returnCode-"+returnCode);
			System.out.println("returnStr--"+returnStr);
			if(!"1".equals(returnCode)){
				returnCode = "2";
			}
			String update_sql = "update patientInfo set impflag='"+returnCode+"',returndesc='"+returnStr+"' where recordFlow='"+pi.getRecordflow()+"'";
			System.out.println("update_sql---"+update_sql);
			PreparedStatement pst = hisdb.prepareStatement(update_sql);
	     	pst.executeUpdate();
	     	pst.close();
	        hisdb.commit();
		}
	}
	
	/**
	 *从HIS中间表IN_PATIENT_INFO中读取需要处理的病人住院信息数据，组织好xml调用webservice。
	 */
	public void manageInPatientInfo() throws Exception {
		Inpatientinfo ipi = new Inpatientinfo();
		ipi.setImpflag("0");
		ipi.setOrderByStr("recordFlow");
		
		List ipiList = new Vector();
		String sql = ipi.makeSearchSql();
		System.out.println("sql---"+sql);
		Statement stm = hisdb.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			Inpatientinfo ipi_temp = new Inpatientinfo();
			ipi_temp.fetchInpatientinfo(rs);
			ipiList.add(ipi_temp);
		}
		rs.close();
		stm.close();
		
		System.out.println("从HIS中间表IN_PATIENT_INFO中读取需要处理的病人住院信息数据"+ipiList.size()+"条");

		for(int i=0;i<ipiList.size();i++){
			ipi = (Inpatientinfo)ipiList.get(i);
			String xmlStr= 
				"<?xml version=\"1.0\" encoding=\"GBK\"?>"
              + "<HtRequest>"
              + "<InPatientInfo>"
              + "<RecordFlow>"+DataUtil.toHtml(ipi.getRecordflow())+"</RecordFlow>"
              + "<IPID>"+DataUtil.toHtml(ipi.getIpid())+"</IPID>"
              + "<PID>"+DataUtil.toHtml(ipi.getPid())+"</PID>"
              + "<AdminissionNo>"+DataUtil.toHtml(ipi.getAdminissionno())+"</AdminissionNo>"
              + "<AdmissionTimes>"+DataUtil.toHtml(ipi.getAdmissiontimes())+"</AdmissionTimes>"
              + "<PatientName>"+DataUtil.toHtml(ipi.getPatientname())+"</PatientName>"
              + "<SexCode>"+DataUtil.toHtml(ipi.getSexcode())+"</SexCode>"
              + "<Sex>"+DataUtil.toHtml(ipi.getSex())+"</Sex>"
              + "<Age>"+DataUtil.toHtml(ipi.getAge())+"</Age>"
              + "<AgeDesc>"+DataUtil.toHtml(ipi.getAgedesc())+"</AgeDesc>"
              + "<MarriageStatusCode>"+DataUtil.toHtml(ipi.getMarriagestatuscode())+"</MarriageStatusCode>"
              + "<MarriageStatus>"+DataUtil.toHtml(ipi.getMarriagestatus())+"</MarriageStatus>"
              + "<FeeTypeCode>"+DataUtil.toHtml(ipi.getFeetypecode())+"</FeeTypeCode>"
              + "<FeeTypeName>"+DataUtil.toHtml(ipi.getFeetypename())+"</FeeTypeName>"
              + "<PatientClass>"+DataUtil.toHtml(ipi.getPatientclass())+"</PatientClass>"
              + "<AdmissionRegisterTime>"+DataUtil.toHtml(ipi.getAdmissionregistertime())+"</AdmissionRegisterTime>"
              + "<AdmissionWay>"+DataUtil.toHtml(ipi.getAdmissionway())+"</AdmissionWay>"
              + "<AdmissionPurpose>"+DataUtil.toHtml(ipi.getAdmissionpurpose())+"</AdmissionPurpose>"
              + "<AdmissionTime>"+DataUtil.toHtml(ipi.getAdmissiontime())+"</AdmissionTime>"
              + "<AdmissionHospital>"+DataUtil.toHtml(ipi.getAdmissionhospital())+"</AdmissionHospital>"
              + "<AdmissionDeptCode>"+DataUtil.toHtml(ipi.getAdmissiondeptcode())+"</AdmissionDeptCode>"
              + "<AdmissionDept>"+DataUtil.toHtml(ipi.getAdmissiondept())+"</AdmissionDept>"
              + "<AdmissionWardCode>"+DataUtil.toHtml(ipi.getAdmissionwardcode())+"</AdmissionWardCode>"
              + "<AdmissionWard>"+DataUtil.toHtml(ipi.getAdmissionward())+"</AdmissionWard>"
              + "<Hospital>"+DataUtil.toHtml(ipi.getHospital())+"</Hospital>"
              + "<DeptCode>"+DataUtil.toHtml(ipi.getDeptcode())+"</DeptCode>"
              + "<DeptName>"+DataUtil.toHtml(ipi.getDeptname())+"</DeptName>"
              + "<WardCode>"+DataUtil.toHtml(ipi.getWardcode())+"</WardCode>"
              + "<WardName>"+DataUtil.toHtml(ipi.getWardname())+"</WardName>"
              + "<DischargeTime>"+DataUtil.toHtml(ipi.getDischargetime())+"</DischargeTime>"
              + "<BedNo>"+DataUtil.toHtml(ipi.getBedno())+"</BedNo>"
              + "<BedFeeType>"+DataUtil.toHtml(ipi.getBedfeetype())+"</BedFeeType>"
              + "<Room>"+DataUtil.toHtml(ipi.getRoom())+"</Room>"
              + "<StateOfIllness>"+DataUtil.toHtml(ipi.getStateofillness())+"</StateOfIllness>"
              + "<DoctorID>"+DataUtil.toHtml(ipi.getDoctorid())+"</DoctorID>"
              + "<Doctor>"+DataUtil.toHtml(ipi.getDoctor())+"</Doctor>"
              + "<MedicalFrpCode>"+DataUtil.toHtml(ipi.getMedicalfrpcode())+"</MedicalFrpCode>"
              + "<MedicalGrp>"+DataUtil.toHtml(ipi.getMedicalgrp())+"</MedicalGrp>"
              + "<NursiongLevel>"+DataUtil.toHtml(ipi.getNursionglevel())+"</NursiongLevel>"
              + "<NurseID>"+DataUtil.toHtml(ipi.getNurseid())+"</NurseID>"
              + "<Nurse>"+DataUtil.toHtml(ipi.getNurse())+"</Nurse>"
              + "<NursingGrpCode>"+DataUtil.toHtml(ipi.getNursinggrpcode())+"</NursingGrpCode>"
              + "<NursiongGrp>"+DataUtil.toHtml(ipi.getNursionggrp())+"</NursiongGrp>"
              + "<InStatus>"+DataUtil.toHtml(ipi.getInstatus())+"</InStatus>"
              + "<MrStatus>"+DataUtil.toHtml(ipi.getMrstatus())+"</MrStatus>"
              + "<DischargeWay>"+DataUtil.toHtml(ipi.getDischargeway())+"</DischargeWay>"
              + "<ManageType>"+DataUtil.toHtml(ipi.getManagetype())+"</ManageType>"
              + "</InPatientInfo>"
              + "</HtRequest>";
			String result = LoadWS1.loadWs("manageAdt", "InPatientInfo", xmlStr);		
			System.out.println("result-"+result);
			String returnCode = "";
			String returnStr = "";
			try{
				HtResponseDocument doc = HtResponseDocument.Factory.parse(result);
				ReturnValue[] rvs = doc.getHtResponse().getReturnValueArray();
				if(rvs!=null&&rvs.length==1){
					ReturnValue rv = rvs[0];
					returnCode = StringUtil.toHtml(rv.getReturnCode());
					returnStr = StringUtil.toHtml(rv.getReturnStr());
				}
			}catch(Exception e){
				e.printStackTrace();
				returnCode = "2";
				returnStr = "返回值解析错误，请查看接口日志！";
			}
			System.out.println("returnCode-"+returnCode);
			System.out.println("returnStr--"+returnStr);
			if(!"1".equals(returnCode)){
				returnCode = "2";
			}

			String update_sql = "update inpatientinfo set impflag='"+returnCode+"',returndesc='"+returnStr+"' where recordFlow='"+ipi.getRecordflow()+"'";
			System.out.println("update_sql---"+update_sql);
			PreparedStatement pst = hisdb.prepareStatement(update_sql);
	     	pst.executeUpdate();
	     	pst.close();
	        hisdb.commit();
		}

	}
}
