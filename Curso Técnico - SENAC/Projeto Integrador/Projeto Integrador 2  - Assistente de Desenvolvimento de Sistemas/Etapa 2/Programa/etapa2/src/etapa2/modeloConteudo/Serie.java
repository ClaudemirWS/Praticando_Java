package etapa2.modeloConteudo;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Serie {

    //ATRIBUTOS DA SERIE
    private String nome, genero, streaming;

    //CONSTRUTOR
    public Serie(String genero, String streaming) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNome da serie: ");
        this.nome = sc.nextLine();
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

    //RETORNA UMA MENSAGEM DESCREVENDO A SERIE 
    public String getDescricao() {
        return ("Serie " + nome + " de " + genero + " está no(a) " + streaming + ".");
    }
}