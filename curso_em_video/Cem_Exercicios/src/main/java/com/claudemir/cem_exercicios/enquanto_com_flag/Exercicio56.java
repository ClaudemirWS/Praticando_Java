
package com.claudemir.cem_exercicios.enquanto_com_flag;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, soma = 0;
        System.out.println("===== SOMA DE MÚLTIPLOS NÚMEROS INTEIROS =====");
        while(num != 1111)
        {
            System.out.print("Digite um número inteiro ou 1111 para SAIR: ");
            num = sc.nextInt();
            soma += num;
        }
        System.out.println("A soma de todos os números é: " + (soma - 1111));
    }
}
