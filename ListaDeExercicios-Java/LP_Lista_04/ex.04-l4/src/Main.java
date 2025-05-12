public class Main {
    public static void main(String[] args) {
        for (int i = -80; i <= 80; i += 10) {
            double F = (9.0 / 5) * i + 32;
            System.out.printf("Temperatura em Fahrenheit: %d°C = %.2f°F\n", i, F);
        }
    }
}
