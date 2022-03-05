package com.spring.example;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Brand implements Features {
	@Override
	public String feature() {
		ArrayList<String> brand=new ArrayList<String>();
		brand.add("Apple");
		brand.add("Xiaomi");
		brand.add("Samsung");
		brand.add("Motorola");
		System.out.println("Select Brand:");
		for(String brnd:brand) {
			System.out.print(brnd+  "  ");
		}
		Scanner sc=new Scanner(System.in);
		String brnd=sc.nextLine();
		if(brand.contains(brnd)) {
			System.out.println("Selected brand is:"+" "+brnd);
			return brnd;
		}
		else
			System.out.println("Incorrect Brand. Try again.");
		return "";
	}
	
	
}
