import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner input = new Scanner(System.in);

        // Preencher a matriz com valores digitados pelo usuário
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Exibir a matriz completa
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", matriz[i][j]); // %4d alinha os números
            }
            System.out.println();
        }

        // Calcular a maior soma das linhas
        int maiorSomaLinha = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
            }
        }

        // Calcular a maior soma das colunas
        int maiorSomaColuna = Integer.MIN_VALUE;
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
            }
        }

        // Exibir os resultados
        System.out.println("\nMaior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);
    }
}

