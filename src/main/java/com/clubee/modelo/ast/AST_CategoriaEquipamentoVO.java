package com.clubee.modelo.ast;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AST_CategoriaEquipamentoVO implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer requestID;
		
	    private String nome;
	    
	    private Date dataCriacao;
	    private String criadoPor;
	    
	   
	    //private static final Logger LOG = LoggerFactory.getLogger(AST_CategoriaEquipamentoVO.class.getName());

	    public AST_CategoriaEquipamentoVO() {
	    }

	    public AST_CategoriaEquipamentoVO(Integer requestID, String nome, Date dataCriacao, String criadoPor) {
	      
	      setRequestID(requestID);
	      setNome(nome);
	      setDataCriacao(dataCriacao);
	      setCriadoPor(criadoPor);
    
	    }

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

		public Date getDataCriacao() {
			return dataCriacao;
		}
		
		public void setDataCriacao(Date dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public String getCriadoPor() {
			return criadoPor;
		}

		public void setCriadoPor(String criadoPor) {
			this.criadoPor = criadoPor;
		}
}
