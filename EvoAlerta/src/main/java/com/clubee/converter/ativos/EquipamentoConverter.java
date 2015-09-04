package com.clubee.converter.ativos;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.ativos.AST_EquipamentoDAO;
import com.clubee.modelo.ativos.AST_EquipamentoVO;

@FacesConverter(forClass = AST_EquipamentoVO.class)
public class EquipamentoConverter implements Converter {
	
	@Inject
	private AST_EquipamentoDAO equipamentoDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		AST_EquipamentoVO retorno = null;
		
		if(value != null) {
			retorno = equipamentoDAO.porID(new Integer(value));
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value != null && !"".equals(value)) {
			AST_EquipamentoVO tipoEquipamento = (AST_EquipamentoVO) value;
			
			String codigo = tipoEquipamento.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
