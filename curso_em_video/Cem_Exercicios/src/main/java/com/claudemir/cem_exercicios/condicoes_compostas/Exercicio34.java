package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, altura, imc;
        String categoria;
        System.out.println("===== CÁLCULO DE IMC =====");
        System.out.print("Digite seu peso: ");
        peso = sc.nextFloat();
        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            categoria = "abaixo do peso.";
        } else if (imc > 18.5 && imc < 25) {
            categoria = "no seu peso ideal.";
        } else if (imc > 20 && imc < 30) {
            categoria = "com sobrepeso.";
        } else if (imc > 30 && imc < 40) {
            categoria = "em estado de obesidade.";
        } else {
            categoria = "em estado de obesidade mórbida.";
        }

        System.out.println("Seu IMC é de " + imc + " você está " + categoria);
    }
}
