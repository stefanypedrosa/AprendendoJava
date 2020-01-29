package br.org.generation.vitrineVirtual.service;

import br.org.generation.vitrineVirtual.model.produto;

public interface IProdutoService {
	public void gravaProduto(produto p);
	public void atualizaProduto(produto p);
	public produto recuperaProduto (int id);
}
