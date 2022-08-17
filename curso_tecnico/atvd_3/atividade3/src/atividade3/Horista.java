package atividade3;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Horista extends Funcionario {

    //VARIÁVEIS PRIVADAS, APENAS O MÉTODO TEM ACESSO E ALTERA SEUS VALORES
    private double valorHora, horasTrabalhadas, salario;

    //RECEBE E RETORNA OS DADOS DOS HORISTAS
    public double dadosSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto o funcionário ganha por hora: R$ ");
        valorHora = sc.nextDouble();
        System.out.print("Quantas horas o funcionário trabalhou: ");
        horasTrabalhadas = sc.nextDouble();
        salario = valorHora * horasTrabalhadas;

        return salario;
    }

}
