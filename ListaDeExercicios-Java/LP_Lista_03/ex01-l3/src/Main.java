import java.util.Scanner;

import static java.io.IO.print;

public class Main {
    public static void main(String[] args) {

        double n, sqrt;

        Scanner in = new Scanner (System.in);
        System.out.print(" Digite um número real : ");
        n = in.nextDouble();

        if(n>=0){
            sqrt = Math.sqrt(n);
            System.out.print(" A raiz Quadrada de " +n+ " = " +n);
        }else{
            System.out.print(" Não existe raiz quadrada.");
        }
    }
}