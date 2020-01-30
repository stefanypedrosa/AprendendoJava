package br.org.generation.alunoCurso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_aluno")
public class aluno {
	
	@Column(name="RA")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int RA;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="email", length=40, unique=true)
	private String email;
	
	@Column(name="telefone", length=11)
	private String telefone;
	
	@Column(name="Nascimento", length=10)
	private String dataNasc;

	@ManyToOne
	@JsonIgnoreProperties("aluno")
	private curso curso;
	
	public curso getCurso() {
		return curso;
	}

	public void setCurso(curso curso) {
		this.curso = curso;
	}

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
