import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite a medida de um raio pra calcular a área de um círculo.");
        radius = in.nextDouble();

        area = Math.PI*Math.pow(radius,2);

        System.out.print(" A area do círculo de raio " + radius + " é " + area);

    }
}