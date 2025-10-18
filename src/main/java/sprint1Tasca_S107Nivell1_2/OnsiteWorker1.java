package sprint1Tasca_S107Nivell1_2;

/**
 * ClassName: OnsiteWorker
 * Package: sprint1Tasca_S107Nivell1_2
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

    @Override
    public double calculateSalary(double hoursWorked) {
        if (hoursWorked<=0) {
            throw new IllegalArgumentException("The number of hours worked cannot be negative or zero.");
        }
        return  super.getHourlyRate()*hoursWorked+ GASOLINECOST;
    }

    @Deprecated
    public double calculateSalaryOld(double hoursWorked) {
        if (hoursWorked<=0) {
            throw new IllegalArgumentException("The number of hours worked cannot be negative or zero.");
        }
        return  super.getHourlyRate()*hoursWorked;
    }



    @Override
    public String toString() {
        return '\n'+ "OnsiteWorker" +'\n'+ super.toString();
    }
}
