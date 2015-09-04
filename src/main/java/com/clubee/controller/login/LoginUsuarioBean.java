package com.clubee.controller.login;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.fundacoes.FND_PessoaDAO;
import com.clubee.util.jpa.FacesUtil;

@Named
@SessionScoped
public class LoginUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private FND_PessoaDAO pessoaDAO;
	
	private String emailLogin;
	private String senha;
	
	public String login() {
		
		boolean autenticacao = pessoaDAO.verificarSenha(emailLogin, senha);
		
		if(autenticacao) {
			return "/index?faces-redirect=true";
		} else {
			FacesUtil.addErrorMessage("Usuário/Senha inválida.");
			return null;
		}
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}
	
	public String getEmailLogin() {
		return emailLogin;
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setEmailLogin(String emailLogin) {
		this.emailLogin = emailLogin;
	}
}
