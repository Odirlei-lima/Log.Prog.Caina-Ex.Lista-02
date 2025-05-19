import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {2,5,10,14,8,9,3,1,0,11};
        int number;
        boolean found = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro para verificar se o mesmo está no vetor:");
        number = input.nextInt();

        for ( int i = 0;i < vetor.length;i++){
            if(vetor[i] ==number){
                System.out.println(" O valor digitado " +number+" está na posição " + i);
                found = true;
            }
        }

        if(!found)
            System.out.println("Valor não encontrado");

    }
}