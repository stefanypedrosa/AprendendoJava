package br.org.generation.alunoCurso.services;

import java.util.List;

import br.org.generation.alunoCurso.model.curso;

public interface ICursoService {
	public List<curso> recuperaTodos();
	public curso getById(int id);
	public void gravarCurso(curso curso);
}
