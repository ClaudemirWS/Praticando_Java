package br.com.banco;

import br.com.model.DadosPessoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */

//Classe responsável por realizar o data acess object e criar funções CRUD
public class DaoSelect {

    private ConexaoMySql conexao;
    private Statement stm;
    private Connection con;
    private ResultSet rs;

    //Conecta ao banco de dados
    public void conect() {
        try {
            conexao = new ConexaoMySql();
            con = conexao.getConnection();
            stm = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    //Desconecta do banco de dados
    public void desconect() {
        try {
            stm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    //Seleciona uma pessoa no banco de dados
    public ResultSet selectPessoa() {
        try {
            return stm.executeQuery("SELECT * FROM PESSOA");
        } catch (SQLException ex) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

    //Insere uma nova pessoa no banco de dados
    public void insertPessoa(DadosPessoa d) {
        try {
            stm.execute("INSERT INTO PESSOA (NOME, TELEFONE, IDADE, PESO, CPF) VALUES ('" + d.getNome() + "', '" + d.getTelefone() + "', " + d.getIdade() + ", " + d.getPeso() + ", '" + d.getCpf() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
