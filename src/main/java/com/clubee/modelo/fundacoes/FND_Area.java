package com.clubee.modelo.fundacoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FND_Areas")
public class FND_Area implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;
	
	@Column(length = 150)
	private String nome;
	
	@ManyToMany(mappedBy = "areas")
	private List<FND_PessoaVO> pessoas = new ArrayList<>();
	
	@ManyToMany(mappedBy = "areas")
	private List<FND_EmpresaVO> empresas = new ArrayList<>();

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
	
	public List<FND_PessoaVO> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<FND_PessoaVO> pessoas) {
		this.pessoas = pessoas;
	}

	public List<FND_EmpresaVO> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<FND_EmpresaVO> empresas) {
		this.empresas = empresas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requestID == null) ? 0 : requestID.hashCode());
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
		FND_Area other = (FND_Area) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
