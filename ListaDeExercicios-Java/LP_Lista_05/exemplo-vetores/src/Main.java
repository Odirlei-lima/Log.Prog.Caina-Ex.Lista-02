import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declaração sem inicialização
        int [] numbers1 = new int[5];

        numbers1[0] = 0;
        numbers1[1] = 6;
        numbers1[2] = 5;
        numbers1[3] = 2;


        // Declaração com inicialização
        int[] numbers2 = {0,6,5,2,1};
        // ums forma de fazer
        // System.out.println(Arrays.toString(numbers2));

        //Outra forma de fazer
        //System.out.println(numbers1[1]);
        //System.out.println(numbers2[0]);
        //System.out.println(numbers2[1]);
        //System.out.println(numbers2[2]);
        //System.out.println(numbers2[3]);
        //System.out.println(numbers2[4]);

        //Outra forma de fazer
        for ( int =i number.length ;i<5; i++);
        System.out.println(numbers1[i]);

        //foreach outra forma

        //for (int pointer:numbers)
            //System.out.println(pointer);
        }
    }
}