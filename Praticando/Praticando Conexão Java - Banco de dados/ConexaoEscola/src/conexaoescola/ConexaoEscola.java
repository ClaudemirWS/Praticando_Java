package conexaoescola;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author Claudemir
 */
public class ConexaoEscola {

    public static void main(String[] args) {
        //CARREGA O DRIVER JDBC
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC carregado");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Driver JDBC nao encontrado : "
                    + cnfe.getMessage());
        }
        //ESTABELECE CONEXÃO COM BANCO
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola", "root", "admin");
            System.out.println("Conexao com o banco de dados estabelecida.");
        } catch (SQLException sqle) {
            System.out.println("Erro na conexao ao Bando de Dados : "
                    + sqle.getMessage());
        }
        //PREPARA PARA COMANDOS SQL
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            System.out.println("Pronto para execucao de comandos sql.");
        } catch (SQLException sqle) {
            System.out.println("Erro no acesso ao Bando de Dados : "
                    + sqle.getMessage());
        }

        //INSERE INFORMAÇÕES NO BANCO
        /*try {
            String sql = null;

            sql = "insert into alunos (nome, idade, endereco) values ('Ana','23','Rua 7 de setembro 826')";
            stmt.executeUpdate(sql);
            System.out.println("Dados inseridos.");
        } catch (SQLException sqle) {
            System.out.println("Erro inserindo : " + sqle.getMessage());
        }*/
        //DELETA INFORMAÇÕES NO BANCO
        /*try {
            String sql = null;
            sql = "delete from alunos where id =1";
            stmt.executeUpdate(sql);
            System.out.println("Dados removidos.");
        } catch (SQLException sqle) {
            System.out.println("Erro remocao : " + sqle.getMessage());
        }*/
        //ATUALIZA INFORMAÇÕES NO BANCO
        /*try {
            String sql = null;
            sql = "update alunos set idade = '58' where id =1";
            stmt.executeUpdate(sql);
            System.out.println("Dados atualizados.");
        } catch (SQLException sqle) {
            System.out.println("Erro atualizacao : "
                    + sqle.getMessage());
        }*/
        //CONSULTANDO DADOS
        /*try {
            String sql = "select id,nome,idade,endereco from alunos";

            //Executando o comando select 
            ResultSet rs = stmt.executeQuery(sql);

            // Exibindo os resultados 
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String endereco = rs.getString("endereco");

                System.out.println("dados da tabela autor do banco de dados");
                System.out.println("--------------------------");
                System.out.println(id + " - " + nome + " - " + idade + " - " + endereco);
            }
        } catch (SQLException sqle) {
            System.out.println("Erro efetuando consulta : " + sqle.getMessage());
        }
        //SEMPRE FECHE CONEXÃO APÓS QUALQUER MODIFICAÇÃO NO BANCO DE DADOS
        //FECHA CONEXÃO
        try {
            con.close();
            System.out.println("Conexão com o banco de dados fechada");
        } catch (SQLException sqle) {
            System.out.println("Erro no fechamento da conexão : " + sqle.getMessage());
        }*/
        //INSERINDO DADOS PELO TECLADO
        /*int idBusca, idadeNova;
        Scanner IdFunc = new Scanner(System.in);
        System.out.println("Informe o id que será atualizado");
        idBusca = IdFunc.nextInt();

        System.out.println("Informe a nova idade");
        idadeNova = IdFunc.nextInt();

        try {
            String sql = null;
            sql = "update alunos set idade = " + idadeNova + " where id =" + idBusca;
            stmt.executeUpdate(sql);
            System.out.println("Dados atualizados.");
        } catch (SQLException sqle) {
            System.out.println("Erro atualizacao : " + sqle.getMessage());
        }*/
        //DELETANDO DADOS PELO TECLADO
        /*int idBusca;
        Scanner IdFunc = new Scanner(System.in);

        System.out.println("Informe o id da linha a ser excluída");
        idBusca = IdFunc.nextInt();

        try {
            String sql = null;
            sql = "delete from alunos where id =" + idBusca;
            stmt.executeUpdate(sql);
            System.out.println("Dados removidos.");
        } catch (SQLException sqle) {
            System.out.println("Erro remocao : " + sqle.getMessage());
        }*/
    }

}
