package com.clubee.dao.ast;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ast.AST_CategoriaEquipamentoVO;
import com.clubee.util.jpa.Transactional;

public class AST_CategoriaEquipamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public AST_CategoriaEquipamentoVO porId(Integer id) {
		return manager.find(AST_CategoriaEquipamentoVO.class, id);
	}
	
	@Transactional
	public void inserirCategoriaEquipamento(AST_CategoriaEquipamentoVO categoriaEquipamento) {
		manager.merge(categoriaEquipamento);
	}
	
	public List<AST_CategoriaEquipamentoVO> buscarTodasCategoriasEquipamento() {
		return manager.createQuery("from AST_CategoriaEquipamentoVO", AST_CategoriaEquipamentoVO.class).getResultList();
	}

}





