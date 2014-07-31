package com.haitaiinc.timer;

import java.util.HashMap;


/**
 * @author Administrator
 *
 * ϵͳʱ�ӿ������������ʼ��������ϵͳʱ��ϵͳ
 */
public class SystemTimerManager {
	private static SystemTimerManager systimermanager=null;//ϵͳʱ�ӿ�������������
	private HashMap timerlist = null;//ʱ�Ӷ���


	/**
	 * ˽�й��캯��
	 */
	private SystemTimerManager(){		
		timerlist = new HashMap();
		initSysTimerManager();	
	}
	
	/**
	 * ��ȡϵͳʱ�ӿ�����ʵ��
	 */	
	public synchronized static SystemTimerManager getInstance(){
		 if(systimermanager==null){
		 	systimermanager = new SystemTimerManager();
		 }
		return systimermanager;
	}
	
	/**
	 * ��ʼ��ϵͳʱ�ӿ�����
	 */
	private void initSysTimerManager(){
		
	}
	
	/**
	 * ע��һ��ʱ�ӵ�ʱ�Ӷ���
	 */
	public void enrolTimer(Object key,NCDASTimer timer  ){
		this.timerlist.put(key,timer);
	}
	
	/**
	 * ע��һ��ʱ��
	 */
	public void logoutTimer(Object key){
		this.timerlist.remove(key);
	} 
	
	public static void main(String[] args) {
	}
}
