package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, anos, sal;
        double novoSal;
        System.out.println("===== REAJUSTE DE SALÁRIO =====");
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite quantos anos você está na empresa: ");
        anos = sc.nextLine();
        System.out.print("Digite o seu salário: R$ ");
        sal = sc.nextLine();
        novoSal = Double.parseDouble(sal);
        if (Integer.parseInt(anos) <= 3) {
            novoSal += novoSal * 3 / 100;
        } else if (Integer.parseInt(anos) > 3 && Integer.parseInt(anos) <= 10) {
            novoSal += novoSal * 12.5 / 100;
        } else {
            novoSal += novoSal * 20 / 100;
        }
        System.out.println(nome + " seu novo salário será de R$ " + novoSal);
    }
}
