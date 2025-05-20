<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização da matriz 5x5
        int[][] matriz = {
                { 2,  7,  1,  8,  3},
                { 4,  5,  9,  2,  6},
                {10, 11, 12, 13, 14},
                { 0,  3,  1,  5,  9},
                { 6,  8,  4,  7,  2}
        };

        int maiorSomaLinha = Integer.MIN_VALUE;
        int maiorSomaColuna = Integer.MIN_VALUE;

        // Calculando a maior soma das linhas
=======
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
>>>>>>> 6b416943067d6135f3de4e925f4e8fbd4e460899
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
            }
        }

<<<<<<< HEAD
        // Calculando a maior soma das colunas
=======
        // Calcular a maior soma das colunas
        int maiorSomaColuna = Integer.MIN_VALUE;
>>>>>>> 6b416943067d6135f3de4e925f4e8fbd4e460899
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
            }
        }

<<<<<<< HEAD
        // Exibindo os resultados
        System.out.println("Maior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);
    }
}
=======
        // Exibir os resultados
        System.out.println("\nMaior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);
    }
}

>>>>>>> 6b416943067d6135f3de4e925f4e8fbd4e460899
