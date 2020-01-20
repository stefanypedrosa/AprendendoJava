package br.org.generation.webmotors.bd;

import java.util.ArrayList;

import br.org.generation.webmotors.model.Cliente;

public class BDCliente {
	private ArrayList<Cliente> lista;
	
	public BDCliente(){
		lista = new ArrayList<Cliente>();
	}
	
	//create
	public void grava(Cliente c) {
		this.lista.add(c);
	}
	
	//read
	public Cliente buscar(int id) {
		Cliente c = null;
		//for it = para cada posição da lista, compara com o parametro passado
		for(Cliente cli:lista) {
			if(cli.getId() == id) {
				c = cli;
				break;
			}
		}
		return c;
	}
	
	//update
	public void atualizar(Cliente c) {
		int pos=-1;
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).getId()==c.getId()) {
				pos = i;
				break;
			}
		}
		if(pos >= 0) {
			lista.set(pos,c);
		}
	}
	
	//delete
	public boolean apagar(int id) {
		int pos=-1;
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).getId()==id) {
				pos = i;
				break;
			}
		}
		if(pos >= 0) {
			lista.remove(pos);
			return true;
		}
		return false;
	}
	
	public ArrayList<Cliente>buscarTodos(){
		return lista;
	}
}
