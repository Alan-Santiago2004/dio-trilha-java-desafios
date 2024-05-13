import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro parametro");
        int parametro1 = scanner.nextInt();
        System.out.println("Segundo parametro");
        int parametro2 = scanner.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        scanner.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 < parametro2) {
            int contagem = parametro2 - parametro1;
            for (int i = 0; i < contagem; i++) {
                System.out.println("imprimir o numero " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }

}
