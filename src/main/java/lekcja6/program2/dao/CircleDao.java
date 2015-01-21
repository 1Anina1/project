package lekcja6.program2.dao;

import lekcja6.program2.shape.Circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Author: Amina
 */
public class CircleDao {

    public List<Circle> findAllCircles() {
        List<Circle> shapes = new ArrayList<Circle>();
        try {
            File shapesFile = new File("src/main/resources/shapes.txt");
            Scanner scanner = new Scanner(shapesFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringTokenizer tok = new StringTokenizer(line, ";");
                    String name = tok.nextToken();
                    double radius = Double.parseDouble(tok.nextToken());

                    Circle circle = new Circle(name, radius);
                    shapes.add(circle);
                }
            }
            catch(FileNotFoundException e){
                System.out.println("Plik nie istnieję ");
            }
        return shapes;
    }

}
