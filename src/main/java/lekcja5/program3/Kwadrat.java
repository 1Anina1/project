package lekcja5.program3;

/**
 * Created by Anina on 2015-01-17.
 */
public class Kwadrat extends Figura {
    double dłBoku;

    public Kwadrat(String nazwaFigury, double dłBoku) {
        super(nazwaFigury);
        this.dłBoku = dłBoku;
    }

    public double polePowierzchni() {
        double pole = Math.pow(dłBoku, 2);
        return pole;

    }

    public double obwód() {
        double obwódFigury = 4 * dłBoku;
        return obwódFigury;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "dłBoku=" + dłBoku + super.toString() +
                '}';
    }
}
