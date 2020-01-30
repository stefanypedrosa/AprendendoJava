package br.org.generation.vitrineVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.vitrineVirtual.model.departamento;
import br.org.generation.vitrineVirtual.service.IDepartamentoService;

@RestController
@CrossOrigin("*")
public class departamentoController {

	@Autowired
	private IDepartamentoService servico;
	
	@GetMapping("/departamento")
	public ResponseEntity<List<departamento>> getAll(){
		return ResponseEntity.ok(servico.getAll());
	}
	
	@GetMapping("departamento/{id}")
	public ResponseEntity<departamento> getById(int id){
		departamento d = servico.getById(id);
		if(d!=null) {
			return ResponseEntity.ok(d);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/departamento/new")
	public ResponseEntity<departamento> gravaDepto(@RequestBody departamento d){
		try {
			servico.gravaDepto(d);
			return ResponseEntity.ok(d);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
		}
	}
}
