package br.org.generation.sistemaaluno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//cria table
@Table(name="tbl_aluno")
public class aluno {
	
	//atributo é definido como coluna, define nome e tamanhho com length
	@Column(name="RA")
	//chave primaria
	@Id
	//indica que o id é auto_increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ra;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="email", length=30, unique = true)
	private String email;
	
	@Column(name="telefone", length=15)
	private String telefone;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
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
	
	
}
