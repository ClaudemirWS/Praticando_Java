package etapa2.modeloConteudo;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Filme {

    //ATRIBUTOS DO FILME
    private String nome, genero, streaming;

    //CONSTRUTOR
    public Filme(String genero, String streaming) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNome do filme: ");
        this.nome = sc.nextLine().strip();
        this.genero = genero;
        this.streaming = streaming;
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