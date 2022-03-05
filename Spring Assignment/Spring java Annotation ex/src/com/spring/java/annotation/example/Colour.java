package com.spring.java.annotation.example;

import org.springframework.stereotype.Component;

@Component
public class Colour {
   
	String colour;

	public void getColour() {
		System.out.print("Colour: "+colour+"  ");
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
