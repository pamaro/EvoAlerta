package com.clubee.modelo.ativos;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class AST_DadosDataEquipamento {

	private Date dataDeCriacao;
	private Date dataDeCompra;
	private Date dataDeInstalacao;
	private Date dataDaUltimaManutencao;
	private Date dataDaProximaManutencao;
	private Date dataDeDesligamento;

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public Date getDataDeCompra() {
		return dataDeCompra;
	}

	public void setDataDeCompra(Date dataDeCompra) {
		this.dataDeCompra = dataDeCompra;
	}

	public Date getDataDeInstalacao() {
		return dataDeInstalacao;
	}

	public void setDataDeInstalacao(Date dataDeInstalacao) {
		this.dataDeInstalacao = dataDeInstalacao;
	}

	public Date getDataDaUltimaManutencao() {
		return dataDaUltimaManutencao;
	}

	public void setDataDaUltimaManutencao(Date dataDaUltimaManutencao) {
		this.dataDaUltimaManutencao = dataDaUltimaManutencao;
	}

	public Date getDataDaProximaManutencao() {
		return dataDaProximaManutencao;
	}

	public void setDataDaProximaManutencao(Date dataDaProximaManutencao) {
		this.dataDaProximaManutencao = dataDaProximaManutencao;
	}

	public Date getDataDeDesligamento() {
		return dataDeDesligamento;
	}

	public void setDataDeDesligamento(Date dataDeDesligamento) {
		this.dataDeDesligamento = dataDeDesligamento;
	}
}
