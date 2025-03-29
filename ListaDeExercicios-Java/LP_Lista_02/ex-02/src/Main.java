//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro.");
        number = in.nextInt();

        result = number * number;

        System.out.println("O quadrado de " + number + " é " + result);



    }
}