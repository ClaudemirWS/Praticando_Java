package aplicacaoacessobd;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Claudemir
 */
public class AplicacaoAcessoBd {

    public static void main(String[] args) {
        try {
            Conexao conector = new Conexao();
            conector.conectar();

            Statement st = conector.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM usuario"); //variavel da classe ResultSet para receber o valor da consulta
            rs.next();
            System.out.println(rs.getInt("COUNT(*)"));
        } catch (SQLException ex) {
            Logger.getLogger(AplicacaoAcessoBd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
