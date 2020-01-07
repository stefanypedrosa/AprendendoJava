import java.util.Scanner;
public class Soma {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b, soma, i;
		
		do {
			a = teclado.nextInt();
			b = teclado.nextInt();
			soma = 0;
			if(a > 0 && b > 0) {
				if(b<a) {
					i = a;
					a = b;
					b = i;
				}
				
				for(i=a;i<=b;i++) {
					System.out.print(i + " ");
					soma = soma+i;
				}
				System.out.println("Sum="+soma);
			}
		}while(a > 0 && b > 0);
		teclado.close();
	}
}
