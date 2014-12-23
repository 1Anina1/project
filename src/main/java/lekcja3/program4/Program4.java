package lekcja3.program4;

import java.util.Random;

/**
 * Author: Amina
 */
public class Program4 {

    public static void main(String[] args){
        Random random = new Random();         // obiekt potrzebny do losowania
        int[] numbers = new int[10];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = random.nextInt(11);
            System.out.println(numbers[i]);
        }

        int suma = sumaElementow(numbers);
        System.out.println("suma = " + suma);

    }

    public static int sumaElementow(int[] numbers){
        int suma = 0;
        for(int i = 0; i<numbers.length; i++){
            suma += numbers[i];               // to samo co suma = suma + numbers[i]
        }
        return suma;
    }

    //TODO napisac dodatkowe metody obliczające:
    //TODO różnicę elementów
    //TODO minimum z elementów
    //TODO maximum z elementów

}