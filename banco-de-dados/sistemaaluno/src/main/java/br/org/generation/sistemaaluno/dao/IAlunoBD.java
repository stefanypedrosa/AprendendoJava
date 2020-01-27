package br.org.generation.sistemaaluno.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaaluno.model.aluno;

public interface IAlunoBD extends CrudRepository<aluno, Integer>{
	
}
