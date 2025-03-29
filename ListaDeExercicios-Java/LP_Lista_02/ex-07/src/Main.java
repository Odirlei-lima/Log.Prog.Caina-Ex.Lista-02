import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mm, inch;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite uma medida em mm. ");
        mm = in.nextDouble();

        inch = mm / 25.4;

        System.out.print(" A medida " + mm + "em polegadas é " + inch + "pol");


        }
    }
