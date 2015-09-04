package com.clubee.controller.ativos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.ativos.AST_CategoriaEquipamentoDAO;
import com.clubee.dao.ativos.AST_EquipamentoDAO;
import com.clubee.modelo.ativos.AST_CategoriaEquipamentoVO;
import com.clubee.modelo.ativos.AST_EquipamentoVO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;

@Named
@ViewScoped
public class CadastroEquipamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private AST_EquipamentoDAO equipamentoDAO;
	
	@Inject
	private AST_CategoriaEquipamentoDAO categoriaEquipamentoDAO;
	
	private AST_EquipamentoVO equipamentoVO = new AST_EquipamentoVO();
	
	private List<AST_TipoEquipamentoVO> tipos = new ArrayList<>();
	
	public void salvar() {
		equipamentoDAO.inserirEquipamentoVO(equipamentoVO);
	}
	
	public List<AST_CategoriaEquipamentoVO> getCategorias() {
		return categoriaEquipamentoDAO.buscarTodasCategoriasEquipamento();
	}
	
	public void handleChange(ValueChangeEvent event){  
	    System.out.println("New value: " + event.getNewValue());
	}
		
	public void popularTipos() {
		AST_CategoriaEquipamentoVO categoria = equipamentoVO.getCategoria();
		
		if(categoria != null) {
			tipos = categoriaEquipamentoDAO.buscarTiposPorCategoria(categoria);
		}
		
		System.out.println(categoria);
	}

	public AST_EquipamentoVO getEquipamentoVO() {
		if(equipamentoVO == null) {
			equipamentoVO = new AST_EquipamentoVO();
		}
		return equipamentoVO;
	}

	public void setEquipamentoVO(AST_EquipamentoVO equipamentoVO) {
		this.equipamentoVO = equipamentoVO;
	}
	
	public List<AST_TipoEquipamentoVO> getTipos() {
		return tipos;
	}
	
	public void setTipos(List<AST_TipoEquipamentoVO> tipos) {
		this.tipos = tipos;
	}
}
