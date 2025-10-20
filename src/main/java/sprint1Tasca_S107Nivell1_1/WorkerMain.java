package sprint1Tasca_S107Nivell1_1;

/**
 * ClassName: WorkerMain
 * Package: sprint1Tasca_S107Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:18/10/2025 - 16:00
 * Version:v1.0
 */
public class WorkerMain {
    public static void main(String[] args) {
        // Note: Worker is an abstract class and cannot be instantiated directly.
        Worker workerOnLine1 = new OnlineWorker("Rong","Jiang",40);
        Worker workerOnLine2 = new OnlineWorker("Lina","Zhou",35);
        Worker workerOnSite1 = new OnsiteWorker("Zhicheng","Jiang",42);
        Worker workerOnSite2 = new OnsiteWorker("Zhixin","Zhou",40);

        double hours = 160;

        System.out.println(workerOnLine1+" salary : " + workerOnLine1.calculateSalary(hours)+ " €");
        System.out.println(workerOnLine2+" salary : " + workerOnLine2.calculateSalary(hours)+ " €");
        System.out.println(workerOnSite1+" salary : " + workerOnSite1.calculateSalary(hours)+ " €");
        System.out.println(workerOnSite2+" salary : " + workerOnSite2.calculateSalary(hours)+ " €");
        System.out.println();

        Worker worker = new OnsiteWorker("Jose","Sanchez",35);
        try {
            System.out.println(worker + " salary : " + worker.calculateSalary(-20));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
