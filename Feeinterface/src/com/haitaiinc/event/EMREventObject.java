package com.haitaiinc.event;

import java.util.EventObject;
import java.util.HashMap;

/**
 * @author bwu 
 *
 * ר��ϵͳ�У������Զ����¼��Ļ�����
 * �����Զ����¼������Ǵ��������
 *
 * 2005/5/16 
 */
public class EMREventObject extends EventObject {
	private HashMap params;
	
	public EMREventObject(Object source){
		super(source);
		params = new HashMap();
	}

	public void setParam(Object key,Object value){
		params.put(key,value);
	}	

	public Object getParam(Object key){
		return params.get(key);
	}		

}
