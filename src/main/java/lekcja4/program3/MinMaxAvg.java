package lekcja4.program3;

import java.util.Random;

/**
 * Author: Amina
 */
public class MinMaxAvg {

    public double min(double[][] values){
        double min = values[0][0];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if( values[i][j] < min){
                    min = values[i][j];
                }
            }
        }
        return min;
    }

    //TODO max i avg

    public double[][] generateArray(){
        double[][] values = new double[10][10];
        Random random = new Random();

        for( int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = random.nextDouble() * 10;
            }
        }

        return values;
    }


}
