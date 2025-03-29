import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vi, a, t, vf;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite o valor da velocidade inical: ");
        vi = in.nextDouble();

        System.out.print(" Digite o valor da aceleração: ");
        a = in.nextDouble();

        System.out.print(" Digite o valor do tempo percorrido: ");
        t = in.nextDouble();

        vf = vi+(a*t);

        System.out.print(" O valor da velocidade final é " + vf);


    }
}