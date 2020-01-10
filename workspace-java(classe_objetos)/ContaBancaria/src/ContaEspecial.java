
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
		System.out.println("Seu limite atual é R$"+limiteCH+"\n");
	}
	
	@Override //apenas explicita a redefinição, não altera em nada
	void detalhesConta() {
		super.detalhesConta();
		System.out.println("Seu limite do cheque especial é R$"+this.limiteCH);
		System.out.println("Seu saldo total é R$"+(this.saldo+this.limiteCH)+"\n");
	}
	
	@Override
	void debitar(float valor) {
		if(valor <= this.saldo + this.limiteCH) {
			this.saldo = this.saldo - valor;
			System.out.println("Débito efetuado com Sucesso\nSeu saldo atual é R$"+saldo+"\n");
		}
		else {
			System.out.println("Você não pode realizar débitos\nSeu saldo atual é R$"+saldo+"\n");
		}
	}
}
