import java.util.Scanner;
public class AppBiblioteca {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcL, opc;
		Biblioteca l1, l2, l3, l4, l5;
		l1 = new Biblioteca("Harry Potter", "JK Rolling", 1998, "Aventura", 2, 4);
		l2 = new Biblioteca("Se eu ficar", "Gayle Forman", 2015, "Romance", 4, 5);
		l3 = new Biblioteca("Para onde ela foi", "Gayle Forman", 2016, "Romance", 4, 5);
		l4 = new Biblioteca("Dracula", "Bram Stocker", 1980, "Terror", 1, 2);
		l5 = new Biblioteca("Ainda sou eu", "Jojo Moyes", 2018, "Aventura", 3, 6);
		
		do {
			System.out.println("BIBLIOTECA MUNICIPAL\n\nSelecione um livro:\n1 - Harry Potter\n2 - Se eu ficar\n3 - Para onde ela foi\n4 - Dracula\n5 - Ainda sou eu\n9 - Sair\n");
			opcL = teclado.nextInt();
			switch(opcL) {
				case 1:
					do {
						System.out.println("Harry Potter\n1 - Consultar\n2 - Emprestar\n3 - Devolver\n4 - Sobre\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: l1.consultar();
							break;
							case 2: l1.emprestar();
							break;
							case 3: l1.devolver();
							break;
							case 4: l1.sobre();
							break;
							case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
							break;
							default: System.out.println("Opção inválida!");
						}
					}while(opc != 9);
				break;
				case 2:
					do {
						System.out.println("Se eu ficar\n1 - Consultar\n2 - Emprestar\n3 - Devolver\n4 - Sobre\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: l2.consultar();
							break;
							case 2: l2.emprestar();
							break;
							case 3: l2.devolver();
							break;
							case 4: l2.sobre();
							break;
							case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
							break;
							default: System.out.println("Opção inválida!");
						}
					}while(opc != 9);
				break;
				case 3:
					do {
						System.out.println("Para onde ela foi\n1 - Consultar\n2 - Emprestar\n3 - Devolver\n4 - Sobre\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: l3.consultar();
							break;
							case 2: l3.emprestar();
							break;
							case 3: l3.devolver();
							break;
							case 4: l3.sobre();
							break;
							case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
							break;
							default: System.out.println("Opção inválida!");
						}
					}while(opc != 9);
				break;
				case 4:
					do {
						System.out.println("Dracula\n1 - Consultar\n2 - Emprestar\n3 - Devolver\n4 - Sobre\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: l4.consultar();
							break;
							case 2: l4.emprestar();
							break;
							case 3: l4.devolver();
							break;
							case 4: l4.sobre();
							break;
							case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
							break;
							default: System.out.println("Opção inválida!");
						}
					}while(opc != 9);
				break;
				case 5:
					do {
						System.out.println("Ainda sou eu\n1 - Consultar\n2 - Emprestar\n3 - Devolver\n4 - Sobre\n9 - Sair\n");
						opc = teclado.nextInt();
						switch(opc) {
							case 1: l5.consultar();
							break;
							case 2: l5.emprestar();
							break;
							case 3: l5.devolver();
							break;
							case 4: l5.sobre();
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