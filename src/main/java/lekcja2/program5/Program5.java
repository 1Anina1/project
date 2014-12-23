package lekcja2.program5;

/**
 * Program wypisuję liczby podzielne przez 5
 * z przedzialu od 1 do 100
 * Author: Amina
 */
public class Program5 {

    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){                 // dzielenie modulo, zwraca resztę z dzielenia
                System.out.println(i);
            }
        }
    }

}

/*

1 / 5 = 0 reszta 1
2 / 5 = 0 reszta 2
3 / 5 = 0 reszta 3
4 / 5 = 0 reszta 4
5 / 5 = 1 reszta 0
6 / 5 = 1 reszta 1
7 / 5 = 1 reszta 2

 */
