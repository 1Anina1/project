package lekcja7.program1;

/**
 * Author: Amina
 */
public class Regex {

    public boolean isItAPhoneNumber(String text){
        return text.matches("\\d{3}-\\d{3}-\\d{3}");
    }

    public boolean isItPostCode(String text){
        return text.matches("\\d{2}-\\d{3}");
    }

    //TODO
    // Napisac metode ktora sprawdza czy podalismy tekst zaczynajacy sie od duzej litery
    // oraz skladajacy sie z samych liter

}
