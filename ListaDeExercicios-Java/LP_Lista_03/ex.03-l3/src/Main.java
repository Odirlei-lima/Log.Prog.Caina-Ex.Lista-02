import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean;

        Scanner in = new Scanner (System.in);
        System.out.print(" Digite a primeira nota : ");
        score1 = in.nextDouble();

        System.out.print(" Digite a Segunda nota : ");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;
//        System.out.print(" Média =" +mean);

        System.out.print(mean<50? " Reprovado": " Aprovado");


        }
    }
