import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println(" Ordem crescente dos três Numeros digitados:");
        System.out.println(" Digite 3 Números inteiros separados por espaço. ");
        n1 = Scanner.nextInt();
        n2 = Scanner.nextInt();
        n3 = Scanner.nextInt();

       int[] numeros = {n1, n2,n3};
       Arrays.sort(numeros);

        System.out.println(" A ordem crescente dos números são: "+numeros[0]+" , "+numeros[1]+" e "+numeros[2]);

        }
    }
