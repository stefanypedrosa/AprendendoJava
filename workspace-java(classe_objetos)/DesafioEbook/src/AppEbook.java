import java.util.Scanner;
public class AppEbook {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Ebook livros[] = new Ebook [5];
		int opc, opcL;
		
		livros[0] = new Ebook("Harry Potter", "JK Rolling", 326);
		livros[1] = new Ebook("Se eu ficar", "Gayle Forman", 298);
		livros[2] = new Ebook("Para onde ela foi", "Gayle Forman", 216);
		livros[3] = new Ebook("Dracula", "Bram Stocker", 80);
		livros[4] = new Ebook("Ainda sou eu", "Jojo Moyes", 352);
		
		do {
			System.out.println("EBOOKS\n\nSelecione um livro:\n1 - Harry Potter\n2 - Se eu ficar\n3 - Para onde ela foi\n4 - Dracula\n5 - Ainda sou eu\n9 - Sair\n");
			opcL = teclado.nextInt();
			switch(opcL) {
				case 1: case 2: case 3: case 4: case 5:
					do {
						System.out.println(livros[opcL-1].getTitulo() + "\n1 - Avançar Pág\n2 - Voltar Pág\n3 - Ir para Pág\n4 - Página Atual\n5 - Sobre\n6 - Mostrar Capa\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: livros[opcL-1].avancarPag();
							break;
							case 2: livros[opcL-1].voltarPag();
							break;
							case 3: livros[opcL-1].irPag();
							break;
							case 4: livros[opcL-1].exibirPag();
							break;
							case 5: livros[opcL-1].sobre();
							break;
							case 6: livros[opcL-1].mostrarCapa();
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
