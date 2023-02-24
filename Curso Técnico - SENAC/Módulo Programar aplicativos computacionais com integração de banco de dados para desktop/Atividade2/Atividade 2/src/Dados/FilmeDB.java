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
        this.conn = conectar();
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

    public boolean excluir(String id) {
        try {
            st = conn.prepareStatement("DELETE FROM filmes WHERE id = ?");
            st.setString(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Filme filme) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? where id = ?");
            st.setString(1, filme.getNome());
            st.setString(2, filme.getData());
            st.setString(3, filme.getCategoria());
            st.setString(4, filme.getId());
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
            st = this.conn.prepareStatement("SELECT id, nome, datalancamento, categoria FROM filmes");
            rs = st.executeQuery();
            List<Filme> lista = new ArrayList<>();
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getString("id"));
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

    public Filme getFilme(String id) {

        try {
            st = this.conn.prepareStatement("SELECT id, nome, datalancamento, categoria FROM filmes WHERE id = ?",
                     ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //Passar o parâmetro da consulta
            st.setString(1, id);

            //Método para poder executar o SELECT.
            //Os resultados obtidos pela consulta serão armazenados na variavel ResultSet
            rs = st.executeQuery();
            rs.next();

            Filme filme = new Filme();

            rs.first(); //irá posicionar o ResultSet na primeira posição

            //Atribuir os dados do "rs" para dentro do objeto filme
            filme.setId(rs.getString("id"));
            filme.setNome(rs.getString("nome"));
            filme.setData(rs.getString("datalancamento"));
            filme.setCategoria(rs.getString("categoria"));

            //retornar o objeto filme
            return filme;

            //tratando o erro, caso ele ocorra
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }

}
