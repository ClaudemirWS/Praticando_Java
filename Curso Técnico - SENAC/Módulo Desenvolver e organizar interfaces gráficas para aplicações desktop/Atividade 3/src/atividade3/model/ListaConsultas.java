package atividade3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Claudemir
 */
public class ListaConsultas {

    // Declaração de variáveis
    private static final List<Consulta> lista = new ArrayList<>();

    // Métodos para acessarmos a lista e adicionarmos novos itens
    public static List<Consulta> Listar() {
        return lista;
    }

    public static void Adicionar(Consulta consulta) {
        lista.add(consulta);
    }
}
