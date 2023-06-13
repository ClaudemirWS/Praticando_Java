package biblioteca;

public class Livro {

    private int livroId;
    private String titulo;
    private int anoPublicacao;

    public Livro(int livroId, String titulo, int anoPublicacao) {
        this.livroId = livroId;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }    

    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
   
}
