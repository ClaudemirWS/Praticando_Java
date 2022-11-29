package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String larg, comp, tipo = null;
        float area;
        System.out.println("===== CLASSIFICANDO UM TERRENO =====");
        System.out.print("Digite a largura do terreno: ");
        larg = sc.nextLine();
        System.out.print("Digite o comprimento do terreno: ");
        comp = sc.nextLine();
        area = Float.parseFloat(larg) * Float.parseFloat(comp);
        if (area < 100) {
            tipo = "TERRENO POPULAR.";
        } else if (area >= 100 && area <= 500) {
            tipo = "TERRENO MASTER.";
        } else if (area > 500) {
            tipo = "TERRENO VIP.";
        }
        System.out.println("O terreno tem uma área de " + area + " m². Classificado como: " + tipo);
    }
}
