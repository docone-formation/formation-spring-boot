package com.docone.formation.first.repository;

import org.springframework.data.repository.CrudRepository;

import com.docone.formation.first.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>  {

}
