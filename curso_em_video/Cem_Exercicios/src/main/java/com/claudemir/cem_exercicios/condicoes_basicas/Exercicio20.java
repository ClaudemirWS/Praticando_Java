package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== PAR OU IMPAR =====");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
    }

}
