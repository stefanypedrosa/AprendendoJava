import java.util.ArrayList;
import java.util.Collections;

public class UsandoArrayList {
	public static void main(String args[]) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("0");
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		lista.add("6");
		lista.add("7");
		lista.add("8");
		lista.add("9");
		
		
		System.out.println(lista);
		Collections.reverse(lista);
		System.out.println(lista);
		Collections.shuffle(lista);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		
	}

}
