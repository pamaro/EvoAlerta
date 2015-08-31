package com.clubee.dao.fnd;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fnd.FND_CatOperacionalVO;
import com.clubee.util.jpa.Transactional;

public class FND_CatOperacionalDAO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	public FND_CatOperacionalVO porId(Integer id) {
		return manager.find(FND_CatOperacionalVO.class, id);
	}
	
	@Transactional
	public void inserirCatOperacionalVO(FND_CatOperacionalVO categoriaOperacional) {
		manager.merge(categoriaOperacional);
	}
	
	public List<FND_CatOperacionalVO> buscasTodasCategoriasOperacionais() {
		return manager.createQuery("from FND_CatOperacional", FND_CatOperacionalVO.class).getResultList();
	}
}


