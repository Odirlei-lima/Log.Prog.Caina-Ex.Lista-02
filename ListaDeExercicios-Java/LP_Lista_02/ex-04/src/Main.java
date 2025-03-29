import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a 1ª nota.");
        n1 = in.nextDouble();

        System.out.println("Digite a 2ª nota.");
        n2 = in.nextDouble();

        media = (n1 + n2) / 2;

        System.out.println("A média das duas notas é " + media);
    }
}