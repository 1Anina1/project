package lekcja5.program3;

import lekcja5.program3.shapes.Circle;
import lekcja5.program3.shapes.Shape;
import lekcja5.program3.shapes.Square;

/**
 * Author: Amina
 */
public class Program3 {

    public static void main(String[] args) {
        Shape circle = new Circle("koło", 3);
        System.out.println(circle);
        double circleSurfaceArea = circle.surfaceArea();
        double circleCircuit = circle.circuit();
        System.out.println("circleSurfaceArea = " + circleSurfaceArea);
        System.out.println("circleCircuit = " + circleCircuit);

        System.out.println();

        Shape square = new Square("kwdrat", 3);
        System.out.println(square);
        double squareSurfaceArea = square.surfaceArea();
        double squareCircuit = square.circuit();
        System.out.println("squareSurfaceArea = " + squareSurfaceArea);
        System.out.println("squareCircuit = " + squareCircuit);


        Shape circle1 = new Circle("circle1", 5);
        Shape circle2 = new Circle("circle2", 4);
        Shape circle3 = new Circle("circle3", 6);

        double c1 = circle1.surfaceArea();
        double c2 = circle2.surfaceArea();
        double c3 = circle3.surfaceArea();

        double p1 = circle1.circuit();
        double p2 = circle2.circuit();
        double p3 = circle3.circuit();

        System.out.println("Circle1 " + c1 + " " + p1);
        System.out.println("Circle2 " + c2 + " " + p2);
        System.out.println("Circle3 " + c3 + " " + p3);
    }
}