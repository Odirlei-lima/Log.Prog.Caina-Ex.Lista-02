import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 números inteiros separados por espaço \ne será exibido todos os números existentes entre eles:");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int inicio = Math.min(n1, n2);
        int fim = Math.max(n1, n2);

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Os números são: " + i);
        }

        scanner.close();
    }
}






