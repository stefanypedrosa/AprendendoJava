import java.util.Scanner;
public class AppTestaTV {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opc;
		Televisao t1;
		t1 = new Televisao();
		t1.marca = "LG";
		t1.modelo = "LG001";
		t1.tensao = 110;
		t1.tamanho = 57;
		t1.ligado = false;
		t1.canal = 5;
		t1.volume = 5;
		
		do {
			System.out.println("Selecione um opção:\n1 - Ligar/Desligar\n2 - Aumentar Volume\n3 - Diminuir Volume\n4 - Avançar Canal\n5 - Voltar Canal\n9 - Sair\n");
			opc = teclado.nextInt();
			
			switch (opc) {
				case 1: t1.switchPower();
				break;
				case 2: t1.aumentarVolume();
				break;
				case 3: t1.diminuirVolume();
				break;
				case 4: t1.avançarCanal();
				break;
				case 5: t1.voltarCanal();
				break;
				case 9: t1.encerrar(); 
				break;
				case 0: System.out.println("Operação concluída!\nObrigada por sua companhia :)");
				break;
				default: System.out.println("Opção inválida!");
			}
		}while(opc != 0);
		teclado.close();
	}
}
