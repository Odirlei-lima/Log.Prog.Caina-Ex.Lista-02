import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;

        Scanner in = new Scanner (System.in);
        System.out.print(" Digite dois numeros inteiros separados po espaço : ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if(n1>n2)
            System.out.print(n1+">"+n2);
        else if (n1<n2)
            System.out.print(n1+" < "+n2);
        else
            System.out.print(n1+" = "+n2);
        }
    }
