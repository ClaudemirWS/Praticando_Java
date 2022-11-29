package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio46 {

    public static void main(String[] args) {
        int cont = 6, max = 100, soma = 0;
        System.out.println("===== SOMA DE 6 ATÉ 100 DE 2 EM 2 ====");
        while (cont < max + 1) {
            soma += cont;
            if (cont < max) {
            System.out.print(cont + " + ");
            }
            else {
                System.out.print(cont);
            }
            cont += 2;            
        }
        System.out.println(" = " + soma);
    }
}
