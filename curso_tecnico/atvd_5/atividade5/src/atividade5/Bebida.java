package atividade5;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Bebida {

    //ATRIBUTOS DA BEBIDA
    private String nome;
    private double quantidade, preco;

    //CONSTRUTOR
    public Bebida() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da nova bebida: ");
        this.nome = sc.nextLine();
        System.out.print("Quantidade (em ml): ");
        quantidade = sc.nextDouble();
        System.out.print("Preço da nova bebida: ");
        this.preco = sc.nextDouble();
    }

    //RETORNA UMA MENSAGEM DESCREVENDO A BEBIDA
    public String getDescricao() {
        return ("Bebida " + nome + " custa R$ " + preco + " e tem " + quantidade + " ml.");
    }

    //RETORNA O NOME DA BEBIDA
    public String getNome() {
        return nome;
    }

    //RETORNA O PREÇO DA BEBIDA
    public double getPreco() {
        return preco;
    }
}
