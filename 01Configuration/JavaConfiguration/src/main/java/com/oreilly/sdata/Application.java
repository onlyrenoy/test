package com.oreilly.sdata;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Application {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(DataConfiguration.class)){
				BookService service = context.getBean(BookService.class);
				Book book = new Book("First Book", new Date(), 33, new BigDecimal("26.00"));
				service.save(book);
				System.out.println("saved");
			}
		
	}
}
