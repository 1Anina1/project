package lekcja4.program3;

import java.util.Random;

/**
 * Author: Amina
 */
public class MinMaxAvg {

    public double min(double[][] values) {
        double min = values[0][0];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] < min) {
                    min = values[i][j];
                }
            }
        }
        return min;
    }

    //TODO max i avg

    public double[][] generateArray() {
        double[][] values = new double[10][10];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = random.nextDouble() * 10;
            }
        }

        return values;
    }

    public double max(double[][] values) {
        double max = values[0][0];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (max < values[i][j]) {
                    max = values[i][j];
                }
            }
        }
        return max;

    }

    public static double avg(double[][] values) {
        int x = 0;
        int y = 0;
        int avg = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                x++;
                y += values[i][j];
                avg = y / x;


            }
        }
        return avg;
    }


}
