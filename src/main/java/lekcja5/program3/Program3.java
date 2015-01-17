package lekcja5.program3;

import lekcja5.program3.shapes.Circle;
import lekcja5.program3.shapes.Shape;
import lekcja5.program3.shapes.Square;

/**
 * Author: Amina
 */
public class Program3 {

    public static void main(String[] args){
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
    }

}
