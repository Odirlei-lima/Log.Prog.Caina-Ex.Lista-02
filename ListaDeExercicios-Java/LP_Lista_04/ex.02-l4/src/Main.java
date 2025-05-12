import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "° n° = ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;

            }
        }
            System.out.println(" O maior n° é = " + maior);
            System.out.println(" O menor n° é = " + menor);


        }
    }
