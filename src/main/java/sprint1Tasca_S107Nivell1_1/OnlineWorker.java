package sprint1Tasca_S107Nivell1_1;

import javax.management.ConstructorParameters;

/**
 * ClassName: OnlineWorker
 * Package: sprint1Tasca_S107Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:17/10/2025 - 17:51
 * Version:v1.0
 */
public class OnlineWorker extends Worker{
    private static final double INTERNETFLATRATE = 500.0;


    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }



    @Override
    public double calculateSalary(double hoursWorked) {
        if (hoursWorked<=0) {
            throw new IllegalArgumentException("The number of hours worked cannot be negative.");
        }
        return super.getHourlyRate()*hoursWorked+INTERNETFLATRATE;
    }

    @Override
    public String toString() {
        return super.toString()+"OnlineWorker{}";
    }
}
