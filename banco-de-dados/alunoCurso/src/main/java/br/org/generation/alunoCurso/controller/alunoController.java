package br.org.generation.alunoCurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.alunoCurso.model.aluno;
import br.org.generation.alunoCurso.services.IAlunoService;

@RestController
@CrossOrigin("*")
public class alunoController {
	@Autowired
	private IAlunoService servico;
	
	@GetMapping("/alunos")
	public ResponseEntity<List<aluno>> getAll(){
		return ResponseEntity.ok(servico.recuperaTodos());
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<aluno> getById(@PathVariable int id){
		aluno a = servico.getById(id);
		if(a != null) {
			return ResponseEntity.ok(a);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/aluno/new")
	public ResponseEntity<aluno> newAluno(@RequestBody aluno aluno){
		try{
			servico.gravarAluno(aluno);
			return ResponseEntity.ok(aluno);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
}
