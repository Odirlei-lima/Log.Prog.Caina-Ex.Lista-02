import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, recovery;

        Scanner in = new Scanner (System.in);
        System.out.print(" Digite a primeira nota : ");
        score1 = in.nextDouble();

        System.out.print(" Digite a Segunda nota : ");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;
        System.out.print(" Média =" +mean);
        if(mean>=50){
            System.out.println(" Aprovado");
        }else {
            System.out.print(" Digite a nota da recuperação:");
            recovery = in.nextDouble();

            mean = (mean + recovery) / 2;

            if (mean < 50)
                System.out.print(" Reprovado ");
            else
            System.out.print("Aprovado");


        }
    }
}