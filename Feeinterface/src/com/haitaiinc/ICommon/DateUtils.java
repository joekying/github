package com.haitaiinc.ICommon;

/**
 * <p>Title: EMR���Ӳ���ϵͳ</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2001</p>
 * <p>Company: �Ͼ���̩�Ƽ�</p>
 * @author Haifei
 * @version 1.0
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateUtils {
	private static int i;

	public DateUtils() {
	}

	/**
	 * ȡ�õ�ǰ��[����]-SQL��������
	 * @return
	 */
	public static java.sql.Date getCurrentDate() {
		java.util.Date dddd = new java.util.Date();
		long llll = dddd.getTime();
		java.sql.Date tttt = new java.sql.Date(llll);
		return tttt;
	}
	/**
	 * ȡ�õ�ǰ��[ʱ��]-SQLʱ������
	 * @return
	 */
	public static java.sql.Time getCurrentTime() {
		java.util.Date dddd = new java.util.Date();
		long llll = dddd.getTime();
		java.sql.Time tttt = new java.sql.Time(llll);
		return tttt;
	}

	/**
	 * ���������ڼ�
	 * @return
	 */
	public static int whatDayIsToday() {
		int dayOfWeek = 0;
		int result = 0;
		java.util.Calendar cal = java.util.Calendar.getInstance();
		dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		switch (dayOfWeek) {
			case java.util.Calendar.MONDAY :
				result = 1; //"��һ";
				break;
			case java.util.Calendar.TUESDAY :
				result = 2; //"�ܶ�";
				break;
			case java.util.Calendar.WEDNESDAY :
				result = 3; //"����";
				break;
			case java.util.Calendar.THURSDAY :
				result = 4; //"����";
				break;
			case java.util.Calendar.FRIDAY :
				result = 5; //"����";
				break;
			case java.util.Calendar.SATURDAY :
				result = 6; //"����";
				break;
			case java.util.Calendar.SUNDAY :
				result = 7; //"����";
				break;
		}
		return result;
	}

	/**
	 * ����ĳ�������ڼ�
	 * @param p_date �����ַ���
	 * @return
	 */
	public static int whatDayIsSpecifyDate(String p_date) {
		//2002-2-22 is friday5
		long differenceDays = 0L;
		long m = 0L;
		differenceDays = signDaysBetweenTowDate(p_date, "2002-2-22");

		m = (differenceDays % 7);
		System.out.println("m=" + m);
		m = m + 5;
		m = m > 7 ? m - 7 : m;
		return Integer.parseInt(m + "");
	}

	public static String WhatWeekdayIsSpecifyDate(String p_date) {
		int day = whatDayIsSpecifyDate(p_date);
		switch (day) {
			case 1 :
				return "����һ";
				//break;
			case 2 :
				return "���ڶ�";
				//break;
			case 3 :
				return "������";
				//break;
			case 4 :
				return "������";
				//break;
			case 5 :
				return "������";
				//break;
			case 6 :
				return "������";
				//break;
			case 7 :
				return "������";
				//break;
			default :
				return "";
		}
	}
	
