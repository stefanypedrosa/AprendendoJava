package br.org.generation.alunoCurso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunoCurso.dao.cursoRepo;
import br.org.generation.alunoCurso.model.curso;

@Component
public class CursoService {

	@Autowired
	private cursoRepo repo;
	
	public List<curso> recuperaTodos() {
		return (List<curso>)repo.findAll();
	}

	public curso getById(int id) {
		return repo.findById(id).get();
	}


	public void gravarCurso(curso curso) {
		try {
			repo.save(curso);
		}
		catch (Exception ex){
			throw new RuntimeException("Erro ao inserir dados");
		}
	}
}
