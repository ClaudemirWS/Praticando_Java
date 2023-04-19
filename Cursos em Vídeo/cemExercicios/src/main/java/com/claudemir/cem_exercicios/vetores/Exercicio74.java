package com.claudemir.cem_exercicios.vetores;

/**
 * @author Claudemir
 */
public class Exercicio74 {

    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                vetor[i] = 5;
            } else if (vetor[i - 1] == 3) {
                vetor[i] = 5;
            } else if (vetor[i - 1] == 5) {
                vetor[i] = 3;
            }

            System.out.print("[" + vetor[i] + "] ");
        }
    }
}
