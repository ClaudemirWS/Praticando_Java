package com.claudemir.cem_exercicios.funcoes;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio98 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite de onde a soma irá iniciar: ");
        int ini = sc.nextInt();
        System.out.print("Digite até onde será somado: ");
        int fim = sc.nextInt();
        System.out.println(somador(ini, fim));
    }

    public static Integer somador(int ini, int fim) {
        int soma = 0;
        for (int i = ini; i <= fim; i++) {
            soma += i;
            if (i < fim) {
                System.out.print(i + " + ");
            } else if (i == fim) {
                System.out.print(i + " = ");
            }
        }
        return soma;
    }

}
