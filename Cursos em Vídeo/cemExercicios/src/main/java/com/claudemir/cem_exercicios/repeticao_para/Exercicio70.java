package com.claudemir.cem_exercicios.repeticao_para;

/**
 * @author Claudemir
 */
public class Exercicio70 {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(n1 + " -> ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Acabou!");
    }
}
