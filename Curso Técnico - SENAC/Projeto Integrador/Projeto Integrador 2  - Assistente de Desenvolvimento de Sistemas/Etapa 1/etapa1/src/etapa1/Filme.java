package etapa1;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Filme {

    //ATRIBUTOS DO FILME
    private String nome, genero, streaming;

    //CONSTRUTOR
    public Filme() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do filme: ");
        this.nome = sc.nextLine().strip();
        System.out.print("Gênero do filme: ");
        this.genero = sc.nextLine().strip();
        System.out.print("Plataforma de streaming: ");
        this.streaming = sc.nextLine().strip();
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

    //RETORNA UMA MENSAGEM DESCREVENDO O FILME 
    public String getDescricao() {
        return ("Filme " + nome + " de " + genero + " está no(a) " + streaming + ".");
    }
}
