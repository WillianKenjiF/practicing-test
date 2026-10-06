package com.example.test.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String autor;
	
	@Column(unique = true)
	private String isbn;
	private int exemplaresDisponiveis;
	
	public Livro() {
	}

	public Livro(Long id, String titulo, String autor, String isbn, int qtdeExemplares) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.exemplaresDisponiveis = qtdeExemplares;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}
	//O setIsbn não foi colocado por ser único, portanto não deve set alterado

	public int getExemplaresDisponiveis() {
		return exemplaresDisponiveis;
	}

	public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
		this.exemplaresDisponiveis = exemplaresDisponiveis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
}
