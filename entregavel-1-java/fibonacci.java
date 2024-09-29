package entregavel.pkg1.java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int numero = scanner.nextInt();

        int n1 = 0, n2 = 1, proximoTermo;

        System.out.println("Sequência de Fibonacci:");

        for (int i = 1; i <= numero; ++i) {
            System.out.print(n1 + " ");
            proximoTermo = n1 + n2;
            n1 = n2;
            n2 = proximoTermo;
        }
    }
}
