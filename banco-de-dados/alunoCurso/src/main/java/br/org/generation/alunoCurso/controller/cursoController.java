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

import br.org.generation.alunoCurso.model.curso;
import br.org.generation.alunoCurso.services.ICursoService;


@RestController
@CrossOrigin("*")
public class cursoController {

	@Autowired
	private ICursoService servico;
	
	@GetMapping("/cursos")
	public ResponseEntity<List<curso>> getAll(){
		return ResponseEntity.ok(servico.recuperaTodos());
	}
	
	@GetMapping("/curso/{id}")
	public ResponseEntity<curso> getById(@PathVariable int id){
		curso c = servico.getById(id);
		if(c != null) {
			return ResponseEntity.ok(c);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/curso/new")
	public ResponseEntity<curso> newCurso(@RequestBody curso curso){
		try{
			servico.gravarCurso(curso);
			return ResponseEntity.ok(curso);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
}
