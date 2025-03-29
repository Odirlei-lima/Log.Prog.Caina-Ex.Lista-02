import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, m;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite a velocidade em m/s. ");
        m = in.nextDouble();

        km = m * 3.6;

        System.out.print(" A velocidade " + m + " m/s em Km/h é " + km + " Km/h.");

    }


    }
