package supermercado;

/**
 * @author venec
 * @author Claudemir Souza 
 * UPDATE: CLASSE ProdutoEntity FOI REFATORADA PARA
 * DadosProduto AFIM DE FORNECER MAIOR CLAREZA DO QUE A CLASSE CONTÉM
 */
public class DadosProduto {

    private int id;
    private String nome;
    private double preco;

    //CONSTRUTOR
    public DadosProduto() {

    }

    //RECEBE DADOS DE NOVOS PRODUTOS
    public void NovoProduto(int id, String nome, double preco) {
        setId(id);
        setNome(nome);
        setPreco(preco);
    }

    //TORNEI OS MÉTODOS SET PRIVADOS
    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    //MÉTODOS GET CONTINUAM PÚBLICOS
    public double getPreco() {
        return preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
