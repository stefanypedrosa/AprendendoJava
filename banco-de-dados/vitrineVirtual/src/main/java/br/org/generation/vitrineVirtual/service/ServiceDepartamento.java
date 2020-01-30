package br.org.generation.vitrineVirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrineVirtual.dao.IDepartamentoDB;
import br.org.generation.vitrineVirtual.model.departamento;

@Component
public class ServiceDepartamento implements IDepartamentoService{

	@Autowired
	IDepartamentoDB repo;
	
	@Override
	public List<departamento> getAll() {
		return (List<departamento>)repo.findAll();
	}

	@Override
	public void gravaDepto(departamento d) {
		try {
			repo.save(d);
		}
		catch (Exception ex) {
			throw new RuntimeException("Erro ao inserir");
		}
	}

	@Override
	public departamento getById(int id) {
		return repo.findById(id).get();
	}

}
