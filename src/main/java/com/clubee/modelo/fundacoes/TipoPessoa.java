package com.clubee.modelo.fundacoes;

public enum TipoPessoa {
	
	ALUNO("Aluno"),
	FUNCIONARIO_INTERNO("Funcionário interno"),
	FUNCIONARIO_EXTERNO("Funcionário externo");
	
	private String descricao;
	
	TipoPessoa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
