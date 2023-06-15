package com.spring.eventhandling.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());

	}

}
