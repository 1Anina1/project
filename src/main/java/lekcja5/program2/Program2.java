package lekcja5.program2;

import lekcja5.program2.workers.Doctor;
import lekcja5.program2.workers.Programmer;
import lekcja5.program2.workers.Worker;

import javax.print.Doc;

/**
 * Author: Amina
 */
public class Program2 {

    public static void main(String[] args) {
        Worker worker = new Worker("Jan", "Kowalski", 30);
        Doctor doctor = new Doctor("Kasia", "Kowalska", 29, "Dentist");
        Programmer programmer = new Programmer("Anna", "Malinowska", 25, "Java");

        System.out.println(worker);
        System.out.println(doctor);
        System.out.println(programmer);
    }

}


/*

        Worker
      |       |
    |           |
  Doctor    Programmer


Worker: name, surname, age
Doctor: specialization
Programmer: language


 */
