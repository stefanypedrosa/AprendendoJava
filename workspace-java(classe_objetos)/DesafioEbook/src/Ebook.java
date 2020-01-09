import java.util.Scanner;
public class Ebook {
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private int zoom;
	
	Scanner teclado = new Scanner(System.in);
	
	public Ebook(String titulo, String autor, int totalPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.pagAtual = 0;
		this.zoom = 100;
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

	public int getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
	
	
	
	public void avancarPag() {
		if(pagAtual < totalPag) {
			pagAtual++;
			System.out.println("Página "+pagAtual+"\n");
		}
		else {
			System.out.println("Você chegou ao final do Ebook\n");
		}
	}
	public void voltarPag() {
		if(pagAtual > 0) {
			pagAtual--;
			System.out.println("Página "+pagAtual+"\n");
		}
		else {
			System.out.println("Você chegou ao início do Ebook\n");
		}
	}
	public void irPag() {
		System.out.println("Qual página você deseja? ");
		pagAtual = teclado.nextInt();
		exibirPag();
	}
	public void exibirPag() {
		System.out.println("Você está na página "+pagAtual+"\n");
	}
	public void mostrarCapa() {
		System.out.println("CAPA\n");
	}
	
	public void sobre() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Total de páginas: "+totalPag +"\n");
	}
	
}
