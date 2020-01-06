/*Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
 * Em seguida, calcule e mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
Entrada
O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.
Sa�da
O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas descritas acima, 
sempre com mensagem correspondente e um espa�o entre os dois pontos e o valor. O valor calculado deve ser 
apresentado com 3 d�gitos ap�s o ponto decimal.*/

import java.util.Scanner;
public class Area {
	public static void main (String args[]) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c, area, pi = 3.14159f;
		
		System.out.println("Digite o valor de a: ");
		a = teclado.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = teclado.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = teclado.nextDouble();
		
		area = a * c /2;
		System.out.printf("TRIANGULO: %.3f\n", area);
		area = pi * (c*c);
		System.out.printf("CIRCULO: %.3f\n", area);
		area = (a+b)*c /2;
		System.out.printf("TRAPEZIO: %.3f\n", area);
		area = b*b;
		System.out.printf("QUADRADO: %.3f\n", area);
		area = a*b;
		System.out.printf("RETANGULO: %.3f\n", area);
		
		teclado.close();
	}
}
