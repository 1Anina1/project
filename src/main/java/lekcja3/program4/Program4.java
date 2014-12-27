package lekcja3.program4;

import java.util.Random;

/**
 * Author: Amina
 */
public class Program4 {

    public static void main(String[] args) {
        Random random = new Random();         // obiekt potrzebny do losowania
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
            System.out.println(numbers[i]);
        }

        int suma = sumaElementow(numbers);
        System.out.println("suma = " + suma);

        int roznica = roznicaZElimetow(numbers);
        System.out.println("różnica = " + roznica);

        int min = minimumZElementow(numbers);
        System.out.println("minimum = " + min);

        int max = maximumZElementow(numbers);
        System.out.println("maximum = " + max);

    }

    public static int sumaElementow(int[] numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];               // to samo co suma = suma + numbers[i]
        }
        return suma;
    }

    public static int minimumZElementow(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return min;

    }

    public static int maximumZElementow(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int roznicaZElimetow(int[] numbers) {
        int roznica = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            roznica -= numbers[i];
        }
        return roznica;
    }

    //TODO napisac dodatkowe metody obliczające:
    //TODO różnicę elementów
    //TODO minimum z elementów
    //TODO maximum z elementów

}
