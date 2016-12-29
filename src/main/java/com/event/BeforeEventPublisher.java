package com.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class BeforeEventPublisher implements ApplicationEventPublisherAware{
	
	private ApplicationEventPublisher publisher ;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}

	public void publish(){
		BeforeInsertFilmEvent event = new BeforeInsertFilmEvent(this);
		publisher.publishEvent(event);
	}
	
	
	
}
