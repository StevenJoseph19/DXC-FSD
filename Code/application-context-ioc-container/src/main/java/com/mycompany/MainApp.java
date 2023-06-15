package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mycompany.model.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\workspace\\DXC-FSD\\application-context-ioc-container\\src\\main\\resources\\Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	}

}
