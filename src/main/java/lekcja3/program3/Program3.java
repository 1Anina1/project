package lekcja3.program3;

/**
 * Tworzenie wlasnych metod
 * Author: Amina
 */
public class Program3 {

    public static void main(String[] args){
        double x = 1.5;
        double y = 2.7;

        double suma = obliczSume(x,y);
        double roznica = obliczRoznice(x,y);
        double iloczyn = obliczIloczyn(x,y);
        double iloraz = obliczIloraz(x,y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("suma = " + suma);
        System.out.println("roznica = " + roznica);
        System.out.println("iloczyn = " + iloczyn);
        System.out.println("iloraz = " + iloraz);
    }

    public static double obliczSume(double number1, double number2){
        return number1 + number2;
    }

    public static double obliczRoznice( double number1, double number2){
        return number1 - number2;
    }

    public static double obliczIloczyn( double number1, double number2){
        return number1 * number2;
    }

    public static double obliczIloraz(double number1, double number2){
        return number1 / number2;
    }

}
