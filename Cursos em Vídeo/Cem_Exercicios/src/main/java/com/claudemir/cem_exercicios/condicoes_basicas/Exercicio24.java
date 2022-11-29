package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, res;
        System.out.println("===== CALCULO DE VIAGEM =====");
        System.out.print("Quantos KM você deseja percorrer: ");
        km = sc.nextDouble();
        if (km <= 200)
        {
            res = km * 0.50;
            System.out.println("Você irá percorrer menos que 200Km, valor R$ " + res);
        }
        else
        {
            res = km * 0.45;
            System.out.println("Você irá percorrer mais que 200Km, valor R$ " + res);
        }
        
    }
    
}
