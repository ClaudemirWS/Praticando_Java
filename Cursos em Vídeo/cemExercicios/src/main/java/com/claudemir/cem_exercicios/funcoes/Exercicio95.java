package com.claudemir.cem_exercicios.funcoes;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = sc.nextInt();

        System.out.println("A soma dos númeors é " + somador(n1, n2));
    }

    public static Integer somador(int n1, int n2) {
        return n1 + n2;
    }

}
