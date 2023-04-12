package com.claudemir.cem_exercicios.repeticao_para;

/**
 * @author Claudemir
 */
public class Exercicio70 {

    public static void main(String[] args) {
        int n = 1, nAnt = 0;
        for (int i = 0; i <= 21; i++) {
            System.out.print(n + " -> ");
            n = n + i;
            i = n;
        }
        System.out.print("Acabou!");
    }
}
