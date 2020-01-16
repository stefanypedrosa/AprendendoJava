package br.com.apresentacoes.print.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apresentacoes.print.model.produto;
import br.com.apresentacoes.print.model.usuario;

@RestController
@CrossOrigin("*") //tornar acessivel a mais de um servidor
public class AppController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello!<br>"
				+ "Vamos consultar?<br>"
				+ "Para consultar o usuário 1: <a href='http://localhost:5200/usuario/1'>http://localhost:5200/usuario/1</a><br>"
				+ "Para consultar o usuário 2: <a href='http://localhost:5200/usuario/2'>http://localhost:5200/usuario/2</a><br>"
				+ "Para consultar o produto 1: <a href='http://localhost:5200/produto/1'>http://localhost:5200/produto/1</a><br>"
				+ "Para consultar o produto 2: <a href='http://localhost:5200/produto/2'>http://localhost:5200/produto/2</a><br>"
				+ "Obrigada pela companhia :)";
	}
	
	@GetMapping("/usuario/1")
	public String user1() {
		usuario u = new usuario(1, "nano", "nano@gmail.com", "nano", "1234", 1);
		return u.toString();
	}
	
	@GetMapping("/usuario/2")
	public String user2() {
		usuario u = new usuario(2, "mia", "mia@hotmail.com", "mia", "4321", 0);
		return u.toString();
	}
	
	@GetMapping("/produto/1")
	public String prod1(){
		produto p = new produto(1, "kit: fonte + pote ração", "rosa, 1.5L, 110V", 152.60, 10, "www.kitfonterosa.com");
		return p.toString();
	}
	
	@GetMapping("/produto/2")
	public String prod2(){
		produto p = new produto(2, "ratinho com catnip", "ratinho de crochê com catnip interno + refil de catnip", 20.80, 50, "www.ratinhocatnip.com");
		return p.toString();
	}
}
