package application;

import entities.*;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente cliente = new Cliente("Alan Santiago");

        Conta cc = new ContaCorrente(cliente);
        Conta cc2 = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        List<Conta> contas = Arrays.asList(cc, cc2, cp);
        Banco banco = new Banco("Itau", contas);


        cc.depositar(100.00);
        cc.imprirmirExtrato();
        cc.transferir(50.00, cp);
        cc.imprirmirExtrato();
        cc2.imprirmirExtrato();
        cp.imprirmirExtrato();
        banco.imprirmirContas();
    }
}
