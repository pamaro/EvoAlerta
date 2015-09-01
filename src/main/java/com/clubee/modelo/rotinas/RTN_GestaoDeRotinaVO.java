package com.clubee.modelo.rotinas;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RTN_GestaoDeRotinas")
public class RTN_GestaoDeRotinaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer RequestID;

	private String nomeAtividade;
	private String descricao;

	//private FND_AreaVO areaResponsavel;

	private Date dataCriacao;
	private Date dataInicioRotina;
	private Date dataFimRotina;

	private String nomeResponsavel;

	private Integer periodicidadeQuantidade;
	private String periodicidadeParametro;

	// private Integer id_ativo;
	// private String nome_ativo;

	// private Integer id_manutencao;

	private String criadoPor;

	private RTN_TipoDeRotinaVO tipoRotina;

	public Integer getRequestID() {
		return RequestID;
	}

	public void setRequestID(Integer requestID) {
		RequestID = requestID;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataInicioRotina() {
		return dataInicioRotina;
	}

	public void setDataInicioRotina(Date dataInicioRotina) {
		this.dataInicioRotina = dataInicioRotina;
	}

	public Date getDataFimRotina() {
		return dataFimRotina;
	}

	public void setDataFimRotina(Date dataFimRotina) {
		this.dataFimRotina = dataFimRotina;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public Integer getPeriodicidadeQuantidade() {
		return periodicidadeQuantidade;
	}

	public void setPeriodicidadeQuantidade(Integer periodicidadeQuantidade) {
		this.periodicidadeQuantidade = periodicidadeQuantidade;
	}

	public String getPeriodicidadeParametro() {
		return periodicidadeParametro;
	}

	public void setPeriodicidadeParametro(String periodicidadeParametro) {
		this.periodicidadeParametro = periodicidadeParametro;
	}

	public String getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	public RTN_TipoDeRotinaVO getTipoRotina() {
		return tipoRotina;
	}

	public void setTipoRotina(RTN_TipoDeRotinaVO tipoRotina) {
		this.tipoRotina = tipoRotina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((RequestID == null) ? 0 : RequestID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RTN_GestaoDeRotinaVO other = (RTN_GestaoDeRotinaVO) obj;
		if (RequestID == null) {
			if (other.RequestID != null)
				return false;
		} else if (!RequestID.equals(other.RequestID))
			return false;
		return true;
	}

}
