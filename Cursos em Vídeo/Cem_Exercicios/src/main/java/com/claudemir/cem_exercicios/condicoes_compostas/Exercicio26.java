package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, maior;
        System.out.println("===== MAIOR OU MENOR =====");
        System.out.print("Digite um número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        num2 = sc.nextInt();
        maior = num1;
        if (num2 > maior)
        {
            maior = num2;
            System.out.println("O " + num2 + " é o maior número.");
        }
        else if (num2 == maior)
        {
            System.out.println("Os dois números são iguais.");
        }
        else
        {
            System.out.println("O " + num1 + " é o maior número.");
        }
    }
}
