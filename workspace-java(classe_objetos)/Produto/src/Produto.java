
public class Produto {
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private int qtdeEstoque;
	
	/*public Produto(int id, String nome, String detalhes, float preco, int qtdeEstoque) {
		this.id = id;
		this.nome = nome;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<=0) {
			throw new RuntimeException("ID Inv�lido");
		}
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.length()==0) {
			throw new RuntimeException("Nome inv�lido");
		}
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		if(detalhes == null || detalhes.length()==0) {
			throw new RuntimeException("Detalhes inv�lidos");
		}
		this.detalhes = detalhes;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		if(preco<=0.0) {
			throw new RuntimeException("Pre�o inv�lido");
		}
		this.preco = preco;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		if(qtdeEstoque<0) {
			throw new RuntimeException("Quantidade inv�lida");
		}
		this.qtdeEstoque = qtdeEstoque;
	}
	
	@Override
	public String toString() {
		return "Produto{\n	ID: "+ this.id+"\n	Nome: \""+this.nome+"\"\n	Detalhes: \""+this.detalhes+"\"\n	Pre�o: \"R$"+this.preco+"\"\n	Quantidade: "+this.qtdeEstoque+"\n}";
	}
	
}
