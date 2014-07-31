package com.haitaiinc.ICommon;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.net.*;

/**
 * @author user
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Util {
	//ȱʡ���ڸ�ʽ
	private static String defDtPtn = "yyyy-MM-dd HH:mm:ss";
	//���ڸ�ʽ������
	private static SimpleDateFormat DATEFORMAT = new SimpleDateFormat(defDtPtn);

	/**
	 * ��ʽ�����ڶ���
	 * @param date ���ڶ���
	 * @param pattern ���ڸ�ʽ
	 * @return ��ʽ����������ַ���
	 */
	public static String formatDate(java.util.Date date, String pattern) {
		String retv;
		DATEFORMAT.applyPattern(pattern);
		retv = DATEFORMAT.format(date);
		DATEFORMAT.applyPattern(defDtPtn);
		return retv;
	}

	/**
	 * ��ʽ�����ڶ���ʹ��ȱʡ�ĸ�ʽ
	 * @param date ���ڶ���
	 * @return ��ʽ����������ַ���
	 */
	public static String formatDate(java.util.Date date) {
		return DATEFORMAT.format(date);
	}
	//
	/**
	 *ȡ�õ�ǰϵͳʱ�䣺�����ʽΪyyyyMMddHHmmss
	 * @param pattern
	 * @return
	 */
	public static String getCurrDateTime() {
		return formatDate(new java.util.Date(), "yyyyMMddHHmmss");
	}

	/**
	 *ȡ�õ�ǰ���� �������ʽΪyyyyMMdd
	 * @param pattern
	 * @return
	 */
	public static String getCurrDate() {
		return formatDate(new java.util.Date(), "yyyyMMdd");
	}

	/**
	 *ȡ�õ�ǰʱ�䣺�����ʽΪHHmmss
	 * @param pattern
	 * @return
	 */
	public static String getCurrTime() {
		return formatDate(new java.util.Date(), "HHmmss");
	}

	public static java.util.Date parseDate(String dateStr, String pattern) {
		DATEFORMAT.applyPattern(pattern);
		java.util.Date ret = null;
		try {
			ret = DATEFORMAT.parse(dateStr);
		} catch (Exception e) {
		}
		DATEFORMAT.applyPattern(defDtPtn);
		return ret;
	}

	/**
	 * URL����
	 * @param field �����������
	 * @return ����������
	 */
	public static String encode(String field) {
		return URLEncoder.encode(field);
	}

	/**
	 * URL����
	 * @param field �����������
	 * @return ����������
	 */
	public static String decode(String field) {
		return URLDecoder.decode(field);
	}

	

	/**
	 * �ӽ������ȡ�ַ����ֶ�ֵ
	 * @param rst �����
	 * @param colName �ֶ���
	 * @param def ȴʡֵ
	 * @return �ֶ�ֵ
	 * @throws SQLException
	 */
	public static String getString(ResultSet rst, String colName, String def)
		throws SQLException {
		String ret = rst.getString(colName);
		if (ret == null)
			ret = def;
		if (ret != null)
			ret = ret.trim();
		return ret;
	}

	/**
	 * �����������������(�������ڲ��ִ���)
	 * @param  day1  ����1
	 * @param  day2  ����2
	 * @return �����������ת�������з������� 
	 *          �����Ϊ��, �����ĳ��Ȳ�Ϊ8�ȵȣ�������null
	 *          ��ע���÷�����������������ַ����ĸ�ʽ����20021534�Ա���Ϊ�ǺϷ����ڣ�
	 */
	public static String betweenTwoDays(String day1, String day2) {
		String result = null;

		Date date1 = new Date();
		Date date2 = new Date();

		//�Ϸ����ж�
		if (day1 == null
			|| day1.trim().length() != 8
			|| day2 == null
			|| day2.trim().length() != 8) {
			return result;
		}

		SimpleDateFormat dateformate = new SimpleDateFormat("yyyyMMdd");
		try {
			date1 = dateformate.parse(day1);
			date2 = dateformate.parse(day2);
		} catch (Exception e) {
			return result;
		}
		int num =
			(int) ((date1.getTime() - date2.getTime()) / (3600 * 1000 * 24));
		result = String.valueOf(Math.abs(num));
		return result;

	}

	/**
	 * ����λ����ǰ�油0�������Ҫ��ıȸ����Ķ̣����ȥǰ����ַ���Ҫ
	 * @param  int    lengthӦ�õĳ���
	 * @param  String numԭ�����ַ� 
	 */
	public static String fillZero(int length, String num) {
		if (num != null && num.length() > 0 && length > 0) {
			if (length >= num.length()) {
				int count = length - num.length();
				for (int i = 0; i < count; i++) {
					num = "0" + num;
				}
				return num;
			} else {
				return num.substring(num.length() - length, num.length());
			}
		} else {
			return "";
		}

	}
	
	/**
	   *  �ַ����滻����  source  �е�  oldString  ȫ������  newString
	   *  @param  source  Դ�ַ���
	   *  @param  oldString  �ϵ��ַ���
	   *  @param  newString  �µ��ַ���
	   *  @param  fullFix �Ƿ���ȫƥ�䡡true-�ǣ�false-��
	   *  @return  �滻����ַ���
	   **/
	public static String strReplace(String source, String oldString, String newString,boolean fullFix) {
		try {

			StringBuffer output = new StringBuffer();
			int lengthOfSource = source.length(); //  Դ�ַ�������
			int lengthOfOld = oldString.length(); //  ���ַ�������

			int posStart = 0; //  ��ʼ����λ��
			int pos; //  ���������ַ�����λ��

			while ((pos = source.indexOf(oldString, posStart)) >= 0) {
				int nextStr = (int)source.charAt(pos+lengthOfOld);
				if(fullFix==false||!((int)'a'<nextStr&&nextStr<(int)'Z')){
					output.append(source.substring(posStart, pos));
					output.append(newString);
				posStart = pos + lengthOfOld;
				}
			}

			if (posStart < lengthOfSource) {
				output.append(source.substring(posStart));
			}
			return output.toString();
		} catch (Exception e) {
			return source;
		}
	}
	public static String strReplace(String source,String oldString,String newString){
		return strReplace(source,oldString,newString,false);
	}


	/**
	 * ȡ�����ַ���
	 * @param data �ַ���
	 * @param sepa �ָ���
	 * @param field �ֶ����
	 * @return ���ַ���
	 */
	public static String getSubString(String data,String sepa,int field){
		String result=null;
		int begin=0;
		int end=0;
		for(int i=0;data!=null&&i<field;i++){
			if(begin>data.length()){
				result=null;
				break;
			}
			end=data.indexOf(sepa,begin);
			if(end==-1)end=data.length();
			result=data.substring(begin,end);
			begin = end+sepa.length();	
		}
		return result;
	}
	
	/**
	 * ��floatֵת��string
	 * @param data floatֵ
	 * @param dec С��λ��
	 * @param rdec ����ֵС��λ��
	 * @return stringֵ
	 */
	public static String changeFloatToString(float data,int dec,int rdec){		
	    Float fdata = new Float(data);
        double ddata = fdata.doubleValue();
        String format = null;
        for(int i=0;i<dec;i++){
        	if(format==null){
        		format = "#.";
        	}
        	format+="0";
        }
        DecimalFormat decFmt = new DecimalFormat(format);
        String tempData = decFmt.format(ddata);
        int length = tempData.indexOf(".");
        if(rdec>0){
        	length = length + rdec + 1;
        }
		tempData = tempData.substring(0,tempData.indexOf(".")+rdec);
		return tempData;
	}
	
	
	public static void main(String[] args) {
		String str1="�ȶ�.�Ǵĵ�11��׼��\n"
			+"\n"
			+"�ڱȶ�.�Ǵ�д�����б�ҵ���ʹ�ѧ��ҵ���������һ��������������11��ѧ��û����ѧУ��ѧ������\n"
			+"�顣�ȶ�.�Ǵ�������̸������о����õ�\"��������ȷ\"�Ľ̵�������һ������֪��ʵΪ����������ˣ����ֽ���ֻ�ܵ������ǳ�Ϊ��ʵ��\n"
			+"���е�ʧ���ߡ�\n"
			+"\n"
			+"��11�������ǣ�\n"
			+"1.	�����ǲ���ƽ�ģ�Ҫȥ��Ӧ����\n"
			+"2.	�����粢���������������������ָ���������Ҹо�����֮ǰ��Ҫ�����ɾ͡�\n"
			+"3.	���иձ�ҵ�㲻��һ����4����Ԫ���㲻���Ϊһ����˾�ĸ��ܲã���ӵ��һ��װ�е绰��������ֱ���㽫��ְλ�������绰�������֡�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"5.	��ţ�����������������ϡ�����游ĸ����ţ������в�ͬ�Ķ��壻���ǳ���Ϊ������\n"
			+"6.	����������������ǲ����㸸ĸ�Ĺ������Բ�Ҫ������Թ���ǵĴ���Ҫ������ȡ��ѵ��\n"
			+"7.	�������֮ǰ����ĸ�ĸ��������������������ζ�����Ǳ�ɽ��������������Ϊ��Щ��������һֱ��Ϊ�㸶�˵�������ϴ��\n"
			+"���������̸������εĿᡣ���ԣ�������������㸸ĸ��һ�����е�\"������\"���������ֵĻ���������ȥ����㷿���¹���ĳ��Ӱɡ�\n"
			+"\n"
			+"asdfasd\n"
			+"\n"
			+"\n"
			+"9999mmmw";
		String str2="1561561\n"
			+"�ȶ�.�Ǵĵ�11��׼��1\n"
			+"�ȶ�.�Ǵĵ�11��׼��\n"
			+"�ȶ�.�Ǵĵ�11��׼��\n"
			+"�ȶ�.�Ǵĵ�11��׼��\n"
			+"\n"
			+"�ڱȶ�.�Ǵ�д�����б�ҵ���ʹ�ѧ��ҵ���������һ��������������11��ѧ��û����ѧУ��ѧ������\n"
			+"�顣�ȶ�.��1��������̸������о����õ�\"��������ȷ\"�Ľ̵�������һ������֪��ʵΪ����������ˣ����ֽ���ֻ�ܵ������ǳ�Ϊ��ʵ��\n"
			+"���е�ʧ��1�ߡ�\n"
			+"v\n"
			+"��11������1�ǣ�\n"
			+"1.	�����ǲ���ƽ�ģ�Ҫȥ��Ӧ����k\n"
			+"2.	�����粢1���������������������ָ���������Ҹо�����֮ǰ��Ҫ�����ɾ͡�\n"
			+"�����粢��1��\n"
			+"3.	���и�1��ҵ�㲻��һ����4����Ԫ���㲻���Ϊһ����˾�ĸ��ܲã���ӵ��һ��װ�е绰��������ֱ���㽫��ְλ�������绰�������֡�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�2\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"6.	����������������ǲ����㸸ĸ�Ĺ������Բ�Ҫ������Թ���ǵĴ���Ҫ������ȡ��ѵ��\n"
			+"insert\n"
			+"7.	�������֮ǰ����ĸ�ĸ��������������������ζ�����Ǳ�ɽ��������������Ϊ��Щ��������һֱ��Ϊ�㸶�˵�������ϴ��\n"
			+"���������̸������εĿᡣ���ԣ�������������㸸ĸ��һ�����е�\"������\"���������ֵĻ���������ȥ����㷿���¹���ĳ��Ӱɡ�\n"
			+"asdfasdfasd\n"
			+"asdfasd\n"
			+"1561561\n"
			+"�ȶ�.�Ǵĵ�11��׼��1\n"
			+"\n"
			+"�ڱȶ�.�Ǵ�д�����б�ҵ���ʹ�ѧ��ҵ���������һ��������������11��ѧ��û����ѧУ��ѧ������\n"
			+"�顣�ȶ�.��1��������̸������о����õ�\"��������ȷ\"�Ľ̵�������һ������֪��ʵΪ����������ˣ����ֽ���ֻ�ܵ������ǳ�Ϊ��ʵ��\n"
			+"���е�ʧ��1�ߡ�\n"
			+"v\n"
			+"��11������1�ǣ�\n"
			+"1.	�����ǲ���ƽ�ģ�Ҫȥ��Ӧ����k\n"
			+"2.	�����粢1���������������������ָ���������Ҹо�����֮ǰ��Ҫ�����ɾ͡�\n"
			+"�����粢��1��\n"
			+"3.	���и�1��ҵ�㲻��һ����4����Ԫ���㲻���Ϊһ����˾�ĸ��ܲã���ӵ��һ��װ�е绰��������ֱ���㽫��ְλ�������绰�������֡�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�2\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"6.	����������������ǲ����㸸ĸ�Ĺ������Բ�Ҫ������Թ���ǵĴ���Ҫ������ȡ��ѵ��\n"
			+"insert\n"
			+"7.	�������֮ǰ����ĸ�ĸ��������������������ζ�����Ǳ�ɽ��������������Ϊ��Щ��������һֱ��Ϊ�㸶�˵�������ϴ��\n"
			+"���������̸������εĿᡣ���ԣ�������������㸸ĸ��һ�����е�\"������\"���������ֵĻ���������ȥ����㷿���¹���ĳ��Ӱɡ�\n"
			+"asdfasdfasd\n"
			+"asdfasd1561561\n"
			+"�ȶ�.�Ǵĵ�11��׼��1\n"
			+"\n"
			+"�ڱȶ�.�Ǵ�д�����б�ҵ���ʹ�ѧ��ҵ���������һ��������������11��ѧ��û����ѧУ��ѧ������\n"
			+"�顣�ȶ�.��1��������̸������о����õ�\"��������ȷ\"�Ľ̵�������һ������֪��ʵΪ����������ˣ����ֽ���ֻ�ܵ������ǳ�Ϊ��ʵ��\n"
			+"���е�ʧ��1�ߡ�\n"
			+"v\n"
			+"��11������1�ǣ�\n"
			+"1.	�����ǲ���ƽ�ģ�Ҫȥ��Ӧ����k\n"
			+"2.	�����粢1���������������������ָ���������Ҹо�����֮ǰ��Ҫ�����ɾ͡�\n"
			+"�����粢��1��\n"
			+"3.	���и�1��ҵ�㲻��һ����4����Ԫ���㲻���Ϊһ����˾�ĸ��ܲã���ӵ��һ��װ�е绰��������ֱ���㽫��ְλ�������绰�������֡�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�2\n"
			+"4.	�������Ϊ�����ʦ���������������ϰ��������롣�ϰ����û���������Ƶġ�\n"
			+"6.	����������������ǲ����㸸ĸ�Ĺ������Բ�Ҫ������Թ���ǵĴ���Ҫ������ȡ��ѵ��\n"
			+"insert\n"
			+"7.	�������֮ǰ����ĸ�ĸ��������������������ζ�����Ǳ�ɽ��������������Ϊ��Щ��������һֱ��Ϊ�㸶�˵�������ϴ��\n"
			+"���������̸������εĿᡣ���ԣ�������������㸸ĸ��һ�����е�\"������\"���������ֵĻ���������ȥ����㷿���¹���ĳ��Ӱɡ�\n"
			+"asdfasdfasd\n"
			+"asdfasd\n"
			+"999b&b'b9<w";
		//long start = System.currentTimeMillis();
		//String[] result=Util.textCompare(str1,str2);
		//System.out.println(result[0]);
		//System.out.println(result[1]);
		
		//String result=Util.stringCompare(str1,str2);
		//System.out.println(result);
		
		//String[] result=Util.stringCompares(str1,str2);
		
		//System.out.println(result[0]);
		//System.out.println(result[1]);
		
		//long end = System.currentTimeMillis();
		//System.out.println(end-start);
		
		
		
		System.out.println(Util.strReplace("abcde","cd","tt"));
	}
	
	/**
	 * ��ĳһʱ���ϼ�����Сʱ,�õ�����ʱ��
	 * @param srcdt ʱ��yyyyMMddHHmmss
	 * @param hours Сʱ��
	 * @return ʱ�� yyyyMMddHHmmss
	 */
	public static String getNewDateTime(String srcdt, int hours) {
		String result = srcdt;
		try {
			if (srcdt != null && srcdt.length() == 14) {
				String tmpdate = srcdt.substring(0, 8);
				String tmptime = srcdt.substring(8, 14);
				String tmphour = srcdt.substring(8, 10);
				String tmpminsec = srcdt.substring(10, 14);
				int itmphour = Integer.parseInt(tmphour);
				if (hours == 24) {
					tmpdate =
						DataUtil.getDate(
							dateAdd(DataUtil.transDate(tmpdate), 1));
				} else if (hours == 48) {
					tmpdate =
						DataUtil.getDate(
							dateAdd(DataUtil.transDate(tmpdate), 2));
				} else {
					itmphour += hours;
					if ((itmphour) >= 24) {
						tmpdate =
							DataUtil.getDate(
								dateAdd(
									DataUtil.transDate(tmpdate),
									itmphour / 24));
						itmphour -= 24 * (itmphour / 24);
					}
					tmphour = itmphour + "";
					if (tmphour.length() == 1)
						tmphour = "0" + tmphour;
					tmptime = tmphour + tmpminsec;
				}

				result = tmpdate + tmptime;
			}
		} catch (Exception e) {
		}
		return result;
	}
	
	/**��ĳһ�����Ǽ���������,�õ���������
	 * @param date �����ַ���yyyy-mm-dd
	 * @param days �ӵ�����
	 * @return ������ yyyyMMdd
	 */
	public static String dateAdd(String date, int days) {

		try {
			java.sql.Date temp = java.sql.Date.valueOf(date);
			java.util.Date ds = new java.util.Date(temp.getTime());
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(ds);
			calendar.add(calendar.DAY_OF_YEAR, days);
			return Util.formatDate(calendar.getTime(), "yyyyMMdd");

		} catch (Exception e) {
			return "";
		}
	}

}
