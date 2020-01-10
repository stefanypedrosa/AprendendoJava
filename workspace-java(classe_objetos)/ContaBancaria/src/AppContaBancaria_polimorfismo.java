
public class AppContaBancaria_polimorfismo {
	public static void main(String args[]){
		Conta c1, c2;
		
		c1 = new Conta(35960, 1500, "123.456.789-00");
		c2 = new ContaEspecial(35961, 1720, "987.654.321-99", 400);
		
		c1.detalhesConta();
		c2.detalhesConta();
	}
}
