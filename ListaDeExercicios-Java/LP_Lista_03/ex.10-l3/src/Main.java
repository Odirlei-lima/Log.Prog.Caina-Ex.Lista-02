import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nome de variável com minúscula por convenção
        int n1, n2, n3;

        System.out.println("Digite 3 números inteiros separados por espaço:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        int[] numeros = {n1, n2, n3};
        Arrays.sort(numeros);

        System.out.println("A ordem crescente dos números é: "
                + numeros[0] + ", "
                + numeros[1] + " e "
                + numeros[2]);

        scanner.close(); // sempre bom fechar o Scanner
    }
}





