package com.haitaiinc.event;

import java.util.EventListener;
import java.util.EventObject;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public interface EMREventListener extends EventListener {

	public void onTimer(EventObject event);

}
