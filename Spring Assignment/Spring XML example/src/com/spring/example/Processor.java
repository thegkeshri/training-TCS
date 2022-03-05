package com.spring.example;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Processor implements Features {

	@Override
	public String feature() {
		ArrayList<String> processor=new ArrayList<String>();
		processor.add("Mediatek");
		processor.add("Snapdragon");
		System.out.println("Select Prcoessor:");
		for(String prcr:processor) {
			System.out.print(prcr+  "  ");
		}
		Scanner sc=new Scanner(System.in);
		String prcr=sc.nextLine();
		if(processor.contains(prcr)) {
			System.out.println("Selected processor is:"+" "+prcr);
			return prcr;
		}
		else
			System.out.println("Incorrect processor. Try again.");
		return "";
	}

	}

