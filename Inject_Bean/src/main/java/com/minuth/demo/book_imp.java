package com.minuth.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName= "prototype")
public class book_imp 
{
	Book book;
	
	@Autowired
	public book_imp(@Qualifier("getMyBook")Book book) {
		this.book=book;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("I'm started");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("I'm destroy");
	}
	
}
