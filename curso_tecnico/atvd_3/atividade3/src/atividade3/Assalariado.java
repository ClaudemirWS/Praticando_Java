package atividade3;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Assalariado extends Funcionario {

    //VARIÁVEL PRIVADA, APENAS O MÉTODO TEM ACESSO E ALTERA SEU VALOR
    private double salario;

    //RECEBE E RETORNA O VALOR DO SALÁRIO DO FUNCIONÁRIO
    public double dadosSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o salário do funcionário: R$ ");
        salario = sc.nextDouble();

        return salario;
    }

}
