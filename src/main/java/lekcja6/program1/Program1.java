package lekcja6.program1;

import lekcja6.program1.dao.WorkerDao;
import lekcja6.program1.worker.Worker;

import java.util.List;

/**
 * Author: Amina
 */
public class Program1 {

    public static void main(String[] args){
        WorkerDao workerDao = new WorkerDao();
        List<Worker> workers = workerDao.findAllWorkers();

        System.out.println(workers);
    }

}
