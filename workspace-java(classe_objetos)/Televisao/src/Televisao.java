
public class Televisao {
	private String marca;
	private String modelo;
	private int tensao;
	private int tamanho;
	private boolean ligado;
	private int volume;
	private int canal;
	private boolean mudo;
	
	public Televisao(String marca, String modelo, int tamanho) {
		this.marca = marca;
		this.modelo = modelo;
		this.tensao = 110;
		this.tamanho = tamanho;
		this.ligado = false;
		this.volume = 5;
		this.canal = 1;
		this.mudo = false;
		
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	public int getTensao() {
		return this.tensao;
	}
	
	public void setTam(int tam) {
		this.tamanho = tam;
	}
	public int getTam() {
		return this.tamanho;
	}
	
	public void setLig(boolean lig) {
		this.ligado = lig;
	}
	public boolean isLig() {
		return this.ligado;
	}
	
	public void setVol(int vol) {
		this.volume = vol;
	}
	public int getVol() {
		return this.volume;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getCanal() {
		return this.canal;
	}
	
	public void setMudo(boolean mudo) {
		this.mudo = mudo;
	}
	public boolean isMudo() {
		return this.mudo;
	}
	
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
			System.out.print("O volume da TV agora est� em " + volume + "\n");
			if(volume>7) {
				System.out.print("Nessa altura pode ser prejudicial a sua audi��o\n");
			}
		}
		else {
			System.out.print("A TV est� no volume m�ximo 10, voc� s� pode diminuir agora\n");
		}
		if(mudo) {
			System.out.println("Obs: Mas est� no mudo.\n");
		}
	}
	
	void diminuirVolume() {
		if(ligado == false) {
			System.out.println("A TV est� desligada, por favor, ligue-a\n");
		}
		else if(volume>1){
			volume--;
			System.out.print("O volume da TV est� em " + volume + "\n");
		}
		else {
			System.out.print("A TV est� no volume m�nimo 0, voc� s� pode aumentar agora\n");
		}
		if(mudo) {
			System.out.println("Obs: Mas est� no mudo.\n");
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
	
	void mudo() {
		if(ligado == false) {
			System.out.println("A TV est� desligada, por favor, ligue-a\n");
		}
		else if(mudo == false) {
			mudo = true;
			System.out.println("A TV est� no mudo\n");
		}
		else {
			mudo = false;
			System.out.println("A TV saiu do mudo, seu volume � "+volume+ "\n");
		}
	}
}