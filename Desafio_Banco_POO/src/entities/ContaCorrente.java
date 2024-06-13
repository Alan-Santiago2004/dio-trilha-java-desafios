package entities;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprirmirExtrato() {
        System.out.println("==== Extrato conta corrente ====");
        super.imprimirContaComum();
    }
}
