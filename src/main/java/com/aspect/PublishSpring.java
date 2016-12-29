package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

import com.event.AfterEventPublisher;
import com.event.BeforeEventPublisher;

public class PublishSpring {
	@Autowired
	private BeforeEventPublisher beforeEventPublisher;
	@Autowired
	private AfterEventPublisher afterEventPublisher;
	
	
	
	public void beforeAdvice(JoinPoint p){
		/*
		 * 发布事件
		 */
		beforeEventPublisher.publish();
	}
	
	public void afterAdvice(JoinPoint p){
		/*
		 * 发布事件
		 */
		afterEventPublisher.publish();
	}

	public BeforeEventPublisher getBeforeEventPublisher() {
		return beforeEventPublisher;
	}

	public void setBeforeEventPublisher(BeforeEventPublisher beforeEventPublisher) {
		this.beforeEventPublisher = beforeEventPublisher;
	}

	public AfterEventPublisher getAfterEventPublisher() {
		return afterEventPublisher;
	}

	public void setAfterEventPublisher(AfterEventPublisher afterEventPublisher) {
		this.afterEventPublisher = afterEventPublisher;
	}
	
	
}
