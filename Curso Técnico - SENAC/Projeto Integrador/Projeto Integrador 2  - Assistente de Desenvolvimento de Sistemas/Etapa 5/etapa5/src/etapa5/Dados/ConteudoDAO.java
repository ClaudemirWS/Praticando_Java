package etapa5.Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Claudemir
 */
public class ConteudoDAO {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public ConteudoDAO() {
        this.conn = conectar();
    }

    //Faz a conexão com o banco de dados
    public Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystream", "root", "admin");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }


    //Desconecta do banco de dados
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
    
}
