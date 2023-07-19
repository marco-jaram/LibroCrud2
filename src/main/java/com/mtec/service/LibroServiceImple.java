package com.mtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.model.Libro;
import com.mtec.repository.ILibroRepo;

@Service
public class LibroServiceImple implements ILibroService{

@Autowired
private ILibroRepo libroRepo;


	@Override
	public List<Libro> findAll() {
		
		return (List<Libro>) libroRepo.findAll();
	}

	@Override
	public Libro save(Libro libro) {
		
		return libroRepo.save(libro);
	}

	@Override
	public Libro findById(Integer id) {
		
		return libroRepo.findById(id).orElse(null) ;
	}

	@Override
	public void delete(Integer id) {
	libroRepo.deleteById(id);
		
	}

}
