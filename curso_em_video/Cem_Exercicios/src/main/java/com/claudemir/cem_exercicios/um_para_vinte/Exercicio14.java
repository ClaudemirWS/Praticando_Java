package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kmPercorr, dias, valor = 0;
        System.out.println("===== LOCADORA DE CARROS =====");
        System.out.print("Digite quantos KM o carro percorreu: ");
        kmPercorr = sc.nextFloat();
        System.out.print("Digite quantos dias o carro foi utilizado: ");
        dias = sc.nextFloat();
        valor += kmPercorr * 0.20;
        valor += dias * 90;
        System.out.println("O aluguel custou R$ " + valor);
    }
}
