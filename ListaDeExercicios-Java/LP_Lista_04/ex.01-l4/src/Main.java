import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o N° da tábuada desejada: ");
        int numero = scanner.nextInt();

        System.out.println(" TÁBUADA DO " + numero + " : ");

        for (int i = 0; i <= 10; i++) {
            System.out.println(+numero + " x " + i + " = " + (numero * i));

        }
    }
}