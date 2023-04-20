package com.claudemir.cem_exercicios.vetores;

import java.util.Random;

/**
 * @author Claudemir
 */
public class Exercicio76 {

    public static void main(String[] args) {
        //ADICIONA NÚMEROS ALEATÓRIOS AO VETOR
        Random rand = new Random();
        int n = 0, vetor[] = new int[7];
        for (int i = 0; i <= 6; i++) {
            n = rand.nextInt(10);
            vetor[i] = n;
            System.out.print("[" + vetor[i] + "] ");
        }
    }

}
