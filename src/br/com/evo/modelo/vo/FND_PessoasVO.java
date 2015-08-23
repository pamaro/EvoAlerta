/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.evo.modelo.vo;

import java.util.logging.Logger;
import java.io.Serializable;
/**
 *
 * @author p719653
 */
public class FND_PessoasVO implements Serializable{

    private int RequestID;
    private String nome_completo;
    private String nome_primeiro;
    private String nome_ultimo;
    private String email;
    private String telefone_com;
    private String telefone_cel;
    private String telefone_fax;
    private String empresa;
    private int empresa_id;
    private String pais;
    private String estado;
    private String cidade;
    private String login;
    private String password;
    private String area_nome;
    private int area_id;
    private static final Logger LOG = Logger.getLogger(FND_PessoasVO.class.getName());

    public FND_PessoasVO() {

    }

    public FND_PessoasVO(int RequestID, String nome_completo, String nome_primeiro,
                         String nome_ultimo, String email, String telefone_com, 
                         String telefone_cel, String telefone_fax, String empresa,
                         int empresa_id, String pais, String estado, String cidade,
                         String login, String password, String area_nome, int area_id) {
      
        setRequestID(RequestID);
        setNome_completo(nome_completo);
        setNome_primeiro(nome_primeiro);
        setNome_ultimo(nome_ultimo);
        setEmail(email);
        setTelefone_cel(telefone_cel);
        setTelefone_com(telefone_com);
        setTelefone_fax(telefone_fax);
        setEmpresa(empresa);
        setEmpresa_id(empresa_id);
        setPais(pais);
        setEstado(estado);
        setCidade(cidade);
        setLogin(login);
        setPassword(password);
        setArea_nome(area_nome);
        setArea_id(area_id);
        }

    
    
    
    public int getRequestID() {
        return RequestID;
    }

    public void setRequestID(int RequestID) {
        this.RequestID = RequestID;
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
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArea_nome() {
        return area_nome;
    }

    public void setArea_nome(String area_nome) {
        this.area_nome = area_nome;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

}
