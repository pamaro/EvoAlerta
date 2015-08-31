package com.clubee.modelo.manutencoes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.clubee.modelo.ativos.AST_MarcaVO;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;

@Entity
@Table(name = "MNT_HistoricoDeManutencao")
public class MNT_HistoricoDeManutencaoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	private String nomeSolicitante;
	private String emailSolicitante;
	private String telefoneSolicitante;

	private String sumario;
	private String descricaoDetalhada;

	// private String categoria_1;
	// private String categoria_2;
	// private String categoria_3;

	private FND_EmpresaVO empresa;

	// private String fornecedor;

	// private FND_AreaVO areaDesignada;

	private String atendidoPor;

	private Date dataAbertura;
	private Date dataEsperada;
	private Date dataConclusao;

	// private String reminder;
	// private String reminderDescricao;

	private byte[] anexo;

	// private String ativo;

	private AST_MarcaVO marca;

	// private String prioridade;

	// private String urgencia;

	private String conclusao;
	private String causaRaiz;

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getNomeSolicitante() {
		return nomeSolicitante;
	}

	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}

	public String getEmailSolicitante() {
		return emailSolicitante;
	}

	public void setEmailSolicitante(String emailSolicitante) {
		this.emailSolicitante = emailSolicitante;
	}

	public String getTelefoneSolicitante() {
		return telefoneSolicitante;
	}

	public void setTelefoneSolicitante(String telefoneSolicitante) {
		this.telefoneSolicitante = telefoneSolicitante;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getDescricaoDetalhada() {
		return descricaoDetalhada;
	}

	public void setDescricaoDetalhada(String descricaoDetalhada) {
		this.descricaoDetalhada = descricaoDetalhada;
	}

	public FND_EmpresaVO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(FND_EmpresaVO empresa) {
		this.empresa = empresa;
	}

	public String getAtendidoPor() {
		return atendidoPor;
	}

	public void setAtendidoPor(String atendidoPor) {
		this.atendidoPor = atendidoPor;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEsperada() {
		return dataEsperada;
	}

	public void setDataEsperada(Date dataEsperada) {
		this.dataEsperada = dataEsperada;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public byte[] getAnexo() {
		return anexo;
	}

	public void setAnexo(byte[] anexo) {
		this.anexo = anexo;
	}

	public AST_MarcaVO getMarca() {
		return marca;
	}

	public void setMarca(AST_MarcaVO marca) {
		this.marca = marca;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	public String getCausaRaiz() {
		return causaRaiz;
	}

	public void setCausaRaiz(String causaRaiz) {
		this.causaRaiz = causaRaiz;
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
		MNT_HistoricoDeManutencaoVO other = (MNT_HistoricoDeManutencaoVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
