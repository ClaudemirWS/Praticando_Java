package etapa1;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Serie {

    //ATRIBUTOS DA SERIE
    private String nome, genero, streaming;

    //CONSTRUTOR
    public Serie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da serie: ");
        this.nome = sc.nextLine();
        System.out.print("Gênero da serie: ");
        this.genero = sc.nextLine();
        System.out.print("Plataforma de streaming: ");
        this.streaming = sc.nextLine();
    }

    //RECEBE O NOME
    public String getNome() {
        return nome;
    }

    //RECEBE O GÊNERO
    public String getGenero() {
        return genero;
    }

    //RECEBE O GÊNERO
    public String getSteaming() {
        return streaming;
    }

    //RETORNA UMA MENSAGEM DESCREVENDO A SERIE 
    public String getDescricao() {
        return ("Serie " + nome + " de " + genero + " está no(a) " + streaming + ".");
    }
}
