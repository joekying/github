package com.haitaiinc.ICommon;

import java.net.*;
import java.text.*;
import java.util.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */

public class DataUtil {

	public DataUtil() {
	}

	public static int parseInt(String str, int def) {
		int ret = def;
		try {
			ret = Integer.parseInt(str);
		} catch (Exception e) {

		}
		return ret;
	}

	public static String getfDate(String date) {
		if (date != null && date.trim().length() == 8)
			return date.trim().substring(0, 4)
				+ "-"
				+ date.trim().substring(4, 6)
				+ "-"
				+ date.trim().substring(6, 8);
		else
			return null;
	}

	public static String transDateTimeShort(String strDataTime) {
		String strdts = transDateTime(strDataTime);

		if (strdts.trim().length() == 19) {
			strdts = strdts.substring(0, 16);
			strdts = Util.strReplace(strdts, "-", "");
		}

		return strdts;
	}

	public static String transDateTime(String srcDateTime) {
		if (srcDateTime != null) {
			if (srcDateTime.trim().length() == 14)
				return transDateTime(
					srcDateTime.trim(),
					"yyyyMMddHHmmss",
					"yyyy-MM-dd HH:mm:ss");
			if (srcDateTime.trim().length() == 8)
				return transDateTime(
					srcDateTime.trim(),
					"yyyyMMdd",
					"yyyy-MM-dd");
			return "";
		} else
			return "";
	}

	public static String transDate(String srcDate) {
		if (srcDate != null) {
			if (srcDate.trim().length() == 14)
				return transDateTime(
					srcDate.trim(),
					"yyyyMMddHHmmss",
					"yyyy-MM-dd HH:mm:ss");
			if (srcDate.trim().length() <= 8)
				return transDateTime(srcDate.trim(), "yyyyMMdd", "yyyy-MM-dd");
			return "";
		} else
			return "";
	}

	public static String getDate(String s) {
		return transDateTime(s, "yyyy-MM-dd", "yyyyMMdd");
	}

	public static String getDateTime(String s) {
		return transDateTime(s, "yyyy-MM-dd HH:mm:ss", "yyyyMMddHHmmss");
	}

	public static String getTime(String time) {
		return transDateTime(time, "HH:mm:ss", "HHmmss");
	}

	public static String transTime(String time) {
		return transDateTime(time, "HHmmss", "HH:mm:ss");
	}

