
public class QuestaoDica extends QuestoesSimples {
	private String dica;

	public QuestaoDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	String aplicarQuestão() {
		return "Questão: "+ this.enunciado +"\nDica: "+this.dica;
	}
}
