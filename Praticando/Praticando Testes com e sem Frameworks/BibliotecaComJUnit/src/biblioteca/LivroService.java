package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LivroService {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro getlivroPorId(int livroId) {
        for (Livro livro : livros) {
            if (livroId == livro.getLivroId()) {
                return livro;
            }
        }
        return null;
    }

    public List<String> listarTitulosPorPubicacao(int ano) {
        List<String> listaTitulos = new ArrayList<>();
        for (Livro livro : livros) {
            if (ano == livro.getAnoPublicacao()) {
                listaTitulos.add(livro.getTitulo());
            }
        }
        return listaTitulos;
    }

}
