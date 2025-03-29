import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Celcius, Fahrenheit;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite uma temperatura em °C: ");
        Celcius = in.nextDouble();

        Fahrenheit = (Celcius * 1.8) + 32;

        System.out.print(" A temperatura " + Celcius + "°C é " + Fahrenheit + "°F.");

    }
}