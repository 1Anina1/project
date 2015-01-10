package lekcja5.program2.workers;

/**
 * Author: Amina
 */
public class Worker {

    private String name;

    private String surname;

    private int age;

    public Worker(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
