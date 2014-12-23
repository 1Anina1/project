package lekcja1.program2;

/**
 * Dzialanie matematyczne
 * Author: Amina
 */
public class Program2 {

    public static void main(String[] args) {
        int x = 6;
        int y = 4;

        int suma = x + y;
        int roznica = x - y;
        int iloczyn = x * y;
        double iloraz = (double) x / (double) y;    //Zmieniamy na double, poniewaz wynik moze byc liczbą zmiennaprzecinkową

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("suma = " + suma);
        System.out.println("roznica = " + roznica);
        System.out.println("iloczyn = " + iloczyn);
        System.out.println("iloraz = " + iloraz);
    }

}