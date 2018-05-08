package com.oreilly.sdata;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.oreilly.sdata.data.entities.Book;

@SpringBootApplication
public class SpringDataBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataBootApplication.class, args);
        BookRepository repository = context.getBean(BookRepository.class);
        Book book = new Book();
        book.setTitle("A test book");
        book.setPageCount(200);
        book.setPublishDate(new Date());
        
        repository.save(book);
    }
}
