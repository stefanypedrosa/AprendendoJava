package br.org.generation.alunoCurso.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.alunoCurso.model.aluno;

public interface alunoRepo extends CrudRepository<aluno, Integer>{
	
}
