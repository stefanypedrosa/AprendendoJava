package br.org.generation.produtos.frontback.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.produtos.frontback.model.usuario;
import br.org.generation.produtos.frontback.security.autenticacao;
import br.org.generation.produtos.frontback.security.token;

@RestController
@CrossOrigin("*")
public class usuarioController {
	@PostMapping("/login")
	public ResponseEntity<token> autentica(@RequestBody usuario usuario){
		if(usuario.getEmail().equals("usuario@usuario.com") && usuario.getSenha().equals("123456")) {
			usuario.setId(10);
			usuario.setNome("Usuario User");
			String tk = autenticacao.generateToken(usuario);
			token token = new token();
			token.setToken(tk);
			return ResponseEntity.ok(token);
		}
		else {
			return ResponseEntity.status(403).build();
		}
	}
	
}
