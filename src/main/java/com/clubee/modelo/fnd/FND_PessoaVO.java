package com.clubee.modelo.fnd;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FND_Pessoas")
public class FND_PessoaVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer RequestID;
	
    private String nome_completo;
    private String nome_primeiro;
    private String nome_ultimo;
    
    private String telefone_com;
    private String telefone_cel;
    private String telefone_fax;
    
    private String empresa;
    private int empresa_id;
    
    private String pais;
    private String estado;
    private String cidade;
    
    private String emailLogin;
    
    private String password;
    
   // private static final Logger LOG = LoggerFactory.getLogger(FND_PessoaVO.class);

   

	public int getRequestID() {
		return RequestID;
	}

	public void setRequestID(int requestID) {
		RequestID = requestID;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getNome_primeiro() {
		return nome_primeiro;
	}

	public void setNome_primeiro(String nome_primeiro) {
		this.nome_primeiro = nome_primeiro;
	}

	public String getNome_ultimo() {
		return nome_ultimo;
	}

	public void setNome_ultimo(String nome_ultimo) {
		this.nome_ultimo = nome_ultimo;
	}

	public String getEmail() {
		return emailLogin;
	}

	public void setEmail(String email) {
		this.emailLogin = email;
	}

	public String getTelefone_com() {
		return telefone_com;
	}

	public void setTelefone_com(String telefone_com) {
		this.telefone_com = telefone_com;
	}

	public String getTelefone_cel() {
		return telefone_cel;
	}

	public void setTelefone_cel(String telefone_cel) {
		this.telefone_cel = telefone_cel;
	}

	public String getTelefone_fax() {
		return telefone_fax;
	}

	public void setTelefone_fax(String telefone_fax) {
		this.telefone_fax = telefone_fax;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(int empresa_id) {
		this.empresa_id = empresa_id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		FND_PessoaVO other = (FND_PessoaVO) obj;
		if (RequestID == null) {
			if (other.RequestID != null)
				return false;
		} else if (!RequestID.equals(other.RequestID))
			return false;
		return true;
	}

}
