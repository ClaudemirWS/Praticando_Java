package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Random;

/**
 * @author Claudemir Souza
 */
public class Exercicio50 {

    public static void main(String[] args) {
        Random random = new Random();
        int sort, cont = 20, acimaCinco = 0, divisTres = 0;
        System.out.println("===== SORTEIO DE 20 NÚMEROS =====");
        while (cont > 0 - 1) {
            sort = random.nextInt(10);
            if (sort > 5) {
                acimaCinco += 1;
            }
            if (sort % 3 == 0) {
                divisTres += 1;
            }
            System.out.print(sort + " -> ");
            cont -= 1;
        }
        System.out.println("Acabou!");
        System.out.println(acimaCinco + " números são maiores do que 5.");
        System.out.println(divisTres + " números são divisíveis por 3.");
    }
}
