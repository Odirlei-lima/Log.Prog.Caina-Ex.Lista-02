import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("  Mostra o numero digitado correspondente ao dia da semana: \n ");

        System.out.print(" Digite um n° de 1 à 7:  ");
        int numero = scanner.nextInt();

        String dia;

        switch (numero){
            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda-feira";
                break;

            case 3:
                dia = "Terça-feira";
                break;

            case 4:
                dia = "Quarta-feira";
                break;

            case 5:
                dia = "Quinta-feira";
                break;

            case 6:
                dia = "Sexta-feira";
                break;

            case 7:
                dia = " Sabádo ";
                break;

            default:
                dia = " INVÁLIDO: \n Digite um número de 1 à 7: ";
                break;

        }

        System.out.print(" O numero digitado é " + dia);

        scanner.close();

        }
    }
