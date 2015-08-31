package com.clubee.modelo.fnd;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FND_Areas")
public class FND_Area implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer requestId;
	
	private String nome;
	
	private FND_PessoaVO pessoas;
	
	private FND_Empresa empresa;
	
	private String responsavel;
	
	public FND_Area() {
	}
	
	public FND_Area(Integer requestId, String nome, FND_Empresa empresa, String responsavel) {
		this.requestId = requestId;
		this.nome = nome;
		this.empresa = empresa;
		this.responsavel = responsavel;
	}
	
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public FND_Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(FND_Empresa empresa) {
		this.empresa = empresa;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public FND_PessoaVO getPessoas() {
		return pessoas;
	}

	public void setPessoas(FND_PessoaVO pessoas) {
		this.pessoas = pessoas;
	}
}
