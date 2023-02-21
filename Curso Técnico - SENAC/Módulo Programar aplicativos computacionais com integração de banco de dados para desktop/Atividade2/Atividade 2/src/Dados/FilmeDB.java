package Dados;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Claudemir
 */
public class FilmeDB {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ALTERAR A SENHA PARA A UTILIZADA NO WORKBENCH
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividade1", "root", "admin");
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

    public Filme consultar(String nome) {

        try {
            Filme filme = new Filme();
            st = conn.prepareStatement("SELECT * FROM filmes WHERE nome = ?");
            st.setString(1, nome);
            rs = st.executeQuery();
            //verificar se a consulta encontrou o funcionário com a matrícula informada
            if (rs.next()) { // se encontrou o funcionário, vamos carregar os dados
                filme.setNome(rs.getString("nome"));
                filme.setData(rs.getString("datalancamento"));
                filme.setCategoria(rs.getString("categoria"));
                return filme;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    public boolean excluir(String nome) {
        try {
            st = conn.prepareStatement("DELETE FROM filmes WHERE nome = ?");
            st.setString(1, nome);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Filme filme) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? where nome = ?");
            st.setString(1, filme.getNome());
            st.setString(2, filme.getData());
            st.setString(3, filme.getCategoria());
            st.setString(4, filme.getNome());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
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
