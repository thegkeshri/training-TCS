package com.spring.java.annotation.example;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class mainApp {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		System.out.println("Welcome to the world of customized Laptop:");
		
		Brand brand=(Brand)context.getBean(Brand.class);
		Colour colour=(Colour)context.getBean(Colour.class);
		Processor processor=(Processor)context.getBean(Processor.class);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the brand name:");
		brand.setBrand(sc.next());
		
		System.out.println("Enter your Colour: ");
		colour.setColour(sc.next());
		
		System.out.println("Enter your Processor name: ");
		processor.setProcessor(sc.next());
		brand.getBrand();
		colour.getColour();
		processor.getProcessor();
		
	}

}
