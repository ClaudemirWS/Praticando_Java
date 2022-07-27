package com.claudemir.primeiroscomandos;

import java.util.Scanner;

public class ClasseScanner {
    
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        
        //DECLARANDO NOVO SCANNER
        Scanner entrada = new Scanner (System.in);
        
        //RECEBENDO DADOS NO SCANNER
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Digite a sua altura (Forneça a mesma usando o separador ,): ");
        altura = entrada.nextFloat();
        entrada.close(); //FECHANDO O BUFFER DE ENTRADA
        
        //RESULTADO
        System.out.println("\n--MOSTRANDO OS DADOS--");
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua Altura: " + altura);
    }
    
}
