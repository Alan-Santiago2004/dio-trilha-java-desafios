package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Deposito inicial(s/n)? ");
        char SimOuNao = sc.next().charAt(0);
        Pessoa pessoa = new Pessoa(agencia, numero, nome);
        if (SimOuNao == 's') {
            System.out.print("Digite o valor do deposito: ");
            double deposito = sc.nextDouble();
            pessoa.setSaldo(deposito);
        }
        System.out.println(pessoa);

        sc.close();

    }
}
