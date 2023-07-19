package com.mtec.service;

import java.util.List;

import com.mtec.model.Libro;


public interface ILibroService {
public List<Libro> findAll();
public Libro save(Libro libro);
public Libro findById(Integer id);
public void delete(Integer id);

}
