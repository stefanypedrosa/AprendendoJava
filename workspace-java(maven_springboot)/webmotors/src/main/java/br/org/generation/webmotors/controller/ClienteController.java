package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDCliente;
import br.org.generation.webmotors.model.Cliente;

@RestController
public class ClienteController {
	//"banco de dados"
	private BDCliente bd = new BDCliente();
	
	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente c) {
		bd.grava(c);
		return ResponseEntity.ok(c);
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id){
		Cliente cli = bd.buscar(id);
		if(cli != null) {
			return ResponseEntity.ok(cli);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/cliente/atualiza")
	public ResponseEntity<String> alteraCliente(@RequestBody Cliente c){
		bd.atualizar(c);
		return ResponseEntity.ok("Sucess!!");
	}
	
	
	@DeleteMapping("/cliente/delete/{id}")
	public ResponseEntity<String> removeCliente(@PathVariable int id){
		if(bd.apagar(id)) {
			return ResponseEntity.ok("Deleted");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
