/*Sabendo que o valor de 100 kw corresponde a 1/7 do valor do sal�rio m�nimo, fa�a
um programa Java que receba o valor do sal�rio m�nimo e a quantidade de kw gasta
por uma resid�ncia e calcule:
a. o valor em reais de cada kw.
b. o valor em reais a ser pago
c. o novo valor a ser pago por essa resid�ncia com um desconto de 10% */

public class KwSalario {
	public static void main (String args[]) {
		
		float salMin, qtdeKw, valorKw, valorPg, valorDesc;
		salMin = Float.parseFloat(args[0]);
		qtdeKw = Float.parseFloat(args[1]);
		
		valorKw = salMin/700;
		valorPg = valorKw * qtdeKw;
		valorDesc = valorPg * 0.9f;
		
		System.out.println("Valor de cada Kw: R$" + valorKw);
		System.out.println("Valor a ser pago: R$" + valorPg);
		System.out.println("Valor com desconto: R$" + valorDesc);
		
	}
}
