import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, mile;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite uma medida em milhas. ");
        mile = in.nextDouble();

        km = mile * 1.609;

        System.out.print(" A medida " + mile + " milhas é " + km + " km ." );


    }
}