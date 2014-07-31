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

public class ManageLabReport {
private Connection lisdb = null;
private Connection emrdb = null;
	
	public ManageLabReport(Connection emrdb,Connection lisdb)throws Exception {
		if (lisdb == null ) {
			throw new Exception("�쳣����");
		}
		if (emrdb == null ) {
			throw new Exception("�쳣����");
		}
		this.lisdb = lisdb;
		this.emrdb = emrdb;
	}
	/**
	 *�Ӽ��鱨���м���ȡ���ݵ���webservice��������д��EMR���鱨�����
	 */
	public void LabReport() throws Exception {
		Labreportinfo lri = new Labreportinfo();
//		lri.setImpflag("0");
//		lri.setOrderByStr("RecordFlow");
		
		List lriList = new Vector();
		List noLriList = new Vector();
		String sql = lri.makeSearchSql();
		System.out.println("sql---"+sql);
		Statement stm = lisdb.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			Labreportinfo lri_temp = new Labreportinfo();
			lri_temp.fetchLabreportinfo(rs);
			String labFlow =StringUtil.toHtml( lri_temp.getLabFlow());
			System.out.println("=======LabFlow:"+labFlow);
			if(!"".equals(labFlow)){
				Statement stmEmr = emrdb.createStatement();
				ResultSet rsEmr = stmEmr.executeQuery("select ipid,pid from ADT.INPATIENT where ADMINISSION_NO='"+lri_temp.getPid()+"'");
				System.out.println("======Pid==ADMINISSION_NO==:"+lri_temp.getPid());
				if(rsEmr.next()){
					lri_temp.setIpid(rsEmr.getString("ipid"));
					lri_temp.setPid(rsEmr.getString("pid"));
					lriList.add(lri_temp);
				}else{
					noLriList.add(lri_temp);
				}
				
			}else{
				noLriList.add(lri_temp);
			}
		}
		rs.close();
		stm.close();
		
		System.out.println("��LIS�м��LabReportInfo�ж�ȡ��Ҫ����Ĳ��˼��鱨������"+lriList.size()+"��");
		System.out.println("��LIS�м��LabReportInfo�ж�ȡ��EMRδ�иò��˵�����"+noLriList.size()+"��");

