package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import com.haitaiinc.ICommon.DataUtil;
import com.haitaiinc.htemr.ws.schema.HtResponseDocument;
import com.haitaiinc.htemr.ws.schema.ReturnValue;
import com.haitaiinc.utils.StringUtil;

/**
 * @author W.B.Jiang
 * 2011-10-27
 * ���ڴ�Hisϵͳ��ȡ���˼�鱨������
 */
public class ManageExamReport {
	private Connection pacsdb = null;
	private Connection emrdb = null;
	
	public ManageExamReport(Connection emrdb,Connection pacsdb)throws Exception {
		if (pacsdb == null ) {
			throw new Exception("�쳣����");
		}
		if (emrdb == null ) {
			throw new Exception("�쳣����");
		}
		this.pacsdb = pacsdb;
		this.emrdb = emrdb;
	}
	
	/**
	 *�Ӽ�鱨���м���ȡ���ݵ���webservice��������д��EMR��鱨�����
	 */
	public void ExamReport() throws Exception {
		Examreportinfo epi = new Examreportinfo();
		epi.setImpflag("0");
		epi.setOrderByStr("RecordFlow");
		
		List epiList = new Vector();
		List noEpiList = new Vector();
		String sql = epi.makeSearchSql();
		System.out.println("sql---"+sql);
		Statement stm = pacsdb.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			Examreportinfo epi_temp = new Examreportinfo();
			epi_temp.fetchExamreportinfo(rs);
			String examRptFlow =StringUtil.toHtml( epi_temp.getExamRptFlow());
			System.out.println("=======examRptFlow:"+examRptFlow);
			if(!"".equals(examRptFlow)){
				Statement stmEmr = emrdb.createStatement();
				ResultSet rsEmr = stmEmr.executeQuery("select ipid,pid from ADT.INPATIENT where ADMINISSION_NO='"+epi_temp.getIpid()+"'");
				System.out.println("======IPid==ADMINISSION_NO==:"+epi_temp.getIpid());
				if(rsEmr.next()){
					epi_temp.setIpid(rsEmr.getString("ipid"));
					epi_temp.setPid(rsEmr.getString("pid"));
					epiList.add(epi_temp);
				}else{
					noEpiList.add(epi_temp);
				}
				
			}else{
				noEpiList.add(epi_temp);
			}
		}
		rs.close();
		stm.close();
		
		System.out.println("��PACS�м��ExamReportInfo�ж�ȡ��Ҫ����Ĳ��˼�鱨������"+epiList.size()+"��");
		System.out.println("��PACS�м��ExamReportInfo�ж�ȡ��EMRδ�иò��˼�鱨�������"+noEpiList.size()+"��");

		for(int i=0;i<epiList.size();i++){
			epi = (Examreportinfo)epiList.get(i);
			String xmlStr= 
				"<?xml version=\"1.0\" encoding=\"GBK\"?>"
              + "<HtRequest >"
              + "<ExamReportInfo>"
              + "<RecordFlow>"+DataUtil.toHtml(epi.getRecordflow())+"</RecordFlow >"
              + "<ExamRptFlow>"+DataUtil.toHtml(epi.getExamRptFlow())+"</ExamRptFlow>"
              + "<OrderSn>"+DataUtil.toHtml(epi.getOrderSn())+"</OrderSn>"
              + "<PID>"+DataUtil.toHtml(epi.getPid())+"</PID>"
              + "<IPID>"+DataUtil.toHtml(epi.getIpid())+"</IPID>"
              + "<InOutFlag>"+DataUtil.toHtml(epi.getInoutFlag())+"</InOutFlag>"
              + "<ExamCode>"+DataUtil.toHtml(epi.getExamCode())+"</ExamCode>"
              + "<ExamName>"+DataUtil.toHtml(epi.getExamName())+"</ExamName>"
              + "<PerformedDeptCode>"+DataUtil.toHtml(epi.getPerformedDeptCode())+"</PerformedDeptCode>"
              + "<PerformedDept>"+DataUtil.toHtml(epi.getPerformedDept())+"</PerformedDept>"
              + "<ExamOrderName>"+DataUtil.toHtml(epi.getExamOrderName())+"</ExamOrderName>"
              + "<ExamDiagnose>"+DataUtil.toHtml(epi.getExamDiagnose())+"</ExamDiagnose>"
              + "<ExamReportCode>"+DataUtil.toHtml(epi.getExamReporterCode())+"</ExamReportCode>"
              + "<ExamReporter>"+DataUtil.toHtml(epi.getExamReporter())+"</ExamReporter>"
              + "<ExamTime>"+DataUtil.toHtml(epi.getExamTime())+"</ExamTime>"
              + "<AuditStatus>"+DataUtil.toHtml(epi.getAuditStatus())+"</AuditStatus>"
              + "<AuditUserID>"+DataUtil.toHtml(epi.getAuditUserId())+"</AuditUserID>"
              + "<AuditUserName>"+DataUtil.toHtml(epi.getAuditUserName())+"</AuditUserName>"
              + "<AuditTime>"+DataUtil.toHtml(epi.getAuditTime())+"</AuditTime>"
              + "<DangerFlag>"+DataUtil.toHtml(epi.getDangerFlag())+"</DangerFlag>"
              + "<Remark>"+DataUtil.toHtml(epi.getRemark())+"</Remark>"
              + "<ApplierID>"+DataUtil.toHtml(epi.getApplierId())+"</ApplierID>"
              + "<Applier>"+DataUtil.toHtml(epi.getApplier())+"</Applier>"
              + "<ApplierDeptCode>"+DataUtil.toHtml(epi.getApplierDeptCode())+"</ApplierDeptCode>"
              + "<ApplierDept>"+DataUtil.toHtml(epi.getApplierDept())+"</ApplierDept>"
              + "<ApplyTime>"+DataUtil.toHtml(epi.getApplyTime())+"</ApplyTime>"
              + "<ExamRptCont>"+epi.getExamRptCont()+"</ExamRptCont>"
              + "</ExamReportInfo>"
              + "</HtRequest>";
			String result = LoadWS1.loadWs("manageExamReport", "ExamReportInfo", xmlStr);
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
				returnStr = "����ֵ����������鿴�ӿ���־��";
			}
			System.out.println("returnCode-"+returnCode);
			System.out.println("returnStr--"+returnStr);
			if(!"1".equals(returnCode)){
				returnCode = "2";
			}
			String update_sql = "update examreportinfo set impflag='"+returnCode+"',returndesc='"+returnStr+"' where recordFlow='"+epi.getRecordflow()+"'";
			System.out.println("update_sql---"+update_sql);
			PreparedStatement pst = pacsdb.prepareStatement(update_sql);
	     	pst.executeUpdate();
	     	pst.close();
	        pacsdb.commit();
		}
		
		Examreportinfo noEri = new Examreportinfo();
		if(noEpiList.size()>0){
			System.out.println("��ʼ��EMRδ�еĲ������ݿ�ʼ���Ѵ����ǣ�");
		}
		for(int i=0;i<noEpiList.size();i++){
			noEri = (Examreportinfo)noEpiList.get(i);

			String update_sql = "update examreportinfo set impflag='2',returndesc='EMRû�иò��˼�¼' where recordFlow='"+noEri.getRecordflow()+"'";
			System.out.println("update_sql---"+update_sql);
			PreparedStatement pst = pacsdb.prepareStatement(update_sql);
	     	pst.executeUpdate();
	     	pst.close();
	        pacsdb.commit();
		}
	}
	
}
