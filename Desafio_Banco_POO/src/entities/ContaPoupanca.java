package entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprirmirExtrato() {
        System.out.println("==== Extrato conta Poupanca ====");
        super.imprimirContaComum();
    }
}
