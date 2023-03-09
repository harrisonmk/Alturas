package projeto;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Locale vai usar o ponto "." ao inves da virgula nos valores double
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        DecimalFormat deci1 = new DecimalFormat("0.0");

        double soma = 0.0;
        int cont = 0;

        System.out.println("Quantas Pessoas Serão Digitadas ?");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scan.nextDouble();

        }

        for (int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        }

        double mediaAlturas = soma / (double) n;
        System.out.println();
        System.out.println("Altura média: " + deci.format(mediaAlturas));

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont = cont + 1;
            }
        }

        double porcentagem = cont * 100.0 / n;
        System.out.println("Pessoas com menos de 16 anos: " + deci1.format(porcentagem) + "%");

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        scan.close();

    }

}
