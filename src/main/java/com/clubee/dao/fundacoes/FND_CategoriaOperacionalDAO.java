package com.clubee.dao.fundacoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fundacoes.FND_CategoriaOperacionalVO;
import com.clubee.util.jpa.Transactional;

public class FND_CategoriaOperacionalDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public FND_CategoriaOperacionalVO porID(Integer id) {
		return manager.find(FND_CategoriaOperacionalVO.class, id);
	}
	
	@Transactional
	public void inserirCatOperacionalVO(FND_CategoriaOperacionalVO categoriaOperacional) {
		manager.merge(categoriaOperacional);
	}
	
	public List<FND_CategoriaOperacionalVO> buscasTodasCategoriasOperacionais() {
		return manager.createQuery("from FND_CatOperacional", FND_CategoriaOperacionalVO.class).getResultList();
	}
}


