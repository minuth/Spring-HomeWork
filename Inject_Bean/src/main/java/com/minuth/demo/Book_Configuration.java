package com.minuth.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Book_Configuration 
{
	@Bean
	public MyBook getMyBook()
	{
		return new MyBook();
	}
	@Bean
	public YourBook getYourBook()
	{
		return new YourBook();
	}
}
