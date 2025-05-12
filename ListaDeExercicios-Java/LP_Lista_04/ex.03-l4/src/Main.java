public class Main {
    public static void main(String[] args) {
        // Começamos do 1, pois queremos números positivos
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}

