import java.util.Scanner;
public class AppBiblioteca_vetor {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Biblioteca livros[] = new Biblioteca [5];
		int opc, opcL;
		
		livros[0] = new Biblioteca("Harry Potter", "JK Rolling", 1998, "Aventura", 2, 4);
		livros[1] = new Biblioteca("Se eu ficar", "Gayle Forman", 2015, "Romance", 4, 5);
		livros[2] = new Biblioteca("Para onde ela foi", "Gayle Forman", 2016, "Romance", 4, 5);
		livros[3] = new Biblioteca("Dracula", "Bram Stocker", 1980, "Terror", 1, 2);
		livros[4] = new Biblioteca("Ainda sou eu", "Jojo Moyes", 2018, "Aventura", 3, 6);
		
		do {
			System.out.println("BIBLIOTECA MUNICIPAL\n\nSelecione um livro:\n1 - Harry Potter\n2 - Se eu ficar\n3 - Para onde ela foi\n4 - Dracula\n5 - Ainda sou eu\n9 - Sair\n");
			opcL = teclado.nextInt();
			switch(opcL) {
				case 1: case 2: case 3: case 4: case 5:
					do {
						System.out.println(livros[opcL-1].getTitulo() + "\n1 - Consultar\n2 - Emprestar\n3 - Devolver\n4 - Sobre\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: livros[opcL-1].consultar();
							break;
							case 2: livros[opcL-1].emprestar();
							break;
							case 3: livros[opcL-1].devolver();
							break;
							case 4: livros[opcL-1].sobre();
							break;
							case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
							break;
							default: System.out.println("Opção inválida!");
						}
					}while(opc != 9);
				break;
				case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
				break;
				default: System.out.println("Opção inválida!");
			}
		}while(opcL != 9);
		
		teclado.close();
	}
}
