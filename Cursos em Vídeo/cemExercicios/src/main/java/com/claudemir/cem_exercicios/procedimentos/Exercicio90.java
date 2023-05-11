package com.claudemir.cem_exercicios.procedimentos;

import java.util.Scanner;

/**
 *
 * @author Claudemir
 */
public class Exercicio90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º valor: ");
        int n2 = sc.nextInt();
        somador(n1, n2);

    }

    public static void somador(int n1, int n2) {
        int soma = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + soma);
    }
}
