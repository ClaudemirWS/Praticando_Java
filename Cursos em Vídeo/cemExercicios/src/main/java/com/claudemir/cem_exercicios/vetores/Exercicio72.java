package com.claudemir.cem_exercicios.vetores;

/**
 * @author Claudemir
 */
public class Exercicio72 {

    public static void main(String[] args) {
        int vetor[] = new int[10], n = 0;
        for (int i = 0; i < vetor.length; i++) {
            n += 5;
            vetor[i] = n;
            System.out.print("["+vetor[i]+"] ");
        }
    }
}
