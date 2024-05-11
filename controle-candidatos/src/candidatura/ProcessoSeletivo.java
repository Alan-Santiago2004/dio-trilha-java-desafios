package candidatura;

import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Processo Seletivo");
        double salarioPretendido = scanner.nextDouble();
        analisarCandidato(salarioPretendido);

        scanner.close();


    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioPretendido == salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
