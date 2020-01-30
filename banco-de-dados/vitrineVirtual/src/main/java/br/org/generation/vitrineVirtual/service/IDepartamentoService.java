package br.org.generation.vitrineVirtual.service;

import java.util.List;

import br.org.generation.vitrineVirtual.model.departamento;

public interface IDepartamentoService{
	public List<departamento> getAll();
	public void gravaDepto(departamento d);
	public departamento getById(int id);
}