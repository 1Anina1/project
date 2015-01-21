package lekcja6.program2;

import lekcja6.program2.dao.CircleDao;
import lekcja6.program2.shape.Circle;

import java.util.List;

/**
 * Author: Amina
 */
public class Runner {

    /*
     * Printf:
     * %d -> liczby naturnalne
     * %f -> liczby zmiennoprzecinkowe
     * %.2f -> liczby zmiennoprzecinkowe z dwoma miejscami po przecinku
     * %s -> napisy
     */
    public  static void main(String[] args){
        CircleDao circleDao = new CircleDao();
        List<Circle> circles = circleDao.findAllCircles();

        for (Circle circle : circles) {
            System.out.printf("%s, promień = %.2f, obwód = %.2f, pole = %.2f", circle.getName(), circle.getRadius(),
                    circle.calculateCircuit(), circle.calculateSurfaceArea());
            System.out.println();

        }
    }

}