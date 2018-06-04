package com.minuth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjectBeanApplication {

	public static void main(String[] args) 
	{
		ApplicationContext con=	SpringApplication.run(InjectBeanApplication.class, args);
		book_imp book=con.getBean(book_imp.class);
		YourBook yb=new YourBook();
		book.setBook(yb);
		Book b=book.getBook();
		
		book_imp book1=con.getBean(book_imp.class);
		
		Book b1=book1.getBook();
		b1.book_detail();
		b.book_detail();
		
	}
}
