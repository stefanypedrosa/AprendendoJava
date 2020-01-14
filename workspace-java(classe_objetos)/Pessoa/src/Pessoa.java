
public class Pessoa {
	private int id;
	private String nome;
	private String email;
	private String senha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Pessoa{\n	id: "+ this.id+"\n	nome: \""+this.nome+"\"\n	email: \""+this.email+"\"\n	senha: \""+this.senha+"\"\n}";
	}
}
