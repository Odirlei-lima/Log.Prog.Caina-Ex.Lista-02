public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Exibe o vetor original
        System.out.println("Vetor original:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        // Aplica a regra aos elementos
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // índice par
                vetor[i] += 2;
            } else { // índice ímpar
                vetor[i] *= 2;
            }
        }

        // Exibe o vetor modificado
        System.out.println("\nVetor modificado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
