
package com.claudemir.primeiroscomandos;

import java.util.Random;

public class VetoreMatriz {
    
    public static void main(String[] args) {
        
        //========== ARRAY UNIDIMENSIONAL ==========
        int [] numeros = new int [5]; //CRIA O ARRAY
        
        //USA UM LAÇO DE REPETIÇÃO PARA PREENCHER O ARRAY
        System.out.println("ARRAY UNIDIMENSIONAL: ");
        for (int i = 0; i <= 4; i++) {
            numeros[i] = (int) (Math.random() * 10);
            System.out.print("[" + numeros[i] + "]");
        }  
        
        //========== ARRAY BIDIMENSIONAL ==========
        int[][] numAleatorio = new int[3][4]; //3 LINHAS E 4 COLUNAS
        Random numeroRandom = new Random();

        //PREENCHE LINHAS E COLUNAS
        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                numAleatorio[i][j] = numeroRandom.nextInt(10); //NÚMERO ALEATÓRIO DE 0 A 10
            }
        }
        //PRINTA O ARRAY NA TELA
        System.out.print("\nARRAY BIDIMENSIONAL: \n");
        for (int i = 0; i < numAleatorio.length; i++) {
            for (int j = 0; j < numAleatorio[i].length; j++) {
                System.out.print("[" + numAleatorio[i][j] + "]");
            }
            System.out.println();       
        }
    }
    
}
