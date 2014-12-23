package lekcja1.program4;

import java.util.Scanner;

/**
 * Sprawdzanie czy liczba podana przez
 * użytkownika jest dodatnia
 * Author: Amina
 */
public class Program4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);       //obiekt do odbierania danych od użytkownika

        System.out.print("Wprowadz liczbę: ");

        int x = scanner.nextInt();

        System.out.println("Wprowadzona liczba to " + x);

        if(x >= 0){
            System.out.println("Liczba jest dodatnia");
        } else {
            System.out.println("Liczba jest ujemna");
        }
    }

}
