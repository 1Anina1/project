package lekcja4.program3;

import java.util.Random;

/**
 * Author: Amina
 */
public class Program3 {

    public static void main(String[] args){
        MinMaxAvg minMaxAvg = new MinMaxAvg();
        double[][] values = minMaxAvg.generateArray();
        double min = minMaxAvg.min(values);
        System.out.println("Min = " + min);
    }


}
