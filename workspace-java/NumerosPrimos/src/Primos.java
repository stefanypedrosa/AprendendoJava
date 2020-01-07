import java.util.Scanner;
public class Primos {
	public static void main(String args[]) {
		Scanner teclado = new Scanner (System.in);
		int teste, num, i, j, aux;
		
		do {
			teste = teclado.nextInt();
		}while(teste <= 1 || teste >= 100);
		
		for(i=0; i<teste; i++) {
			do {
				num = teclado.nextInt();
			}while(num < 1 || num >= 100000000);
			aux = 0;
			for(j=2; j<=num; j++) {
				if(num%j == 0) {
					aux++;
				}
			}
			if(aux == 1) {
				System.out.println(num + " eh primo");
			}
			else {
				System.out.println(num + " nao eh primo");
			}
		}
		teclado.close();
	}
}
