package br.org.generation.alunoCurso.services;

import java.util.List;

import br.org.generation.alunoCurso.model.aluno;

public interface IAlunoService {
	public List<aluno> recuperaTodos();
	public aluno getById(int id);
	public void gravarAluno(aluno aluno);
}
