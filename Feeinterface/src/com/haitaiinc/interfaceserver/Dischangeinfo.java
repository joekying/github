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
	 * 生成插入操作的PreparedStatement
	 * @param pst 使用INSERT预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeInsSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setInt(++index, Integer.parseInt(Ano)); //病人ID
		pst.setString(++index, xm); //姓名
		pst.setString(++index, xb); //性别
		pst.setString(++index, nl); //年龄
		pst.setString(++index, cwh); //床号
		pst.setString(++index, bmh); //病区
		pst.setString(++index, zyh); //住院号
		pst.setString(++index, DataUtil.transDateTime(ryrq)); //入院日期
		pst.setString(++index, DataUtil.transDateTime(cyrq)); //出院日期
		pst.setInt(++index, zyts); //住院天数
		pst.setString(++index, zdcy); //自动出院
		pst.setString(++index, lxdh); //联系电话
		pst.setString(++index, xxh); //X线号
		pst.setString(++index, cth); //CT(MRI)号
		pst.setString(++index, blh); //病理号
		pst.setString(++index, blzd); //病理诊断
		pst.setString(++index, ryzd); //入院诊断
		pst.setString(++index, cyzd); //出院诊断
		pst.setString(++index, ryqk); //入院情况
		pst.setString(++index, zyjg); //住院经过
		pst.setString(++index, cyqk); //出院情况
		pst.setString(++index, cyyz); //出院医嘱
		pst.setString(++index, bz); //备注
		
		return pst;
	}

	/**
	 * Method makeUpdSt.
	 * 生成修改操作的PreparedStatement
	 * @param pst 使用UPDATE预处理好的PreparedStatement
	 * @return PreparedStatement 返回设置过值的pst，<br>
	 * 与传入的pst是同一个对象
	 * @throws SQLException
	 */
	public PreparedStatement makeUpdSt(PreparedStatement pst)
		throws SQLException {
		int index = 0;
		pst.setString(++index, xm); //姓名
		pst.setString(++index, xb); //性别
		pst.setString(++index, nl); //年龄
		pst.setString(++index, cwh); //床号
		pst.setString(++index, bmh); //病区
		pst.setString(++index, zyh); //住院号
		pst.setString(++index, DataUtil.transDateTime(ryrq)); //入院日期
		pst.setString(++index, DataUtil.transDateTime(cyrq)); //出院日期
		pst.setInt(++index, zyts); //住院天数
		pst.setString(++index, zdcy); //自动出院
		pst.setString(++index, lxdh); //联系电话
		pst.setString(++index, xxh); //X线号
		pst.setString(++index, cth); //CT(MRI)号
		pst.setString(++index, blh); //病理号
		pst.setString(++index, blzd); //病理诊断
		pst.setString(++index, ryzd); //入院诊断
		pst.setString(++index, cyzd); //出院诊断
		pst.setString(++index, ryqk); //入院情况
		pst.setString(++index, zyjg); //住院经过
		pst.setString(++index, cyqk); //出院情况
		pst.setString(++index, cyyz); //出院医嘱
		pst.setString(++index, bz); //备注
		pst.setInt(++index, Integer.parseInt(Ano)); //病人ID
		
		return pst;
	}
	
	/**
	 * Method fetchCommonCode.
	 * 将使用SELECT得到的结果集里的值传到当前对象的对应属性中
	 * @param rs
	 * @throws SQLException
	 */
	public void fetchDischangeinfo(ResultSet rs) throws SQLException {
		Ano = rs.getInt("Ano")+""; //病人ID
		xm = rs.getString("xm"); //姓名
		xb = rs.getString("xb"); //性别
		nl = rs.getString("nl"); //年龄
		cwh = rs.getString("cwh"); //床号
		bmh = rs.getString("bmh"); //病区
		zyh = rs.getString("zyh"); //住院号
		ryrq = DataUtil.getDateTime(rs.getString("ryrq")); //入院日期
		cyrq = DataUtil.getDateTime(rs.getString("cyrq")); //出院日期
		zyts = rs.getInt("zyts"); //住院天数
		zdcy = rs.getString("zdcy"); //自动出院
		lxdh = rs.getString("lxdh"); //联系电话
		xxh = rs.getString("xxh"); //X线号
		cth = rs.getString("cth"); //CT(MRI)号
		blh = rs.getString("blh"); //病理号
		blzd = rs.getString("blzd"); //病理诊断
		ryzd = rs.getString("ryzd"); //入院诊断
		cyzd = rs.getString("cyzd"); //出院诊断
		ryqk = rs.getString("ryqk"); //入院情况
		zyjg = rs.getString("zyjg"); //住院经过
		cyqk = rs.getString("cyqk"); //出院情况
		cyyz = rs.getString("cyyz"); //出院医嘱
		bz = rs.getString("bz"); //备注
		
	}
	
	/**
	 * Method fetchCommonCode.
	 * 将使用SELECT得到的结果集里的值传到当前对象的对应属性中
	 * @param rs
	 * @throws SQLException
	 */
	public void summarytoDischange(DischangeSummary ds,Connection emrdb) throws SQLException {
		Ano = ds.getIpid(); //病人ID
		xm = ds.getName(); //姓名
		xb = ds.getSex(); //性别
		nl = ds.getAge(); //年龄
		cwh = ds.getBed(); //床号
		bmh = ds.getWard(); //病区
		zyh = ds.getPid(); //住院号
		ryrq = ds.getAdmissionTime(); //入院日期
		cyrq = ds.getDischangeTime(); //出院日期
		zyts = ds.getInHopitalDay(); //住院天数
		lxdh = ""; //联系电话
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
			Element structs = rootElm.element("structs");// "structs"是节点名
			List nodes = structs.elements("struct");// "struct"是节点名
			
			for (Iterator it = nodes.iterator(); it.hasNext();) {
			   Element elm = (Element) it.next();
			   Attribute attribute=elm.attribute("id");// 属性名name
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
