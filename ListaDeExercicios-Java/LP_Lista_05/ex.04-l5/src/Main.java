import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println(" Digite 10 números inteiros: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int maior = numbers[0];
        int menor = numbers[0];

        for(int i=0; i<numbers.length;i++){
           if(numbers[i]>maior) maior=numbers[i];
           if(numbers[i]<menor) menor=numbers[i];
        }
        // Encontra todas as posições dos maiores e menores
        //Essas duas listas (posicoesMaior e posicoesMenor) vão guardar os índices/n
        // onde aparecem o maior e o menor valor, respectivamente.
        ArrayList<Integer> posicoesMaior = new ArrayList<>();
        ArrayList<Integer> posicoesMenor = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == maior) posicoesMaior.add(i);
            if (numbers[i] == menor) posicoesMenor.add(i);
        }
        // Mostrar todos os valores do vetor
        System.out.println("\nNúmeros armazenados no vetor:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");
        }
        //Mostra o maior e menor e suas posições
        System.out.println(" \nO maior número é: "+ maior+ " ,posição " +posicoesMaior+".");
        System.out.println(" \nO menor número é: "+ menor+ " ,posição " +posicoesMenor+".");
    }

}
