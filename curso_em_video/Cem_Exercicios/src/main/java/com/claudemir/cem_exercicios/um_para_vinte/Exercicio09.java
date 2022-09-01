package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("===== QUANTOS DÓLARES VOCÊ PODE COMPRAR =====");
        System.out.print("Digite um valor em R$: ");
        valor = sc.nextDouble();
        System.out.println("Você pode comprar " + (valor/3.45) + " dólares.");
    }

}
