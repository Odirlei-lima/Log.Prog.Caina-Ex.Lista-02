import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mm, inch;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite uma medida em polegadas. ");
        inch = in.nextDouble();

        mm = inch * 25.4;

        System.out.print(" A medida " + inch + "em milemetros é " + mm + "mm. ");


    }
}