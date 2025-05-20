
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