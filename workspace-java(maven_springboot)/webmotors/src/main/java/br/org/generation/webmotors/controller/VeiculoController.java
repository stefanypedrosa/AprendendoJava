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

import br.org.generation.webmotors.bd.BDVeiculo;
import br.org.generation.webmotors.model.Veiculo;



@RestController
public class VeiculoController {
	//banco de dados
		private BDVeiculo bd = new BDVeiculo();
		
		@PostMapping("/veiculo/novo")
		public ResponseEntity<Veiculo> novoCliente(@RequestBody Veiculo v) {
			bd.grava(v);
			return ResponseEntity.ok(v);
		}
		
		@GetMapping("/veiculo/{id}")
		public ResponseEntity<Veiculo> getCliente(@PathVariable int id){
			Veiculo vcl = bd.buscar(id);
			if(vcl != null) {
				return ResponseEntity.ok(vcl);
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}
		
		@GetMapping("/veiculo/todos")
		public ResponseEntity<ArrayList<Veiculo>> getTodos(){
			return ResponseEntity.ok(bd.buscarTodos());
		}
		
		@PutMapping("/veiculo/atualiza")
		public ResponseEntity<String> alteraVeiculo(@RequestBody Veiculo v){
			bd.atualizar(v);
			return ResponseEntity.ok("Sucess!!");
		}
		
		
		@DeleteMapping("/veiculo/delete/{id}")
		public ResponseEntity<String> removeVeiculo(@PathVariable int id){
			if(bd.apagar(id)) {
				return ResponseEntity.ok("Deleted");
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}
}
