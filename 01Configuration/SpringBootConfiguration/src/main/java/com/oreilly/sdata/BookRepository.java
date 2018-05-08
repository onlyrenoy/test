package com.oreilly.sdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oreilly.sdata.data.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
