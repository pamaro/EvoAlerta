package com.clubee.modelo.rtn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RTN_GestaoDeRotinas")
public class RTN_GestaoDeRotinaVO {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  RequestID;
	private String nome_atividade;
	private String desricao;
	private String area_responsavel;
	private Integer  id_area_responsavel;
	private Date data_criacao;
	private Date data_inicio_rotina;
	private Date data_fim_rotina;
	private String nome_responsavel;
	private String periodicidade_quantidade;
	private String periodicidade_parametro;
	private Integer  id_ativo;
	private String nome_ativo;
	private Integer  id_manutencao;
	private String criado_por;
	private Integer  id_tipoRotina;
	private Integer  tipo_rotina;
	
	public Integer getRequestID() {
		return RequestID;
	}
	public void setRequestID(Integer requestID) {
		RequestID = requestID;
	}
	public String getNome_atividade() {
		return nome_atividade;
	}
	public void setNome_atividade(String nome_atividade) {
		this.nome_atividade = nome_atividade;
	}
	public String getDesricao() {
		return desricao;
	}
	public void setDesricao(String desricao) {
		this.desricao = desricao;
	}
	public String getArea_responsavel() {
		return area_responsavel;
	}
	public void setArea_responsavel(String area_responsavel) {
		this.area_responsavel = area_responsavel;
	}
	public Integer getId_area_responsavel() {
		return id_area_responsavel;
	}
	public void setId_area_responsavel(Integer id_area_responsavel) {
		this.id_area_responsavel = id_area_responsavel;
	}
	public Date getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
	public Date getData_inicio_rotina() {
		return data_inicio_rotina;
	}
	public void setData_inicio_rotina(Date data_inicio_rotina) {
		this.data_inicio_rotina = data_inicio_rotina;
	}
	public Date getData_fim_rotina() {
		return data_fim_rotina;
	}
	public void setData_fim_rotina(Date data_fim_rotina) {
		this.data_fim_rotina = data_fim_rotina;
	}
	public String getNome_responsavel() {
		return nome_responsavel;
	}
	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}
	public String getPeriodicidade_quantidade() {
		return periodicidade_quantidade;
	}
	public void setPeriodicidade_quantidade(String periodicidade_quantidade) {
		this.periodicidade_quantidade = periodicidade_quantidade;
	}
	public String getPeriodicidade_parametro() {
		return periodicidade_parametro;
	}
	public void setPeriodicidade_parametro(String periodicidade_parametro) {
		this.periodicidade_parametro = periodicidade_parametro;
	}
	public Integer getId_ativo() {
		return id_ativo;
	}
	public void setId_ativo(Integer id_ativo) {
		this.id_ativo = id_ativo;
	}
	public String getNome_ativo() {
		return nome_ativo;
	}
	public void setNome_ativo(String nome_ativo) {
		this.nome_ativo = nome_ativo;
	}
	public Integer getId_manutencao() {
		return id_manutencao;
	}
	public void setId_manutencao(Integer id_manutencao) {
		this.id_manutencao = id_manutencao;
	}
	public String getCriado_por() {
		return criado_por;
	}
	public void setCriado_por(String criado_por) {
		this.criado_por = criado_por;
	}
	public Integer getId_tipoRotina() {
		return id_tipoRotina;
	}
	public void setId_tipoRotina(Integer id_tipoRotina) {
		this.id_tipoRotina = id_tipoRotina;
	}
	public Integer getTipo_rotina() {
		return tipo_rotina;
	}
	public void setTipo_rotina(Integer tipo_rotina) {
		this.tipo_rotina = tipo_rotina;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((RequestID == null) ? 0 : RequestID.hashCode());
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
