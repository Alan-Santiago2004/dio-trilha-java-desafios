package iphone;

import funcionalidades.Navegador;
import funcionalidades.ReprodutorMusical;
import funcionalidades.Telefone;

import java.util.Locale;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        System.out.print("Reprodutor Musical: ");
        String musica = scanner.nextLine();
        reprodutorMusical.selecionarMusica(musica);
        reprodutorMusical.pausar();

        Telefone telefone = new Telefone();
        System.out.print("Telefone: ");
        String numero = scanner.nextLine();
        telefone.ligar(numero);
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Navegador navegador = new Navegador();
        System.out.print("Navegador: ");
        String url = scanner.nextLine();
        navegador.adicionarNovaAba();
        navegador.exibirPagina(url);
        navegador.atualizarPagina();


        scanner.close();
    }
}
