import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do número (base):");
        int number = in.nextInt();


        System.out.println("Digite a potência desejada (expoente, deve ser >= 0):");
        int potencia = in.nextInt();

               if (potencia < 0) {
            System.out.println("A potência deve ser maior ou igual a zero.");
        } else {
            int resultado = calcularPotencia(number, potencia);
            System.out.println(number + " elevado a " + potencia + " é: " + resultado);
        }


    }


    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
