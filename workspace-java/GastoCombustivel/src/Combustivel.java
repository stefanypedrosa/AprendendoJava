/*Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, 
 * ao utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse 
 * atrav�s de um simples programa. Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) 
 * e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, 
 * calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.
Entrada
O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo 
� a velocidade m�dia durante a mesma (em km/h).
Sa�da
Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal*/

import java.util.Scanner;
public class Combustivel {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int tempo, velMedia;
		float gasto;
		
		System.out.print("Digite o tempo gasto em horas: ");
		tempo = teclado.nextInt();
		System.out.print("Digite a velocidade media em km/h: ");
		velMedia = teclado.nextInt();
		
		gasto = (float)velMedia * (float)tempo / 12f;
		System.out.printf("%.3f\n", gasto);
		
		teclado.close();
	}
}
