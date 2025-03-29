import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, mile;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite uma medida em Km. ");
        km = in.nextDouble();

        mile = km / 1.609;

        System.out.print(" A medida " + km + " Km é " + mile + " milhas .");


    }
}