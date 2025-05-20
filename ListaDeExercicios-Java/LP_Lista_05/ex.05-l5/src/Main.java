public class Main {
    public static void main(String[] args) {
        // Vetor original
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Vetor invertido
        int[] v2 = new int[v1.length];

        // Copiando os elementos de v1 para v2 em ordem invertida
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.print("Vetor v1: ");
        for (int valor : v1) {
            System.out.print(valor + " ");
        }

        System.out.print("\nVetor v2 (invertido): ");
        for (int valor : v2) {
            System.out.print(valor + " ");
        }
    }
}
