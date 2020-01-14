
public class Oracle implements InterfaceBD{
	public void conectar() {
		System.out.println("Conectando...");
	}
	public void desconectar() {
		System.out.println("Desconectando...");
	}
	public void executarComando(String comando) {
		System.out.println("ORACLE>"+comando);
	}
}
