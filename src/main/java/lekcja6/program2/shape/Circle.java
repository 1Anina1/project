package lekcja6.program2.shape;

/**
 * Author: Amina
 */
public class Circle {

    private String name;

    private double radius;

    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    public double calculateCircuit(){
        return 2 * Math.PI * radius;
    }

    public double calculateSurfaceArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public String getName(){
        return name;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
