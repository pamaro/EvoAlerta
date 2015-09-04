package com.clubee.controller.ativos;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.ativos.AST_CategoriaEquipamentoDAO;
import com.clubee.dao.ativos.AST_TipoEquipamentoDAO;
import com.clubee.modelo.ativos.AST_CategoriaEquipamentoVO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;
import com.clubee.util.jpa.FacesUtil;

@Named
@ViewScoped
public class CategoriaEquipamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private AST_CategoriaEquipamentoDAO categoriaEquipamentoDAO;
	
	@Inject
	private AST_TipoEquipamentoDAO tipoEquipamentoDAO;
	
	private AST_CategoriaEquipamentoVO categoriaEquipamentoVO = new AST_CategoriaEquipamentoVO();
	
	public void salvar() {
		categoriaEquipamentoDAO.inserirCategoriaEquipamento(categoriaEquipamentoVO);
		FacesUtil.addSuccessMessage("categoria salva.");
	}
	
	public List<AST_TipoEquipamentoVO> getTipos() {
		return tipoEquipamentoDAO.buscarTodosTiposEquipamentos();
	}
	
	public AST_CategoriaEquipamentoVO getCategoriaEquipamentoVO() {
		return categoriaEquipamentoVO;
	}
	
	public void setCategoriaEquipamentoVO(AST_CategoriaEquipamentoVO categoriaEquipamentoVO) {
		this.categoriaEquipamentoVO = categoriaEquipamentoVO;
	}
}
