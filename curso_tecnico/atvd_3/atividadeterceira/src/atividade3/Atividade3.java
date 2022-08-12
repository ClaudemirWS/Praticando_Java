package atividade3;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumento; //RECEBERÁ DO USUÁRIO O VALOR DO AUMENTO

        //FAZ O CADASTRO DE 10 FUNCIONÁRIOS
        Funcionario funcionario[] = new Funcionario[9];
        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i] = new Funcionario();
            funcionario[i].dadosFuncionario();
            funcionario[i].tipoFuncionario();
            System.out.println("");
        }

        //LISTA OS FUNCIONÁRIOS
        System.out.println(" ===== DADOS DE FUNCIONÁRIOS =====");
        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i].mostraDados();
            System.out.println("");
        }

        System.out.println("");
        //AJUSTA SALÁRIOS
        System.out.println(" ===== AUMENTO DE SALÁRIO =====");
        System.out.print("Digite em Reais o valor do aumento: R$ ");
        aumento = sc.nextDouble();
        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i].aplicaAumento(funcionario[i].salario, aumento);
        }

        System.out.println("");
        //LISTA OS FUNCIONÁRIOS COM O AJUSTE
        System.out.println(" ===== DADOS COM REAJUSTE SALARIAL =====");
        for (int i = 0; i < funcionario.length; i++) {
            funcionario[i].mostraDados();
            System.out.println("");
        }
    }

}
