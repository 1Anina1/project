package lekcja5.program3.shapes;

/**
 * Author: Amina
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String nazwaFigury, double radius) {
        super(nazwaFigury);
        this.radius = radius;
    }

    public double surfaceArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circuit() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                super.toString() + '}';
    }

}
