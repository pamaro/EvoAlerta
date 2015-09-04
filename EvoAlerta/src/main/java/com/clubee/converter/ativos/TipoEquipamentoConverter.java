package com.clubee.converter.ativos;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.ativos.AST_TipoEquipamentoDAO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;

@FacesConverter(forClass = AST_TipoEquipamentoVO.class)
public class TipoEquipamentoConverter implements Converter {
	
	@Inject
	private AST_TipoEquipamentoDAO tipoEquipamentoDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		AST_TipoEquipamentoVO retorno = null;
		
		if(value != null) {
			retorno = tipoEquipamentoDAO.porID(new Integer(value));
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value != null && !"".equals(value)) {
			AST_TipoEquipamentoVO tipoEquipamento = (AST_TipoEquipamentoVO) value;
			
			String codigo = tipoEquipamento.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
