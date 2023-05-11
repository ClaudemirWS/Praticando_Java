package com.claudemir.cem_exercicios.procedimentos;

/**
 * @author Claudemir
 */
public class Exercicio88 {

    public static void main(String[] args) {
        gerador("Praticando Java", 4);
    }

    public static void gerador(String texto, int qtd) {
        System.out.println("+-------------------------------+");
        for (int i = 0; i < qtd; i++) {
            System.out.println("\t"+texto);
        }
        System.out.println("+-------------------------------+");
    }
}
