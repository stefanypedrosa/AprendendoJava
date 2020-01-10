
public class QuestoesSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestoesSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String getEnunciado(int i) {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	String aplicarQuestão() {
		return "Questão: "+ this.enunciado;
	}
	
	boolean corrigir(String resAluno) {
		return resposta.equals(resAluno);
	}
}
