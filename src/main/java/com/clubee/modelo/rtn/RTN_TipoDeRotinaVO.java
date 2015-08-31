package com.clubee.modelo.rtn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RTN_TipoDeRotina")
public class RTN_TipoDeRotinaVO {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  RequestID;
	private String tipo_rotina;
	private Integer status;
	private String criado_por;
	private Date data_criacao;
	
	
	public Integer getRequestID() {
		return RequestID;
	}
	public void setRequestID(Integer requestID) {
		RequestID = requestID;
	}
	public String getTipo_rotina() {
		return tipo_rotina;
	}
	public void setTipo_rotina(String tipo_rotina) {
		this.tipo_rotina = tipo_rotina;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCriado_por() {
		return criado_por;
	}
	public void setCriado_por(String criado_por) {
		this.criado_por = criado_por;
	}
	public Date getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
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
		RTN_TipoDeRotinaVO other = (RTN_TipoDeRotinaVO) obj;
		if (RequestID == null) {
			if (other.RequestID != null)
				return false;
		} else if (!RequestID.equals(other.RequestID))
			return false;
		return true;
	}
	
	

}
