package br.org.generation.produtos.frontback.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.produtos.frontback.model.produto;
import br.org.generation.produtos.frontback.security.autenticacao;

@RestController
@CrossOrigin("*")
public class produtoController {
	@GetMapping("/listagem")
	public ResponseEntity<ArrayList<produto>> getProdutos(@RequestParam String token){
		if(autenticacao.isValid(token)) {
			ArrayList<produto> lista = new ArrayList<produto>();
			for (int i=0; i<20;i++) {
				produto p = new produto();
				p.setCodigo((10+i)*10);
				p.setTitulo("TupperWare 00"+(i+1));
				p.setPreco(7+(3*i));
				p.setDetalhes("Cor 0"+(i+1));
				
				lista.add(p);
			}
			return ResponseEntity.ok(lista);
		}
		else {
			return ResponseEntity.status(403).build();
		}
		
	}
}