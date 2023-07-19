package com.mtec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblibro")
public class Libro {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Integer id;
@Column(name="autor")
private String autor;
@Column(name="titulo")
private String titulo;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}

	
}
