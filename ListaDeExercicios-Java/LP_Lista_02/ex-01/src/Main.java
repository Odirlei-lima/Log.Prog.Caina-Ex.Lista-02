//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                int number, result;

                Scanner in = new Scanner(System.in);

                System.out.println("Digite um número inteiro:");
                number = in.nextInt();

                result = number * 2;

                System.out.println("O dobro de " + number + " é " + result);


            }
        }