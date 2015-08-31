package com.clubee.modelo.fnd;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FND_CatOperacionalVO")
public class FND_CatOperacionalVO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int requestID;
    
	private String categoria_1;
    private String categoria_2;
    private String categoria_3;
    private String email;
    
    private FND_Empresa empresa;
    
  
    //private static final Logger LOG = LoggerFactory.getLogger(FND_CatOperacionalVO.class.getName());

    public FND_CatOperacionalVO() {

    }

    public FND_CatOperacionalVO(int requestID, String categoria_1, String categoria_2,
                         String categoria_3, String email) {
      
        setRequestID(requestID);
        setCategoria_1(categoria_1);
        setCategoria_2(categoria_2);
        setCategoria_3(categoria_3);
        setEmail(email);
    }

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public String getCategoria_1() {
		return categoria_1;
	}

	public void setCategoria_1(String categoria_1) {
		this.categoria_1 = categoria_1;
	}

	public String getCategoria_2() {
		return categoria_2;
	}

	public void setCategoria_2(String categoria_2) {
		this.categoria_2 = categoria_2;
	}

	public String getCategoria_3() {
		return categoria_3;
	}

	public void setCategoria_3(String categoria_3) {
		this.categoria_3 = categoria_3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public FND_Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(FND_Empresa empresa) {
		this.empresa = empresa;
	}
}
