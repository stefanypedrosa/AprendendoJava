import java.util.Scanner;
public class CadastroProduto {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Produto lista[] = new Produto[5];
		int i=0;
		
		System.out.println("LOJINHA");
		
		do {
			try {
				Produto p = new Produto();
				System.out.println("\nDigite o ID do Produto "+(i+1)+":");
				int id = Integer.parseInt(teclado.nextLine());
				p.setId(id);
				
				System.out.println("Digite o nome do Produto "+(i+1)+":");
				String nome = teclado.nextLine();
				p.setNome(nome);
				
				System.out.println("Digite os detalhes do Produto "+(i+1)+":");
				String detalhe = teclado.nextLine();
				p.setDetalhes(detalhe);
				
				System.out.println("Digite o preco do Produto "+(i+1)+":");
				float preco = Float.parseFloat(teclado.nextLine());
				p.setPreco(preco);
				
				System.out.println("Digite a quantidade do Produto "+(i+1)+" em estoque:");
				int qtdeE = Integer.parseInt(teclado.nextLine());
				p.setQtdeEstoque(qtdeE);
				
				lista[i]=p;
				i++;
			}
			catch(Exception e) {
				System.out.println("Erro ao Cadastrar");
				System.out.println(e.getMessage());
			}
			
		}while(i<5);
		
		System.out.println("\nListagem de Produtos 1");
		for(i=0;i<5;i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println("\nListagem de Produtos 2");
		//equivalente
		for(Produto p:lista) {
			System.out.println(p);
		}
		
		teclado.close();
	}
}
