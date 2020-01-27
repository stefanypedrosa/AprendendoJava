package br.org.generation.sistemaaluno.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaaluno.dao.IAlunoBD;
import br.org.generation.sistemaaluno.model.aluno;

@Component
public class ServicosAlunos implements IAlunoService {
	
	//"autoamarrada" no sistema | gerenciamento por conta do SpringBoot
	@Autowired
	//alusão ao banco (CrudRepository)
	IAlunoBD repo;
	public void gravarAluno(aluno aluno) {
		try {
			repo.save(aluno);
		}
		catch (Exception ex){
			throw new RuntimeException("Erro ao inserir dados");
		}
	}
	public void atualizaAluno(aluno aluno) {
		try {
			repo.save(aluno);
		}
		catch (Exception ex){
			throw new RuntimeException("Erro ao atualizar dados");
		}
	}
	public aluno recuperaAluno(int id) {
		return repo.findById(id).get();
	}
	
	
}
