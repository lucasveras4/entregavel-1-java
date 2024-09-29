package entregavel.pkg1.java;

import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        System.out.print("Digite a quantidade de números a serem somados: ");
        int qtdNumeros = scanner.nextInt();

        for (int i = 1; i <= qtdNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);
            contador += numero;
        }

        System.out.println("Soma dos números = " + contador);
        scanner.close();
    }
}