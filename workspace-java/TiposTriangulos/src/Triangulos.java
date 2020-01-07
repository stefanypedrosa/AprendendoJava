import java.util.Scanner;
public class Triangulos {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c, aux;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		if(a<b) {
			aux = a;
			a = b;
			b = aux;
		}
		if(a<c) {
			aux = a;
			a = c;
			c = aux;
		}
		if(b<c) {
			aux = c;
			c = b;
			b = aux;
		}
		
		if(a >= b+c) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if(a*a > b*b + c*c) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if(a*a == b*b + c*c) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if(a*a < b*b + c*c) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if(a == b && a == c && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(a == b && a != c && b != c || a == c && a != b && c != b || b == c && a != b && c != a) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		teclado.close();
	}
}
