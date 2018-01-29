package com.docone.formation.first.repository;

import org.springframework.data.repository.CrudRepository;

import com.docone.formation.first.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}



