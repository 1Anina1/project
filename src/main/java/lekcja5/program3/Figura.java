package lekcja5.program3;

/**
 * Created by Anina on 2015-01-17.
 */
public class Figura {
    String nazwaFigury;

    public Figura(String nazwaFigury) {
        this.nazwaFigury = nazwaFigury;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nazwaFigury = '" + nazwaFigury + '\'' +
                '}';
    }
}
