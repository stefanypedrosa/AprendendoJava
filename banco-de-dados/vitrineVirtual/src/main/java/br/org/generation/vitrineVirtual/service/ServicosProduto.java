package br.org.generation.vitrineVirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrineVirtual.dao.IProdutoDB;
import br.org.generation.vitrineVirtual.model.produto;

@Component
public class ServicosProduto implements IProdutoService{
	
	@Autowired
	IProdutoDB repo;

	@Override
	public void gravaProduto(produto p) {
		try {
			repo.save(p);
		}
		catch(Exception ex) {
			throw new RuntimeException("Erro ao inserir dados");
		}
		
	}

	@Override
	public void atualizaProduto(produto p) {
		
		
	}

	@Override
	public produto recuperaProduto(int id) {
		return repo.findById(id).get();
	}
}
