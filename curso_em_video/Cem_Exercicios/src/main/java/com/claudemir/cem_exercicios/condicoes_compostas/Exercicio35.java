package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipo, dias;
        float km, valor = 0;

        System.out.println("===== ALUGUEL DE CARROS =====");
        System.out.print("Qual o tipo de carro: 0 - Popular | 1 - Luxo: ");
        tipo = sc.nextInt();
        System.out.print("Dias que foi alugado: ");
        dias = sc.nextInt();
        System.out.print("Quantos KM's foram percorridos: ");
        km = sc.nextFloat();

        //CONDIÇÕES PARA O VALOR DO ALUGUEL
        if (tipo == 0) {
            valor = dias * 90;
            if (km <= 100) {
                valor += km * 0.20;
            } else if (km > 100) {
                valor += km * 0.10;
            }

        } else if (tipo == 1) {
            valor = dias * 150;
            if (km <= 200) {
                valor += km * 0.30;
            } else if (km > 200) {
                valor += km * 0.25;
            }
        } else {
            System.out.println("Tipo inválido.");
        }
        
        System.out.println("O carro foi alugado por " + dias + " dias."
        + " Rodou " + km + " KM's e seu aluguel custou R$ " + valor);
    }
}