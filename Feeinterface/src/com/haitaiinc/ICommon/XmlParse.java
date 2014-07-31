package com.haitaiinc.ICommon;

import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;

import com.haitaiinc.exception.HTException;
import com.haitaiinc.utils.StringUtil;

public class XmlParse {
	private Document doc = null;
	private Element rootEle = null;

	private static final XMLOutputter xmlout = new XMLOutputter();

	static {

		Format fm = xmlout.getFormat();
		fm.setEncoding("GB2312");
		xmlout.setFormat(fm);
	}

	public XmlParse(String xml) throws HTException {
		if (xml != null && xml.trim().length() > 0) {
			try {
				SAXBuilder s = new SAXBuilder();
				StringReader reader = new StringReader(xml);
				doc = s.build(reader);
				rootEle = doc.getRootElement();
				reader.close();
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new HTException(e);
			}
		}
	}

	public Element getRootEle() {
		return rootEle;
	}

	public Element getElement(String xpath) {
		Element ret = null;
		if (rootEle != null && xpath != null) {
			try {
				ret = (Element) XPath.selectSingleNode(rootEle, xpath);
			}
			catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	public static Element getElement(Element ele, String xpath) {
		Element ret = null;
		if (ele != null && xpath != null) {
			try {
				ret = (Element) XPath.selectSingleNode(ele, xpath);
			}
			catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	public String getElementText(String xpath) {
		String ret = null;
		if (rootEle != null && xpath != null) {
			try {
				Element ele = (Element) XPath.selectSingleNode(rootEle, xpath);
				if (ele != null) {
					ret = ele.getText();
				}
			}
			catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public static String getElementText(Element ele) {
		String ret = null;
		if (ele != null) {
			ret = ele.getText();
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public static String getElementText(Element ele, String xpath) {
		String ret = null;
		if (ele != null && xpath != null) {
			Element el = getElement(ele, xpath);
			if (el != null) {
				ret = el.getText();
			}
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public String getElementAttrText(String xpath, String attrname) {
		String ret = null;
		if (rootEle != null && xpath != null && attrname != null) {
			try {
				Element ele = (Element) XPath.selectSingleNode(rootEle, xpath);
				if (ele != null) {
					ret = ele.getAttributeValue(attrname);
				}
			}
			catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public static String getElementAttrText(Element ele, String attrname) {
		String ret = null;
		if (ele != null && attrname != null) {
			ret = ele.getAttributeValue(attrname);
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public List getElements(String xpath) {
		List ret = null;
		if (rootEle != null && xpath != null) {
			try {
				ret = XPath.selectNodes(rootEle, xpath);

			}
			catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	public static List getElements(Element ele, String xpath) {
		List ret = null;
		if (ele != null && xpath != null) {
			try {
				ret = XPath.selectNodes(ele, xpath);

			}
			catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return ret;
	}

	public static String elementToString(Element ele) {
		String ret = null;
		if (ele != null) {
			ret = xmlout.outputString(ele);
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public static String elementToString(List eles) {
		String ret = null;
		if (eles != null && eles.size() > 0) {
			ret = xmlout.outputString(eles);
		}
		if (ret == null) {
			ret = "";
		}
		return ret;
	}

	public static String parseObjToXml(Object obj) {
		String ret = "";
		Element ele = parseObjToXml(obj, null);
		ret = elementToString(ele);
		return ret;
	}

	public static Element parseObjToXml(Object obj, String name) {
		Element ret = null;
		try {
			if (obj != null) {
				Class objclass = obj.getClass();
				String elename = name;
				if (elename == null) {
					elename = objclass.getName();
					if (elename.indexOf(".") > -1) {
						elename = elename.substring(elename.lastIndexOf(".") + 1);
					}
				}
				Element rootele = new Element(elename);
				if (objclass.isPrimitive() || obj instanceof String) {
					if (obj != null) {
						rootele.setText(obj + "");
					}
				}
				else if (objclass.isArray()) {
					Object[] arr = (Object[]) obj;
					for (int i = 0; arr != null && i < arr.length; i++) {
						Element tempele = parseObjToXml(arr[i], "Array");
						if (tempele != null) {
							rootele.addContent(tempele);
						}
					}
				}
				else if (obj instanceof Collection) {
					Iterator it = ((Collection) obj).iterator();
					while (it != null && it.hasNext()) {
						Element tempele = parseObjToXml(it.next(), "Iterator");
						if (tempele != null) {
							rootele.addContent(tempele);
						}
					}
				}
				else if (obj instanceof Map) {
					Map map = (Map) obj;
					Set keyset = map.keySet();
					Iterator it = keyset.iterator();
					while (it != null && it.hasNext()) {
						Object key = it.next();
						Element tempele = parseObjToXml(map.get(key), "Map" + key);
						if (tempele != null) {
							rootele.addContent(tempele);
						}
					}
				}
				else {
					Field[] fields = objclass.getDeclaredFields();
					for (int i = 0; i < fields.length; i++) {
						Field field = fields[i];
						String fname = field.getName();
						fname = "get" + fname.substring(0, 1).toUpperCase()
								+ fname.substring(1);
						Method method = null;
						try {
							method = objclass.getMethod(fname, null);
						}
						catch (Exception e) {
						}
						Object tempobj = null;
						if (method != null) {
							tempobj = method.invoke(obj, null);
						}
						Element tempele = parseObjToXml(tempobj, field.getName());
						if (tempele != null) {
							rootele.addContent(tempele);
						}
					}
					Class supclass = objclass.getSuperclass();
					if (supclass != null) {
						fields = supclass.getDeclaredFields();
						for (int i = 0; i < fields.length; i++) {
							Field field = fields[i];
							String fname = field.getName();
							fname = "get" + fname.substring(0, 1).toUpperCase()
									+ fname.substring(1);
							Method method = null;
							try {
								method = supclass.getMethod(fname, null);
							}
							catch (Exception e) {
							}
							Object tempobj = null;
							if (method != null) {
								tempobj = method.invoke(obj, null);
							}
							Element tempele = parseObjToXml(tempobj, field.getName());
							if (tempele != null) {
								rootele.addContent(tempele);
							}
						}
					}
				}
				ret = rootele;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public Object parseXmlToObj(String xml, Class cls) {
		Object ret = null;
		try {
			Constructor cs = cls.getConstructor(null);
			Object obj = cs.newInstance(null);

			ret = obj;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static void main(String[] args) {

	}

	public static Element createElement(String name, String value) {
		Element ele = new Element(name);
		if (value != null) {
			ele.setText(value);
		}
		return ele;
	}

	public static Element setElementtext(String name, String value,
			Element parentNode) {
		Element ret = getElement(parentNode, name);
		if (ret == null) {
			ret = createElement(name, value);
			parentNode.addContent(ret);
		}
		else {
			ret.setText(value);
		}
		return ret;
	}

	public static String parseObjToStr(Object obj, String name,HashMap otherInfoMap) {
		String ret = null;
		try {
			if (obj != null) {
				Class objclass = obj.getClass();
				Class supclass = objclass.getSuperclass();
				if (supclass != null) {
					objclass = supclass;
				}
				String elename = name;
				if (elename == null) {
					elename = objclass.getName();
					System.out.println("elename="+elename);
					if (elename.indexOf(".") > -1) {
						elename = elename.substring(elename.lastIndexOf(".") + 1);
					}
				}
				List notElecList = null;
				if(otherInfoMap != null && otherInfoMap.containsKey("notElecList")){
					notElecList = (List)otherInfoMap.get("notElecList");
				}
				Element rootele = new Element(elename);
				Field[] fields = objclass.getDeclaredFields();
				List fieldList = new Vector();
				for(int i = 0; i < fields.length; i++){
					Field field = fields[i];
					String fname = field.getName();
					if("TABLENAME".equals(fname)
							|| "EQUAL".equals(fname)
							|| "NOTEQUAL".equals(fname)
							|| "ISNULL".equals(fname)
							|| "NOTISNULL".equals(fname)
							|| "LARGERTHAN".equals(fname)
							|| "LESSTHAN".equals(fname)
							|| "LARGEREQTHAN".equals(fname)
							|| "LESSEQTHAN".equals(fname)
							|| "NMEQUAL".equals(fname)
							|| "NMNOTEQUAL".equals(fname)
							|| "NMLARGERTHAN".equals(fname)
							|| "NMLESSTHAN".equals(fname)
							|| "NMLARGEREQTHAN".equals(fname)
							|| "NMLESSEQTHAN".equals(fname)
							|| "LEFTLIKE".equals(fname)
							|| "RIGHTLIKE".equals(fname)
							|| "LIKE".equals(fname)
							|| "orderByStr".equals(fname)
							|| "elecsignatoryFlag".equals(fname)
							|| "elecsignatoryTime".equals(fname)
							|| "elecsignatoryId".equals(fname)
							|| "elecsignatoryName".equals(fname)
							|| "elecsignatoryContent".equals(fname)
							|| "elecsignatoryFlagOper".equals(fname)
							|| "elecsignatoryTimeOper".equals(fname)
							|| "elecsignatoryIdOper".equals(fname)
							|| "elecsignatoryNameOper".equals(fname)
							|| "elecsignatoryContentOper".equals(fname)){
						continue;
					}
					if(notElecList != null && notElecList.contains(fname)){
						continue;
					}
					fieldList.add(fname);
				}
				for (int i = 0; fieldList != null && i < fieldList.size(); i++) {
					String fname = (String)fieldList.get(i);
					if(fname != null && fname.endsWith("Oper")){
						String temp = fname.substring(0,fname.lastIndexOf("Oper"));
						if(fieldList.contains(temp)){
							continue;
						}
					}
					Element ele = new Element(fname);
					fname = "get" + fname.substring(0, 1).toUpperCase()
							+ fname.substring(1);
					Method method = null;
					try {
						method = objclass.getMethod(fname, null);
					}
					catch (Exception e) {
					}
					Object tempobj = null;
					if (method != null) {
						tempobj = method.invoke(obj, null);
					}
					if(tempobj != null && tempobj instanceof String){
						ele.setText(tempobj.toString());
					}
					rootele.addContent(ele);
				}
				XMLOutputter output = new XMLOutputter();
				Format fm = output.getFormat();
				fm.setEncoding("GB2312");
				output.setFormat(fm);
				ret = output.outputString(rootele);
				ret = StringUtil.replace(ret, "\r", "");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
}
