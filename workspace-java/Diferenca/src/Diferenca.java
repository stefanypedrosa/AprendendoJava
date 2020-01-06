import java.util.Scanner;
public class Diferenca {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		d = teclado.nextInt();
		
		System.out.println("DIFERENCA = " + (a * b - c * d));
		
		teclado.close();
	}
}
