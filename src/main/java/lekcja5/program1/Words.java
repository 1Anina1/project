package lekcja5.program1;

/**
 * Klasa wykonująca obliczenia na tablicach typu String.
 * Potrafi między innymi znalezć liczbę elementów
 * rozpoczynaących się na zadany tekst oraz znaleźć
 * liczbę liter w tablicy.
 * Author: Amina
 */
public class Words {

    /**
     * Metoda oblicza ile elementów tablicy rozpoczyna się
     * na zadany tekst
     * @param textesArray Tablica z tekstami
     * @param startingText Rozpoczynający tekst
     * @return Liczba pasujących elementów
     */
    public int howManyWordsStartWith(String[] textesArray, String startingText){
        int foundedTexts = 0;
        for (int i = 0; i < textesArray.length; i++) {
            if(textesArray[i].startsWith(startingText)){
                foundedTexts++;
            }
        }
        return foundedTexts;
    }

    /**
     * Metoda licząca znaki w tablicy
     * @param textesArray Tablica z tekstami
     * @return Liczba liter
     */
    public int countCharacters(String[] textesArray){
        int characters = 0;
        for (int i = 0; i < textesArray.length; i++) {
            String text = textesArray[i];
            characters += text.length();
        }
        return characters;
    }

}
