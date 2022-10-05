package supermercado;

/**
 * @author venec
 * @author Claudemir Souza
 */
public class Supermercado {

    public static void main(String[] args) {

        //CRIA NOVO PRODUTO
        DadosProduto produto = new DadosProduto();
        produto.NovoProduto(1, "Refrigerante", 10.90);

        //SALVA PRODUTO NO BANCO
        GuardaProduto cp = new GuardaProduto();
        cp.salvarProduto(produto);
        
    }

}
