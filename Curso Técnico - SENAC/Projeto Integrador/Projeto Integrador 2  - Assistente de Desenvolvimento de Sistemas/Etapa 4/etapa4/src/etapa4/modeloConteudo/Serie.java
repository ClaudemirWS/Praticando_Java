package etapa4.modeloConteudo;

/**
 * @author Claudemir Souza
 */
public class Serie {

    //ATRIBUTOS DA SERIE
    private String nome, genero, streaming;

    //CONSTRUTOR
    public Serie() {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

}
