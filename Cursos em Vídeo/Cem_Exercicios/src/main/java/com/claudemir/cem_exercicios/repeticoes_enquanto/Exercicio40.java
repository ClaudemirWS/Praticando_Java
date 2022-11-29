package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio40 {

    public static void main(String[] args) {
        int cont = 0;
        do {
            if (cont < 21) {
                System.out.print(cont + " -> ");
            } else {
                System.out.print("Acabou!");
            }
            cont += 3;
        } while (cont < 24);
    }
}
