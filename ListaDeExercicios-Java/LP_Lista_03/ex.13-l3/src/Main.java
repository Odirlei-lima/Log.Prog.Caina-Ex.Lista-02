import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Calculadora Geométrica \n" +
                "----------------------------\n" +
                "            MENU            \n" +
                "Escolha a opção desejada: \n" +
                "1 - Círculo\n" +
                "2 - Triângulo Retângulo\n" +
                "3 - Retângulo\n" +
                "----------------------------\n" +
                "Escolha uma opção: ");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();

            if (raio <= 0) {
                System.out.println("Valor inválido.");
            } else {
                double area = Math.PI * Math.pow(raio, 2);
                double perimetro = 2 * Math.PI * raio;

                System.out.println("A área do círculo é = " + area);
                System.out.println("O perímetro do círculo é = " + perimetro);
            }

        } else if (opcao == 2) {
            System.out.print("Digite o primeiro lado: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Digite o segundo lado: ");
            double lado2 = scanner.nextDouble();

            System.out.print("Digite o terceiro lado: ");
            double lado3 = scanner.nextDouble();

            double a, b, c;

            // Descobrir qual é o maior (hipotenusa)
            if (lado1 >= lado2 && lado1 >= lado3) {
                c = lado1;
                a = lado2;
                b = lado3;
            } else if (lado2 >= lado1 && lado2 >= lado3) {
                c = lado2;
                a = lado1;
                b = lado3;
            } else {
                c = lado3;
                a = lado1;
                b = lado2;
            }

            // Verificar se é um triângulo retângulo
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println("É um triângulo retângulo!");
                double area = (a * b) / 2;
                double perimetro = a + b + c;
                System.out.println("A área do triângulo é = " + area);
                System.out.println("O perímetro do triângulo é = " + perimetro);
            } else {
                System.out.println("NÃO é um triângulo retângulo.");
            }

        } else if (opcao == 3) {
            System.out.println("Digite o primeiro lado do retângulo: ");
            double ladoA = scanner.nextDouble();

            System.out.println("Digite o segundo lado do retângulo: ");
            double ladoB = scanner.nextDouble();

            if (ladoA == ladoB) {
                System.out.println("Não forma um retângulo (é um quadrado).");
            } else {
                double area = ladoA * ladoB;
                double perimetro = 2 * (ladoA + ladoB);
                System.out.println("A área do retângulo é = " + area);
                System.out.println("O perímetro do retângulo é = " + perimetro);
            }

        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}





