package lekcja5.program1;

import java.util.Arrays;

/**
 * Obliczenia na tablicach
 * Author: Amina
 */
public class Program4 {

    public static void main(String[] args){
        String[] textsArray = new String[3];
        String startsWith = "To jest pierwszy";
        textsArray[0] = "To jest pierwszy napis";
        textsArray[1] = "To jest drugi napis";
        textsArray[2] = "To jest trzeci napis";

        Words words = new Words();

        System.out.println(Arrays.toString(textsArray));

        int howManyTextesStartWith = words.howManyWordsStartWith(textsArray, startsWith);
        System.out.println("howManyTextesStartWith = " + howManyTextesStartWith);

        int howManyCharacters = words.countCharacters(textsArray);
        System.out.println("howManyCharacters = " + howManyCharacters);
    }

}