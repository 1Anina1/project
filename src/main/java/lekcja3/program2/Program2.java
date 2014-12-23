package lekcja3.program2;

/**
 * Tworzenie wlasnej metody
 * Author: Daniel
 */
public class Program2 {

    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 9;
        numbers[2] = 8;
        numbers[3] = 4;
        numbers[4] = -5;

        showElements(numbers);
    }

    public static void showElements(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("tab[%d] = %d\n", i, tab[i]);
        }
    }

}
