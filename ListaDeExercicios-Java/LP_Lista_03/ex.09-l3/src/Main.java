import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do lado 1:");
        double lado1 = in.nextDouble();

        System.out.println("Digite o valor do lado 2:");
        double lado2 = in.nextDouble();

        System.out.println("Digite o valor do lado 3:");
        double lado3 = in.nextDouble();

        if (formaTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }

        in.close();
    }

    public static boolean formaTriangulo(double a, double b, double c) {
        // Verifica a condição de existência do triângulo para cada lado
        return (a < b + c && a > Math.abs(b - c)) &&
                (b < a + c && b > Math.abs(a - c)) &&
                (c < a + b && c > Math.abs(a - b));
    }
}
