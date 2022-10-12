package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio38 {

    public static void main(String[] args) {
        int cont = 6;
        do {
            if (cont < 12) {
                System.out.print(cont + " -> ");
            } else {
                System.out.print("Acabou!");
            }
            cont += 1;
        } while (cont < 13);
    }
}
