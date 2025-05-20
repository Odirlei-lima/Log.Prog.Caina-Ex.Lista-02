import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro maior que zero e veja o seu fatorial: ");
        int number = in.nextInt();
        int fatorial = calcularFatorial(number);
        if (number>0) {

            System.out.println( + number + "! = " + fatorial);
        }else{

            System.out.println("Digite um número Válido:");
        }

    }

    public static int calcularFatorial(int number) {
        int fatorial= 1;
        for (int i = 1; i <= number; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
