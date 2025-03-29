import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, h, volume;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite o valor do raio do cilindro: ");
        radius = in.nextDouble();

        System.out.print(" Digite o valor da altura do cilindro: ");
        h = in.nextDouble();

        volume = Math.PI*Math.pow(radius,2)*h;

        System.out.print(" O volume do cílindro é = " + volume );

    }
}