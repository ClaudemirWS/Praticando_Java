package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vel, multa;
        System.out.println("===== SISTEMA DE MULTAS =====");
        System.out.print("Qual a velocidade do carro: ");
        vel = sc.nextFloat();
        if (vel >= 80) {
            multa = vel*5;
            System.out.println("Carro multado, valor da multa R$ " + multa);
        } else {
            System.out.println("Não foi multado.");
        }
    }

}
