package lekcja5.program3.shapes;

/**
 * Author: Amina
 */
public class Square extends Shape {

    private double lenght;

    public Square(String shapeName, double lenght) {
        super(shapeName);
        this.lenght = lenght;
    }

    public double surfaceArea() {
        return Math.pow(lenght, 2);
    }

    public double circuit() {
        return 4 * lenght;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lenght=" + lenght + " " + super.toString() +
                '}';
    }

}
