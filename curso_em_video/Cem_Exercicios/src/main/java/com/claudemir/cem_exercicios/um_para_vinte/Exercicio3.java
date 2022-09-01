package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, salario;
        System.out.println("===== LENDO NOME E SALÁRIO DE UM FUNCIONÁRIO =====");
        System.out.print("Nome do funcionário: ");
        nome = sc.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextLine();
        System.out.println("O salário atual do funcionário " + nome + " é R$ " + salario + ".");

    }

}
