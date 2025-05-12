import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Calculadora: \n  Digite o 1° número: ");
        Double numero1 = scanner.nextDouble();

        System.out.println(" Digite o 2° número: ");
        Double numero2 = scanner.nextDouble();

        System.out.println(" Escolha a operação desejada:\n" +
                "-------------------------------\n" +
                "Digite 1 para soma (+)\n" +
                "Digite 2 para subtração (-)\n" +
                "Digite 3 para divisão (/)\n" +
                "Digite 4 para multiplicação (*)\n" +
                "-------------------------------\n");
        int operacao = scanner.nextInt();
        double resultado;

        switch (operacao){
            case 1:
                resultado = numero1+numero2;
                System.out.println("Resultado " + numero1+ " + " + numero2+ " = "+ resultado);
                break;

            case 2:
                resultado = numero1-numero2;
                System.out.println("Resultado " + numero1+ " - " + numero2+ " = "+ resultado);
                break;

            case 3:
                if (numero2!=0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado " + numero1+ " / " + numero2+ " = "+ resultado);
                }else{
                    System.out.println("Erro: divisão por zero. " );
                }

                break;

            case 4:
                resultado = numero1*numero2;
                System.out.println("Resultado " + numero1+ " * " + numero2+ " = "+ resultado);
                break;

            default:
                System.out.println(" Operação Inválida!!!");


        }




        


    }
}