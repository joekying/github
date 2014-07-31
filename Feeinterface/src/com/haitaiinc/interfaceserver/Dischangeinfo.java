package com.haitaiinc.interfaceserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.haitaiinc.ICommon.DataUtil;
import com.haitaiinc.struct.DischangeSummary;

/**
 * @author haitaiinc
 * ExamReportInfo
 */
public class Dischangeinfo
		extends com.haitaiinc.struct.Dischangeinfo{

	public static final String INSERT =
		"insert into bajc_cyjr(Ano,xm,xb,nl,cwh,bmh,zyh,ryrq,cyrq,zyts,zdcy,lxdh,xxh,cth,blh,blzd,ryzd,cyzd,ryqk,zyjg,cyqk,cyyz,bz)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public static final String UPDATE =
		"update bajc_cyjr set xm=?,xb=?,nl=?,cwh=?,bmh=?,zyh=?,ryrq=?,cyrq=?,zyts=?,zdcy=?,lxdh=?,xxh=?,cth=?,blh=?,blzd=?,ryzd=?,cyzd=?,ryqk=?,zyjg=?,cyqk=?,cyyz=?,bz=? where Ano=?";

	public static final String SELECT =
		"select Ano,xm,xb,nl,cwh,bmh,zyh,ryrq,cyrq,zyts,zdcy,lxdh,xxh,cth,blh,blzd,ryzd,cyzd,ryqk,zyjg,cyqk,cyyz,bz from bajc_cyjr ";
	
	/**
	 * Method makeInsSt.
	 * ���ɲ��������PreparedStatement
	 * @param pst ʹ��INSERTԤ����õ�PreparedStatement
	 * @return PreparedStatement �������ù�ֵ��pst��<br>
	 * �봫���pst��ͬһ������
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setInt(++index, Integer.parseInt(Ano)); //����ID
		pst.setString(++index, xm); //����
		pst.setString(++index, xb); //�Ա�
		pst.setString(++index, nl); //����
		pst.setString(++index, cwh); //����
		pst.setString(++index, bmh); //����
		pst.setString(++index, zyh); //סԺ��
		pst.setString(++index, DataUtil.transDateTime(ryrq)); //��Ժ����
		pst.setString(++index, DataUtil.transDateTime(cyrq)); //��Ժ����
		pst.setInt(++index, zyts); //סԺ����
		pst.setString(++index, zdcy); //�Զ���Ժ
		pst.setString(++index, lxdh); //��ϵ�绰
		pst.setString(++index, xxh); //X�ߺ�
		pst.setString(++index, cth); //CT(MRI)��
		pst.setString(++index, blh); //�����
		pst.setString(++index, blzd); //�������
		pst.setString(++index, ryzd); //��Ժ���
		pst.setString(++index, cyzd); //��Ժ���
		pst.setString(++index, ryqk); //��Ժ���
		pst.setString(++index, zyjg); //סԺ����
		pst.setString(++index, cyqk); //��Ժ���
		pst.setString(++index, cyyz); //��Ժҽ��
		pst.setString(++index, bz); //��ע
		
		return pst;
	}

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
		pst.setString(++index, xm); //����
		pst.setString(++index, xb); //�Ա�
		pst.setString(++index, nl); //����
		pst.setString(++index, cwh); //����
		pst.setString(++index, bmh); //����
		pst.setString(++index, zyh); //סԺ��
		pst.setString(++index, DataUtil.transDateTime(ryrq)); //��Ժ����
		pst.setString(++index, DataUtil.transDateTime(cyrq)); //��Ժ����
		pst.setInt(++index, zyts); //סԺ����
		pst.setString(++index, zdcy); //�Զ���Ժ
		pst.setString(++index, lxdh); //��ϵ�绰
		pst.setString(++index, xxh); //X�ߺ�
		pst.setString(++index, cth); //CT(MRI)��
		pst.setString(++index, blh); //�����
		pst.setString(++index, blzd); //�������
		pst.setString(++index, ryzd); //��Ժ���
		pst.setString(++index, cyzd); //��Ժ���
		pst.setString(++index, ryqk); //��Ժ���
		pst.setString(++index, zyjg); //סԺ����
		pst.setString(++index, cyqk); //��Ժ���
		pst.setString(++index, cyyz); //��Ժҽ��
		pst.setString(++index, bz); //��ע
		pst.setInt(++index, Integer.parseInt(Ano)); //����ID
		
		return pst;
	}
	
	/**
	 * Method fetchCommonCode.
	 * ��ʹ��SELECT�õ��Ľ�������ֵ������ǰ����Ķ�Ӧ������
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchDischangeinfo(ResultSet rs) throws SQLException {
		Ano = rs.getInt("Ano")+""; //����ID
		xm = rs.getString("xm"); //����
		xb = rs.getString("xb"); //�Ա�
		nl = rs.getString("nl"); //����
		cwh = rs.getString("cwh"); //����
		bmh = rs.getString("bmh"); //����
		zyh = rs.getString("zyh"); //סԺ��
		ryrq = DataUtil.getDateTime(rs.getString("ryrq")); //��Ժ����
		cyrq = DataUtil.getDateTime(rs.getString("cyrq")); //��Ժ����
		zyts = rs.getInt("zyts"); //סԺ����
		zdcy = rs.getString("zdcy"); //�Զ���Ժ
		lxdh = rs.getString("lxdh"); //��ϵ�绰
		xxh = rs.getString("xxh"); //X�ߺ�
		cth = rs.getString("cth"); //CT(MRI)��
		blh = rs.getString("blh"); //�����
		blzd = rs.getString("blzd"); //�������
		ryzd = rs.getString("ryzd"); //��Ժ���
		cyzd = rs.getString("cyzd"); //��Ժ���
		ryqk = rs.getString("ryqk"); //��Ժ���
		zyjg = rs.getString("zyjg"); //סԺ����
		cyqk = rs.getString("cyqk"); //��Ժ���
		cyyz = rs.getString("cyyz"); //��Ժҽ��
		bz = rs.getString("bz"); //��ע
		
	}
	
	/**
	 * Method fetchCommonCode.
	 * ��ʹ��SELECT�õ��Ľ�������ֵ������ǰ����Ķ�Ӧ������
	 * @param rs
	 * @throws SQLException
	 */
	public void summarytoDischange(DischangeSummary ds,Connection emrdb) throws SQLException {
		Ano = ds.getIpid(); //����ID
		xm = ds.getName(); //����
		xb = ds.getSex(); //�Ա�
		nl = ds.getAge(); //����
		cwh = ds.getBed(); //����
		bmh = ds.getWard(); //����
		zyh = ds.getPid(); //סԺ��
		ryrq = ds.getAdmissionTime(); //��Ժ����
		cyrq = ds.getDischangeTime(); //��Ժ����
		zyts = ds.getInHopitalDay(); //סԺ����
		lxdh = ""; //��ϵ�绰
		String ryzd = "";
		String cyzd = "";
		Statement stm1 = emrdb.createStatement();
		ResultSet rs1 = stm1.executeQuery("select DIAG_TYPE_CODE,DIAG_NAME from INPCASE.INP_DIAG where ipid='"+ds.getIpid()+"' and DIAG_TYPE_CODE in('ryzd','cyzd') order by CREATE_TIME");
		while (rs1.next()) {
			if("ryzd".equals(rs1.getString(1))){
				ryzd += rs1.getString(2)+",";
			}else{
				cyzd += rs1.getString(2)+",";
			}
		}
		rs1.close();
		stm1.close();
		String cont = ds.getXmlCont();
		try {
			Document document = DocumentHelper.parseText(cont);
			Element rootElm = document.getRootElement();
			Element structs = rootElm.element("structs");// "structs"�ǽڵ���
			List nodes = structs.elements("struct");// "struct"�ǽڵ���
			
			for (Iterator it = nodes.iterator(); it.hasNext();) {
			   Element elm = (Element) it.next();
			   Attribute attribute=elm.attribute("id");// ������name
			   if("XR_NUM".equals(attribute.getText())){
				   xxh = elm.attribute("value").getText();
			   }else if("MRI_NUM".equals(attribute.getText())){
				   cth = elm.attribute("value").getText();
			   }else if("PATHOLOGY_NUM".equals(attribute.getText())){
				   blh = elm.attribute("value").getText();
			   }else if("PATHOLOGY_DIAGNOSIS".equals(attribute.getText())){
				   blzd = elm.attribute("value").getText();
			   }else if("ADMISSION_STATE".equals(attribute.getText())){
				   ryqk = elm.attribute("value").getText();
			   }else if("TREAT_PROCESS".equals(attribute.getText())){
				   zyjg = elm.attribute("value").getText();
			   }else if("DISCHARGE_STATE".equals(attribute.getText())){
				   cyqk = elm.attribute("value").getText();
			   }else if("DISCHARGE_ORDER".equals(attribute.getText())){
				   cyyz = elm.attribute("value").getText();
			   }else if("MEMO".equals(attribute.getText())){
				   bz = elm.attribute("value").getText();
			   }else if("AUTO_DISCHANGE".equals(attribute.getText())){
				   zdcy = elm.attribute("value").getText();
			   }
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
