package com.clubee.dao.rotinas;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.rotinas.RTN_TipoDeRotinaVO;
import com.clubee.util.jpa.Transactional;

public class RTN_TipoDeRotinaDAO implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public RTN_TipoDeRotinaVO porId(Integer id) {
		return manager.find(RTN_TipoDeRotinaVO.class, id);
	}

	public List<RTN_TipoDeRotinaVO> porStatus(String status) {
		return manager.createQuery("select tp from RTN_TipoDeRotinaVO tp where tp.status = :status ",
				RTN_TipoDeRotinaVO.class).getResultList();
	}

	public List<RTN_TipoDeRotinaVO> todasRotinas() {
		return manager.createQuery("from RTN_TipoDeRotinaVO", RTN_TipoDeRotinaVO.class).getResultList();
	}
	
	@Transactional
	public void inserirTipoRotina(RTN_TipoDeRotinaVO tipoRotina){
		 manager.merge(tipoRotina);
	}

}
