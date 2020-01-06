import java.util.Scanner;
public class Circulo {
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		double a, area, pi = 3.14159;
		
		System.out.println("Digite o valor de a: ");
		a = teclado.nextDouble();
		
		area = pi * (a*a);
		System.out.printf("A=%.4f\n", area);
		
		teclado.close();
	}
}
