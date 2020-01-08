
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
		System.out.println("A TV est� "+ ((ligado)?"ligada\n":"desligada\n"));
		//(testelogico)? "resultadoverdadeiro":"resultadofalso"
	}
	
	void encerrar() {
		if(ligado == false) {
			System.out.println("Opera��o Encerrada!\nDigite 0 para fechar ou 1 para ligar novamente ;)\n");
		}
		else {
			System.out.println("A TV est� ligada, antes de encerrar, desligue-a\n");
		}
	}
	
	void aumentarVolume() {
		if(ligado == false) {
			System.out.println("A TV est� desligada, por favor, ligue-a\n");
		}
		else if (volume<10){
			volume++;
			System.out.println("O volume da TV agora est� em " + volume + "\n");
			if(volume>7) {
				System.out.println("O volume nessa altura pode ser prejudicial a sua audi��o\n");
			}
		}
		else {
			System.out.println("A TV est� no volume m�ximo 10, voc� s� pode diminuir agora\n");
		}
	}
	
	void diminuirVolume() {
		if(ligado == false) {
			System.out.println("A TV est� desligada, por favor, ligue-a\n");
		}
		else if(volume>1){
			volume--;
			System.out.println("O volume da TV est� em " + volume + "\n");
		}
		else {
			System.out.println("A TV est� no volume m�nimo 0, voc� s� pode aumentar agora\n");
		}
	}
	
	void avan�arCanal() {
		if(ligado == false) {
			System.out.println("A TV est� desligada, por favor, ligue-a\n");
		}
		else if(canal<20){
			canal++;
			System.out.println("Voc� est� no canal " + canal + "\n");
		}
		else {
			canal = 1;
			System.out.println("Voc� est� no canal " + canal + "\n");
		}
	}
	
	void voltarCanal() {
		if(ligado == false) {
			System.out.println("A TV est� desligada, por favor, ligue-a\n");
		}
		else if (canal>1){
			canal--;
			System.out.println("Voc� est� no canal " + canal + "\n");
		}
		else {
			canal = 20;
			System.out.println("Voc� est� no canal " + canal + "\n");
		}
	}
}
