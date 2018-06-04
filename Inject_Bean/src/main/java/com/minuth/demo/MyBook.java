package com.minuth.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

public class MyBook implements Book
{
	@Override
	public void book_detail() 
	{
		System.out.println("This my book!!!");
		
	}
	
}
