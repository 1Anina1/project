package lekcja4.program1;

import java.util.Random;

/**
 * Author: Amina
 */
public class Program1 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = random.nextInt(11);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}