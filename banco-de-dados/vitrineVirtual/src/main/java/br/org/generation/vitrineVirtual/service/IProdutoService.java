package br.org.generation.vitrineVirtual.service;

import java.util.List;

import br.org.generation.vitrineVirtual.model.produto;

public interface IProdutoService {
	public List<produto> getAll();
	public void gravaProduto(produto p);
	public void atualizaProduto(produto p);
	public produto getById (int id);
}
