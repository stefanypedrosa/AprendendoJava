import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {
		int n, i=0;
		for(n=new Scanner(System.in).nextInt();i<=10; System.out.println(n+" x " + i + " = " + n*i++));
		//for(int n=new Scanner(System.in).nextInt(); i=0; i<=10; System.out.println(n+" x " + i + " = " + n*i++));
	}
}
