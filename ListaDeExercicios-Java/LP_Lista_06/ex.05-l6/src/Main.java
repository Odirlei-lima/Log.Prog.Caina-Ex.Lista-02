import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.println("Digite o número que deseja buscar:");
        int alvo = in.nextInt();

        int posicao = buscaBinaria(numeros, alvo);

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado no array.");
        }


    }


    public static int buscaBinaria(int[] array, int alvo) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
