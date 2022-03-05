package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Features brand=(Features)context.getBean("brand");
		String b=brand.feature();
		Features camera=(Features)context.getBean("camera");
		String c=camera.feature();
		Features processor=(Features)context.getBean("processor");
		String p=processor.feature();
		System.out.println("Your Selected Features are:");
		System.out.println("brand:"+b+" camera:"+c+" processor:"+p);
		
	}

}
