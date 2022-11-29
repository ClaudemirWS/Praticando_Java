package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio41 {

    public static void main(String[] args) {
        int cont = 100;
        while (cont > -1) {
            System.out.print(cont + " -> ");
            if (cont == 0) {
                System.out.print("Acabou!");
            }
            cont -= 5;
        }
    }
}
