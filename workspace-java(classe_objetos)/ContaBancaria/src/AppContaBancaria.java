import java.util.Scanner;
public class AppContaBancaria {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opc;
		float valor;
		Conta c1 = new Conta(35960, 1500, "123.456.789-00");
		ContaEspecial c2 = new ContaEspecial(35961, 1720, "987.654.321-99", 400);
		
		do {
			System.out.println("BANCO 24 HORAS\nDigite o que deseja fazer?\n1 - Detalhes da conta\n2 - Consulta de Saldo\n3 - Creditar\n4 - Debitar\n9 - Sair\n");
			opc = teclado.nextInt();
			switch(opc) {
				case 1: c1.detalhesConta();
						c2.detalhesConta();
				break;
				case 2: c1.consultaSaldo();
				break;
				case 3: 
					System.out.println("Que valor deseja creditar?");
					valor = teclado.nextFloat();
					c1.creditar(valor);
				break;
				case 4:
					System.out.println("Que valor deseja debitar?");
					valor = teclado.nextFloat();
					c1.debitar(valor);
				break;
				case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
				break;
				default: System.out.println("Opção inválida!");
			}	
		}while(opc != 9);
		
		teclado.close();
	}
}
