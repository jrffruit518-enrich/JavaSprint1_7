package sprint1Tasca_S107Nivell1_2;

/**
 * ClassName: OnsiteWorker
 * Package: sprint1Tasca_S107Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:17/10/2025 - 16:05
 * Version:v1.0
 */
public class OnsiteWorker1 extends Worker1 {
    private static final double GASOLINECOST= 1000;

    public OnsiteWorker1(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Deprecated
    @Override
    public double calculateSalary(double hoursWorked) {
        if (hoursWorked<=0) {
            throw new IllegalArgumentException("The number of hours worked cannot be negative o zero.");
        }
        return  super.getHourlyRate()*hoursWorked+ GASOLINECOST;
    }


    @Override
    public String toString() {
        return '\n'+ "OnsiteWorker" +'\n'+ super.toString();
    }
}
