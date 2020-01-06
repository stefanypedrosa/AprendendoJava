import java.util.Scanner;
public class Leitura {
	public static void main (String args[]) {
		Scanner teclado = new Scanner (System.in);
		int a;
		float b;
		String texto;
		
		System.out.println("Digite um nome: ");
		texto = teclado.nextLine();
		System.out.print("Digite um valor inteiro: ");
		a = teclado.nextInt();
		System.out.print("Digite um valor real: ");
		b = teclado.nextFloat();
		
		System.out.println("Você digitou o nome: " + texto);
		System.out.print("Você digitou os valores " + a + " e ");
		System.out.printf("%.3f\n",b);
		
		teclado.close();
	}
}
