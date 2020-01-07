import java.util.Scanner;
public class Perfeito {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int teste, num, i, soma, j;
		
		do {
			teste = teclado.nextInt();
		}while(teste < 1 || teste > 20);
		
		for(i=0; i<teste; i++) {
			do {
				num = teclado.nextInt();
			}while(num < 1 || num > 10000000);
			soma = 0;
			for(j=1; j<num; j++) {
				if(num%j == 0) {
					soma = soma + j;
				}
			}
			if(soma == num) {
				System.out.println(num + " eh perfeito");
			}
			else {
				System.out.println(num + " nao eh perfeito");
			}
		}
		teclado.close();
	}
}
