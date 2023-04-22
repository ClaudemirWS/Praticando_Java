package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio79 {

    public static void main(String[] args) {
        //VERIFICANDO PARES EM UMA LISTA
        int num, vetor[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //PREENCHENDO A LISTA
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            vetor[i] = num;
        }
        //MOSTRANDO OS NÚMEROS PARES E SUAS POSIÇÕES NA LISTA
        System.out.print("\n===== PARES E SUAS POSIÇÕES NA LISTA =====\n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("Número: " + vetor[i] + ", Posição na lista: [" + i + "]");
            }
        }
    }
}
