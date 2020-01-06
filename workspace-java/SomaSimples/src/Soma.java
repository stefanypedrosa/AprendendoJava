import java.util.Scanner;
public class Soma {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	int a, b;
	
	a = teclado.nextInt();
	b = teclado.nextInt();
	
	System.out.println("SOMA = " + (a+b));
	
	teclado.close();
	}
}
