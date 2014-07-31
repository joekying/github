package com.haitaiinc.event;

import java.util.EventObject;
import java.util.HashMap;

/**
 * @author bwu 
 *
 * 专科系统中，所有自定义事件的基础类
 * 所有自定义事件对象都是此类的子类
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
