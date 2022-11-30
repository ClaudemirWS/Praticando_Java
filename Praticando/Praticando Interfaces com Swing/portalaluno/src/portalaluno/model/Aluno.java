package portalaluno.model;

/**
 * @author Claudemir
 */
public class Aluno {

    // Declaração de variáveis
    private String nome;
    private String email;
    private String curso;

    // Métodos para acessar e atualizar dados das variáveis
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
