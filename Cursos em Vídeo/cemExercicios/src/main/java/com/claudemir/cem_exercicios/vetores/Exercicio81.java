package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio81 {

    public static void main(String[] args) {
        int idade, media = 0, maior = 0;
        int vetor[] = new int[8]; //DEFINE TAMANHO DO VETOR
        Scanner sc = new Scanner(System.in);

        //PREENCHE VETOR E ORGANIZA CENÁRIO
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Idade da " + (i + 1) + "º pessoa: ");
            idade = sc.nextInt();
            vetor[i] = idade;
            //ADICIONA VALORES A SOMA DA MÉDIA
            media += vetor[i];
            //GUARDA A MAIOR IDADE RECEBIDA NO VETOR
            if (i == 0) {
                maior = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("===== RESULTADOS =====");
        System.out.println("A média de idade entre todos foi de " + media / vetor.length + " anos.");

        //FAZ BUSCAS NO VETOR
        System.out.print("Pessoas com mais de 25 anos nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 25) {
                System.out.print("[" + i + "]");
            }
        }
        System.out.print("\nA maior idade digitada foi: " + maior + ", nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maior) {
                System.out.print("[" + i + "]");
            }
        }
    }
}
