package entities;

public class Pessoa {
    private String agencia;
    private int numero;
    private String nomeCliente;
    private double saldo;

    public Pessoa() {
    }

    public Pessoa(String agencia, int numero, String nomeCliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," +
                " conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque";
    }
}
