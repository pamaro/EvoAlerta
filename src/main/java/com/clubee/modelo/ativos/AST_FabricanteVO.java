package com.clubee.modelo.ativos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AST_Fabricante")
public class AST_FabricanteVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer requestID;
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDeCriacao;
	
	private String criadoPor;
	
	private AST_MarcaVO marca;
	
	private AST_ModeloVO modelo;
	
	@OneToMany
	private List<AST_EquipamentoVO> equipamentos = new ArrayList<>();

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public String getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	public AST_MarcaVO getMarca() {
		return marca;
	}

	public void setMarca(AST_MarcaVO marca) {
		this.marca = marca;
	}

	public AST_ModeloVO getModelo() {
		return modelo;
	}

	public void setModelo(AST_ModeloVO modelo) {
		this.modelo = modelo;
	}

	public List<AST_EquipamentoVO> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<AST_EquipamentoVO> equipamentos) {
		this.equipamentos = equipamentos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((requestID == null) ? 0 : requestID.hashCode());
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
		AST_FabricanteVO other = (AST_FabricanteVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
