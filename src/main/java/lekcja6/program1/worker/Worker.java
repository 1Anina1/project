package lekcja6.program1.worker;

/**
 * Author: Amina
 */
public class Worker {

    private int id;

    private String name;

    private String surname;

    private double salary;

    public Worker(int id, String name, String surname, double salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
