package com.event;

import org.springframework.context.ApplicationListener;

public class AfterEventHandler implements ApplicationListener<AfterInsertFilmEvent>{

	public void onApplicationEvent(AfterInsertFilmEvent event) {
		System.out.println("After Insert Data");
	}

}
