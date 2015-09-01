package com.clubee.modelo.fundacoes;

public enum StatusPerfil {
	
	ATIVO("Ativo"),
	INATIVO("Inativo"),
	FERIAS("Férias"),
	TRANCADO("Trancado");
	
	private String descricao;
	
	StatusPerfil(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
