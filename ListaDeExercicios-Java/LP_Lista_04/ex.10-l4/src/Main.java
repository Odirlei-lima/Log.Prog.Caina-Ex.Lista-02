import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci você quer ver: ");
        int n = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }


    }
}

