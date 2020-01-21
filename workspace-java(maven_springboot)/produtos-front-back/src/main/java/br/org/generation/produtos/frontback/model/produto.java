package br.org.generation.produtos.frontback.model;

public class produto {
	private int codigo;
	private String titulo;
	private String detalhes;
	private double preco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "produto [codigo=" + codigo + ", titulo=" + titulo + ", detalhes=" + detalhes + ", preco=" + preco + "]";
	}
	
}
