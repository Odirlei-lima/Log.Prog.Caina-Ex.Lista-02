public class Main {
    public static void main(String[] args) {
        // Declaração sem inicialização
        //int[][]numbers = new int [2][2];

        // Declaração com inicialização
        int[][] matriz = {{5, 8, 9}, {9, 6, 5}, {2, 3, 4}};

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                System.out.print(matriz[i][j] + " ");
                }
                System.out.print("\n");
        }
    }
}
