public class Main {
    public static void main(String[] args) {
        // Matriz A 3x2
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Matriz B 2x2
        int[][] B = {
                {7, 8},
                {9, 10}
        };

        // Matriz produto C 3x2
        int[][] C = new int[3][2];

        // Multiplicação de matrizes
        for (int i = 0; i < 3; i++) {          // para cada linha de A
            for (int j = 0; j < 2; j++) {      // para cada coluna de B
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {  // percorre colunas de A / linhas de B
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir resultado
        System.out.println("Matriz resultado C = A x B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
