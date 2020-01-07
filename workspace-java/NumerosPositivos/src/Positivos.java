import java.util.Scanner;
public class Positivos {
	public static void main(String agrs[]) {
		Scanner teclado = new Scanner(System.in);
		double num;
		int i, pos=0;
		for(i=0; i<6; i++) {
			num = teclado.nextDouble();
			if(num > 0) {
				pos++;
			}
		}
		System.out.println(pos+ " valores positivos");
		teclado.close();
	}
}
