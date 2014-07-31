package com.haitaiinc.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.haitaiinc.ICommon.Util;
import com.haitaiinc.event.*;

/**
 * @author bwu
 *
 * ����ϵͳ��ʱ�����࣬
 */
public class NCDASTimer implements EMREventListener {
	private static final int RUN_MODLE_TIMING = 1; //��ʱ����ģʽ 
	private static final int RUN_MODLE_CIRCLE = 2; //ѭ������ģʽ
	private static final int RUN_MODLE_TIME_CIRC = 3; //��ʱѭ������ģʽ

	Date begintime = null; //����ʱ�䣬ΪNull��ʾ��������
	long intertime; //����Ƶ�ʣ�Ϊ0��ʾ����1��
	boolean isRun = false; //��ʱ���Ƿ��������� true-��������/false-ֹͣ
	int runModel; //��ʱ������ģʽ 

	List listeners = new Vector(); //����������
	Timer timer = new Timer(); //ʱ�Ӷ���
	TimerTask task = null;
	/**
	 *  ��ʱ���๹�캯��
	 *  @param Stirng vbegintime ����ʱ��(yyyyMMddHHmmss)
	 *  @param String vintertime ����Ƶ��
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

		if (this.isRun == true) { //��ʱ�����ڼ�ʱ
			stop(); //ֹͣ��ʱ��
		}

		//������ʱ��ʱ��������
		task = new TimerTask() {
			public void run() {
				onTime();
			}
		};

		//���ݶ�ʱ������ģʽ��������ʱ��
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
	 * �ж϶�ʱ������ģʽ
	 */
	private int judgeRunModel() {
		int result;
		if (begintime == null) { //δΪ��������ʱ��
			result = this.RUN_MODLE_CIRCLE;
		} else if (intertime == 0) { //δ��������Ƶ��
			result = this.RUN_MODLE_TIMING;
		} else {
			result = this.RUN_MODLE_TIME_CIRC;
		}
		return result;
	}

	/**
	 * ע�������
	 */
	synchronized public void addListenre(EMREventListener listen) {
		listeners.add(listen);
	}

	/**
	 * ������ʱʱ��
	 */
	private void onTime() {
		//�����¼�����
		EMREventObject event = new EMREventObject(this);
		//�����¼���Ϣ
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
