package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio54 {

    public static void main(String[] args) {
        int cont = 1, idade, mais90 = 0, menos160 = 0, mais100 = 0, media = 0;
        float peso, altura;
        while (cont != 3) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a altura da " + cont + "ª pessoa: ");
            altura = sc.nextFloat();
            System.out.print("Digite o peso da " + cont + "ª pessoa: ");
            peso = sc.nextFloat();

            //CONDICOES
            if (peso > 90) {
                mais90 += 1;
            }
            if (peso < 50) {
                if (altura < 1.60) {
                    menos160 += 1;
                }
            }
            if (altura > 1.90) {
                if (peso > 100) {
                    mais100 += 1;
                }
            }
            media += altura;
            cont += 1;
        }
        media = media / cont;
        System.out.println("\nA média entre todas as alturas foi de: " + media);
        System.out.println(mais90 + " pessoas pesam mais de 90kg.");
        System.out.println(menos160 + " pessoas pesam menos de 50kg e tem altura inferior a 1.60m.");
        System.out.println(mais100 + " pessoas medem mais de 1.90m e tem peso superior a 100kg.");
    }
}
