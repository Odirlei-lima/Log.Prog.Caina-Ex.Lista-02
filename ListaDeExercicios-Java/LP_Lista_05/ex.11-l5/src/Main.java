import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Entrada do tamanho da matriz A
        System.out.print("Digite o número de linhas da matriz A: ");
        int linhasA = in.nextInt();

        System.out.print("Digite o número de colunas da matriz A: ");
        int colunasA = in.nextInt();

        // Entrada do tamanho da matriz B
        System.out.print("Digite o número de linhas da matriz B: ");
        int linhasB = in.nextInt();

        System.out.print("Digite o número de colunas da matriz B: ");
        int colunasB = in.nextInt();

        // Verifica se a multiplicação é possível
        if (colunasA != linhasB) {
            System.out.println("Multiplicação impossível: número de colunas da matriz A diferente do número de linhas da matriz B.");
            in.close();
            return;
        }

        // Cria as matrizes A e B
        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];

        // Entrada dos valores da matriz A
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = in.nextInt();
            }
        }

        // Entrada dos valores da matriz B
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = in.nextInt();
            }
        }

        // Matriz produto C terá dimensão linhasA x colunasB
        int[][] C = new int[linhasA][colunasB];

        // Calcula a multiplicação
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) { // ou k < linhasB (são iguais)
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibe a matriz resultado
        System.out.println("Matriz resultado C = A x B:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
