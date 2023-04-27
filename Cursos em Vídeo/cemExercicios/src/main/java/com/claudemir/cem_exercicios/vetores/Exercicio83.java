package com.claudemir.cem_exercicios.vetores;

import java.util.Random;

/**
 * @author Claudemir
 */
public class Exercicio83 {

    public static void main(String[] args) {
        Random rand = new Random();
        int vetor[] = new int[10];
        int aux;

        //VETOR ORIGINAL, DESORDENADO
        System.out.print("===== LISTA DESORDENADA =====\n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(0, 99);
            System.out.print("[" + vetor[i] + "] ");
        }

        //VETOR ORDENADO
        System.out.print("\n===== LISTA ORDENADA =====\n");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for (int o = 0; o < vetor.length; o++) {
            System.out.print("[" + vetor[o] + "] ");
        }
    }
}
