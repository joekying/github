package com.haitaiinc.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.haitaiinc.ICommon.Util;
import com.haitaiinc.event.*;

/**
 * @author bwu
 *
 * 用于系统定时器基类，
 */
public class NCDASTimer implements EMREventListener {
	private static final int RUN_MODLE_TIMING = 1; //定时启动模式 
	private static final int RUN_MODLE_CIRCLE = 2; //循环启动模式
	private static final int RUN_MODLE_TIME_CIRC = 3; //定时循环启动模式

	Date begintime = null; //启动时间，为Null表示立即启动
	long intertime; //启动频率，为0表示启动1此
	boolean isRun = false; //定时器是否正在运行 true-正在运行/false-停止
	int runModel; //定时器运行模式 

	List listeners = new Vector(); //监听器队列
	Timer timer = new Timer(); //时钟对象
	TimerTask task = null;
	/**
	 *  定时器类构造函数
	 *  @param Stirng vbegintime 启动时间(yyyyMMddHHmmss)
	 *  @param String vintertime 启动频率
	 */
	public NCDASTimer(String vbegintime, long vintertime)
		throws ParseException {
		if (vbegintime != null && vbegintime.length() > 0) {
			SimpleDateFormat adf = new SimpleDateFormat();
			adf.applyPattern("yyyyMMddHHmmss");
			try {
				begintime = adf.parse(vbegintime);
			} catch (ParseException e) {
				e.printStackTrace();
				throw e;
			}
		} else {
			begintime = null;
		}
		intertime = vintertime;
		this.runModel = judgeRunModel();
	}
	public NCDASTimer(String vbegintime) throws ParseException {
		if (vbegintime != null) {
			SimpleDateFormat adf = new SimpleDateFormat();
			adf.applyPattern("yyyyMMddHHmmss");
			try {
				begintime = adf.parse(vbegintime);
			} catch (ParseException e) {
				throw e;
			}
		} else {
			begintime = null;
		}

		intertime = 0;
		this.runModel = judgeRunModel();
	}
	public NCDASTimer(long vintertime) {
		begintime = null;
		intertime = vintertime;
		this.runModel = judgeRunModel();
	}

	public boolean start() {
		boolean result = false;

		if (this.isRun == true) { //定时器正在计时
			stop(); //停止计时器
		}

		//定义临时计时器任务类
		task = new TimerTask() {
			public void run() {
				onTime();
			}
		};

		//根据定时器启动模式，启动定时器
		if (this.runModel == this.RUN_MODLE_TIMING) {
			timer.schedule(task, begintime);
		} else if (this.runModel == this.RUN_MODLE_CIRCLE) {
			timer.schedule(task, 0, this.intertime);
		} else {
			timer.schedule(task, begintime, this.intertime);
		}
		result = true;

		this.isRun = result;
		return result;
	}

	public boolean stop() {
		boolean result = false;
		if (this.isRun == true) {
			this.task.cancel();
			this.timer.cancel();
			this.isRun = false;
		}

		return result;
	}

	/**
	 * Returns the begintime.
	 * @return String
	 */
	public String getBegintime() {
		return Util.formatDate(begintime, "yyyymmddhhmmss");
	}

	/**
	 * Returns the intertime.
	 * @return long
	 */
	public long getIntertime() {
		return intertime;
	}

	/**
	 * Returns the isRun.
	 * @return boolean
	 */
	public boolean isRun() {
		return isRun;
	}

	/**
	 * Sets the runModel.
	 * @param runModel The runModel to set
	 */
	public void setRunModel(int runModel) {
		this.runModel = runModel;
	}

	/**
	 * 判断定时器运行模式
	 */
	private int judgeRunModel() {
		int result;
		if (begintime == null) { //未为设置启动时间
			result = this.RUN_MODLE_CIRCLE;
		} else if (intertime == 0) { //未设置启动频率
			result = this.RUN_MODLE_TIMING;
		} else {
			result = this.RUN_MODLE_TIME_CIRC;
		}
		return result;
	}

	/**
	 * 注册监听器
	 */
	synchronized public void addListenre(EMREventListener listen) {
		listeners.add(listen);
	}

	/**
	 * 触发定时时间
	 */
	private void onTime() {
		//生成事件对象
		EMREventObject event = new EMREventObject(this);
		//发送事件消息
		EMREventListener listener = null;
		for (int i = 0; i < listeners.size(); i++) {
			listener = (EMREventListener) listeners.get(i);
			listener.onTimer(event);
		}
	}

	/**
	 * @see com.haitaiinc.cdas.event.EMREventListener#onTimer(EventObject)
	 */
	public void onTimer(EventObject event) {
	}

}
