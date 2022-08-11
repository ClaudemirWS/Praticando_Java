package teste3poo;

/**
 * @author Claudemir Souza
 */
public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimindo extrato da conta...");
        System.out.println(" - Saldo: R$ " + this.getSaldo());
    }

}
