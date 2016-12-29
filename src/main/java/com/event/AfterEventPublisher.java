package com.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class AfterEventPublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}

	public void publish(){
		AfterInsertFilmEvent event=new AfterInsertFilmEvent(this);
		
		publisher.publishEvent(event);
	}
	
	
}
