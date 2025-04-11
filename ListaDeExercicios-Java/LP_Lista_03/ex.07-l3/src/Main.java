import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner Scanner = new Scanner(System.in);

                System.out.print("Digite o valor de a: ");
                double a = Scanner.nextDouble();

                System.out.print("Digite o valor de b: ");
                double b = Scanner.nextDouble();

                System.out.print("Digite o valor de c: ");
                double c = Scanner.nextDouble();

                if (a == 0) {
                    System.out.println("Isso não é uma equação do segundo grau.");
                } else {

                    double delta = b * b - 4 * a * c;

                    if (delta < 0) {
                        System.out.println("A equação não possui raízes reais.");
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                        System.out.println("As raízes da equação são:");
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }
                }

            }
        }


