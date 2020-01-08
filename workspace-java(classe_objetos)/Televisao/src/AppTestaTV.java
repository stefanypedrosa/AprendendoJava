import java.util.Scanner;
public class AppTestaTV {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opc, opcTV;
		Televisao t1, t2;
		t1 = new Televisao("LG", "LG001", 57);
		t2 = new Televisao("DELL", "D001", 60);
		
		/*t1.setMarca("LG");
		t1.setModelo("LG001");
		t1.setTensao(110);
		t1.setTam(57);
		t1.setLig(false);
		t1.setCanal(5);
		t1.setVol(5);
		t1.setMudo(false);
		
		t2.setMarca("DELL");
		t2.setModelo("D001");
		t2.setTensao(110);
		t2.setTam(60);
		t2.setLig(false);
		t2.setCanal(7);
		t2.setVol(3);
		t2.setMudo(false);*/
		
		do {
			System.out.println("Selecione uma opção:\n1 - TV 1\n2 - TV 2\n9 - Sair\n");
			opcTV = teclado.nextInt();
			
			switch(opcTV) {
				case 1:
				do {
					System.out.println("TV 1\nSelecione uma opção:\n1 - Ligar/Desligar\n2 - Aumentar Volume\n3 - Diminuir Volume\n4 - Avançar Canal\n5 - Voltar Canal\n6 - Mudo\n9 - Sair\n");
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
						case 6: t1.mudo();
						break;
						case 9: t1.encerrar(); 
						break;
						case 0: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
						break;
						default: System.out.println("Opção inválida!");
					}
				}while(opc != 0);
				break;
				case 2:
				do {
					System.out.println("TV 2\nSelecione uma opção:\n1 - Ligar/Desligar\n2 - Aumentar Volume\n3 - Diminuir Volume\n4 - Avançar Canal\n5 - Voltar Canal\n6 - Mudo\n9 - Sair\n");
					opc = teclado.nextInt();
					
					switch (opc) {
						case 1: t2.switchPower();
						break;
						case 2: t2.aumentarVolume();
						break;
						case 3: t2.diminuirVolume();
						break;
						case 4: t2.avançarCanal();
						break;
						case 5: t2.voltarCanal();
						break;
						case 6: t2.mudo();
						break;
						case 9: t2.encerrar(); 
						break;
						case 0: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
						break;
						default: System.out.println("Opção inválida!");
					}
				}while(opc != 0);
			break;
			case 9: System.out.println("Operação concluída!\nObrigada por sua companhia :)\n");
			break;
			default: System.out.println("Opção inválida!");
			}
		}while(opcTV != 9);
		teclado.close();
	}
}