		for(int i=0;i<lriList.size();i++){
			lri = (Labreportinfo)lriList.get(i);
			String recordFLow = lri.getRecordflow(); //���鱨���м���¼��ˮ��
			String labFlow =StringUtil.toHtml( lri.getLabFlow()); 
			
			//��ȡ���鱨���ӱ�����Ӧ������(��������Ŀֵ��ˮ��Ϊ�� ���� ���鱨����ˮ��������һ�µļ�¼ɸѡ��)
			Labreportiteminfo lrii = new Labreportiteminfo();
			lrii.setRecordflow(recordFLow);
			lrii.setOrderByStr("RecordItemFlow");
			List lriiList = new Vector();
			String sql_item = lrii.makeSearchSql();
			System.out.println("sql_item---"+sql_item);
			Statement stm_item = lisdb.createStatement();
			ResultSet rs_item = stm_item.executeQuery(sql_item);
			while (rs_item.next()) {
				Labreportiteminfo lrii_temp = new Labreportiteminfo();
				lrii_temp.fetchLabreportiteminfo(rs_item);
				lrii_temp.setIpid(lri.getIpid());
				lrii_temp.setPid(lri.getPid());
				String labFlow_temp =StringUtil.toHtml(lrii_temp.getLabFlow());
				String labItemRcdFlow = StringUtil.toHtml(lrii_temp.getLabItemRcdFlow());
				if(labFlow_temp.equals(labFlow)&&!"".equals(labItemRcdFlow)){
					lriiList.add(lrii_temp);
				}
			}
			rs_item.close();
			stm_item.close();
			
			String xmlStr= 
				"<?xml version=\"1.0\" encoding=\"GBK\"?>"
             + "<HtRequest >"
             + "<LabReportInfo>"
             + "<RecordFlow>"+DataUtil.toHtml(lri.getRecordflow())+"</RecordFlow>"
             + "<LabFlow>"+DataUtil.toHtml(lri.getLabFlow())+"</LabFlow>"
             + "<PID>"+DataUtil.toHtml(lri.getPid())+"</PID>"
             + "<IPID>"+DataUtil.toHtml(lri.getIpid())+"</IPID>"
             + "<InOutFlag>"+DataUtil.toHtml(lri.getInoutFlag())+"</InOutFlag>"
             + "<LabRepCode>"+DataUtil.toHtml(lri.getLabRepCode())+"</LabRepCode>"
             + "<LabRepName>"+DataUtil.toHtml(lri.getLabRepName())+"</LabRepName>"
             + "<LabApplyTime>"+DataUtil.getDateTime(DataUtil.toHtml(lri.getLabApplyTime()))+"</LabApplyTime>"
             + "<LabApplierCode>"+DataUtil.toHtml(lri.getLabApplierCode())+"</LabApplierCode>"
             + "<LabApplierName>"+DataUtil.toHtml(lri.getLabApplierName())+"</LabApplierName>"
             + "<SampleSubmitTime>"+DataUtil.getDateTime(DataUtil.toHtml(lri.getSampleSubmitTime()))+"</SampleSubmitTime>"
             + "<SampleSubmitCode>"+DataUtil.toHtml(lri.getSampleSubmiterCode())+"</SampleSubmitCode>"
             + "<SampleSubmitName>"+DataUtil.toHtml(lri.getSampleSubmiterName())+"</SampleSubmitName>"
             + "<ApplierDeptCode>"+DataUtil.toHtml(lri.getApplierDeptCode())+"</ApplierDeptCode>"
             + "<ApplierDept>"+DataUtil.toHtml(lri.getApplierDept())+"</ApplierDept>"
             + "<SampleCode>"+DataUtil.toHtml(lri.getSampleCode())+"</SampleCode>"
             + "<Sample>"+DataUtil.toHtml(lri.getSample())+"</Sample>"
             + "<IsUrgent>"+DataUtil.toHtml(lri.getIsUrgent())+"</IsUrgent>"
             + "<LabStatus>"+DataUtil.toHtml(lri.getLabStatus())+"</LabStatus>"
             + "<LabTime>"+DataUtil.getDateTime(DataUtil.toHtml(lri.getLabTime()))+"</LabTime>"
             + "<LabRecorderID>"+DataUtil.toHtml(lri.getLabRecorderId())+"</LabRecorderID>"
             + "<LabRecorder>"+DataUtil.toHtml(lri.getLabRecorder())+"</LabRecorder>"
             + "<AuditUserID>"+DataUtil.toHtml(lri.getAuditUserId())+"</AuditUserID>"
             + "<AuditUserName>"+DataUtil.toHtml(lri.getAuditUserName())+"</AuditUserName>"
             + "<LabInstrument>"+DataUtil.toHtml(lri.getLabInstrument())+"</LabInstrument>"
             + "<LabDeptCode>"+DataUtil.toHtml(lri.getLabDeptCode())+"</LabDeptCode>"
             + "<LabDeptName>"+DataUtil.toHtml(lri.getLabDeptName())+"</LabDeptName>"
             + "<SampleRecvTime>"+DataUtil.getDateTime(DataUtil.toHtml(lri.getSampleRecvTime()))+"</SampleRecvTime>"
             + "<SampleReceiverID>"+DataUtil.toHtml(lri.getSampleReceiverId())+"</SampleReceiverID>"
             + "<SampleReceiver>"+DataUtil.toHtml(lri.getSampleReceiver())+"</SampleReceiver>"
             + "<Age>"+DataUtil.toHtml(lri.getAge())+"</Age>"
             + "<BedNo>"+DataUtil.toHtml(lri.getBedNo())+"</BedNo>"
             + "<IsBacilli>"+DataUtil.toHtml(lri.getIsBacilli())+"</IsBacilli>"
             + "<DangerDescribe>"+DataUtil.toHtml(lri.getDangerDescribe())+"</DangerDescribe>"
             + "<LabOtherFlag>"+DataUtil.toHtml(lri.getLabOtherFlag())+"</LabOtherFlag>"
             + "<Remark>"+DataUtil.toHtml(lri.getRemark())+"</Remark>";
            for(int j=0;j<lriiList.size();j++){
            	Labreportiteminfo lrii_temp = (Labreportiteminfo)lriiList.get(j);
            	xmlStr+= "<LabReportItemInfo>"
            		+"<LabItemRcdFlow>"+DataUtil.toHtml(lrii_temp.getLabItemRcdFlow())+"</LabItemRcdFlow>"
            		+"<LabFlow>"+DataUtil.toHtml(lrii_temp.getLabFlow())+"</LabFlow>"
        			+"<PID>"+DataUtil.toHtml(lrii_temp.getPid())+"</PID>"
        			+"<IPID>"+DataUtil.toHtml(lrii_temp.getIpid())+"</IPID>"
        			+"<LabRepItemCode>"+DataUtil.toHtml(lrii_temp.getLabRepitemCode())+"</LabRepItemCode>"
        			+"<LabRepItemName>"+DataUtil.toHtml(lrii_temp.getLabRepitemName())+"</LabRepItemName>"
        			+"<LabRepItemOtherName>"+DataUtil.toHtml(lrii_temp.getLabRepitemOtherName())+"</LabRepItemOtherName>"
        			+"<ResultType>"+DataUtil.toHtml(lrii_temp.getResultType())+"</ResultType>"
        			+"<ResultNum>"+DataUtil.toHtml(lrii_temp.getResultNum())+"</ResultNum>"
        			+"<ResultText>"+DataUtil.toHtml(lrii_temp.getResultNum())+DataUtil.toHtml(lrii_temp.getResultText())+"</ResultText>"
        			+"<LowerLimit1>"+DataUtil.toHtml(lrii_temp.getLowerLimit1())+"</LowerLimit1>"
        			+"<UpperLimit1>"+DataUtil.toHtml(lrii_temp.getUpperLimit1())+"</UpperLimit1>"
        			+"<ReferenceText>"+DataUtil.toHtml(lrii_temp.getReferenceText())+"</ReferenceText>"
        			+"<LabRepItemUnitCode>"+DataUtil.toHtml(lrii_temp.getLabRepitemUnitCode())+"</LabRepItemUnitCode>"
        			+"<LabRepItemUnit>"+DataUtil.toHtml(lrii_temp.getLabRepitemUnit())+"</LabRepItemUnit>"
        			+"<DangerFlag>"+DataUtil.toHtml(lrii_temp.getDangerFlag())+"</DangerFlag>"
        			+"<ChangeFlag>"+DataUtil.toHtml(lrii_temp.getChangeFlag())+"</ChangeFlag>"
            		+"</LabReportItemInfo>";
            }
             xmlStr+= "</LabReportInfo>"
             + "</HtRequest>";
             System.err.println(xmlStr);
			String result = LoadWS1.loadWs("manageLabReport", "LabReportInfo", xmlStr);
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
//			String update_sql = "update labreportinfo set impflag='"+returnCode+"',returndesc='"+returnStr+"' where recordFlow='"+lri.getRecordflow()+"'";
			String update_sql = "update Reportform  set zdy10='1' where SectionNo="+lri.getSectionNo()+" and PatNo='"+lri.getPatNo()+"' and TestTypeNo="+lri.getTestTypeNo()+" and SampleNo='"+lri.getSampleNo()+"'";
			System.out.println("update_sql---"+update_sql);
			PreparedStatement pst = lisdb.prepareStatement(update_sql);
	     	pst.executeUpdate();
	     	pst.close();
	        lisdb.commit();
		}
		Labreportinfo noLri = new Labreportinfo();
		if(noLriList.size()>0){
			System.out.println("��ʼ��EMRδ�еĲ������ݿ�ʼ���Ѵ����ǣ�");
		}
		for(int i=0;i<noLriList.size();i++){
			noLri = (Labreportinfo)noLriList.get(i);

			String update_sql = "update Reportform  set zdy10='1' where SectionNo="+noLri.getSectionNo()+" and PatNo='"+noLri.getPatNo()+"' and TestTypeNo="+noLri.getTestTypeNo()+" and SampleNo='"+noLri.getSampleNo()+"'";
			System.out.println("no_update_sql---"+update_sql);
			PreparedStatement pst = lisdb.prepareStatement(update_sql);
	     	pst.executeUpdate();
	     	pst.close();
	        lisdb.commit();
		}
	}
}
