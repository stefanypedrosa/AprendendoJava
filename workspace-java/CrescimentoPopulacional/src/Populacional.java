import java.util.Scanner;
public class Populacional {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int teste,  i, anos, popA, popB;
		float cresA, cresB;
		
		do {
			teste = teclado.nextInt();
		}while(teste < 1 || teste > 3000);
		
		for (i=0; i<teste; i++) {
			do {
				popA = teclado.nextInt();
			}while(popA<100 || popA > 1000000);
			do {
				popB = teclado.nextInt();
			}while(popB<popA || popB > 1000000);
			do {
				cresA = teclado.nextFloat();
			}while(cresA < 0.1 || cresA > 10.0);
			do {
				cresB = teclado.nextFloat();
			}while(cresA < cresB || cresB > 10.0);
			anos=0;
			while(popA <= popB && anos < 102) {
				popA = (int)(popA + popA * (cresA/100));
				popB = (int)(popB + popB * (cresB/100));
				anos++;
			}
			if(anos<=100) {
				System.out.println(anos + " anos.");
			}
			else {
				System.out.println("Mais de 1 seculo.");
			}
		}
		teclado.close();
	}
}
