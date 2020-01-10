
public class Conta {
	protected int nroConta;
	protected int agencia;
	protected float saldo;
	protected String cpfTitular;
	
	public Conta(int nroConta, float saldo, String cpfTitular) {
		this.nroConta = nroConta;
		this.agencia = 1234;
		this.saldo = saldo;
		this.cpfTitular = cpfTitular;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	void debitar(float valor) {
		if(valor <= saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("D�bito efetuado com Sucesso\nSeu saldo atual � R$"+saldo+"\n");
		}
		else {
			System.out.println("Voc� n�o pode realizar d�bitos\nSeu saldo atual � R$"+saldo+"\n");
		}
	}
	
	void creditar(float valor) {
		this.saldo+=valor;
		System.out.println("Cr�dito efetuado com Sucesso\nSeu saldo atual � R$"+saldo+"\n");
	}
	
	void consultaSaldo() {
		System.out.println("Seu saldo atual � R$"+saldo+"\n");
	}
	
	void detalhesConta() {
		System.out.println("\nSua ag�ncia: "+this.agencia);
		System.out.println("Sua conta: "+this.nroConta);
		System.out.println("Seu CPF: "+this.cpfTitular);
		System.out.println("Seu saldo atual � R$"+saldo);
	}
}
