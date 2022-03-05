package com.spring.example;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.Configuration;
@Configuration
public class Camera implements Features {
	@Override
	public String feature() {
		ArrayList<String> camera=new ArrayList<String>();
		camera.add("Sony");
		camera.add("Toshiba");
		
		System.out.println("Select Camera:");
		for(String cam:camera) {
			System.out.print(cam+  "  ");
		}
		Scanner sc=new Scanner(System.in);
		String cam=sc.nextLine();
		if(camera.contains(cam)) {
			System.out.println("Selected Camera is:"+" "+cam);
			return cam;
		}
		else {
			System.out.println("Incorrect Camera. Try again.");
			return "";
		}
			
	}

	
}
