package supermercado;

/**
 * @author Claudemir Souza
 */
public class ValidaProduto {

    //VALIDA SE O PRODUTO FOI CADASTRADO COM TODOS OS DADOS
    public boolean validacao(DadosProduto produto) {

        if (produto.getId() != 0 && !produto.getNome().equals("") && produto.getPreco() != 0) {
            return true;
        } else {
            return false;
        }
    }
}
