package com.algaworks.jm.reservaweb.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String sigla;
	private String nome;
	private String descricao;
	
	public Curso() {
	}
	
	public Curso(String sigla, String nome, String descricao) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static List<Curso> listar() {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("fcjb", "Formação Consultor Java Beginner", 
				"Pacote de 112 horas para pessoas que não conhecem ou são iniciantes na plataforma Java. " +
				"Esta formação proporcionará todo conhecimento necessário para entrar no mercado como " +
				"programador Java para Web com Servlets e JSP, com forte base nos conceitos " +
				"de orientação a objetos, boas práticas de programação Java e fluência na utilização do Eclipse."));
		
		cursos.add(new Curso("dwjsf", "Desenvolvimento Web com JavaServer Faces", 
				"Aprenda tecnologias que trarão mais produtividade para desenvolvimento de sistemas " +
				"corpotativos em arquitetura web. JavaServer Faces é uma especificação consagrada pelo " +
				"mercado e faz parte do currículo dos melhores profissionais especialistas em Java."));
		
		cursos.add(new Curso("pcpj", "Preparatório para Certificação de Programador Java", 
				"Prepare-se para a prova da Sun Microsystems/Oracle que o qualificará oficialmente como um bom " +
				"entendedor da tecnologia Java e mostre ao mercado todo o seu potencial."));
		
		cursos.add(new Curso("dcph", "Desenvolvimento da Camada de Persistência com Hibernate", 
				"O curso tem como objetivo apresentar os recursos do framework de persistência " +
				"objeto-relacional mais utilizado no mundo, como mapeamento avançado usando anotações, " +
				"gravação e consulta de objetos com HQL, Criteria API, SQL Nativo e etc."));
		
		cursos.add(new Curso("gaps", "Gerenciamento Ágil de Projetos com Scrum", 
				"Aprenda os conceitos e como aplicar Scrum em diferentes ambientes, como em nível " +
				"organizacional, com equipes distribuídas, contratos ágeis, principais dificuldades, " +
				"resistências, alinhamento com modelos de qualidade tais como CMMI e MPS.BR e alinhamento " +
				"com guias de boas práticas existentes, tais como o PMBOK."));
		
		return cursos;
	}
	
}