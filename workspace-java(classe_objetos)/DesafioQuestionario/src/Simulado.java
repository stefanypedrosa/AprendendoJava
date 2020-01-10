import java.util.Scanner;
public class Simulado {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String resAluno;
		int acertos=0;
		QuestoesSimples simulado[] = new QuestoesSimples[5];
		
		simulado[0] = new QuestoesSimples("Quem descobriu o Brasil?","Pedro Alvares Cabral");
		simulado[1] = new QuestoesMultiplaEscolha("Qual a f�rmula da agua?","c", "H3O","H2O2","H2O","H6C6");
		simulado[2] = new QuestaoDica("O Avicultor diz: 'Se eu tivesse dois Patos a mais, o dobro desse n�mero seria 100.' Quantos Patos tem ele?", "48", "Metade de 100-2");
		simulado[3] = new QuestoesMultiplaEscolha("Se estivessem na sala de aula 5 alunos mais, a metade deles seria 20 alunos. Quantos est�o l� realmente?","c", "32", "37", "35", "40");
		simulado[4] = new QuestoesSimples("Zezinho tem 24 bolas. D� 4 para Luizinho e ambos ficar�o com quantidades iguais. Quantas bolas tinhas Luizinho inicialmente?", "16");

		
		System.out.println("SIMULADO");
		System.out.println("Preparado ou n�o, vai come�ar.....");
		for(int i=0;i<simulado.length;i++) {
			System.out.println("\n"+simulado[i].aplicarQuest�o());
			resAluno = teclado.nextLine();
			if(simulado[i].corrigir(resAluno)) {
				acertos++;
			}
		}
		System.out.println("Voc� fez "+ acertos+" acertos");
		if(acertos>simulado.length/2) {
			System.out.println("Parab�ns!!!\nContinue se empenhando\n");
		}
		else {
			System.out.println("Seus acertos est�o baixos, precisa estudar mais\n");
		}
		
		teclado.close();
	}
}
