import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, media;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite a primeira nota. ");
        n1 = in.nextDouble();


        System.out.print(" Digite a segunda nota. ");
        n2 = in.nextDouble();

        media = (n1*1) + (n2*2) / 3;

        System.out.print(" A média entre as notas " + n1 + " e " + n2 + " é " + media +" . " );
    }

}