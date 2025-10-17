package sprint1Tasca_S107Nivell1_1;

/**
 * ClassName: OnlineWorker
 * Package: sprint1Tasca_S107Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:17/10/2025 - 17:51
 * Version:v1.0
 */
public class OnlineWorker extends Worker{
    private static final double internetFlatRate = 500.0;


    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    public OnlineWorker() {
    }

    @Override
    public double calculateSalary(double hour) {
        if (hour<0) {
            throw new IllegalArgumentException("The hour can't be negative.");
        }
        return super.getHourlyRate()*hour+internetFlatRate;
    }

    @Override
    public String toString() {
        return super.toString()+"OnlineWorker{}";
    }
}
