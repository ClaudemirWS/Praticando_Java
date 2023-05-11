package com.claudemir.cem_exercicios.procedimentos;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio94 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos termos da sequência de fibonacci deseja ver: ");
        int valor = sc.nextInt();
        fibonacci(valor);
    }

    public static void fibonacci(int valor) {
        int n1 = 0, n2 = 1;
        for (int i = 0; i < valor; i++) {
            System.out.print(n1 + " -> ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Acabou!");
    }
}
