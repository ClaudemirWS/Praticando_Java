package portalaluno.model;

  import java.util.ArrayList;
  import java.util.List;

/**
 * @author Claudemir
 */
public class ListaAluno {

    // Declaração de variáveis
    private static final List<Aluno> lista = new ArrayList<>();

    // Métodos para acessarmos a lista e adicionarmos novos itens
    public static List<Aluno> Listar() {
        return lista;
    }

    public static void Adicionar(Aluno aluno) {
        lista.add(aluno);
    }
}
