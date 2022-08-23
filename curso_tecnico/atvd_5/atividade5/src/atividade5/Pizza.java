package atividade5;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Pizza {

    //ATRIBUTOS DA PIZZA
    private String nome, tipo, ingredientes;
    private double tamanho, preco;

    //CONSTRUTOR
    public Pizza() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da nova pizza: ");
        this.nome = sc.nextLine();
        System.out.print("Preço da pizza: ");
        this.preco = sc.nextDouble();
    }
    
    //RETORNA UMA MENSAGEM DESCREVENDO A PIZZA
    public String getDescricao()
    {
        return ("Pizza de " + nome + " custa R$ " + preco + ".");
    }
    
    //RETORNA O NOME DA PIZZA
    public String getNome()
    {
        return nome;
    }
    
    //RETORNA O PREÇO DA PIZZA
    public double getPreco()
    {
        return preco;
    }
}
