package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio47 {

    public static void main(String[] args) {
        int cont = 500, max = 0, soma = 0;
        System.out.println("===== SOMA DE 500 ATÉ 0 DE 50 EM 50 ====");
        while (cont > max - 1) {
            soma += cont;
            if (cont > max) {
            System.out.print(cont + " + ");
            }
            else {
                System.out.print(cont);
            }
            cont -= 50;            
        }
        System.out.println(" = " + soma);
    }
}
