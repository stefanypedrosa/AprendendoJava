
public class Hello {
	public static void main(String args[]){
		
		System.out.println("Hello World");
		
		int v1, v2;
		v1 = Integer.parseInt(args[0]);
		v2 = Integer.parseInt(args[1]);
		
		int res = v1 + v2;
		System.out.println("Valor somado = " + res);
	}
}
