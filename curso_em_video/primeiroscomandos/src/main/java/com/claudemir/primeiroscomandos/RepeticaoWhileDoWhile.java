package com.claudemir.primeiroscomandos;

public class RepeticaoWhileDoWhile {
    public static void main(String[] args) {
        int i = 1;
        
        //REPETIÇÃO USANDO WHILE
        System.out.println("LAÇO WHILE: ");
        while(i <= 10)
        {
            System.out.println("\nEste é o número: " + i);
            i++;
        }
        
        //REPETIÇÃO USANDO DO-WHILE
        i = 1;
        System.out.println("\nLAÇO DO-WHILE: ");
        do 
        {
            System.out.println("\nNúmero: " + i);
            i++;
            
        } while (i <= 10);
    }
        
}
