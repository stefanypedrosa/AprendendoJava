package br.org.generation.alunoCurso.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_curso")
public class curso {
	@Column(name="codCurso")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codCurso;
	
	@Column(name="nome", length=30)
	private String nome;
	
	@Column(name="descricao", length=200)
	private String descricao;
	
	@Column(name="cargaHoraria")
	private int cargaHoraria;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	@JsonIgnoreProperties("curso")
	private List<aluno> aluno;
	
	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public List<aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<aluno> aluno) {
		this.aluno = aluno;
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

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
