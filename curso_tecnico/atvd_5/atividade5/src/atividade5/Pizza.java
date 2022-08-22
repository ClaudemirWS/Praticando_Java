package atividade5;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Pizza {
    
    private String nome, tipo, ingredientes;
    private double tamanho, preco;
    
    public Pizza()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da nova pizza: ");
        this.nome = sc.nextLine();
    }
    
    public String getPizza()
    {
        return nome;
    }
    
}
