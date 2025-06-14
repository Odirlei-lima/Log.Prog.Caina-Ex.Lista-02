import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = scanner.nextInt();

        BigInteger fatorial = BigInteger.ONE; // classe BigInteger, que permite trabalhar com inteiros de tamanho ilimitado.

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + fatorial);

    }
}

