import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double b, h, A;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite o valor da base do triângulo:  ");
        b = in.nextDouble();

        System.out.print(" Digite o valor da altura do triângulo: ");
        h = in.nextDouble();

        A = (b * h) / 2;

        System.out.print(" A área do triagulo retangulo é = " + A);


    }
}

