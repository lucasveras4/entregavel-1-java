import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de entradas: ");
        int N = scanner.nextInt();

        int contador = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o número (" + i + ") da sequência: ");
            double numero = scanner.nextDouble();
            if (numero % 1 == 0) {
                contador++;
            }
        }

        System.out.println("Contagem de números inteiros: " + contador);
    }
}