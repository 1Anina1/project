package lekcja6.program2;

/**
 * Created by Anina on 2015-01-21.
 */
public class Circle {
    private String nazwa;
    private double surfaceArea;
    private double circuit;

    public Circle(String nazwa, double surfaceArea, double circuit){
        this.nazwa = nazwa;
        this.surfaceArea = surfaceArea;
        this.circuit = circuit;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "nazwa='" + nazwa + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", circuit=" + circuit +
                '}';
    }
}
