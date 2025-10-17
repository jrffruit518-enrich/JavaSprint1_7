package sprint1Tasca_S107Nivell1_1;

/**
 * ClassName: OnsiteWorker
 * Package: sprint1Tasca_S107Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:17/10/2025 - 16:05
 * Version:v1.0
 */
public class OnsiteWorker extends Worker{
    private static final double gasolineCost= 1000;

    public OnsiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    public OnsiteWorker() {
    }

    @Override
    public double calculateSalary(double hour) {
        return  38*hour;
    }


    @Override
    public String toString() {
        return "OnsiteWorker{}";
    }
}
