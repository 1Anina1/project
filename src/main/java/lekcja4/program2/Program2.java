package lekcja4.program2;

import java.util.Random;

/**
 * Tablice trójwymiarowe
 * Author: Amina
 */
public class Program2 {

    public static void main(String[] args){
        int [][][] pixels = generateArray();

        // Pixele czerwone
        int numOfRedPixels = 0;
        for(int i = 0; i < pixels.length; i++){
            for(int j = 0; j < pixels[i].length; j++){
                if( pixels[i][j][0] == 255 && pixels[i][j][1] == 0 && pixels[i][j][2] == 0){
                    numOfRedPixels++;
                }
            }
        }

        int numOfGrayPixels = 0;
        for(int i = 0; i < pixels.length; i++){
            for(int j = 0; j < pixels[i].length; j++){
                if( pixels[i][j][0] == pixels[i][j][1] &&  pixels[i][j][1] == pixels[i][j][2]){
                    if(pixels[i][j][0] != 0 && pixels[i][j][0] != 255){
                        numOfGrayPixels++;
                    }
                }
            }
        }

        System.out.println("Całkowicie czerwonych pixeliej jest " + numOfRedPixels);
        System.out.println("Szarych pixeli jest " + numOfGrayPixels);
    }

    private static int[][][] generateArray(){
        int[][][] pixels = new int[1000][1000][3];
        Random random = new Random();

        for( int i = 0; i < pixels.length; i++){
            for (int j = 0; j < pixels[i].length; j++){
                for(int k = 0; k < pixels[i][j].length; k++){
                    pixels[i][j][k] = random.nextInt(256);
                }
            }
        }

        return pixels;
    }

}