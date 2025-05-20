<<<<<<< HEAD

        public class Main {
            public static void main(String[] args) {
                int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int aux ;

                System.out.println("Vetor Original:");
                for (int valor: vetor)
                    System.out.print(valor +", ");


                for (int i = 0; i < vetor.length/2; i++) {

                    aux =vetor [vetor.length-1-i];
                    vetor [vetor.length-1-i]= vetor [i];
                    vetor [i]=aux;
                }

                System.out.println(" \n Vetor Invertido:");
                for (int valor : vetor)
                    System.out.print(valor+ ", ");
    }
}
=======
public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando o vetor
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Exibindo o vetor original
        System.out.print("Vetor original: ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // Invertendo os valores no próprio vetor
        int aux; // variável auxiliar
        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        // Exibindo o vetor invertido
        System.out.print("Vetor invertido: ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
>>>>>>> 6b416943067d6135f3de4e925f4e8fbd4e460899
