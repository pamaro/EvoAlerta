package com.clubee.modelo.ativos;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AST_Equipamentos")
public class AST_EquipamentoVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer requestID;
	
	private String nome;
	
	//private FND_StatusVO status;
	
	private String codigoEquipamento;
	
	@ManyToOne
	private AST_CategoriaEquipamentoVO categoria;
	
	@ManyToOne
	private AST_TipoEquipamentoVO tipo;
	
	private AST_MarcaVO marca;
	private AST_ModeloVO modelo;
	
	@ManyToOne
	private AST_FabricanteVO fabricante;
	
	private String empresa;
	
	private Long numeroDeSerie;
	
	@Lob
	private byte[] imagem;
	
	@Embedded
	private AST_DadosDataEquipamento dadosDeDatas = new AST_DadosDataEquipamento();
	
	private Integer peridiocidadeQuantidade;
	private Integer peridiocidadeParametro;
	

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


	public String getCodigoEquipamento() {
		return codigoEquipamento;
	}

	public void setCodigoEquipamento(String codigoEquipamento) {
		this.codigoEquipamento = codigoEquipamento;
	}

	public AST_CategoriaEquipamentoVO getCategoria() {
		return categoria;
	}

	public void setCategoria(AST_CategoriaEquipamentoVO categoria) {
		this.categoria = categoria;
	}

	public AST_TipoEquipamentoVO getTipo() {
		return tipo;
	}

	public void setTipo(AST_TipoEquipamentoVO tipo) {
		this.tipo = tipo;
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

	public AST_FabricanteVO getFabricante() {
		return fabricante;
	}

	public void setFabricante(AST_FabricanteVO fabricante) {
		this.fabricante = fabricante;
	}

	public Long getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(Long numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public AST_DadosDataEquipamento getDadosDeDatas() {
		return dadosDeDatas;
	}

	public void setDadosDeDatas(AST_DadosDataEquipamento dadosDeDatas) {
		this.dadosDeDatas = dadosDeDatas;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Integer getPeridiocidadeQuantidade() {
		return peridiocidadeQuantidade;
	}

	public void setPeridiocidadeQuantidade(Integer peridiocidadeQuantidade) {
		this.peridiocidadeQuantidade = peridiocidadeQuantidade;
	}

	public Integer getPeridiocidadeParametro() {
		return peridiocidadeParametro;
	}

	public void setPeridiocidadeParametro(Integer peridiocidadeParametro) {
		this.peridiocidadeParametro = peridiocidadeParametro;
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
		AST_EquipamentoVO other = (AST_EquipamentoVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
