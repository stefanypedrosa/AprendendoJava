import java.util.Scanner;
public class TesteBD {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		InterfaceBD bd = new MySQL();
		int opc;
		
		System.out.println("Qual banco deseja usar?\n1 - MySQL\n2 - Oracle");
		opc = teclado.nextInt();
	
		if(opc == 1) {
			bd = new MySQL();
		}
		else if(opc == 2) {
			bd = new Oracle();
		}
		else if(opc == 9) {
			System.out.println("Obrigado por sua companhia!!");
		}
		else{
			System.out.println("Inválido");
		}
		
		bd.conectar();
		bd.executarComando("select * from users");
		bd.desconectar();	
			
		teclado.close();
	}
}
