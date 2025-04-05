import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, recovery;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite a primeira nota : ");
        score1 = in.nextDouble();

        System.out.print(" Digite a Segunda nota : ");
        score2 = in.nextDouble();

        mean = (score1 + score2) / 2;
        System.out.print(" Média = " + mean);
        if (mean >= 8.5) {
            System.out.println(" Conceito A ");
        } else if (mean >=7){
            System.out.print(" Conceito B ");
        } else if (mean >= 5){
            System.out.print(" Conceito C ");
        } else {
            System.out.print(" Conceito D ");
        }
    }
}


