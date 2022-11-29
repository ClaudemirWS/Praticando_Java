package com.claudemir.cem_exercicios.sequencias_basicas;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura, altura, area;
        System.out.println("===== PINTANDO UMA PAREDE =====");
        System.out.print("Digite a largura da parede: ");
        largura = sc.nextDouble();
        System.out.print("Digite a altura da parede: ");
        altura = sc.nextDouble();
        area = largura * altura;
        System.out.println("A parede tem uma área de " + area + " m2.");
        System.out.println("Serão necessários " + (area/2) + " litros de tinta.");
    }
}
