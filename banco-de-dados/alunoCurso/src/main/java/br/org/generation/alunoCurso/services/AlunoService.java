package br.org.generation.alunoCurso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.alunoCurso.dao.alunoRepo;
import br.org.generation.alunoCurso.model.aluno;

@Component
public class AlunoService implements IAlunoService{

	@Autowired
	private alunoRepo repo;
	
	@Override
	public List<aluno> recuperaTodos() {
		return (List<aluno>)repo.findAll();
	}

	@Override
	public aluno getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void gravarAluno(aluno aluno) {
		try {
			repo.save(aluno);
		}
		catch (Exception ex){
			throw new RuntimeException("Erro ao inserir dados");
		}
	}
}
