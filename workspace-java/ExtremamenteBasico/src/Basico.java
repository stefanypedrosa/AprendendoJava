import java.util.Scanner;
public class Basico {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b, x;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		x = a+b;
		System.out.println("X = " + x);
		
		teclado.close();
	}
}
