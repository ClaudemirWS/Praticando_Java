package teste1poo;

/**
 * @author Claudemir Souza
 */
public class Funcionario {

    public String nome;
    public float salario;

    public void aplicaAumento(float valor) {
        salario = salario + valor;
    }
}
