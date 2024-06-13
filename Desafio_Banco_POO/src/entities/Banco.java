package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contaList = new ArrayList<>();

    public Banco() {
    }

    public Banco(String nome, List<Conta> contaList) {
        this.nome = nome;
        this.contaList = contaList;
    }

    public String getNome() {
        return nome;
    }

    public void imprirmirContas() {
        System.out.println("==== Banco: " + this.nome + " ====");
        for (Conta c : contaList) {
            System.out.println("Conta numero: " + c.getNumero());
        }
    }
}
