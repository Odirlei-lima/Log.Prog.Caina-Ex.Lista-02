import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1,x2;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite o valor a: ");
        a = in.nextDouble();

        System.out.print(" Digite o valor do coeficiente b: ");
        b = in.nextDouble();

        System.out.print(" Digite o valor do coeficiente c: ");
        c= in.nextDouble();

        System.out.println(a+"x²+"+b+"x+"+c+"=0");

        delta = Math.pow(b,2)-(4*a*c);

        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);

        System.out.println("x1= "+ x1);
        System.out.println("x2= "+ x2);



    }
}