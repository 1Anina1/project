package lekcja6.program1.dao;

import lekcja6.program1.worker.Worker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Author: Amina
 */
public class WorkerDao {

    public List<Worker> findAllWorkers(){
        List<Worker> workers = new ArrayList<Worker>();

        try {
            File workersFile = new File("C:/workers.txt");
            Scanner scanner = new Scanner(workersFile);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(line, ";");
                int id = Integer.parseInt(tokenizer.nextToken());
                String name = tokenizer.nextToken();
                String surname = tokenizer.nextToken();
                double salary = Double.parseDouble(tokenizer.nextToken());

                Worker worker = new Worker(id, name, surname, salary);
                workers.add(worker);
            }


        } catch (FileNotFoundException e){
            System.out.println("Plik nie istnieje");
        }

        return workers;
    }

}
