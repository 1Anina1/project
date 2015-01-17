package lekcja5.program3;

/**
 * Created by Anina on 2015-01-17.
 */
public class Koło extends Figura {
    double dlPromienia;

    public Koło(String nazwaFigury, double dlPromienia) {
        super(nazwaFigury);
        this.dlPromienia = dlPromienia;
    }

    public double polePowierzhni() {
        double polePowierzchni = 3.14 * Math.pow(dlPromienia, 2);
        return polePowierzchni;


    }

    public double obwód() {
        double obwódFigury = 2 * 3.14 * dlPromienia;
        return obwódFigury;
    }

    @Override
    public String toString() {
        return "Koło{" +
                "dlPromienia=" + dlPromienia +
                super.toString() + '}';
    }
}
