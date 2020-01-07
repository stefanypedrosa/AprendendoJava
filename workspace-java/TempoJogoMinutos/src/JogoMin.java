import java.util.Scanner;
public class JogoMin {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int hI, hF, minI, minF, h, min;
		
		hI = teclado.nextInt();
		minI = teclado.nextInt();
		hF = teclado.nextInt();
		minF = teclado.nextInt();
		
		if(hF > hI) {
			h = hF - hI;
		}
		else if(hF == hI) {
			h = 24;
		}
		else {
			h = (24+hF) - hI;
		}
		if(minF > minI) {
			min = minF - minI;
			if(h >= 24) {
				h = 0;
			}
		}
		else if(minF == minI) {
			min = 0;
		}
		else {
			min = (60+minF) - minI;
			h--;
		}
		
		System.out.println("O JOGO DUROU "+ h +" HORA(S) E "+min+" MINUTO(S)");
		teclado.close();
	}
}
