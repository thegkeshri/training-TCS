package com.spring.java.annotation.example;

import org.springframework.stereotype.Component;

@Component
public class Brand {
		
	String brand;

	public void getBrand() {
		System.out.println("Your customized laptop has these features: ");
		System.out.print("Brand:"+brand+"  ");;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
