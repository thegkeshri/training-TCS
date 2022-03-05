package com.spring.java.annotation.example;

import org.springframework.stereotype.Component;

@Component
public class Processor {
	
	String processor;

	public void getProcessor() {
		System.out.println("Processor: "+processor);
		System.out.println("  Thank you for using our app.!!");
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
}
