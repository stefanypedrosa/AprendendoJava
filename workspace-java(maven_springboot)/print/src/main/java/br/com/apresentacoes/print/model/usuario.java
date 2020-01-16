package br.com.apresentacoes.print.model;

public class usuario {
	private int id;
	private String login;
	private String email;
	private String nomeCompleto;
	private String senha;
	private int perfilAcesso;
	
	public usuario(int id, String login, String email, String nomeCompleto, String senha, int perfilAcesso) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.nomeCompleto = nomeCompleto;
		this.senha = senha;
		this.perfilAcesso = perfilAcesso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(int perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	
	public String toString() {
		return "Usuario{<br>ID: "+this.id+"<br>login: "+this.login+"<br>email: "+this.email+"<br>Nome completo: "+this.nomeCompleto+ "<br>senha: "+this.senha+"<br>Perfil Acesso: "+this.perfilAcesso+"<br>}";
	}
	
	
}
