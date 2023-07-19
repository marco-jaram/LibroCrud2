package com.mtec.repository;

import org.springframework.data.repository.CrudRepository;

import com.mtec.model.Libro;

public interface ILibroRepo extends CrudRepository<Libro, Integer> {

}
