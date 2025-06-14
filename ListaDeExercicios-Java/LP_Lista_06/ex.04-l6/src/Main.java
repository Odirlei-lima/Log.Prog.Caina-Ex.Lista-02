import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        String entrada = in.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }


    }

    public static boolean ehPalindromo(String texto) {

        String limpa = texto.replaceAll("\\s+", "").toLowerCase();

        int esquerda = 0;
        int direita = limpa.length() - 1;

        while (esquerda < direita) {
            if (limpa.charAt(esquerda) != limpa.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }
}
