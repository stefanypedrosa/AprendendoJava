import java.util.Scanner;
public class Produto {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	int a, b;
	
	a = teclado.nextInt();
	b = teclado.nextInt();
	
	System.out.println("PROD = " + (a*b));
	
	teclado.close();
	}
}
