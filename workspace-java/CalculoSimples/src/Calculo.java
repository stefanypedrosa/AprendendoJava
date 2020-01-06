import java.util.Scanner;
public class Calculo {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int peca1, peca2, qtde1, qtde2;
		double valor1, valor2;
		
		peca1 = teclado.nextInt();
		qtde1 = teclado.nextInt();
		valor1 = teclado.nextDouble();
		peca2 = teclado.nextInt();
		qtde2 = teclado.nextInt();
		valor2 = teclado.nextDouble();
		
		valor1 = valor1 * qtde1;
		valor2 = valor2 * qtde2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valor1+valor2));
		teclado.close();
	}
}