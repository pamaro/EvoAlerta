/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.evo.modelo.dao;

import br.com.evo.modelo.vo.FND_PessoasVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jutilbr.java.util.db.UtilDB;
import jutilbr.java.util.db.conexao.Conecta;
import jutilbr.java.util.formata.Formata;
import jutilbr.java.util.seguranca.Seguranca;
/**
 *
 * @author p719653ajdaklsdjlakjdlak
 */
public class FND_PessoasDao {]
		
		

    private static String INSERT_FND_PESSOAS = "insert into FND_Pessoas("
            + "nome_completo,nome_primeiro,"
            + "nome_ultimo,email,telefone_com,\n"
            + "telefone_cel,telefone_fax,empresa,"
            + "empresa_id,pais,estado,cidade,login,"
            + "password,area_nome,"
            + "area_id)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,MD5(?),?,?)";

    private static String SELECT_FND_PESSOAS_ALL = "SELECT * FROM FND_Pessoas";

    public FND_PessoasDao() throws Exception{
        
    }
        
         
   
     public boolean inserirPessoas(FND_PessoasVO fND_PessoasVO , Connection conn) throws SQLException, Exception{
        boolean retorno = false;
        try {
            PreparedStatement ps = conn.prepareStatement(FND_PessoasDao.INSERT_FND_PESSOAS);
            ps.setString(1, fND_PessoasVO.getNome_completo());
            ps.setString(2, fND_PessoasVO.getNome_primeiro());
            ps.setString(3, fND_PessoasVO.getNome_ultimo());
            ps.setString(4, fND_PessoasVO.getEmail());
            ps.setString(5, fND_PessoasVO.getTelefone_cel());
            ps.setString(6, fND_PessoasVO.getTelefone_com());
            ps.setString(7, fND_PessoasVO.getTelefone_fax());
            ps.setString(8, fND_PessoasVO.getEmpresa());
            ps.setInt(9, fND_PessoasVO.getEmpresa_id());
            ps.setString(10, fND_PessoasVO.getPais());
            ps.setString(11, fND_PessoasVO.getEstado());
            ps.setString(12, fND_PessoasVO.getCidade());
            ps.setString(13, fND_PessoasVO.getLogin());
            ps.setString(14, fND_PessoasVO.getPassword());
            ps.setString(15, fND_PessoasVO.getArea_nome());
            ps.setInt(16, fND_PessoasVO.getArea_id());
            if (ps.executeUpdate() > 0) {
                retorno = true;
            }

            UtilDB.close(ps);

        } catch (SQLException sqlex) {
            System.out.println("Erro no método inserir " + sqlex.getMessage());
            throw new SQLException("Erro ao inserir usuario : " + sqlex.getMessage());
        }/**
         * fim do catch
         */
        catch (Exception ex) {
            System.out.println("Erro geral no método inserir " + ex.getMessage());
            throw new Exception("Erro ao inserir usuario: " + ex.getMessage());
        }
        /**
         * fim do catch
         */

        return retorno;
        
    }
}


