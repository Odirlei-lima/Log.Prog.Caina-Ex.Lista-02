import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("=== JOGO DA TÁBUADA ===");
            System.out.println("Responda corretamente todas as operações da tabuada de 1 a 10 para vencer!");

            boolean perdeu = false;

            // Laços das tabuadas
            for (int i = 1; i <= 10 && !perdeu; i++) {
                System.out.println(" \nTábuada do "+i);
                for (int j = 1; j <= 10 && !perdeu; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Resposta incorreta! Você perdeu.");
                        perdeu = true;
                    }
                }
            }

            // Verifica se o jogador venceu
            if (!perdeu) {
                System.out.println("PARABÉNS! Você completou toda a tabuada sem errar!");
            }

            // Perguntar se quer jogar novamente
            System.out.print("Deseja jogar novamente? (s/n): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                jogarNovamente = false;
                System.out.println("Obrigado por jogar!");
            }
        }


    }
}
