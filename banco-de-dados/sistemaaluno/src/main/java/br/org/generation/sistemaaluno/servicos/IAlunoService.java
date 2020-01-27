package br.org.generation.sistemaaluno.servicos;

import br.org.generation.sistemaaluno.model.aluno;

public interface IAlunoService {
	public void gravarAluno(aluno aluno);
	public void atualizaAluno(aluno aluno);
	public aluno recuperaAluno(int id);
	
}
