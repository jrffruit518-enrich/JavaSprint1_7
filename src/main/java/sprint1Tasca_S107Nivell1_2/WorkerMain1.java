package sprint1Tasca_S107Nivell1_2;


/**
 * ClassName: WorkerMain1
 * Package: sprint1Tasca_S107Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:18/10/2025 - 17:01
 * Version:v1.0
 */

@SuppressWarnings("deprecation")
public class WorkerMain1 {

    public static void main(String[] args) {
        OnlineWorker1 workerOnLine1 = new OnlineWorker1("Rong","Jiang",40);
        OnsiteWorker1 workerOnSite1 = new OnsiteWorker1("Zhicheng","Jiang",42);

        System.out.println("salary : " + workerOnLine1.calculateSalaryOld(160));
        System.out.println("salary : " + workerOnSite1.calculateSalaryOld(160));
    }
}
