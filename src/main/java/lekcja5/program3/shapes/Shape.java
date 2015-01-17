package lekcja5.program3.shapes;

/**
 * Author: Amina
 */
public abstract class Shape {

    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double surfaceArea();

    public abstract double circuit();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName = '" + shapeName + '\'' +
                '}';
    }

}
