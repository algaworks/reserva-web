package com.algaworks.jm.reservaweb.controle;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.algaworks.jm.reservaweb.modelo.Curso;

@ManagedBean
@RequestScoped
public class ListaCursosBean {

	private List<Curso> cursos;
	
	@PostConstruct
	public void init() {
		this.cursos = Curso.listar();
	}

	public List<Curso> getCursos() {
		return cursos;
	}

}