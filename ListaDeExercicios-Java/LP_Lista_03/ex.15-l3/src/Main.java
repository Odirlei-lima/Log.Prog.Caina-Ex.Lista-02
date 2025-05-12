import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dinheiro na máquina:");
        double dinheiro = scanner.nextDouble();

        System.out.println("---------------------------------\n" +
                "              MENU               \n" +
                "1. Café Expresso ---------R$ 0,50 \n" +
                "2. Café Longo ------------R$ 1,00 \n" +
                "3. Capuccino -------------R$ 2,50 \n" +
                "4. Chocolate -------------R$ 2,00 \n" +
                "---------------------------------");
        int opcao = scanner.nextInt();

        if (opcao >= 1 && opcao <= 4) {
            double preco = 0;
            switch (opcao) {
                case 1:
                    preco = 0.50;
                    break;
                case 2:
                    preco = 1.00;
                    break;
                case 3:
                    preco = 2.50;
                    break;
                case 4:
                    preco = 2.00;
                    break;
            }

            if (dinheiro >= preco) {
                double troco = dinheiro - preco;
                System.out.println("Seu troco é = R$ " + troco + " - Retire sua bebida.");
            } else {
                System.out.println("Dinheiro insuficiente para essa bebida.");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
