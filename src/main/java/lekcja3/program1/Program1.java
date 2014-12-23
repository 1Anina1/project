package lekcja3.program1;

/**
 * Tworzenie tablicy i wyświetlanie w pętli for
 * Author: Amina
 */
public class Program1 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 9;
        numbers[2] = 8;
        numbers[3] = 4;
        numbers[4] = -5;

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println("numbers[" + i + "] = " + numbers[i]);
            System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
        }
    }

}