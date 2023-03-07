package etapa5.Dados;

import etapa5.Principal.Conteudo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Claudemir
 */
public class FilmeDAO extends ConexaoDAO {

    //Salva um filme
    public int salvarFilme(Conteudo conteudo) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO filmes(nome, genero, streaming) VALUES(?,?,?)");
            st.setString(1, conteudo.getNome());
            st.setString(2, conteudo.getGenero());
            st.setString(3, conteudo.getStreaming());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //Exclui um filme
    public boolean excluirFilme(String id) {
        try {
            st = conn.prepareStatement("DELETE FROM filmes WHERE id = ?");
            st.setString(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    //Atualiza os dados de um filme
    public int atualizarFilme(Conteudo conteudo) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE filmes SET nome = ?, genero = ?, streaming = ? WHERE id = ?");
            st.setString(1, conteudo.getNome());
            st.setString(2, conteudo.getGenero());
            st.setString(3, conteudo.getStreaming());
            st.setString(4, conteudo.getId());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }

    //Pega um conteudo especifico a partir do Id  e Tipo
    public Conteudo getFilme(String id) {

        try {
            st = this.conn.prepareStatement("SELECT id, nome, genero, streaming FROM filmes WHERE id = ?",
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //Passar o parâmetro da consulta
            st.setString(1, id);

            //Método para poder executar o SELECT.
            //Os resultados obtidos pela consulta serão armazenados na variavel ResultSet
            rs = st.executeQuery();
            rs.next();

            Conteudo conteudo = new Conteudo();

            rs.first(); //irá posicionar o ResultSet na primeira posição

            //Atribuir os dados do "rs" para dentro do objeto filme
            conteudo.setId(rs.getString("id"));
            conteudo.setNome(rs.getString("nome"));
            conteudo.setGenero(rs.getString("genero"));
            conteudo.setStreaming(rs.getString("streaming"));

            return conteudo;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }

    //Pega toda a lista de filmes
    public List<Conteudo> getFilmes() {
        try {
            st = conn.prepareStatement("SELECT id, nome, genero, streaming FROM filmes");
            rs = st.executeQuery();
            List<Conteudo> lista = new ArrayList<>();
            while (rs.next()) {
                Conteudo conteudo = new Conteudo();
                conteudo.setId(rs.getString("id"));
                conteudo.setNome(rs.getString("nome"));
                conteudo.setGenero(rs.getString("genero"));
                conteudo.setStreaming(rs.getString("streaming"));
                lista.add(conteudo);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }

    }

    //Pega a lista de filmes com base no streaming
    public List<Conteudo> getFilmeStreaming(String streaming) {

        try {
            st = this.conn.prepareStatement("SELECT id, nome, genero, streaming FROM filmes WHERE streaming LIKE ?");
            st.setString(1, "%" + streaming + "%");
            rs = st.executeQuery();
            List<Conteudo> lista = new ArrayList<>();
            while (rs.next()) {
                Conteudo conteudo = new Conteudo();
                conteudo.setId(rs.getString("id"));
                conteudo.setNome(rs.getString("nome"));
                conteudo.setGenero(rs.getString("genero"));
                conteudo.setStreaming(rs.getString("streaming"));
                lista.add(conteudo);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
}
