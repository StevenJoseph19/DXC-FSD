package com.spring.eventhandling.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.ContextStartedEvent;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;

	}

	public void publish() {
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}

}
