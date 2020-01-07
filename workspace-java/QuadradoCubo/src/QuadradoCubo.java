import java.util.Scanner;
public class QuadradoCubo {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int num, i;
		num = teclado.nextInt();
		while(num < 1 || num > 1000) {
			num = teclado.nextInt();
		}
		
		for(i=1;i<=num;i++) {
			System.out.println(i + " " + i*i + " " + i*i*i);
		}
		teclado.close();
	}
}
