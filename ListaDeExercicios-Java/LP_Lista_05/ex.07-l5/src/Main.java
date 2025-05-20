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
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha > maiorSomaLinha) {
                maiorSomaLinha = somaLinha;
            }
        }

        // Calculando a maior soma das colunas
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColuna) {
                maiorSomaColuna = somaColuna;
            }
        }

        // Exibindo os resultados
        System.out.println("Maior soma entre as linhas: " + maiorSomaLinha);
        System.out.println("Maior soma entre as colunas: " + maiorSomaColuna);
    }
}
