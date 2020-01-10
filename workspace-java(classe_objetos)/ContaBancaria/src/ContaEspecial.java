
public class ContaEspecial extends Conta {
	private float limiteCH;
	
	public ContaEspecial(int nroConta, float saldo, String cpfTitular, float limiteCH) {
		super(nroConta, saldo, cpfTitular);
		this.limiteCH = limiteCH;
	}
	
	public float getLimiteCH() {
		return limiteCH;
	}
	public void setLimiteCH(float limiteCH) {
		this.limiteCH = limiteCH;
	}

	void consultaLimite() {
		System.out.println("Seu limite atual � R$"+limiteCH+"\n");
	}
	
	@Override //apenas explicita a redefini��o, n�o altera em nada
	void detalhesConta() {
		super.detalhesConta();
		System.out.println("Seu limite do cheque especial � R$"+this.limiteCH);
		System.out.println("Seu saldo total � R$"+(this.saldo+this.limiteCH)+"\n");
	}
	
	@Override
	void debitar(float valor) {
		if(valor <= this.saldo + this.limiteCH) {
			this.saldo = this.saldo - valor;
			System.out.println("D�bito efetuado com Sucesso\nSeu saldo atual � R$"+saldo+"\n");
		}
		else {
			System.out.println("Voc� n�o pode realizar d�bitos\nSeu saldo atual � R$"+saldo+"\n");
		}
	}
}
