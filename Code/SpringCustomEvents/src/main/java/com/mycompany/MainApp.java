package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.eventhandling.events.CustomEventPublisher;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");

		cvp.publish();
		cvp.publish();
	}

}
