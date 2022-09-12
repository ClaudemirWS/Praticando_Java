package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        System.out.println("===== CRIANDO UM TRIÂNGULO =====");
        System.out.print("Digite o 1º ângulo: ");
        x = sc.nextDouble();
        System.out.print("Digite o 2º ângulo: ");
        y = sc.nextDouble();
        System.out.print("Digite o 3º ângulo: ");
        z = sc.nextDouble();
        if (x < y + z && y < x + z && z < x + y)
        {
            System.out.println("É possível criar um triângulo.");
        }
        else{
            System.out.println("Não é possível criar um triângulo.");
        }
    }
}
