package Dados;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Claudemir
 */
public class FilmeDB {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public FilmeDB() {
        this.conn = this.conectar();
    }

    public Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividade1", "root", "admin");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
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

    public List<Filme> getFilmes() {
        try {
            st = this.conn.prepareStatement("SELECT nome, datalancamento, categoria FROM filmes");
            rs = st.executeQuery();
            List<Filme> lista = new ArrayList<>();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setNome(rs.getString("nome"));
                filme.setData(rs.getString("datalancamento"));
                filme.setCategoria(rs.getString("categoria"));
                lista.add(filme);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }

    }

}
