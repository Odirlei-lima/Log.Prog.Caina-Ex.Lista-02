import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da compra.");
        double valor = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento.\n" +
                "---------------------------\n" +
                "           MENU            \n" +
                "1. PIX\n" +
                "2. Débito\n" +
                "3. Crédito\n" +
                "----------------------------");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double pagamento1 = valor - (valor * 10) / 100;
            System.out.println("Pagamento com PIX, desconto de 10% = R$ " + pagamento1);
        } else if (opcao == 2) {
            double pagamento2 = valor - (valor * 5) / 100;
            System.out.println("Pagamento com débito, desconto de 5% = R$ " + pagamento2);
        } else if (opcao == 3) {
            System.out.println("Digite o N° de parcelas:");
            int parcelas = scanner.nextInt();

            if (parcelas <= 4) {
                double valorcred = valor + (valor * 2) / 100;
                double valorparc = valorcred / parcelas;
                System.out.println("O valor das parcelas em " + parcelas + " vezes é de R$ = " + valorparc);
            } else if (parcelas <= 10) {
                double valorcred = valor + (valor * 5) / 100;
                double valorparc = valorcred / parcelas;
                System.out.println("O valor das parcelas em " + parcelas + " vezes é de R$ = " + valorparc);
            } else {
                System.out.println("N° de parcelas inválido.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

