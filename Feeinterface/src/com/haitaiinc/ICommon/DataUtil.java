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
	 * �ü��ַ���
	 * @param src Դ��
	 * @return String �ü�����ַ���
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
	 * ������ʱ���һ�ָ�ʽת��Ϊ��һ�ָ�ʽ
	 * @param srcTime Դ��
	 * @param srcPattern	Դ����ʽ
	 * @param destPattern Ŀ�괮��ʽ
	 * @return String Ŀ�괮
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

	//���ݳ������ڼ�������
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
	 * ���������ַ�����������
	 * һ�����Ϸ�������
	 * һ�����·�������
	 * ע:��һ�����ڱ�����ڵڶ�������
	 */
	public static String calculateAge(String strDate1, String strDate2) {
//		System.out.println("[��������]Date1 = " + strDate1 + " Date2 = " + strDate2);
		String result = "";
		if (strDate1 != null && strDate2 != null && strDate1.compareTo(strDate2)>=0) {
			//���ַ���ת��Ϊ��������
			Date date1 = Util.parseDate(strDate1, "yyyyMMdd");
			Date date2 = Util.parseDate(strDate2, "yyyyMMdd");

			if (date1 != null && date2 != null) {
				Calendar calendar1 = Calendar.getInstance();
				Calendar calendar2 = Calendar.getInstance();
				calendar1.setTime(date1);
				calendar2.setTime(date2);

//				System.out.println(calendar1.toString());
				//��ȡ���
				int year1 = calendar1.get(Calendar.YEAR);
				int year2 = calendar2.get(Calendar.YEAR);
//				System.out.println("year1=" + year1 + " year2=" + year2);
				//��ȡ�·�
				int month1 = calendar1.get(Calendar.MONTH) + 1;
				int month2 = calendar2.get(Calendar.MONTH) + 1;
//				System.out.println("month1=" + month1 + " month2=" + month2);
				//��ȡ����
				int day1 = calendar1.get(Calendar.DATE);
				int day2 = calendar2.get(Calendar.DATE);
//				System.out.println("day1=" + day1 + " day2=" + day2);
				//����ʱ���
				int ageYear = year1 - year2; //��������
				int ageMonth = month1 - month2; //��������
				int ageDay = day1 - day2; //��������

//				System.out.println("***************ageYear=" + ageYear);
//				System.out.println("***************ageMonth=" + ageMonth);
//				System.out.println("***************ageDay=" + ageDay);
				
				if (ageYear == 0) { //������һ������
					if (ageDay < 0) {
						ageMonth--;
						ageDay = 30 + ageDay;
						if (ageMonth <= 0) {
							if(ageDay>=29){
								result = "1��";
							}else{
								result = String.valueOf(ageDay) + "��";
							}
						} else {
							result =
								String.valueOf(ageMonth)
									+ "��"
									+ String.valueOf(ageDay)
									+ "��";
						}
					} else {
						if (ageMonth <= 0) {
							if(ageDay>=29){
								result = "1��";
							}else{
								result = String.valueOf(ageDay) + "��";
							}
						} else {
							result =
								String.valueOf(ageMonth)
									+ "��"
									+ String.valueOf(ageDay)
									+ "��";
						}
					}
				}else if (ageYear == 1) { //�������1��
					if (ageMonth > 0) { //������һ������
						result = String.valueOf(ageYear) + "��"+String.valueOf(ageMonth)+"��";
					} else if (ageMonth == 0) { //�����ڵ���
						if (ageDay < 0) { //������11����
							ageMonth = 12 + ageMonth;
							ageMonth--;
							ageDay = 30 + ageDay;
							if (ageMonth <= 0) {
								result = String.valueOf(ageDay) + "��";
							} else {
								result =
									String.valueOf(ageMonth)
										+ "��"
										+ String.valueOf(ageDay)
										+ "��";
							}
						} else { //�������һ��
							result = String.valueOf(ageYear) + "��"+String.valueOf(ageMonth)+"��";
						}
					} else { //������һ������
						ageMonth = 12 + ageMonth;
						if (ageDay <= 0) {
							ageMonth--;
							ageDay = 30 + ageDay;
							if (ageMonth <= 0) {
								if(ageDay>=29){
									result = "1��";
								}else{
									result = String.valueOf(ageDay) + "��";
								}
							} else {
								result =
									String.valueOf(ageMonth)
										+ "��"
										+ String.valueOf(ageDay)
										+ "��";
							}
						} else {
							if (ageMonth <= 0) {
								result = String.valueOf(ageDay) + "��";
							} else {
								result =
									String.valueOf(ageMonth)
										+ "��"
										+ String.valueOf(ageDay)
										+ "��";
							}
						}
					}
				} else if(ageYear>1 && ageYear<=12){ //��ݲ���1��12
					if (ageMonth > 0) { 
						result = String.valueOf(ageYear) + "��";
						if(ageYear < 12){
							result += String.valueOf(ageMonth)+"��";
						}
					}else if (ageMonth == 0){
						if(ageDay <0){
							ageYear--;
							ageMonth = ageMonth + 11;
						}
						result = String.valueOf(ageYear) + "��";
						if(ageYear < 12){
							result += String.valueOf(ageMonth)+"��";
						}
					}else if(ageMonth<0){
						ageYear--;
						ageMonth = ageMonth + 12;
						result = String.valueOf(ageYear) + "��" + String.valueOf(ageMonth)+"��";
					}
				} else if(ageYear>12){	//��12��
//					result = String.valueOf(ageYear)+"��";
					if (ageMonth == 0){
						if(ageDay <0){
							ageYear--;
						}
					}else if(ageMonth<0){
						ageYear--;
					}
					result = String.valueOf(ageYear) + "��";
				} else { //����������
					result = "";
				}
				
//				else if(ageYear == 1){	//��ݲ�һ��
//					if (ageMonth > 0) { //������һ�����ϣ���������
//						result = String.valueOf(ageYear) + "��";
//					} else if (ageMonth == 0) { //�����ڵ���
//						ageMonth = 12 + ageMonth;
//						if (ageDay < 0) { //������11����
//							ageMonth--;
//							result = String.valueOf(ageMonth) + "��";
//						} else { //�������һ��
//							result = String.valueOf(ageYear) + "��";
//						}
//					} else { //������һ������
//						ageMonth = 12 + ageMonth;
//						if (ageDay <= 0) {
//							ageMonth--;
//						} 
//						result = String.valueOf(ageMonth) + "��";
//					}			
//				}
				 
//				 else if (ageYear > 1) { //������һ�����ϣ���������
//					result = String.valueOf(ageYear) + "��";
//				} else { //����������
//					result = "";
//				}
			}
		}
//		System.out.println("���䣺" + result);
		return result;
	}
	
	
	/**
		 * �������Ʒ�ֵ 
		 * add by fjw 2004-08-18 ���չ�����Ŀ����
		 */
	public static float getQualityCheckScore(String modelno) {
		float result = 0;
		if (modelno == null) {
		} else if (modelno.equals("000001")) { //��Ժ��¼�ڲ�����Ժ24Сʱ�����(��ҽһԺ��Ŀ����)
			result = 5;
		} else if (modelno.equals("000002")) { //�״β��̼�¼�ڲ�����Ժ8Сʱ�����
			result = 1;
		} else if (modelno.equals("000003")) { //��Ժ��48Сʱ�ڱ�����1������ҽʦ�鷿
			result = 1;
		} else if (modelno.equals("000004")) { //�ڵ�1�����β鷿��ÿ5�������һ�����β鷿����ҽһԺ����
			result = 0;
		} else if (modelno.equals("000005")) { //��Ժ��һ�ܱ�����һ�θ���������ҽʦ�鷿
			result = 1;
		} else if (modelno.equals("000006")) { //�ڵ�һ�Σ���������ҽʦ�鷿��ÿһ�ܱ�����һ�����β鷿
			result = 1;
		} else if (modelno.equals("000007")) { //������Ժ������ÿ������в��̼�¼
			result = (float) 0.5;
		} else if (
			modelno.equals(
				"000008")) { //���ػ���ÿ���в��̼�¼�������ȶ���������3���¼һ�Σ������ȶ������Բ�����5���¼һ��
			result = (float) 0.5;
		} else if (modelno.equals("000009")) { //���ȼ�¼������ҽ����6Сʱ�����(��ҽһԺ��Ŀ����)
			result = 0;
		} else if (modelno.equals("000010")) { //ת���¼�벡��ת���24Сʱ�������ҽһԺ��Ŀ����)
			result = 0;
		} else if (modelno.equals("000011")) { //������¼�벡��������24Сʱ�������ҽһԺ��Ŀ����)
			result = 0;
		} else if (modelno.equals("000012")) { //��Ժ��¼�ڲ��˳�Ժ24Сʱ�����
			result = 4;
		} else if (modelno.equals("000013")) { //������ҳ�ڻ��߳�Ժ24Сʱ�����
			result = 0;
		} else if (modelno.equals("000014")) { //��������������ǰ1��Ҫ�в��̼�¼����ǰ�׶�С�������
			result = 0;
		} else if (modelno.equals("000015")) { //������¼���������24Сʱ����ɣ���ҽ��Ŀ������
			result = 0;
		} else if (modelno.equals("000016")) { //�������Ĳ��˱����н׶�С��
			result = 0;
		} else if (modelno.equals("000017")) { //������3���ڱ���ÿ���в��̼�¼
			result = (float) 0.5;
		} else if (modelno.equals("000018")) { //����סԺÿ��30������н׶�С��
			result = 1;
		} else if (
			modelno.equals(
				"000019")) { //��Σ����ÿ�����������ҽʦ����Ĳ鷿��¼�����ػ���3���ڱ������ϼ�ҽʦ�鷿�������ȶ�����7����Ҫ���ϼ�ҽʦ�鷿
			result = 0;
		} else if (modelno.equals("000020")) { //����3��Ҫ��һ���ϼ�ҽʦ�鷿
			result = (float) 0.5;
		} else if (modelno.equals("000021")) { //��Ժ��72Сʱ�ڱ�����72Сʱ�����֪
			result = 10;
		} else if (modelno.equals("900001")) { //����Ժ��¼
			result = 34;
		} else if (modelno.equals("900002")) { //���׳�
			result = 5;
		} else if (modelno.equals("900003")) { //��Ժ��48Сʱ������һ������ҽʦ�鷿
			result = 1;
		} else if (modelno.equals("900004")) { //�ڵ�һ�����β鷿��ÿ��5����һ�����β鷿�����ݲ��ã�
			result = 0;
		} else if (modelno.equals("900005")) { //��Ժ��һ�ܱ�����һ�����β鷿
			result = (float) 0.5;
		} else if (modelno.equals("900006")) { //�ڵ�һ������ҽʦ�鷿��ÿ��7��ͱ�����һ������ҽʦ�鷿
			result = (float) 0.5;
		} else if (modelno.equals("900007")) { //������Ժ���������ÿ���в��̼�¼
			result = (float) 0.5;
		} else if (
			modelno.equals(
				"900008")) { //��Σ����ÿ�����������ҽʦ����Ĳ鷿��¼�����ػ���3���ڱ������ϼ�ҽʦ�鷿�������ȶ�����7����Ҫ���ϼ�ҽʦ�鷿
			result = (float) 0.5;
		} else if (modelno.equals("900009")) { //���ȼ�¼������ҽ���´��6Сʱ�����(��ҽ��Ŀ����) 
			result = 0;
		} else if (modelno.equals("900010")) { //ת���¼�벡��ת���24Сʱ���(��ҽ��Ŀ����)
			result = 0;
		} else if (modelno.equals("900011")) { //������¼�ڲ���������24Сʱ����ɣ�������
			result = 2;
		} else if (modelno.equals("900012")) { //��Ժ��¼�ڲ��˳�Ժ24Сʱ����ɣ�������
			result = 2;
		} else if (modelno.equals("900013")) { //������ҳ�ڻ��߳�Ժ24Сʱ�����
			result = 0;
		} else if (modelno.equals("900014")) { //��������������ǰ1��Ҫ�в��̼�¼����ǰ�׶�С�ᣬ������
			result = 0;
		} else if (modelno.equals("900015")) { //������¼���������24Сʱ�����
			result = 5;
		} else if (modelno.equals("900016")) { //�������Ĳ��˱����н׶�С��
			result = 0;
		} else if (modelno.equals("900017")) { //������3���ڱ���ÿ���в��̼�¼
			result = (float) 0.5;
		} else if (modelno.equals("900018")) { //����סԺÿ��30������н׶�С��
			result = 1;
		} else if (
			modelno.equals(
				"900019")) { //��Σ����ÿ�����������ҽʦ����Ĳ鷿��¼�����ػ���3���ڱ������ϼ�ҽʦ�鷿�������ȶ�����7����Ҫ���ϼ�ҽʦ�鷿
			result = (float) 0.5;
		} else if (modelno.equals("900020")) { //����3��Ҫ��һ���ϼ�ҽʦ�鷿
			result = 5;
		} else if (modelno.equals("900021")) { //�޳�Ժ��¼(����)
			result = 10;
		} else if (modelno.equals("900022")) { //�޲�����ҳ(����)
			result = 30;
		} else if (modelno.equals("900030")) { //��Ժ��¼��ȱ����
			result = 1;
		} else if (modelno.equals("900031")) { //��Ժ��¼��ȱ����ʷ
			result = 2;
		} else if (modelno.equals("900032")) { //��Ժ��¼��ȱ�ֲ�ʷ
			result = 12;
		} else if (modelno.equals("900033")) { //��Ժ��¼��ȱ����ʷ
			result = 3;
		} else if (modelno.equals("900034")) { //��Ժ��¼��ȱ����ʷ
			result = 1;
		} else if (modelno.equals("900035")) { //��Ժ��¼��ȱ����̥��ʷ����ҽ��Ŀ���ã�
			result = 2;
		} else if (modelno.equals("900036")) { //��Ժ��¼��ȱ�����
			result = 5;
		} else if (modelno.equals("900037")) { //��Ժ��¼��ȱר�Ƽ��
			result = 4;
		} else if (modelno.equals("900038")) { //��Ժ��¼��ȱ�������
			result = 0;
		} else if (modelno.equals("900039")) { //��Ժ��¼��ȱ��������
			result = (float) 0.5;
		} else if (modelno.equals("900040")) { //��Ժ��¼��ȱ����ְҵ
			result = (float) 0.5;
		} else if (modelno.equals("900041")) { //��Ժ��¼��ȱ�����Ա�
			result = (float) 0.5;
		} else if (modelno.equals("900042")) { //��Ժ��¼��ȱ���˹�����λ
			result = (float) 0.5;
		} else if (modelno.equals("900043")) { //��Ժ��¼��ȱ���˳�ס��ַ
			result = (float) 0.5;
		} else if (modelno.equals("900044")) { //��Ժ��¼��ȱ���˻��
			result = (float) 0.5;
		} else if (modelno.equals("900045")) { //��Ժ��¼��ȱ��������
			result = (float) 0.5;
		} else if (modelno.equals("900046")) { //��Ժ��¼��ȱ���˳�����
			result = (float) 0.5;
		} else if (modelno.equals("900047")) { //��Ժ��¼��ȱ��������
			result = (float) 0.5;
		} else if (modelno.equals("900048")) { //��Ժ��¼��ȱ��Ժ����
			result = (float) 0.5;
		} else if (modelno.equals("900049")) { //��Ժ��¼��ȱ��ʷ����
			result = (float) 0.5;
		} else if (modelno.equals("900050")) { //��Ժ��¼��ȱ��ʷ������
			result = (float) 0.5;
		} else if (modelno.equals("900051")) { //��Ժ��¼��ȱ��������
			result = (float) 0.5;
		} else if (modelno.equals("900052")) { //��Ժ��¼��ȱ�ɿ��̶�
			result = (float) 0.5;
		} else if (modelno.equals("900053")) { //��Ժ��¼��ȱ��ҽ���
			result = 5;
		} else if (modelno.equals("900054")) { //��Ժ��¼��ȱ��ҽ���
			result = 5;
		} else if (modelno.equals("900055")) { //�״β��̼�¼��ȱ��ʷժҪ
			result = 3;
		} else if (modelno.equals("900056")) { //�״β��̼�¼��ȱ�没��֤�������
			result = 3;
		} else if (modelno.equals("900057")) { //�״β��̼�¼��ȱ��ҽ�����������
			result = 3;
		} else if (modelno.equals("900058")) { //�״β��̼�¼��ȱ��ҽ�������
			result = 3;
		} else if (modelno.equals("900059")) { //�״β��̼�¼��ȱ��ҽ�����������
			result = 3;
		} else if (modelno.equals("900060")) { //�״β��̼�¼��ȱ���Ƽƻ�
			result = 3;
		} else if (modelno.equals("900061")) { //�״β��̼�¼��ȱ��ҽ���
			result = 3;
		} else if (modelno.equals("900062")) { //�״β��̼�¼��ȱ��ҽ���
			result = 3;
		} else if (modelno.equals("900063")) { //������¼��ȱ��������
			result = 2;
		} else if (modelno.equals("900064")) { //������¼��ȱ���Ⱦ���
			result = 2;
		} else if (modelno.equals("900065")) { //������¼��ȱ��ҽ���
			result = 2;
		} else if (modelno.equals("900066")) { //������¼��ȱ��ҽ���
			result = 2;
		} else if (modelno.equals("900067")) { //��Ժ��¼��ȱ��Ժʱ���
			result = 2;
		} else if (modelno.equals("900068")) { //��Ժ��¼��ȱסԺ����
			result = 2;
		} else if (modelno.equals("900069")) { //��Ժ��¼��ȱ��Ժҽ��
			result = 2;
		} else if (modelno.equals("900070")) { //��Ժ��¼��ȱ��ҽ���
			result = 2;
		} else if (modelno.equals("900071")) { //��Ժ��¼��ȱ��ҽ���
			result = 2;
		} else if (modelno.equals("900072")) { //������¼��ȱ��������
			result = 2;
		} else if (modelno.equals("900073")) { //������¼��ȱ����ҽ��
			result = 2;
		} else if (modelno.equals("900074")) { //������¼��ȱ������
			result = 2;
		} else if (modelno.equals("900075")) { //������¼��ȱ��ǰ���
			result = 2;
		} else if (modelno.equals("900076")) { //������¼��ȱ�������
			result = 2;
		} else if (modelno.equals("900077")) { //������¼��ȱ��I����
			result = 2;
		} else if (modelno.equals("900078")) { //������¼��ȱ��II����
			result = 2;
		} else if (modelno.equals("900079")) { //������¼��ȱ����ҽʦ
			result = 2;
		} else if (modelno.equals("900080")) { //������¼��ȱ��ʿ
			result = 2;
		} else if (modelno.equals("900081")) { //������¼��ȱ��������
			result = 2;
		} else if (modelno.equals("900082")) { //������¼��ȱ��������
			result = 2;
		} else if (modelno.equals("900083")) { //�޲��̼�¼
			result = 20;
		} else if (modelno.equals("900084")) { //δ��д72Сʱ�����֪
			result = 10;
		} else if (modelno.equals("900085")) { //δ���ڹ涨ʱ������д72Сʱ�����֪
			result = 0;
		} else if (
			modelno.equals("900086")) { //��Ժ��¼��ȱ������� add by fjw 2004-09-06
			result = 0;
		} else if (
			modelno.equals("900087")) { //��Ժ��¼��ȱ������� add by fjw 2004-09-06
			result = 2;
		}

		return result;
	}

	/**
	 *��Դ���ݰ���ָ���ָ������в�ַ��� 
	 *@author fjw 2005-01-22
	 *@param asrcStr--��Ҫ��ֵ�Դ����
	 *        adelimiter--�ָ���
	 *@return ��Ų�ֺ����ݵ�HashMap����    
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
			//modify by fjw 2003-04-04  ����������ַ���ת�崦����Щ�����ַ����������ţ�˫���ţ���С�ں�
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