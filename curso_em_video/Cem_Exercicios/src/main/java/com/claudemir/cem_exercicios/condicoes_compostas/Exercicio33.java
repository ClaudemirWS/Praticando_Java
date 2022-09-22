package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorCasa, salComprador, anosPagamt, prestMensal, porcSalario = 0;
        System.out.println("===== EMPRÉSTIMO PARA COMPRA DE IMÓVEL =====");
        System.out.print("Digite o valor do imóvel: R$ ");
        valorCasa = sc.nextFloat();
        System.out.print("Digite o seu salário: R$ ");
        salComprador = sc.nextFloat();
        System.out.print("Digite em quantos anos pretende pagar: ");
        anosPagamt = sc.nextFloat();

        prestMensal = valorCasa / anosPagamt;
        porcSalario = (salComprador * 30) / 100;

        if (prestMensal > porcSalario) {
            System.out.println("Sua prestação mensal será de R$ " + prestMensal
                    + " , 30% do seu salário equivale a R$ " + porcSalario + ", Empréstimo NEGADO.");
        } else {
            System.out.println("Sua prestação mensal será de R$ " + prestMensal
                    + " , 30% do seu salário equivale a R$ " + porcSalario + ", Empréstimo APROVADO.");
        }

    }
}
