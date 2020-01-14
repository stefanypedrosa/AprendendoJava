import java.util.Scanner;
public class TestePessoa {
	public static void main(String args[]) {
	Pessoa p = new Pessoa();
	Scanner teclado = new Scanner(System.in);
	
	p.setId(1);
	p.setNome("Stefany");
	p.setEmail("stefany@stefany.com");
	p.setSenha("12345");
	
	System.out.println(p);
	teclado.close();
	}
}
