package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sal, salAumento;
        System.out.println("===== AUMENTO DE SALÁRIO =====");
        System.out.print("Digite o seu salário atual: R$ ");
        sal = sc.nextFloat();
        salAumento = sal + (sal*15/100);
        System.out.println("Seu salário passou de R$ " + sal +
                " para R$ "  + salAumento);
    }
}
