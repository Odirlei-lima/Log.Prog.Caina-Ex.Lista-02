import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, h, volume;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite o valor do raio do cone: ");
        radius = in.nextDouble();

        System.out.print(" Digite o valor da altura do cone: ");
        h = in.nextDouble();

        volume = ( h*Math.PI*Math.pow(radius,2))/3;

        System.out.print(" O valor do volume do cone é = " + volume);

    }
}