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
        System.out.print("Tipo (Doce/Salgada): ");
        this.tipo = sc.nextLine();
        System.out.print("Ingredientes: ");
        this.ingredientes = sc.nextLine();
        System.out.print("Tamanho (em cm): ");
        this.tamanho = sc.nextDouble();
        System.out.print("Preço: ");
        this.preco = sc.nextDouble();
    }

    //RETORNA UMA MENSAGEM DESCREVENDO A PIZZA
    public String getDescricao() {
        return ("Pizza de " + nome + " do tipo " + tipo + ", tamanho " + tamanho + " cm, preço: R$ " + preco 
                + "\n Ingredientes: " + ingredientes + "\n");
    }

    //RETORNA O NOME DA PIZZA
    public String getNome() {
        return nome;
    }

    //RETORNA O PREÇO DA PIZZA
    public double getPreco() {
        return preco;
    }
}
