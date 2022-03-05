package com.spring.java.annotation.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
	public Colour colour() {
    	return new Colour();
    }
    @Bean
    public Brand brand() {
    	return new Brand();
    }
    @Bean
    public Processor processor() {
    	return new Processor();
    }
}
