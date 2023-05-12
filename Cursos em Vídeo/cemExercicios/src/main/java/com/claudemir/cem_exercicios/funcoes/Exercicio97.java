package com.claudemir.cem_exercicios.funcoes;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio97 {

    public static void main(String[] args) {
        System.out.println("O maior número digitado foi o " + maior());
    }

    public static Integer maior() {
        Scanner sc = new Scanner(System.in);
        int maior = 0, n;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o " + i + " número: ");
            n = sc.nextInt();
            if (maior == 0) {
                maior = n;
            } else if (n > maior) {
                maior = n;
            }
        }
        return maior;
    }
}
