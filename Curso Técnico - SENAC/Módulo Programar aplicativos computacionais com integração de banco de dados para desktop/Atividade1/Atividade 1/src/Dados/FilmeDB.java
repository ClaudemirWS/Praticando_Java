package Dados;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Claudemir
 */
public class FilmeDB {

    Connection conn;
    PreparedStatement st;
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ALTERAR A SENHA PARA A UTILIZADA NO WORKBENCH
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividade1", "root", "");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    public int salvar(Filme filme) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO filmes(nome, datalancamento, categoria) VALUES(?,?,?)");
            st.setString(1, filme.getNome());
            st.setString(2, filme.getData());
            st.setString(3, filme.getCategoria());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }

}
