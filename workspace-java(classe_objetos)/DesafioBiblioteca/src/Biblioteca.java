
public class Biblioteca {
	private String titulo;
	private String autor;
	private int anoPubli;
	private String categoria;
	private int numEst;
	private int numPrat;
	private boolean emprestado;
	
	public Biblioteca(String titulo, String autor, int anoPubli, String categoria, int numEst, int numPrat) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
		this.categoria = categoria;
		this.numEst = numEst;
		this.numPrat = numPrat;
		this.emprestado = false;
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
	public int getAnoPubli() {
		return anoPubli;
	}
	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumEst() {
		return numEst;
	}
	public void setNumEst(int numEst) {
		this.numEst = numEst;
	}
	public int getNumPrat() {
		return numPrat;
	}
	public void setNumPrat(int numPrat) {
		this.numPrat = numPrat;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	void consultar() {
		if(emprestado) {
		System.out.println("Este livro est� emprestado\n");
		}
		else {
			System.out.println("Este livro est� dispon�vel para empr�stimo\n");
		}
	}
	
	void emprestar() {
		if(this.emprestado == false) {
			System.out.println("Este livro pode ser emprestado");
			this.emprestado = true;
			System.out.println("Emprestando...");
			System.out.println("Livro emprestado\n");
		}
		else {
			System.out.println("Este livro n�o est� dispon�vel para empr�stimo\n");
		}
	}
	
	void devolver() {
		if(this.emprestado == true) {
			System.out.println("Obrigado por devolver este livro\n");
			this.emprestado = false;
		}
		else {
			System.out.println("Este livro n�o est� emprestado, logo n�o pode ser devolvido ;)\n");
		}
	}
	
	void sobre() {
		System.out.println("Titulo: "+ this.titulo);
		System.out.println("Autor: "+ this.autor);
		System.out.println("Ano de Publica��o: "+ this.anoPubli);
		System.out.println("Categoria: "+ this.categoria);
		System.out.println("Onde est�? => Estante "+ this.numEst+" | Prateleira "+this.numPrat+"\n");
	}
}