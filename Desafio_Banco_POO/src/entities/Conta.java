package entities;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADAO = 1;
    private static int SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0d;
        this.cliente = cliente;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferencia realizada!");
    }

    protected void imprimirContaComum() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
