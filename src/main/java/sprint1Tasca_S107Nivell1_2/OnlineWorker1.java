package sprint1Tasca_S107Nivell1_2;


/**
 * ClassName: OnlineWorker
 * Package: sprint1Tasca_S107Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:17/10/2025 - 17:51
 * Version:v1.0
 */
public class OnlineWorker1 extends Worker1 {
    private static final double INTERNETFLATRATE = 500.0;


    public OnlineWorker1(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }


    @Override
    public double calculateSalary(double hoursWorked) {
        if (hoursWorked<=0) {
            throw new IllegalArgumentException("The number of hours worked cannot be negative or zero.");
        }
        return super.getHourlyRate()*hoursWorked+INTERNETFLATRATE;
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
        return '\n'+ "OnlineWorker" +'\n'+ super.toString();
    }
}
