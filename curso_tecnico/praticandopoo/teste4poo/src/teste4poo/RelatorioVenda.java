package teste4poo;

/**
 * @author Claudemir Souza
 */
public class RelatorioVenda extends Relatorio {

    public Venda[] vendas = null;

    @Override
    public void emiteRelatorio() {
        float totalVendas = 0;
        System.out.println("RELATORIO DE VENDAS");
        System.out.println(super.emiteCabecalho());

        if (vendas != null) {
            for (Venda v : vendas) {
                System.out.println(v.cliente + " - R$" + v.valor);
                totalVendas += v.valor;
            }
        }
        this.total = totalVendas;
        System.out.println(super.emiteRodape());
    }
}
