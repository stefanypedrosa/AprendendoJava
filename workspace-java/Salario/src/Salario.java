import java.util.Scanner;
public class Salario {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int cod, horas;
		double valor;
		
		cod = teclado.nextInt();
		horas = teclado.nextInt();
		valor = teclado.nextDouble();
		
		System.out.println("NUMBER = " + cod);
		System.out.printf("SALARY = U$ %.2f\n", (horas*valor));
		teclado.close();
	}
}
