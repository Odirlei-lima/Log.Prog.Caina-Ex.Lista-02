import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double km, m;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite a velocidade em km/s. ");
        km = in.nextDouble();

        m = km / 3.6;

        System.out.print(" A velocidade " + km + "Km/h em m/s é " + m + "m/s.");

    }
}
