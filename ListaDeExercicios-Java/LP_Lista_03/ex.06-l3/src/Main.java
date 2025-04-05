import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a opção desejada entre 5 à 9 ");
        n = in.nextInt();

        if (n<5 || n>9) {
            System.out.print(" Opção Inválida");
        }else{
            System.out.print(" Opção Válida");
            }
        }
    }
