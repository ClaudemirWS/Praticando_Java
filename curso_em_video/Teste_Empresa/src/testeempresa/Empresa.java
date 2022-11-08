package testeempresa;

/**
 * @author Claudemir Souza
 */
public class Empresa {

    String nome;
    String cnpj;
    Funcionario gerente;
    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        funcionarios = new Funcionario[numeroFuncionarios];
        this.nome = nome;
        this.cnpj = cnpj;
    }

}
