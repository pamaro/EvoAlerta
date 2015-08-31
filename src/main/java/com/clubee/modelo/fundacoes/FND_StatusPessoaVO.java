package com.clubee.modelo.fundacoes;

public enum FND_StatusPessoaVO {
	
	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String descricao;
	
	FND_StatusPessoaVO(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
