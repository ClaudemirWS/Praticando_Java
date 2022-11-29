package problema;

/**
 * @author Claudemir Souza
 */
abstract class Exercicios {

    private String nome;

    public Exercicios(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }
}
