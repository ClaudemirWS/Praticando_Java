package supermercado;

/**
 * @author venec
 * @author Claudemir Souza 
 * UPDATE: CLASSE ProdutoControllerFOI REFATORADA PARA
 * GuardaProduto E DIVIDIDA EM OUTRA CLASSE SEGUINDO O PRINCÍPIO DA
 * RESPONSABILIDADE ÚNICA DO SOLID. MANTIVE O MÉTODO enviarMensagem POIS ELE FAZ
 * UMA AÇÃO QUE COMPLETA O ATO DE GUARDAR PRODUTOS
 */
public class GuardaProduto {

    //USADO PARA VALIDAR SE NÃO FALTAM INFORMAÇÕES
    ValidaProduto valida = new ValidaProduto();

    //SALVA O PRODUTO NO BANCO DE DADOS
    public boolean salvarProduto(DadosProduto produto) {
        if (valida.validacao(produto)) {
            this.enviarMensagem(true, produto.getNome());
            return true;
        } else {
            this.enviarMensagem(false, "");
            return false;
        }
    }

    //MENSAGEM DE CONFIRMAÇÃO DE PRODUTO SALVO
    public void enviarMensagem(Boolean status, String nome) {
        if (status == true) {
            System.out.println("Produto " + nome + " salvo com sucesso.");
        } else if (status == false) {
            System.out.println("Erro ao salvar produto.");
        }
    }

}
