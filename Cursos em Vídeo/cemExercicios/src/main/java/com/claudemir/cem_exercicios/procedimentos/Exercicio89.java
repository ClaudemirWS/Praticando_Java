package com.claudemir.cem_exercicios.procedimentos;

/**
 * @author Claudemir
 */
public class Exercicio89 {

    public static void main(String[] args) {
        gerador("Praticando Java", 4, 2);
    }

    public static void gerador(String texto, int qtd, int des) {
        String borda = "";
        String b1 = "+-------------------------------+";
        String b2 = "#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#";
        String b3 = "$_______________________________$";

        if (des == 1) {
            borda = b1;
        } else if (des == 2) {
            borda = b2;
        } else if (des == 3) {
            borda = b3;
        }

        System.out.println(borda);
        for (int i = 0; i < qtd; i++) {
            System.out.println("\t" + texto);
        }
        System.out.println(borda);
    }
}
