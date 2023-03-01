package br.com.control;

import br.com.banco.DaoSelect;
import br.com.model.DadosPessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */

//Classe com funções prontas que podem ser utilizadas
public class Funcoes {

    //Busta todas as pessoas e adiciona em uma lista
    public void buscaPessoa() {
        DaoSelect daoSelect = new DaoSelect();
        daoSelect.conect();
        ResultSet rs = daoSelect.selectPessoa();

        List<DadosPessoa> listPessoa = new ArrayList<>();

        try {
            while (rs.next()) {
                DadosPessoa dadosPessoa = new DadosPessoa();
                dadosPessoa.setCpf(rs.getString("CPF"));
                dadosPessoa.setId(rs.getInt("ID_PESSOA"));
                dadosPessoa.setIdade(rs.getInt("IDADE"));
                dadosPessoa.setNome(rs.getString("NOME"));
                dadosPessoa.setPeso(rs.getDouble("PESO"));
                dadosPessoa.setTelefone(rs.getString("TELEFONE"));
                listPessoa.add(dadosPessoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        daoSelect.desconect();

        System.out.println("Tamanho da lista: " + listPessoa.size());
    }

    //Insere os dados de uma nova pessoa
    public void inserePessoa() {
        DaoSelect daoSelect = new DaoSelect();
        daoSelect.conect();

        DadosPessoa dadosPessoa = new DadosPessoa();
        dadosPessoa.setCpf("12345678911");
        dadosPessoa.setIdade(11);
        dadosPessoa.setNome("teste");
        dadosPessoa.setPeso(10.0);
        dadosPessoa.setTelefone("12345678910");

        daoSelect.insertPessoa(dadosPessoa);

        daoSelect.desconect();
    }
}
