import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,x;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite o coeficiente angular: ");
        a = in.nextDouble();

        System.out.print(" Digite o valor do coeficiente linear: ");
        b = in.nextDouble();

        x = -b/a;

        System.out.println(" A Equação do 1°= " +a+"x+"+b+"= 0");
        System.out.println(" O valor de x= "+x);


    }
}