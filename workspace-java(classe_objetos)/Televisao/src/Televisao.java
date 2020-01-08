
public class Televisao {
	String marca;
	String modelo;
	int tensao;
	int tamanho;
	boolean ligado;
	int volume;
	int canal;
	
	void switchPower(){
		ligado = !ligado;
		System.out.println("A TV está "+ ((ligado)?"ligada\n":"desligada\n"));
		//(testelogico)? "resultadoverdadeiro":"resultadofalso"
	}
	
	void encerrar() {
		if(ligado == false) {
			System.out.println("Operação Encerrada!\nDigite 0 para fechar ou 1 para ligar novamente ;)\n");
		}
		else {
			System.out.println("A TV está ligada, antes de encerrar, desligue-a\n");
		}
	}
	
	void aumentarVolume() {
		if(ligado == false) {
			System.out.println("A TV está desligada, por favor, ligue-a\n");
		}
		else if (volume<10){
			volume++;
			System.out.println("O volume da TV agora está em " + volume + "\n");
			if(volume>7) {
				System.out.println("O volume nessa altura pode ser prejudicial a sua audição\n");
			}
		}
		else {
			System.out.println("A TV está no volume máximo 10, você só pode diminuir agora\n");
		}
	}
	
	void diminuirVolume() {
		if(ligado == false) {
			System.out.println("A TV está desligada, por favor, ligue-a\n");
		}
		else if(volume>1){
			volume--;
			System.out.println("O volume da TV está em " + volume + "\n");
		}
		else {
			System.out.println("A TV está no volume mínimo 0, você só pode aumentar agora\n");
		}
	}
	
	void avançarCanal() {
		if(ligado == false) {
			System.out.println("A TV está desligada, por favor, ligue-a\n");
		}
		else if(canal<20){
			canal++;
			System.out.println("Você está no canal " + canal + "\n");
		}
		else {
			canal = 1;
			System.out.println("Você está no canal " + canal + "\n");
		}
	}
	
	void voltarCanal() {
		if(ligado == false) {
			System.out.println("A TV está desligada, por favor, ligue-a\n");
		}
		else if (canal>1){
			canal--;
			System.out.println("Você está no canal " + canal + "\n");
		}
		else {
			canal = 20;
			System.out.println("Você está no canal " + canal + "\n");
		}
	}
}
