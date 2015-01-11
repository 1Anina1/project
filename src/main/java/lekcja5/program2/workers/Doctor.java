package lekcja5.program2.workers;

/**
 * Author: Amina
 */
public class Doctor extends Worker {

    private String specialazation;

    public Doctor(String name, String surname, int age, String specialazation) {
        super(name, surname, age);
        this.specialazation = specialazation;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialazation='" + specialazation + '\'' +
                '}' + super.toString();
    }
}
