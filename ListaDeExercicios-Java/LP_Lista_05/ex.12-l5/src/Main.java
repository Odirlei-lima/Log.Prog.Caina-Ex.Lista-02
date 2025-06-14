public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {2, 3, 1},
                {4, 1, -3},
                {1, 2, 5}
        };

        int det = determinante3x3(matriz);

        System.out.println("Determinante da matriz = " + det);
    }


    public static int determinante3x3(int[][] m) {
        int diagonalPrincipal = m[0][0] * m[1][1] * m[2][2] +
                m[0][1] * m[1][2] * m[2][0] +
                m[0][2] * m[1][0] * m[2][1];

        int diagonalSecundaria = m[0][2] * m[1][1] * m[2][0] +
                m[0][0] * m[1][2] * m[2][1] +
                m[0][1] * m[1][0] * m[2][2];

        return diagonalPrincipal - diagonalSecundaria;
    }
}
