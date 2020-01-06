/*Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, 
 * ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse 
 * através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) 
 * e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, 
 * calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo 
é a velocidade média durante a mesma (em km/h).
Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal*/

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