	public static String intToStr(int data, int len) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < len; i++)
			buf.append('0');
		buf.append(data);
		return buf.substring(buf.length() - len);
	}

	/**
	 * 裁剪字符串
	 * @param src 源串
	 * @return String 裁剪后的字符串
	 */
	public static String trim(String src) {
		String ret = "";
		if (src != null)
			ret = src.trim();
		return ret;
	}

	public static String selOption(String optValue, String value) {
		if (value != null && value.equals(optValue))
			return "SELECTED";
		return "";
	}

	public static String isChecked(String chkValue, String value) {
		if (value != null && value.equals(chkValue))
			return "CHECKED";
		return "";
	}

	/**
	 * 将日期时间从一种格式转换为另一种格式
	 * @param srcTime 源串
	 * @param srcPattern	源串格式
	 * @param destPattern 目标串格式
	 * @return String 目标串
	 */
	public static String transDateTime(
		String srcTime,
		String srcPattern,
		String destPattern) {
		if (srcTime == null)
			return "";
		try {
			SimpleDateFormat fmt = new SimpleDateFormat();
			fmt.applyPattern(srcPattern);
			Date date = fmt.parse(srcTime);
			fmt.applyPattern(destPattern);
			return fmt.format(date);
		} catch (Exception exp) {
		}
		return srcTime;
	}

	//根据出生日期计算年龄
	public static String calculateAge(String birthdayStr) {
		//		if(birthdayStr!=null){
		//  		Date birthday=Util.parseDate(birthdayStr,"yyyymmdd");
		//  		if(birthday!=null){
		//  			Calendar calendar=Calendar.getInstance();
		//  			int year1=calendar.get(Calendar.YEAR);
		//  			calendar.setTime(birthday);
		//  			int year2=calendar.get(Calendar.YEAR);
		//  			int age=year1-year2;
		//  			return String.valueOf(age);
		//  		}
		//  	}
		//  	return "";	
		
		return calculateAge(Util.getCurrDate(), birthdayStr);
	}
	/**
	 * 根据日期字符串计算年龄
	 * 一年以上返回年数
	 * 一年以下返回月数
	 * 注:第一个日期必须大于第二个日期
	 */
	public static String calculateAge(String strDate1, String strDate2) {
//		System.out.println("[计算年龄]Date1 = " + strDate1 + " Date2 = " + strDate2);
		String result = "";
		if (strDate1 != null && strDate2 != null && strDate1.compareTo(strDate2)>=0) {
			//将字符串转换为日期数据
			Date date1 = Util.parseDate(strDate1, "yyyyMMdd");
			Date date2 = Util.parseDate(strDate2, "yyyyMMdd");

			if (date1 != null && date2 != null) {
				Calendar calendar1 = Calendar.getInstance();
				Calendar calendar2 = Calendar.getInstance();
				calendar1.setTime(date1);
				calendar2.setTime(date2);

//				System.out.println(calendar1.toString());
				//读取年份
				int year1 = calendar1.get(Calendar.YEAR);
				int year2 = calendar2.get(Calendar.YEAR);
//				System.out.println("year1=" + year1 + " year2=" + year2);
				//读取月份
				int month1 = calendar1.get(Calendar.MONTH) + 1;
				int month2 = calendar2.get(Calendar.MONTH) + 1;
//				System.out.println("month1=" + month1 + " month2=" + month2);
				//读取日期
				int day1 = calendar1.get(Calendar.DATE);
				int day2 = calendar2.get(Calendar.DATE);
//				System.out.println("day1=" + day1 + " day2=" + day2);
				//计算时间差
				int ageYear = year1 - year2; //计算年数
				int ageMonth = month1 - month2; //计算月数
				int ageDay = day1 - day2; //计算天数

//				System.out.println("***************ageYear=" + ageYear);
//				System.out.println("***************ageMonth=" + ageMonth);
//				System.out.println("***************ageDay=" + ageDay);
				
				if (ageYear == 0) { //年龄在一年以内
					if (ageDay < 0) {
						ageMonth--;
						ageDay = 30 + ageDay;
						if (ageMonth <= 0) {
							if(ageDay>=29){
								result = "1月";
							}else{
								result = String.valueOf(ageDay) + "天";
							}
						} else {
							result =
								String.valueOf(ageMonth)
									+ "月"
									+ String.valueOf(ageDay)
									+ "天";
						}
					} else {
						if (ageMonth <= 0) {
							if(ageDay>=29){
								result = "1月";
							}else{
								result = String.valueOf(ageDay) + "天";
							}
						} else {
							result =
								String.valueOf(ageMonth)
									+ "月"
									+ String.valueOf(ageDay)
									+ "天";
						}
					}
				}else if (ageYear == 1) { //年龄差在1岁
					if (ageMonth > 0) { //年龄在一年以上
						result = String.valueOf(ageYear) + "岁"+String.valueOf(ageMonth)+"月";
					} else if (ageMonth == 0) { //生日在当月
						if (ageDay < 0) { //年龄在11个月
							ageMonth = 12 + ageMonth;
							ageMonth--;
							ageDay = 30 + ageDay;
							if (ageMonth <= 0) {
								result = String.valueOf(ageDay) + "天";
							} else {
								result =
									String.valueOf(ageMonth)
										+ "月"
										+ String.valueOf(ageDay)
										+ "天";
							}
						} else { //年龄大于一岁
							result = String.valueOf(ageYear) + "岁"+String.valueOf(ageMonth)+"月";
						}
					} else { //年龄在一年以下
						ageMonth = 12 + ageMonth;
						if (ageDay <= 0) {
							ageMonth--;
							ageDay = 30 + ageDay;
							if (ageMonth <= 0) {
								if(ageDay>=29){
									result = "1月";
								}else{
									result = String.valueOf(ageDay) + "天";
								}
							} else {
								result =
									String.valueOf(ageMonth)
										+ "月"
										+ String.valueOf(ageDay)
										+ "天";
							}
						} else {
							if (ageMonth <= 0) {
								result = String.valueOf(ageDay) + "天";
							} else {
								result =
									String.valueOf(ageMonth)
										+ "月"
										+ String.valueOf(ageDay)
										+ "天";
							}
						}
					}
				} else if(ageYear>1 && ageYear<=12){ //年份差在1－12
					if (ageMonth > 0) { 
						result = String.valueOf(ageYear) + "岁";
						if(ageYear < 12){
							result += String.valueOf(ageMonth)+"月";
						}
					}else if (ageMonth == 0){
						if(ageDay <0){
							ageYear--;
							ageMonth = ageMonth + 11;
						}
						result = String.valueOf(ageYear) + "岁";
						if(ageYear < 12){
							result += String.valueOf(ageMonth)+"月";
						}
					}else if(ageMonth<0){
						ageYear--;
						ageMonth = ageMonth + 12;
						result = String.valueOf(ageYear) + "岁" + String.valueOf(ageMonth)+"月";
					}
				} else if(ageYear>12){	//满12岁
//					result = String.valueOf(ageYear)+"岁";
					if (ageMonth == 0){
						if(ageDay <0){
							ageYear--;
						}
					}else if(ageMonth<0){
						ageYear--;
					}
					result = String.valueOf(ageYear) + "岁";
				} else { //数据有问题
					result = "";
				}
				
//				else if(ageYear == 1){	//年份差一年
//					if (ageMonth > 0) { //年龄在一年以上，返回年数
//						result = String.valueOf(ageYear) + "岁";
//					} else if (ageMonth == 0) { //生日在当月
//						ageMonth = 12 + ageMonth;
//						if (ageDay < 0) { //年龄在11个月
//							ageMonth--;
//							result = String.valueOf(ageMonth) + "月";
//						} else { //年龄大于一岁
//							result = String.valueOf(ageYear) + "岁";
//						}
//					} else { //年龄在一年以下
//						ageMonth = 12 + ageMonth;
//						if (ageDay <= 0) {
//							ageMonth--;
//						} 
//						result = String.valueOf(ageMonth) + "月";
//					}			
//				}
				 
//				 else if (ageYear > 1) { //年龄在一年以上，返回年数
//					result = String.valueOf(ageYear) + "岁";
//				} else { //数据有问题
//					result = "";
//				}
			}
		}
//		System.out.println("年龄：" + result);
		return result;
	}
	
	
	/**
		 * 质量控制分值 
		 * add by fjw 2004-08-18 参照广州项目增加
		 */
	public static float getQualityCheckScore(String modelno) {
		float result = 0;
		if (modelno == null) {
		} else if (modelno.equals("000001")) { //入院记录在病人入院24小时内完成(浙医一院项目待定)
			result = 5;
		} else if (modelno.equals("000002")) { //首次病程记录在病人入院8小时内完成
			result = 1;
		} else if (modelno.equals("000003")) { //入院后48小时内必须有1次主治医师查房
			result = 1;
		} else if (modelno.equals("000004")) { //在第1次主治查房后，每5天必须有一次主治查房，浙医一院不用
			result = 0;
		} else if (modelno.equals("000005")) { //入院后一周必须有一次副主任以上医师查房
			result = 1;
		} else if (modelno.equals("000006")) { //在第一次（副）主任医师查房后每一周必须有一次主任查房
			result = 1;
		} else if (modelno.equals("000007")) { //病人入院后三天每天必须有病程记录
			result = (float) 0.5;
		} else if (
			modelno.equals(
				"000008")) { //病重患者每天有病程记录，病情稳定患者至少3天记录一次，病情稳定得慢性病患者5天记录一次
			result = (float) 0.5;
		} else if (modelno.equals("000009")) { //抢救记录在抢救医嘱后6小时内完成(浙医一院项目不用)
			result = 0;
		} else if (modelno.equals("000010")) { //转入记录与病人转入后24小时内完成浙医一院项目不用)
			result = 0;
		} else if (modelno.equals("000011")) { //死亡记录与病人死亡后24小时内完成浙医一院项目不用)
			result = 0;
		} else if (modelno.equals("000012")) { //出院记录在病人出院24小时内完成
			result = 4;
		} else if (modelno.equals("000013")) { //病案首页在患者出院24小时内完成
			result = 0;
		} else if (modelno.equals("000014")) { //手术病人在手术前1天要有病程记录（术前阶段小结待定）
			result = 0;
		} else if (modelno.equals("000015")) { //手术记录在手术完成24小时内完成（浙医项目待定）
			result = 0;
		} else if (modelno.equals("000016")) { //有手术的病人必须有阶段小结
			result = 0;
		} else if (modelno.equals("000017")) { //手术后3天内必须每天有病程记录
			result = (float) 0.5;
		} else if (modelno.equals("000018")) { //病人住院每满30天必须有阶段小结
			result = 1;
		} else if (
			modelno.equals(
				"000019")) { //病危患者每天必须有主任医师级别的查房记录，病重患者3天内必须有上级医师查房，病情稳定患者7天内要有上级医师查房
			result = 0;
		} else if (modelno.equals("000020")) { //术后3天要有一次上级医师查房
			result = (float) 0.5;
		} else if (modelno.equals("000021")) { //入院后72小时内必须由72小时病情告知
			result = 10;
		} else if (modelno.equals("900001")) { //无入院记录
			result = 34;
		} else if (modelno.equals("900002")) { //无首程
			result = 5;
		} else if (modelno.equals("900003")) { //入院后48小时必须有一次主治医师查房
			result = 1;
		} else if (modelno.equals("900004")) { //在第一次主治查房后，每隔5天有一次主治查房（杭州不用）
			result = 0;
		} else if (modelno.equals("900005")) { //入院后一周必须有一次主任查房
			result = (float) 0.5;
		} else if (modelno.equals("900006")) { //在第一次主任医师查房后，每隔7天就必须有一次主任医师查房
			result = (float) 0.5;
		} else if (modelno.equals("900007")) { //病人入院后三天必须每天有病程记录
			result = (float) 0.5;
		} else if (
			modelno.equals(
				"900008")) { //病危患者每天必须有主任医师级别的查房记录，病重患者3天内必须有上级医师查房，病情稳定患者7天内要有上级医师查房
			result = (float) 0.5;
		} else if (modelno.equals("900009")) { //抢救记录在抢救医嘱下达后6小时内完成(浙医项目不用) 
			result = 0;
		} else if (modelno.equals("900010")) { //转入记录与病人转入后24小时完成(浙医项目不用)
			result = 0;
		} else if (modelno.equals("900011")) { //死亡记录在病人死亡后24小时内完成（待定）
			result = 2;
		} else if (modelno.equals("900012")) { //出院记录在病人出院24小时内完成（待定）
			result = 2;
		} else if (modelno.equals("900013")) { //病案首页在患者出院24小时内完成
			result = 0;
		} else if (modelno.equals("900014")) { //手术病人在手术前1天要有病程记录（术前阶段小结，待定）
			result = 0;
		} else if (modelno.equals("900015")) { //手术记录在手术完成24小时内完成
			result = 5;
		} else if (modelno.equals("900016")) { //有手术的病人必须有阶段小结
			result = 0;
		} else if (modelno.equals("900017")) { //手术后3天内必须每天有病程记录
			result = (float) 0.5;
		} else if (modelno.equals("900018")) { //病人住院每满30天必须有阶段小结
			result = 1;
		} else if (
			modelno.equals(
				"900019")) { //病危患者每天必须有主任医师级别的查房记录，病重患者3天内必须有上级医师查房，病情稳定患者7天内要有上级医师查房
			result = (float) 0.5;
		} else if (modelno.equals("900020")) { //术后3天要有一次上级医师查房
			result = 5;
		} else if (modelno.equals("900021")) { //无出院记录(待定)
			result = 10;
		} else if (modelno.equals("900022")) { //无病案首页(待定)
			result = 30;
		} else if (modelno.equals("900030")) { //入院记录中缺主诉
			result = 1;
		} else if (modelno.equals("900031")) { //入院记录中缺个人史
			result = 2;
		} else if (modelno.equals("900032")) { //入院记录中缺现病史
			result = 12;
		} else if (modelno.equals("900033")) { //入院记录中缺既往史
			result = 3;
		} else if (modelno.equals("900034")) { //入院记录中缺家族史
			result = 1;
		} else if (modelno.equals("900035")) { //入院记录中缺经带胎产史（浙医项目不用）
			result = 2;
		} else if (modelno.equals("900036")) { //入院记录中缺体格检查
			result = 5;
		} else if (modelno.equals("900037")) { //入院记录中缺专科检查
			result = 4;
		} else if (modelno.equals("900038")) { //入院记录中缺辅助检查
			result = 0;
		} else if (modelno.equals("900039")) { //入院记录中缺病人姓名
			result = (float) 0.5;
		} else if (modelno.equals("900040")) { //入院记录中缺病人职业
			result = (float) 0.5;
		} else if (modelno.equals("900041")) { //入院记录中缺病人性别
			result = (float) 0.5;
		} else if (modelno.equals("900042")) { //入院记录中缺病人工作单位
			result = (float) 0.5;
		} else if (modelno.equals("900043")) { //入院记录中缺病人常住地址
			result = (float) 0.5;
		} else if (modelno.equals("900044")) { //入院记录中缺病人婚否
			result = (float) 0.5;
		} else if (modelno.equals("900045")) { //入院记录中缺病人民族
			result = (float) 0.5;
		} else if (modelno.equals("900046")) { //入院记录中缺病人出生地
			result = (float) 0.5;
		} else if (modelno.equals("900047")) { //入院记录中缺病人年龄
			result = (float) 0.5;
		} else if (modelno.equals("900048")) { //入院记录中缺入院日期
			result = (float) 0.5;
		} else if (modelno.equals("900049")) { //入院记录中缺采史日期
			result = (float) 0.5;
		} else if (modelno.equals("900050")) { //入院记录中缺病史陈述者
			result = (float) 0.5;
		} else if (modelno.equals("900051")) { //入院记录中缺发病节气
			result = (float) 0.5;
		} else if (modelno.equals("900052")) { //入院记录中缺可靠程度
			result = (float) 0.5;
		} else if (modelno.equals("900053")) { //入院记录中缺中医诊断
			result = 5;
		} else if (modelno.equals("900054")) { //入院记录中缺西医诊断
			result = 5;
		} else if (modelno.equals("900055")) { //首次病程记录中缺病史摘要
			result = 3;
		} else if (modelno.equals("900056")) { //首次病程记录中缺辨病辩证诊断依据
			result = 3;
		} else if (modelno.equals("900057")) { //首次病程记录中缺中医鉴别诊断依据
			result = 3;
		} else if (modelno.equals("900058")) { //首次病程记录中缺西医诊断依据
			result = 3;
		} else if (modelno.equals("900059")) { //首次病程记录中缺西医鉴别诊断依据
			result = 3;
		} else if (modelno.equals("900060")) { //首次病程记录中缺诊疗计划
			result = 3;
		} else if (modelno.equals("900061")) { //首次病程记录中缺中医诊断
			result = 3;
		} else if (modelno.equals("900062")) { //首次病程记录中缺西医诊断
			result = 3;
		} else if (modelno.equals("900063")) { //死亡记录中缺死亡经过
			result = 2;
		} else if (modelno.equals("900064")) { //死亡记录中缺抢救经过
			result = 2;
		} else if (modelno.equals("900065")) { //死亡记录中缺中医诊断
			result = 2;
		} else if (modelno.equals("900066")) { //死亡记录中缺西医诊断
			result = 2;
		} else if (modelno.equals("900067")) { //出院记录中缺入院时情况
			result = 2;
		} else if (modelno.equals("900068")) { //出院记录中缺住院经过
			result = 2;
		} else if (modelno.equals("900069")) { //出院记录中缺出院医嘱
			result = 2;
		} else if (modelno.equals("900070")) { //出院记录中缺中医诊断
			result = 2;
		} else if (modelno.equals("900071")) { //出院记录中缺西医诊断
			result = 2;
		} else if (modelno.equals("900072")) { //手术记录中缺手术名称
			result = 2;
		} else if (modelno.equals("900073")) { //手术记录中缺手术医生
			result = 2;
		} else if (modelno.equals("900074")) { //手术记录中缺麻醉方法
			result = 2;
		} else if (modelno.equals("900075")) { //手术记录中缺术前诊断
			result = 2;
		} else if (modelno.equals("900076")) { //手术记录中缺术后诊断
			result = 2;
		} else if (modelno.equals("900077")) { //手术记录中缺第I助手
			result = 2;
		} else if (modelno.equals("900078")) { //手术记录中缺第II助手
			result = 2;
		} else if (modelno.equals("900079")) { //手术记录中缺麻醉医师
			result = 2;
		} else if (modelno.equals("900080")) { //手术记录中缺护士
			result = 2;
		} else if (modelno.equals("900081")) { //手术记录中缺手术所见
			result = 2;
		} else if (modelno.equals("900082")) { //手术记录中缺手术步骤
			result = 2;
		} else if (modelno.equals("900083")) { //无病程记录
			result = 20;
		} else if (modelno.equals("900084")) { //未填写72小时病情告知
			result = 10;
		} else if (modelno.equals("900085")) { //未能在规定时间内填写72小时病情告知
			result = 0;
		} else if (
			modelno.equals("900086")) { //入院记录中缺初步诊断 add by fjw 2004-09-06
			result = 0;
		} else if (
			modelno.equals("900087")) { //入院记录中缺修正诊断 add by fjw 2004-09-06
			result = 2;
		}

		return result;
	}

	/**
	 *将源数据按照指定分隔符进行拆分方法 
	 *@author fjw 2005-01-22
	 *@param asrcStr--需要拆分的源数据
	 *        adelimiter--分隔符
	 *@return 存放拆分后数据的HashMap对象    
	 */
	public static HashMap getDelimiterMap(String asrcStr, String adelimiter) {
		HashMap destMap = new HashMap();
		if ((asrcStr == null) || (asrcStr.trim().length() == 0))
			return destMap;
		StringTokenizer st = new StringTokenizer(asrcStr, adelimiter);
		while (st.hasMoreTokens()) {
			destMap.put(st.nextToken(), "1");
		}
		return destMap;
	}

	/**
	 * Method toHtml.
	 * @param src
	 * @return String
	 */
	public static String toHtml(String src) {
		String ret = "";
		if (src != null) {
			ret = src.trim();
			//modify by fjw 2003-04-04  加入对特殊字符的转义处理，这些特殊字符包括单引号，双引号，大小于号
			if (ret.length() > 0) {
				ret = EMRString.replace(ret, "&", "&amp;");
				ret = EMRString.replace(ret, "\"", "&quot;");
				ret = EMRString.replace(ret, "<", "&lt;");
				ret = EMRString.replace(ret, ">", "&gt;");
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		String age = calculateAge("19800517");
		System.err.println("age:"+age);
	}
}