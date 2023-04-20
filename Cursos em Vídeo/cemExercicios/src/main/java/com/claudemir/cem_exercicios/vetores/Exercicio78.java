package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio78 {

    public static void main(String[] args) {
        //VAMOS RECEBER VALORES E MOSTRAR OS MÚLTIPLOS DE 10
        int num, vetor[] = new int[15];
        Scanner sc = new Scanner(System.in);
        //LENDO VALORES
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            vetor[i] = num;
        }
        //VAMOS MOSTRAR OS NÚMEROS
        System.out.print("\n===== VALORES RECEBIDOS =====\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "] ");
        }
        //VAMOS MOSTRAR OS MÚLTIPLOS DE 10
        System.out.print("\n===== POSIÇÃO DOS MÚLTIPLOS DE 10 =====\n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 10 == 0) {
                System.out.print("["+i+"] ");
            }
        }
    }

}
