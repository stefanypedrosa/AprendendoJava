package br.com.apresentacoes.print.model;

public class produto {
	private int id;
	private String titulo;
	private String detalhes;
	private double preco;
	private int qtdeEstoque;
	private String linkFoto;
	
	public produto(int id, String titulo, String detalhes, double preco, int qtdeEstoque, String linkFoto) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
		this.linkFoto = linkFoto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	public String toString() {
		return "Produto{<br>ID: "+this.id+"<br>título: "+this.titulo+"<br>detalhes: "+this.detalhes+"<br>preco: R$"+this.preco+ "<br>estoque: "+this.qtdeEstoque+"<br>linkFoto: "+this.linkFoto+"<br>}";
	}
	
}
