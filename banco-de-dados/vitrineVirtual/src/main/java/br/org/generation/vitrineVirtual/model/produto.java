package br.org.generation.vitrineVirtual.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_produto")
public class produto {
	
	@Column(name="idProduto")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="detalhes", length=300)
	private String detalhes;
	
	@Column(name="preco")
	private float preco;
	
	@Column(name="foto")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private departamento departamento;
	
	
	public departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(departamento departamento) {
		this.departamento = departamento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
