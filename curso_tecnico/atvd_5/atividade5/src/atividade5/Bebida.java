package atividade5;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Bebida {

    private String nome;
    private double quantidade, preco;

    public Bebida() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da nova bebida: ");
        this.nome = sc.nextLine();
    }
    
    public String getBebida()
    {
        return nome;
    }
    
}
