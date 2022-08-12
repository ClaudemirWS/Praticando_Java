package atividade3;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Funcionario {

    //VARIÁVEIS PRIVADAS, APENAS OS MÉTODOS TEM ACESSO E ALTERAM SEUS VALORES
    private String nome, cpf, endereco, telefone, setor, tipo;
    //APENAS CLASSES DERIVADAS OU QUE ESTEJAM NO MESMO PACOTE TERÃO ACESSO
    protected double salario;

    public Funcionario() {

    }

    //COLETA DADOS DO FUNCIONÁRIO
    public void dadosFuncionario() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        nome = sc.nextLine().strip();

        System.out.print("CPF do funcionário: ");
        cpf = sc.nextLine().strip();

        System.out.print("Endereço do funcionário: ");
        endereco = sc.nextLine().strip();

        System.out.print("Telefone do funcionário: ");
        telefone = sc.nextLine().strip();

        System.out.print("Setor do funcionário: ");
        setor = sc.nextLine().strip();

    }

    //IDENTIFICA SEU TIPO E RECEBE SEU SALÁRIO
    public void tipoFuncionario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite A(Assalariado) ou H(Horista): ");
        tipo = sc.nextLine().toUpperCase().strip();
        //ASSALARIADO OU HORISTA
        if (tipo.equals("A")) {
            Assalariado assalariado = new Assalariado();
            salario = assalariado.dadosSalario();
        } else if (tipo.equals("H")) {
            Horista horista = new Horista();
            salario = horista.dadosSalario();
        }
    }

    //CALCULA O REAJUSTE E APLICA AO SALÁRIO
    public void aplicaAumento(double salarioRecebido, double valor) {
        salario = salarioRecebido += valor;
    }

    //PRINTA OS DADOS
    public void mostraDados() {
        System.out.print(
        "\nNome: " + nome + 
        "\nCPF nº: " + cpf + 
        "\nEndereço: " + endereco + 
        "\nTelefone: " + telefone + 
        "\nSetor: " + setor + 
        "\nReceberá: R$ " + salario
        );
    }

}
