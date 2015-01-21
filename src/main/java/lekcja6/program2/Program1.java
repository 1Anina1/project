package lekcja6.program2;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Anina on 2015-01-21.
 */
public class Program1 {
    public List<Circle> findAllShapes() {
        List<Circle> shapes = new ArrayList<Circle>();
        try {
            File shapesFile = new File("C:/Users/Anina/IdeaProjects/project/src/main/java/lekcja6/program2");
            Scanner scanner = new Scanner(shapesFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                StringTokenizer tok = new StringTokenizer(line, ";");

                    String nazwa = tok.nextToken();
                    double surfaceArea = Double.parseDouble(tok.nextToken());
                    double circuit = Double.parseDouble(tok.nextToken());

                    Circle circle = new Circle(nazwa, surfaceArea, circuit);
                    shapes.add(circle);


                }
            }
            catch(FileNotFoundException e){
                System.out.println("Plik nie istnieję ");

            }
        return shapes;



    }
}
