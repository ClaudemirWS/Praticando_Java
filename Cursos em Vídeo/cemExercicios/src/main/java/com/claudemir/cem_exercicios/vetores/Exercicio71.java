package com.claudemir.cem_exercicios.vetores;

/**
 * @author Claudemir
 */
public class Exercicio71 {
    public static void main(String[] args) {
        int vetor[] = new int [8];
       
        //PREENCHENDO VETOR DE 8 POSIÇÕES
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = 999;
            System.out.print("["+vetor[i]+"] ");
        }      
    }
}
