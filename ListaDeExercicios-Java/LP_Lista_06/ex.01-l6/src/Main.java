import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro maior que zero e veja sua soma: ");
        int N = in.nextInt();
        int soma = calcularSoma(N);
        if (N>0) {

            System.out.println("A soma de zero até o numero " + N + " = " + soma);
        }else{

            System.out.println("Digite um número Válido:");
        }

    }

    public static int calcularSoma(int N) {
        int soma = 0;
        for (int i = 0; i <= N; i++) {
        soma += i;
    }
        return soma;
    }
}

