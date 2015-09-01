package com.clubee.controller.rotinas;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.rotinas.RTN_TipoDeRotinaDAO;
import com.clubee.modelo.rotinas.RTN_TipoDeRotinaVO;

@Named
@SessionScoped
public class CadastroTipoRotina implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Inject
	private RTN_TipoDeRotinaDAO tipoDeRotinaDAO;
	
	private RTN_TipoDeRotinaVO tipoDeRotinaVO = new RTN_TipoDeRotinaVO();

	public RTN_TipoDeRotinaVO getTipoDeRotinaVO() {
		return tipoDeRotinaVO;
	}

	public void setTipoDeRotinaVO(RTN_TipoDeRotinaVO tipoDeRotinaVO) {
		this.tipoDeRotinaVO = tipoDeRotinaVO;
	}
	
	
	public void cadastrarRotina(){
		
		tipoDeRotinaDAO.inserirTipoRotina(tipoDeRotinaVO);
		
	}
	
	
}