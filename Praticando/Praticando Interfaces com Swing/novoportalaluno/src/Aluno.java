/**
 *
 * @author Claudemir
 */
public class Aluno {

    /*
    * Definição e encapsulamento dos atributos da classe.
    * Representam as características de um aluno. Geralmente
    * são encapsuladas como private.
    */
    
    private String nome;
    private String email;
    private int idade;
    
    /*
    * Abaixo estão os métodos acessores e modificadores.
    * Os setters servem para atribuir valores aos atributos privados
    * Os getters servem para pegar os valores dos atributos privados
    */

    /**
      * @return the nome
      */
    public String getNome() {
        return nome;
    }

    /**
      * @param nome the nome to set
      */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
      * @return the email
      */
    public String getEmail() {
        return email;
    }

    /**
      * @param email the email to set
      */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
      * @return the idade
      */
    public int getIdade() {
        return idade;
    }

    /**
      * @param idade the idade to set
      */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
  }
