package br.org.generation.sistemaaluno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaaluno.model.aluno;
import br.org.generation.sistemaaluno.servicos.IAlunoService;

@RestController
@CrossOrigin("*")
public class alunoController {
	
	@Autowired
	private IAlunoService servico;
	
	
	@PostMapping("/aluno/new")
	public ResponseEntity<aluno> newUser(@RequestBody aluno a){
		try{
			servico.gravarAluno(a);
			return ResponseEntity.ok(a);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PutMapping("/atualiza")
	public ResponseEntity<aluno> atualizaAluno(@RequestBody aluno a){
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<aluno> getAluno(@PathVariable int id){
		return ResponseEntity.ok(null);
	}
	
	
	
	
}
