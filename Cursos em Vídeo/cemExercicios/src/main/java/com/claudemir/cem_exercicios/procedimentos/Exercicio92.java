package com.claudemir.cem_exercicios.procedimentos;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio92 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        ParouImpar(n);
    }

    public static void ParouImpar(int n) {
        if (n % 2 == 0) {
            System.out.print("O número é PAR.");
        } else {
            System.out.print("O número é ÍMPAR.");
        }
    }
}
