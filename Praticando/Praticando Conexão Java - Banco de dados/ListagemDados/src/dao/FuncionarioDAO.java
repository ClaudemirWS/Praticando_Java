package dao;

import beans.Empresa;
import beans.Funcionario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Claudemir
 */
public class FuncionarioDAO {

    private Conexao conexao;
    private Connection conn;

    public FuncionarioDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Funcionario funcionario) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sql = "INSERT INTO funcionario(nomefunc, empresaid, admissao) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNomefunc());
            stmt.setInt(2, funcionario.getEmpresaid().getId());
            stmt.setString(3, sdf.format(funcionario.getDataAdmissao()));
            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro ao inserir funcionario: " + e.getMessage());
        }

    }

    public void editar(Funcionario funcionario) {
        //string sql com o código de update para o banco de dados
        String sql = "UPDATE funcionario SET nomefunc=?, empresaid=? WHERE id=?";
        try {
            //esse trecho é igual ao método inserir
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //Setando os parâmetros
            stmt.setString(1, funcionario.getNomefunc());
            stmt.setInt(2, funcionario.getEmpresaid().getId());
            stmt.setInt(3, funcionario.getId());
            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao editar funcionario: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        //string sql com o código de exclusão para o banco de dados
        String sql = "DELETE FROM funcionario WHERE id = ?";
        try {
            //esse trecho é igual ao método editar e inserir
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);

            //Executando a query
            stmt.execute();
            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("Erro ao excluir funcionario: " + e.getMessage());
        }

    }

    public Funcionario getFuncionario(int id) {

        //código responsavel por buscar o funcionário dentro do banco de dados
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //PreparedStatement stmt = this.conn.prepareStatement(sql);
            //Passar o parâmetro da consulta
            stmt.setInt(1, id);

            //Método para poder executar o SELECT.
            //Os resultados obtidos pela consulta serão armazenados na variavel ResultSet
            //Faça a importação da classe import java.sql.ResultSet;
            ResultSet rs = stmt.executeQuery();
            rs.next();

            //Criar um objeto do tipo empresa, que irá pegar os dados do rs(ResultSet) e armazenar na variavel
            Funcionario funcionario = new Funcionario();

            rs.first(); //irá posicionar o ResultSet na primeira posição

            //Atribuir os dados do "rs" para dentro do objeto funcionario
            //Iremos definir o que cada atributo irá mostrar, vinculando com a sua respectiva coluna no banco de dados
            funcionario.setId(id);
            funcionario.setNomefunc(rs.getString("nomefunc"));
            Empresa empresaid = new Empresa();
            empresaid.setId(rs.getInt("empresaid"));
            funcionario.setEmpresaid(empresaid);
            funcionario.setDataAdmissao(rs.getDate("admissao"));

            //retornar o objeto funcionario, pois o método pede esse retorno
            return funcionario;

            //tratando o erro, caso ele ocorra
        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
            return null;
        }
    }

    public List<Funcionario> getFuncionarios() {
        String sql = "SELECT funcionario.id as id, nomefunc, empresaid, nomeempresa, admissao FROM funcionario "
                + "INNER JOIN empresa ON funcionario.empresaid = empresa.id";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Funcionario> lista = new ArrayList<>();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                Empresa empresa = new Empresa();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNomefunc(rs.getString("nomefunc"));
                funcionario.setDataAdmissao(rs.getDate("admissao"));
                empresa.setId(rs.getInt("empresaid"));
                empresa.setNomeempresa(rs.getString("nomeempresa"));
                funcionario.setEmpresaid(empresa);

                lista.add(funcionario);

            }
            return lista;
        } catch (Exception e) {
            return null;
        }

    }

}
