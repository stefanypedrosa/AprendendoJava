package br.org.generation.vitrineVirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.vitrineVirtual.model.produto;

public interface IProdutoDB extends CrudRepository<produto, Integer>{

}
