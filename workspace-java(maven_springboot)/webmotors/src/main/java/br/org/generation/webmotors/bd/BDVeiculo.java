package br.org.generation.webmotors.bd;

import java.util.ArrayList;

import br.org.generation.webmotors.model.Veiculo;

public class BDVeiculo {
private ArrayList<Veiculo> lista;
	
	public BDVeiculo(){
		lista = new ArrayList<Veiculo>();
	}
	
	//create
	public void grava(Veiculo v) {
		this.lista.add(v);
	}
	
	//read
	public Veiculo buscar(int id) {
		Veiculo v = null;
		//for it = para cada posição da lista, compara com o parametro passado
		for(Veiculo vcl:lista) {
			if(vcl.getId() == id) {
				v = vcl;
				break;
			}
		}
		return v;
	}
	
	//update
	public void atualizar(Veiculo v) {
		int pos=-1;
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).getId()==v.getId()) {
				pos = i;
				break;
			}
		}
		if(pos >= 0) {
			lista.set(pos,v);
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
	
	public ArrayList<Veiculo>buscarTodos(){
		return lista;
	}
}
