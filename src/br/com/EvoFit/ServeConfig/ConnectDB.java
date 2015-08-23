package br.com.EvoFit.ServeConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@SessionScoped
@ManagedBean

public class ConnectDB {

	private static final String DRIVER_MY_SQL = "com.mysql.jdbc.Driver";
	/**
	 * PARÂMETROS PARA BASE DE DADOS OBSERVAÇÃO:MODIFIQUE A URL PARA O IP
	 * DESEJADO->PRODUÇÃO OU TESTE
	 */

	private static final String URL_EvoFitDB = "jdbc:mysql://179.188.16.35/clubee8";
	private static final String USER_DB = "clubee8";
	private static final String PASSWRD_DB = "Sucesso15";
	 int conTotal = 0;
	private Connection connEvoFit;
	
    public int getConTotal() {
		return conTotal;
	}

	public void setConTotal(int conTotal) {
		this.conTotal = conTotal;
	}

	/**Estabelece conexao com a base de dados */
    public Connection getConectaEVOFit() throws Exception {
    	
    	
    	
        try {
            final int NUMERO_MAXIMO_TESTE_CONEXAO = Integer.MAX_VALUE;// TROQUE O VALOR PARA FAZER SEU TESTE
            
            for (int i = 1; i <= 6; i++) {
               Class.forName(ConnectDB.DRIVER_MY_SQL);
               connEvoFit = DriverManager.getConnection(ConnectDB.URL_EvoFitDB, ConnectDB.USER_DB, ConnectDB.PASSWRD_DB);
               connEvoFit.setAutoCommit(false);
               conTotal =+ i ;
            }
                 System.out.println("NUMERO_MAXIMO_TESTE_CONEXAO = " + conTotal);
        } catch (ClassNotFoundException cnfex) {

            System.out.println("Driver  Não Encontrado " + cnfex.getMessage());
            throw new Exception("Driver Nao  Encontrado " + cnfex.getMessage());
        } catch (SQLException sqlEx) {

            System.out.println("Erro: Não Foi Possível Estabelecer Conexão com banco de dados  "
                    + sqlEx.getMessage());
            throw new Exception("Não Foi Possível Conectar com o Banco de Dados: " + sqlEx.getMessage());
        } catch (Exception ex) {

            System.out.println("Erro geral: " + ex.getMessage());
            throw new Exception("Não Foi Possível Conectar com o Banco de Dados  " + ex.getMessage());
        }

        return connEvoFit;

    }
    
    public String testeCOn() {
        try {
            new ConnectDB().getConectaEVOFit();
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
		return "index";

    }

}
