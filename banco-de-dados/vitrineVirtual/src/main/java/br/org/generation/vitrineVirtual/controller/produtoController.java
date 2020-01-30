package br.org.generation.vitrineVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.vitrineVirtual.model.produto;
import br.org.generation.vitrineVirtual.service.IProdutoService;

@RestController
@CrossOrigin("*")
public class produtoController {
	@Autowired
	private IProdutoService servico;
	
	@GetMapping("/produtos")
	public ResponseEntity<List<produto>> getAll(){
		return ResponseEntity.ok(servico.getAll());
	}
	
	@GetMapping("produto/{id}")
	public ResponseEntity<produto> getById(int id){
		produto p = servico.getById(id);
		if(p!=null) {
			return ResponseEntity.ok(p);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/produto/new")
	public ResponseEntity<produto> newProduto(@RequestBody produto p){
		try {
			servico.gravaProduto(p);
			return ResponseEntity.ok(p);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
}
