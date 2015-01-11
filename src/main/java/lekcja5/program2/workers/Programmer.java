package lekcja5.program2.workers;

/**
 * Author: Amina
 */
public class Programmer extends Worker {

    private String language;

    public Programmer(String name, String surname, int age, String language){
        super(name, surname, age);
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language='" + language + '\'' +
                "} " + super.toString();
    }
}
