package com.claudemir.cem_exercicios.vetores;

/**
 * @author Claudemir
 */
public class Exercicio75 {

    public static void main(String[] args) {
        //FIBONACCI NO VETOR
        int n1 = 1, n2 = 1, n3 = 0;
        int vetor[] = new int[16];
        for (int i = 0; i <= 15; i++) {
            vetor[i] = n1;
            System.out.print("["+vetor[i]+"] ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
