package com.event;

import org.springframework.context.ApplicationListener;

public class BeforeEventHandler implements ApplicationListener<BeforeInsertFilmEvent>{

	public void onApplicationEvent(BeforeInsertFilmEvent event) {
		System.out.println("Before Insert Data");
	}

}