public static String WhatWeekdayIsSpecifyDate1(String p_date) {
		int day = whatDayIsSpecifyDate(p_date);
		switch (day) {
			case 1 :
				return "1";
				//break;
			case 2 :
				return "2";
				//break;
			case 3 :
				return "3";
				//break;
			case 4 :
				return "4";
				//break;
			case 5 :
				return "5";
				//break;
			case 6 :
				return "6";
				//break;
			case 7 :
				return "7";
				//break;
			default :
				return "";
		}
	}
	/**
	 * ��ȡ���������ֵ
	 * @return
	 */
	public static java.util.Date getToday() {
		return (new java.util.Date());
	}
	/**
	 * ����������������
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static long daysBetweenTowDate(
		java.util.Date d1,
		java.util.Date d2) {
		return java.lang.Math.abs(
			(d1.getTime() - d2.getTime()) / (3600 * 24 * 1000));
	}

	/**
	 * Method daysBetweenTowDate �����ڼ��������.
	 * @param d1 ��ʼ���� ������
	 * @param d2 ��ʼ���� ������
	 * @return long ���� 
	 */
	public static long daysBetweenTowDate(java.sql.Date d1, java.sql.Date d2) {
		return java.lang.Math.abs(
			(d1.getTime() - d2.getTime()) / (3600 * 24 * 1000));
	}

	/**
	 * Method signDaysBetweenTowDate �����ڼ��������.
	 * @param d1 ��ʼ���� ������
	 * @param d2 ��ʼ���� ������
	 * @return long ����
	 */
	public static long signDaysBetweenTowDate(
		java.sql.Date d1,
		java.sql.Date d2) {
		return (d1.getTime() - d2.getTime()) / (3600 * 24 * 1000);
	}

	/**
	 * Method daysBetweenTowDate �����ڼ��������.
	 * @param d1 �����ַ���
	 * @param d2 �����ַ���
	 * @return long ����
	 */
	public static long daysBetweenTowDate(String d1, String d2) {
		java.sql.Date dd1 = null;
		java.sql.Date dd2 = null;
		long result = -1l;
		try {
			dd1 = java.sql.Date.valueOf(d1);
			dd2 = java.sql.Date.valueOf(d2);
			result = daysBetweenTowDate(dd1, dd2);
		} catch (Exception ex) {
			result = -1;
		}
		return result;
	}
	/**
	 * Method signDaysBetweenTowDate �����ڼ��������.
	 * @param d1 �����ַ���
	 * @param d2 �����ַ���
	 * @return long ����
	 */
	public static long signDaysBetweenTowDate(String d1, String d2) {
		java.sql.Date dd1 = null;
		java.sql.Date dd2 = null;
		long result = -1l;
		try {
			dd1 = java.sql.Date.valueOf(d1);
			dd2 = java.sql.Date.valueOf(d2);
			result = signDaysBetweenTowDate(dd1, dd2);
		} catch (Exception ex) {
			result = -1;
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

	/**
	 * ��ĳһ�����Ǽ���������,�õ���������
	 * @param p_date �����ַ���
	 * @param p_days ��ӵ�����
	 * @return һ��������
	 */
	public static java.util.Date newDateOfAddDays(String p_date, int p_days) {
		java.util.Date ds = null;
		java.sql.Date dTemp = null;
		dTemp = java.sql.Date.valueOf(p_date);
		ds = new java.util.Date(dTemp.getTime());

		return newDateOfAddDays(ds, p_days);
	}

	/**
	 * Method newDateOfAddDays �õ�ָ�����ں�ָ������������.
	 * @param p_date ��ǰ����
	 * @param p_days ����
	 * @return Date �õ�������
	 */
	public static java.util.Date newDateOfAddDays(
		java.util.Date p_date,
		int p_days) {
		long dateValue = 0L;
		long daysValue = 0L;
		java.util.Date newDate = null;

		dateValue = p_date.getTime();
		daysValue = p_days * (3600 * 24 * 1000);

		dateValue += daysValue;
		newDate = new java.util.Date(dateValue);

		return newDate;
	}

	/**
	 * Method timeAdd.
	 * @param time
	 * @param hours
	 * @return String
	 */
	public static String timeAdd(String time, double hours) {
		try {
			java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat();
			Date ts = newTimeOfAddHours(time, hours);
			fmt.applyPattern("HH:mm:ss");
			return fmt.format(ts);
		} catch (Exception e) {
			return "";
		}
	}
	/**
	 * ��ĳһʱ���ϼ�����Сʱ,�õ�����ʱ��
	 * @param p_time ʱ���ַ���
	 * @param p_hours ��ӵ�Сʱ��
	 * @return һ����ʱ��
	 */
	public static Date newTimeOfAddHours(String p_time, double p_hours) {
		Date ts = null;
		java.sql.Time tTemp = null;
		tTemp = java.sql.Time.valueOf(p_time);

		ts = new Date(tTemp.getTime());

		return newTimeOfAddHours(ts, p_hours);
	}

	/**
	 * Method newTimeOfAddHours ��ָ��ʱ�������ϼ���ָ��Сʱ�õ��µ�ʱ������.
	 * @param p_time: ָ��ʱ������.
	 * @param p_hours: ָ��Сʱ.
	 * @return Date �µ�ʱ������.
	 */
	public static Date newTimeOfAddHours(Date p_time, double p_hours) {
		long timeValue = 0L;
		long hourValue = 0L;

		timeValue = p_time.getTime();
		hourValue = (long) (p_hours * (3600 * 1000));

		timeValue += hourValue;
		Date newTime = new Date(timeValue);

		return newTime;
	}
	/**
	 * �ַ���ת��������
	 * @param s1
	 * @return
	 */
	public static java.sql.Date strToDate(String s1) {
		java.sql.Date newDate = null;
		try {
			newDate = java.sql.Date.valueOf(s1);
		} catch (Exception ex) {
			newDate = null;
		}
		return newDate;
	}

	/**
	 * Method strToUtilDate �ַ�����ת����util Date.
	 * @param s1
	 * @return Date
	 */
	public static java.util.Date strToUtilDate(String s1) {
		java.sql.Date sd = strToDate(s1);
		return new java.util.Date(sd.getTime());
	}

	public static String DateToStr(java.util.Date d) {
		if (d == null) {
			return null;
		}
		return DateToStr(new java.sql.Date(d.getTime()));
	}

	public static String DateToStr(java.sql.Date d) {
		if (d == null) {
			return null;
		}
		return d.toString();
	}

	/**
	 * ȡ����������ֱ��Ӧ������
	 * @return
	 */
	public String[] getDateOfWeekDay() {
		String result_date[] = new String[7]; //���ص�����ֵ
		java.util.Calendar cal = java.util.Calendar.getInstance();

		int today_year = cal.get(cal.YEAR); //��ǰ���
		int today_xq = cal.get(cal.DAY_OF_WEEK) - 1; //�������ܼ�
		if (today_xq == 0) {
			today_xq = 7;
		}

		int today_date = cal.get(cal.DATE); //�����Ǽ���
		int today_month = cal.get(cal.MONTH) + 1; //�����Ǽ���
		int week_left_days = 7 - today_xq; //����ʣ����

		int i = 0;
		int date_x = 0; //���ܵ�ĳ��

		int new_year = 0; //�����
		int new_month = 0; //���·�
		int new_date = 0; //����

		for (i = 1; i < 8; i++) {
			date_x = week_left_days + today_date + i;

			if (today_month == 1
				|| today_month == 3
				|| today_month == 5
				|| today_month == 7
				|| today_month == 8
				|| today_month == 10
				|| today_month == 12) {
				if (date_x > 31) {
					new_date = date_x - 31;
					new_month = today_month + 1;
				} else {
					new_date = date_x;
					new_month = today_month;
				}
			} else if (today_month == 2) {
				if (check_runnian(today_year)) {
					if (date_x > 29) {
						new_date = date_x - 29;
						new_month = today_month + 1;
					} else {
						new_date = date_x;
						new_month = today_month;
					}
				} else {
					if (date_x > 28) {
						new_date = date_x - 28;
						new_month = today_month + 1;
					} else {
						new_date = date_x;
						new_month = today_month;
					}
				}
			} else if (
				today_month == 4
					|| today_month == 6
					|| today_month == 9
					|| today_month == 11) {
				if (date_x > 30) {
					new_date = date_x - 30;
					new_month = today_month + 1;
				} else {
					new_date = date_x;
					new_month = today_month;
				}
			}
			if (new_month > 12) {
				new_month = new_month - 12;
				new_year = today_year + 1;
			} else {
				new_year = today_year;
			}
			result_date[i - 1] = new_year + "-" + new_month + "-" + new_date;
		}
		return result_date;
	}

	/**
	 * �����Ƿ�Ϊ����
	 * @param p_year Ҫ�жϵ����
	 * @return �ǻ��
	 */
	public boolean check_runnian(int p_year) {
		if (p_year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return ȡָ�����ڵ���һ����
	 * @param ָ������
	 */
	public static java.util.Date targetWeeksMondayDate(String d) {
		int i = 0;
		i = whatDayIsSpecifyDate(d);

		java.util.Date dd = strToUtilDate(d);
		java.util.Date result = null;

		if (i == 1) {
			result = dd;
		} else if (i == 2) {
			result = newDateOfAddDays(dd, -1);
		} else if (i == 3) {
			result = newDateOfAddDays(dd, -2);
		} else if (i == 4) {
			result = newDateOfAddDays(dd, -3);
		} else if (i == 5) {
			result = newDateOfAddDays(dd, -4);
		} else if (i == 6) {
			result = newDateOfAddDays(dd, -5);
		} else if (i == 7) {
			result = newDateOfAddDays(dd, -6);
		}
		return result;
	}

	/**
	 * @return ȡָ�����ڵ���������
	 * @param ָ������
	 */
	public static java.util.Date targetWeeksSundayDate(String d) {
		int i = 0;
		i = whatDayIsSpecifyDate(d);

		java.util.Date dd = strToDate(d);
		java.util.Date result = null;
		if (i == 1) {
			result = newDateOfAddDays(dd, 6);
		} else if (i == 2) {
			result = newDateOfAddDays(dd, 5);
		} else if (i == 3) {
			result = newDateOfAddDays(dd, 4);
		} else if (i == 4) {
			result = newDateOfAddDays(dd, 3);
		} else if (i == 5) {
			result = newDateOfAddDays(dd, 2);
		} else if (i == 6) {
			result = newDateOfAddDays(dd, 1);
		} else if (i == 7) {
			result = dd;
		}
		return result;
	}

	public static void main(String[] args) {
		DateUtils du = new DateUtils();
		String s = null;
		s = du.whatDayIsSpecifyDate("1981-01-01") + "";
		System.out.print(s);
	}

	//add by rliu 2005-09-13
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

	/**
	 * Method getCurrDateTime.
	 * @param format
	 * @return String
	 */
	public static String getCurrDateTime(String format) {
		String currTimeStr;
		try {
			java.util.Date currDate = new java.util.Date();
			SimpleDateFormat dtFmt = new SimpleDateFormat(format);
			currTimeStr = dtFmt.format(currDate);
			//Debug.println("currTimeStr===="+currTimeStr);	
		} catch (Exception e) {
			return "";
		}
		return currTimeStr;
	}

	/**
	 *����ָ����ʽ��ȡ��ǰʱ����ַ��� 
	 *@author fjw 2004-08-26
	 *@param afmt--�ض��ĸ�ʽ
	 *@return ָ����ʽ���ַ���   
	 */
	public static String getCurrDateTime() {
		String currTimeStr;
		try {
			java.util.Date currDate = new java.util.Date();
			SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy-MM-dd");
			currTimeStr = dtFmt.format(currDate);
		} catch (Exception e) {
			return "";
		}
		return currTimeStr;
	}

	/**
	*�����������ڣ����ַ�����ʾ��֮���������� 
	*@author fjw 2004-08-12
	*@param  d1--��һ���ڣ���������
	*         d2--��Ϊ����������
	*@return ���߼�������� 
	*/
	public static long daysBetweenTowDate2(String d1, String d2) {
		long result = -1l;
		try {
			String destStr1 =
				d1.substring(0, 4)
					+ "-"
					+ d1.substring(4, 6)
					+ "-"
					+ d1.substring(6, 8)
					+ " 00:00:00";
			java.sql.Timestamp destTime1 = java.sql.Timestamp.valueOf(destStr1);
			String destStr2 =
				d2.substring(0, 4)
					+ "-"
					+ d2.substring(4, 6)
					+ "-"
					+ d2.substring(6, 8)
					+ " 00:00:00";
			java.sql.Timestamp destTime2 = java.sql.Timestamp.valueOf(destStr2);
			long diffTimes = destTime1.getTime() - destTime2.getTime();
			result = java.lang.Math.abs(diffTimes / (3600 * 24 * 1000));
		} catch (Exception ex) {
			result = -1;
		}
		return result;
	}

	/**
	 * �õ�ĳ�պ��죨24Сʱһ�죩������ʱ��
	 */
	public static String getNextDateTime(String oldDateTime, int i) {
		String nextDateTime = "";

		String date = oldDateTime.substring(0, 8);
		String time = oldDateTime.substring(8, 14);

		nextDateTime = DateUtils.dateAdd(DataUtil.transDate(date), i) + time;

		return nextDateTime;
	}
	
	
	public static String newTimeOfAddMin(String datetime, double imin) {
		String newt = "";
		try {
			DateFormat dtformat = new SimpleDateFormat("yyyyMMddHHmmss");
			Date ds = dtformat.parse(datetime);
			long itime = ds.getTime();
			System.out.println("timeValue=" + itime);
			long min = (long) (imin * (60 * 1000));
			itime += min;
			Date newTime = new Date(itime);
			newt = Util.formatDate(newTime, "yyyyMMddHHmmss");
			System.out.println("this new time----" + newt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newt;
	}
}