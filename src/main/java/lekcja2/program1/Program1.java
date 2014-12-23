package lekcja2.program1;

import java.util.Scanner;

/**
 * Pokazuję dzialanie switch'a
 * Author: Amina
 */
public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz odpowiednią opcje:");
        System.out.println("1. Opcja pierwsza");
        System.out.println("2. Opcja druga");
        System.out.println("3. Opcja trzecia");
        System.out.println("4. Opcja czwarta");
        System.out.println("5. Opcja piąta");
        System.out.print("Wybór: ");

        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("Wybrao opcję pierwszą");
                break;
            case 2:
                System.out.println("Wybrano opcję drugą");
                break;
            case 3:
                System.out.println("Wybrano opcję trzecią");
                break;
            case 4:
                System.out.println("Wybrano opcję czwartą");
                break;
            case 5:
                System.out.println("Wybrano opcję piątą");
                break;
            default:
                System.out.println("Wybrano nieprawidłową opcję");
        }

    }

}

/*
        if (x == 1) {
            System.out.println("Wybrano opcję pierwszą");
        }
        if (x == 2) {
            System.out.println("Wybrano opcję drugą");
        }
        if (x == 3) {
            System.out.println("Wybrano opcje trzecią");
        }
        if (x == 4) {
            System.out.println("Wybrano opcje czwartą");
        }
        if (x == 5) {
            System.out.println("Wybrano opcje piątą");
        }
        if (x < 1 || x > 3) {
            System.out.println("Wybrano nieprawidłową opcję");
        }
*/
