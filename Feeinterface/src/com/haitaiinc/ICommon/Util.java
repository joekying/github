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
	//缺省日期格式
	private static String defDtPtn = "yyyy-MM-dd HH:mm:ss";
	//日期格式化对象
	private static SimpleDateFormat DATEFORMAT = new SimpleDateFormat(defDtPtn);

	/**
	 * 格式化日期对象
	 * @param date 日期对象
	 * @param pattern 日期格式
	 * @return 格式化后的日期字符串
	 */
	public static String formatDate(java.util.Date date, String pattern) {
		String retv;
		DATEFORMAT.applyPattern(pattern);
		retv = DATEFORMAT.format(date);
		DATEFORMAT.applyPattern(defDtPtn);
		return retv;
	}

	/**
	 * 格式化日期对象，使用缺省的格式
	 * @param date 日期对象
	 * @return 格式化后的日期字符串
	 */
	public static String formatDate(java.util.Date date) {
		return DATEFORMAT.format(date);
	}
	//
	/**
	 *取得当前系统时间：具体格式为yyyyMMddHHmmss
	 * @param pattern
	 * @return
	 */
	public static String getCurrDateTime() {
		return formatDate(new java.util.Date(), "yyyyMMddHHmmss");
	}

	/**
	 *取得当前日期 ：具体格式为yyyyMMdd
	 * @param pattern
	 * @return
	 */
	public static String getCurrDate() {
		return formatDate(new java.util.Date(), "yyyyMMdd");
	}

	/**
	 *取得当前时间：具体格式为HHmmss
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
	 * URL编码
	 * @param field 被编码的内容
	 * @return 编码后的内容
	 */
	public static String encode(String field) {
		return URLEncoder.encode(field);
	}

	/**
	 * URL解码
	 * @param field 被解码的内容
	 * @return 解码后的内容
	 */
	public static String decode(String field) {
		return URLDecoder.decode(field);
	}

	

	/**
	 * 从结果集中取字符串字段值
	 * @param rst 结果集
	 * @param colName 字段名
	 * @param def 却省值
	 * @return 字段值
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
	 * 计算两天相隔的天数(两个日期不分次序)
	 * @param  day1  日期1
	 * @param  day2  日期2
	 * @return 相隔天数。当转换过程中发生错误， 
	 *          如参数为空, 参数的长度不为8等等，均返回null
	 *          （注：该方法不负责检验日期字符串的格式；如20021534仍被认为是合法日期）
	 */
	public static String betweenTwoDays(String day1, String day2) {
		String result = null;

		Date date1 = new Date();
		Date date2 = new Date();

		//合法性判断
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
	 * 补足位数（前面补0），如果要求的比给定的短，则截去前面的字符不要
	 * @param  int    length应该的长度
	 * @param  String num原本的字符 
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
	   *  字符串替换，将  source  中的  oldString  全部换成  newString
	   *  @param  source  源字符串
	   *  @param  oldString  老的字符串
	   *  @param  newString  新的字符串
	   *  @param  fullFix 是否完全匹配　true-是／false-否
	   *  @return  替换后的字符串
	   **/
	public static String strReplace(String source, String oldString, String newString,boolean fullFix) {
		try {

			StringBuffer output = new StringBuffer();
			int lengthOfSource = source.length(); //  源字符串长度
			int lengthOfOld = oldString.length(); //  老字符串长度

			int posStart = 0; //  开始搜索位置
			int pos; //  搜索到老字符串的位置

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
	 * 取得子字符串
	 * @param data 字符串
	 * @param sepa 分隔符
	 * @param field 字段序号
	 * @return 子字符串
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
	 * 将float值转成string
	 * @param data float值
	 * @param dec 小数位数
	 * @param rdec 返回值小数位数
	 * @return string值
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
		String str1="比尔.盖茨的11条准则\n"
			+"\n"
			+"在比尔.盖茨写给高中毕业生和大学毕业生的书里，有一个单子上面列有11项学生没能在学校里学到的事\n"
			+"情。比尔.盖茨在书中谈到让你感觉良好的\"政治上正确\"的教导培养出一整代不知现实为何物的年轻人，这种教育只能导致他们成为现实世\n"
			+"界中的失败者。\n"
			+"\n"
			+"这11项事情是：\n"
			+"1.	生活是不公平的；要去适应它。\n"
			+"2.	这世界并不会在意你的自尊。这世界指望你在自我感觉良好之前先要有所成就。\n"
			+"3.	高中刚毕业你不会一年挣4万美元。你不会成为一个公司的副总裁，并拥有一部装有电话的汽车，直到你将此职位和汽车电话都挣到手。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"5.	烙牛肉饼并不有损你的尊严。你的祖父母对烙牛肉饼可有不同的定义；他们称它为机遇。\n"
			+"6.	如果你陷入困境，那不是你父母的过错，所以不要尖声抱怨我们的错误，要从中吸取教训。\n"
			+"7.	在你出生之前，你的父母并非像他们现在这样乏味。他们变成今天这个样子是因为这些年来他们一直在为你付账单，给你洗衣\n"
			+"服，听你大谈你是如何的酷。所以，如果你想消灭你父母那一辈子中的\"寄生虫\"来拯救雨林的话，还是先去清除你房间衣柜里的虫子吧。\n"
			+"\n"
			+"asdfasd\n"
			+"\n"
			+"\n"
			+"9999mmmw";
		String str2="1561561\n"
			+"比尔.盖茨的11条准则1\n"
			+"比尔.盖茨的11条准则\n"
			+"比尔.盖茨的11条准则\n"
			+"比尔.盖茨的11条准则\n"
			+"\n"
			+"在比尔.盖茨写给高中毕业生和大学毕业生的书里，有一个单子上面列有11项学生没能在学校里学到的事\n"
			+"情。比尔.盖1茨在书中谈到让你感觉良好的\"政治上正确\"的教导培养出一整代不知现实为何物的年轻人，这种教育只能导致他们成为现实世\n"
			+"界中的失败1者。\n"
			+"v\n"
			+"这11项事情1是：\n"
			+"1.	生活是不公平的；要去适应它。k\n"
			+"2.	这世界并1不会在意你的自尊。这世界指望你在自我感觉良好之前先要有所成就。\n"
			+"这世界并不1会\n"
			+"3.	高中刚1毕业你不会一年挣4万美元。你不会成为一个公司的副总裁，并拥有一部装有电话的汽车，直到你将此职位和汽车电话都挣到手。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。2\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"6.	如果你陷入困境，那不是你父母的过错，所以不要尖声抱怨我们的错误，要从中吸取教训。\n"
			+"insert\n"
			+"7.	在你出生之前，你的父母并非像他们现在这样乏味。他们变成今天这个样子是因为这些年来他们一直在为你付账单，给你洗衣\n"
			+"服，听你大谈你是如何的酷。所以，如果你想消灭你父母那一辈子中的\"寄生虫\"来拯救雨林的话，还是先去清除你房间衣柜里的虫子吧。\n"
			+"asdfasdfasd\n"
			+"asdfasd\n"
			+"1561561\n"
			+"比尔.盖茨的11条准则1\n"
			+"\n"
			+"在比尔.盖茨写给高中毕业生和大学毕业生的书里，有一个单子上面列有11项学生没能在学校里学到的事\n"
			+"情。比尔.盖1茨在书中谈到让你感觉良好的\"政治上正确\"的教导培养出一整代不知现实为何物的年轻人，这种教育只能导致他们成为现实世\n"
			+"界中的失败1者。\n"
			+"v\n"
			+"这11项事情1是：\n"
			+"1.	生活是不公平的；要去适应它。k\n"
			+"2.	这世界并1不会在意你的自尊。这世界指望你在自我感觉良好之前先要有所成就。\n"
			+"这世界并不1会\n"
			+"3.	高中刚1毕业你不会一年挣4万美元。你不会成为一个公司的副总裁，并拥有一部装有电话的汽车，直到你将此职位和汽车电话都挣到手。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。2\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"6.	如果你陷入困境，那不是你父母的过错，所以不要尖声抱怨我们的错误，要从中吸取教训。\n"
			+"insert\n"
			+"7.	在你出生之前，你的父母并非像他们现在这样乏味。他们变成今天这个样子是因为这些年来他们一直在为你付账单，给你洗衣\n"
			+"服，听你大谈你是如何的酷。所以，如果你想消灭你父母那一辈子中的\"寄生虫\"来拯救雨林的话，还是先去清除你房间衣柜里的虫子吧。\n"
			+"asdfasdfasd\n"
			+"asdfasd1561561\n"
			+"比尔.盖茨的11条准则1\n"
			+"\n"
			+"在比尔.盖茨写给高中毕业生和大学毕业生的书里，有一个单子上面列有11项学生没能在学校里学到的事\n"
			+"情。比尔.盖1茨在书中谈到让你感觉良好的\"政治上正确\"的教导培养出一整代不知现实为何物的年轻人，这种教育只能导致他们成为现实世\n"
			+"界中的失败1者。\n"
			+"v\n"
			+"这11项事情1是：\n"
			+"1.	生活是不公平的；要去适应它。k\n"
			+"2.	这世界并1不会在意你的自尊。这世界指望你在自我感觉良好之前先要有所成就。\n"
			+"这世界并不1会\n"
			+"3.	高中刚1毕业你不会一年挣4万美元。你不会成为一个公司的副总裁，并拥有一部装有电话的汽车，直到你将此职位和汽车电话都挣到手。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。2\n"
			+"4.	如果你认为你的老师严厉，等你有了老板再这样想。老板可是没有任期限制的。\n"
			+"6.	如果你陷入困境，那不是你父母的过错，所以不要尖声抱怨我们的错误，要从中吸取教训。\n"
			+"insert\n"
			+"7.	在你出生之前，你的父母并非像他们现在这样乏味。他们变成今天这个样子是因为这些年来他们一直在为你付账单，给你洗衣\n"
			+"服，听你大谈你是如何的酷。所以，如果你想消灭你父母那一辈子中的\"寄生虫\"来拯救雨林的话，还是先去清除你房间衣柜里的虫子吧。\n"
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
	 * 在某一时间上加上若小时,得到的新时间
	 * @param srcdt 时间yyyyMMddHHmmss
	 * @param hours 小时数
	 * @return 时间 yyyyMMddHHmmss
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
	
	/**在某一日期是加上若干天,得到的新日期
	 * @param date 日期字符串yyyy-mm-dd
	 * @param days 加的天数
	 * @return 新日期 yyyyMMdd
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
