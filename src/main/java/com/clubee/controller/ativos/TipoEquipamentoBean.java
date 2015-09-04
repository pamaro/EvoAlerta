package com.clubee.controller.ativos;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.ativos.AST_TipoEquipamentoDAO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;
import com.clubee.util.jpa.FacesUtil;

@Named
@ViewScoped
public class TipoEquipamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private AST_TipoEquipamentoDAO tipoEquipamentoDAO;
	
	private AST_TipoEquipamentoVO tipoEquipamentoVO = new AST_TipoEquipamentoVO();
	
	public void salvar() {
		tipoEquipamentoDAO.inserirTipoEquipamentoVO(tipoEquipamentoVO);
		FacesUtil.addSuccessMessage("Tipo de equipamento salvo");
	}

	public AST_TipoEquipamentoVO getTipoEquipamentoVO() {
		return tipoEquipamentoVO;
	}
	
	public void setTipoEquipamentoVO(AST_TipoEquipamentoVO tipoEquipamentoVO) {
		this.tipoEquipamentoVO = tipoEquipamentoVO;
	}
}
