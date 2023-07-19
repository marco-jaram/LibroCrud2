package com.mtec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtec.model.Libro;
import com.mtec.service.ILibroService;
import com.mtec.service.LibroServiceImple;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class LibroController {

	
	@Autowired
	private ILibroService libroService;
	
	@GetMapping("/libros")
	public List<Libro> obtenerTodos(){
		return libroService.findAll();
	}
	@PostMapping("/libros")
	public Libro crearLibro (@RequestBody Libro libro) {
		return libroService.save(libro);
	}
	@GetMapping("libros/{id}")
	public Libro obtenerUnLibro (@PathVariable Integer id) {
	return  libroService.findById(id);
	
	}
	@PutMapping("/{id}")
	public Libro actaulizarLibro (@PathVariable Integer id, @RequestBody Libro LibroActualizado) {
		Libro libroExistente = libroService.findById(id);
		if (libroExistente !=null){
		libroExistente.setAutor(LibroActualizado.getAutor());
		libroExistente.setTitulo(LibroActualizado.getTitulo());
		return libroService.save(libroExistente);
		} 
		return null;
		}
	@DeleteMapping("/libros/{id}")
	public void eliminarLibro (@PathVariable Integer id) {
		libroService.delete(id);
	}
	
	
	
	
	
	}
	

