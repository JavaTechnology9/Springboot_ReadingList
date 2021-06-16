package com.javatechnology.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechnology.model.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long>{
	List<Book> findByReader(String reader);

}
