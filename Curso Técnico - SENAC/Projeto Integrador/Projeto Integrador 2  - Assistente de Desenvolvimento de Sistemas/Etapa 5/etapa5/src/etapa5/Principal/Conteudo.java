package etapa5.Principal;

/**
 * @author Claudemir Souza
 */
public class Conteudo {


    //ATRIBUTOS DO CONTEÚDO
    private String id, nome, genero, streaming, tipo;

    //CONSTRUTOR
    public Conteudo() {

    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
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
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
