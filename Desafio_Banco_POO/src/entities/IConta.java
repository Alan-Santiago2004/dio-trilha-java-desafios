package entities;

public interface IConta {
    void depositar(Double valor);
    void sacar(Double valor);
    void transferir(Double valor,Conta contaDestino);
    void imprirmirExtrato();
}
