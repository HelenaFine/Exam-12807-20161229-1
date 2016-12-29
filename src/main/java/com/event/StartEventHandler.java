package com.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import sun.applet.AppletListener;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context Start");
	}

}
