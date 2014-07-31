package com.haitaiinc.timer;

import java.util.HashMap;


/**
 * @author Administrator
 *
 * 系统时钟控制器，负责初始化并控制系统时钟系统
 */
public class SystemTimerManager {
	private static SystemTimerManager systimermanager=null;//系统时钟控制器单例对象
	private HashMap timerlist = null;//时钟队列


	/**
	 * 私有构造函数
	 */
	private SystemTimerManager(){		
		timerlist = new HashMap();
		initSysTimerManager();	
	}
	
	/**
	 * 获取系统时钟控制器实例
	 */	
	public synchronized static SystemTimerManager getInstance(){
		 if(systimermanager==null){
		 	systimermanager = new SystemTimerManager();
		 }
		return systimermanager;
	}
	
	/**
	 * 初始化系统时钟控制器
	 */
	private void initSysTimerManager(){
		
	}
	
	/**
	 * 注册一个时钟到时钟队列
	 */
	public void enrolTimer(Object key,NCDASTimer timer  ){
		this.timerlist.put(key,timer);
	}
	
	/**
	 * 注销一个时钟
	 */
	public void logoutTimer(Object key){
		this.timerlist.remove(key);
	} 
	
	public static void main(String[] args) {
	}
}
