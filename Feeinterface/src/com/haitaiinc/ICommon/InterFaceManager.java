package com.haitaiinc.ICommon;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;



import com.haitaiinc.event.EMREventListener;
import com.haitaiinc.interfaceserver.ManageInFirstFee;
import com.haitaiinc.timer.NCDASTimer;
import com.haitaiinc.timer.SystemTimerManager;
/**
 * @author user
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class InterFaceManager extends Thread implements EMREventListener {
	private Document configdom = null;
	private Connection emrdb = null;
	private Connection hisdb = null;

	
	private boolean isRun = false;
	private static boolean toStop = false;
	private boolean isServer = false;

	private HashMap modelset = null;
	private String InterFaceType; //��ʾ�ӿ�����������
	private static String cachedri = null;
	private static String cacheurl = null;
	private static String cacheuser = null;
	private static String cachepswd = null;
	private String begintime; //�ӿ�����ʱ��
	private String laststarttime; //�ϴνӿ�����ʱ��
	private String lastendtime; //�ϴνӿ�ֹͣʱ��

	private String inDate;	//��Ժʱ��
	
	public InterFaceManager() {
		this.modelset = new HashMap();
		this.setExitHook();
	}
	public static void main(String[] args) {
		InterFaceManager ifm = new InterFaceManager();
		if (args.length > 0) {
			ifm.setInterFaceType(args[0]);
		} else {
			ifm.setInterFaceType("LabReport");
		}
		try {
			ifm.init(ifm.getInterFaceType());
		} catch (Exception e) {
			System.out.println("ϵͳ�쳣�˳�");
			e.printStackTrace();
		}
	}
	private void init(String type)
		throws
			JDOMException,
			IOException,
			ClassNotFoundException,
			SQLException,
			ParseException {
		loadSysConfig("config.xml");
		if (this.isServer == false) {
			buildTimer(type);
		}
	}
	private void buildTimer(String type) throws ParseException {
		Element root = this.configdom.getRootElement();
		Element timercfg = root.getChild("Timer");
		String begintime = timercfg.getChild("begintime").getText();
		String intertime = "";
		if ("InFirstFee".equals(type)) {//2012-12-15����������ҳ���÷���
		      intertime = timercfg.getChild("InFirstFee").getText();
	    }
		
		System.out.println("begintime=" + begintime);
		System.out.println("intertime=" + intertime);
		long it = Long.parseLong(intertime);
		it = it * 60000;
		NCDASTimer timer = null;
		try {
			timer = new NCDASTimer(begintime, it);
		} catch (ParseException e) {
			e.printStackTrace();
			throw e;
		}
		timer.addListenre(this);
		SystemTimerManager.getInstance().enrolTimer("main", timer);
		timer.start();
	}
	private void loadSysConfig(String filename)throws IOException, JDOMException {
		System.out.println("[����sysconfig.xml�����ļ�...]");
		SAXBuilder builder = new SAXBuilder();
		try {
			this.configdom = builder.build(new File(filename));
		} catch (IOException e) {
			System.out.println("[��ȡ�ļ�ʧ��...]");
			throw e;
		} catch (JDOMException e1) {
			System.out.println("[�����ļ�ʧ��...]");
		}
	}
	private void openConnection() throws ClassNotFoundException, SQLException {
		System.out.println("[�������ݿ�������ԴBEGIN...]");
		Element root = configdom.getRootElement();
		Element modelset = root.getChild("ModelSet");
		List list = modelset.getChildren();
		for (int i = 0; list != null && i < list.size(); i++) {
			Element e = (Element) list.get(i);
		}
	
		Element isServer = root.getChild("isServer");
		if ("1".equals(isServer.getText())) {
			this.isServer = true;
		} else {
			this.isServer = false;
		}
		
		String driver = null;
		String url = null;
		String user = null;
		String password = null;
	 if ("InFirstFee".equals(this.InterFaceType)) {
		      Element connConfig = root.getChild("HISConnection");
		      driver = connConfig.getAttribute("driver").getValue();
		      url = connConfig.getChild("url").getText();
		      user = connConfig.getChild("user").getText();
		      password = connConfig.getChild("password").getText();
		      try {
		        System.out.println("[׼������HIS���ݿ�]");
		        System.out.println("driver:" + driver);
		        System.out.println("url:" + url);
		        System.out.println("user:" + user);
		        System.out.println("password:" + password);
		        Class.forName(driver);
		        this.hisdb = DriverManager.getConnection(url, user, password);
		        System.out.println("[HIS���ݿ����ӳɹ�]");
		      } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		        throw e;
		      } catch (SQLException e) {
		        System.out.println("[HIS���ݿ�����ʧ��]");
		        e.printStackTrace();
		        throw e;
		      }

		      connConfig = root.getChild("EMRConnection");
		      driver = connConfig.getAttribute("driver").getValue();
		      url = connConfig.getChild("url").getText();
		      user = connConfig.getChild("user").getText();
		      password = connConfig.getChild("password").getText();
		      try {
		        System.out.println("[׼������EMR���ݿ�]");
		        System.out.println("driver:" + driver);
		        System.out.println("url:" + url);
		        System.out.println("user:" + user);
		        System.out.println("password:" + password);
		        Class.forName(driver);
		        this.emrdb = DriverManager.getConnection(url, user, password);
		        System.out.println("[EMR���ݿ����ӳɹ�]");
		      } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		        throw e;
		      } catch (SQLException e) {
		        System.out.println("[EMR���ݿ�����ʧ��]");
		        e.printStackTrace();
		        throw e;
		      }
		    }
		
		
		System.out.println("[�������ݿ�������ԴEND...]");
	}

	/**
	 * @see com.haitaiinc.event.EMREventListener#onTimer(EventObject)
	 */
	public void onTimer(EventObject event) {
		try {
			if (this.isRun == false) {
				this.isRun = true;
				//������������
				openConnection();
				String currtime = Util.getCurrDateTime();
				System.out.println("[�ӿ�����ʱ��] "+ DataUtil.transDateTime(currtime,"yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss"));
				 if ("InFirstFee".equals(this.InterFaceType)) {
			          System.out.println("������ҳ���÷���InFirstFee����begin��......");
			          ManageInFirstFee manageInFirstFee = new ManageInFirstFee(this.hisdb, this.emrdb);
			          manageInFirstFee.manageInFirstFeeDetial();
			          System.out.println("������ҳ���÷���InFirstFee����end��......");
			        }
				currtime = Util.getCurrDateTime();
				System.out.println("[�ӿ�ֹͣʱ��] "+ DataUtil.transDateTime(currtime,"yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss"));
				System.out.println("\n");
			} else {
				System.out.println("[ϵͳ��������......]");
			}
		} catch (Exception e) {
			System.out.println("[���ݽӿ�����ʱ��������!]" + e.getMessage());  
			e.printStackTrace();
			//������б�־;
			if (this.isRun = true)
				this.isRun = false;
		} finally {
			//�ر���������
			closeConnection();
			this.isRun = false;
		}
	}
	public void setExitHook() {
		Runtime.getRuntime().addShutdownHook(this);
	}
	public void closeConnection() {
		System.out.println("[����ϵͳ��Դ......]");
		if (this.emrdb != null) {
			try {
				emrdb.commit();
				emrdb.close();
				emrdb = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (this.hisdb != null) {
			try {
				hisdb.commit();
				hisdb.close();
				hisdb = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		toStop = true;
		closeConnection();
	}
	/**
	 * Returns the interFaceType.
	 * @return String
	 */
	public String getInterFaceType() {
		return InterFaceType;
	}
	/**
	 * Sets the interFaceType.
	 * @param interFaceType The interFaceType to set
	 */
	public void setInterFaceType(String interFaceType) {
		InterFaceType = interFaceType;
	}
	/**
	 * Returns the toStop.
	 * @return boolean
	 */
	public static boolean isToStop() {
		return toStop;
	}
	/**
	 * Returns the cachedri.
	 * @return String
	 */
	public static String getCachedri() {
		return cachedri;
	}
	/**
	 * Returns the cachepswd.
	 * @return String
	 */
	public static String getCachepswd() {
		return cachepswd;
	}
	/**
	 * Returns the cacheurl.
	 * @return String
	 */
	public static String getCacheurl() {
		return cacheurl;
	}
	/**
	 * Returns the cacheuser.
	 * @return String
	 */
	public static String getCacheuser() {
		return cacheuser;
	}
}
