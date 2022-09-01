package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dist;
        System.out.println("===== CONVERTENDO DISTÂNCIAS =====");
        System.out.print("Digite uma distância em metros: ");
        dist = sc.nextDouble();
        System.out.println("A distância de " + dist + " corresponde a: \n"
                + (dist/1000) + " Km\n"
                + (dist/100) + " Hm\n"
                + (dist/10) + " Dam\n"
                + (dist*10) + " Dm\n"
                + (dist*100) + " Cm\n"
                + (dist*1000) + " Mm\n");
    }
}
