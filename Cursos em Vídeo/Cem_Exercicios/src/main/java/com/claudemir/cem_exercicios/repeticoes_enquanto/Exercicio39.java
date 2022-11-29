package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio39 {

    public static void main(String[] args) {
        int cont = 10;
        do {
            if (cont > 2) {
                System.out.print(cont + " -> ");
            } else {
                System.out.print("Acabou!");
            }
            cont -= 1;
        } while (cont > 1);
    }
}
