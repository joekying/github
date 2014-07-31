package com.haitaiinc.interfaceserver;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.jaxen.function.ext.LowerFunction;

public class LoadWS {
	
	public static String loadWs(String method,String type,String xmlStr) {
		System.err.println("------------------------------");
		System.err.println(xmlStr);
		System.err.println("------------------------------");
		String url = "http://130.150.161.7:8080/HtWebService/services/Manage";
		String result = "";
		try{
			Service  service = new Service();
            Call call = (Call) service.createCall();
            call.setOperationName(new QName(url,method));
            call.addParameter("type",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.addParameter("xmlStr",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);
            call.setTargetEndpointAddress(new java.net.URL(url));
            result = (String)call.invoke(new Object[]{type,xmlStr});
            System.err.println("result:"+result);
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args){
		String method = "manageDict";
		String type = "WardDictInfo";
		String xmlStr = 
			"<?xml version=\"1.0\" encoding=\"GBK\"?>"
			+ "<HtRequest>" 
			+"<WardDictInfo>"
			+"<RecordFlow>10000000000000001</RecordFlow>"
			+"<WardCode>009</WardCode>"
			+"<WardName>²¡Çø1</WardName>"
			+"<DeptCode>002</DeptCode>"
			+"<DeptName>¿ÆÊÒ2</DeptName>"
			+"<HospitalCode>00001</HospitalCode>"
			+"<HospitalName>JYFY</HospitalName>"
			+"<Ordinal>1</Ordinal>"
			+"<Available>Y</Available>"
			+"</WardDictInfo>"
			+"</HtRequest>" 
			;
		loadWs(method, type, xmlStr);
	}
}
