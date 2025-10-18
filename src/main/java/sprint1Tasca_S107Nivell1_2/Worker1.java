package sprint1Tasca_S107Nivell1_2;

import java.util.Objects;

/**
 * ClassName: Worker
 * Package: sprint1Tasca_S107Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:17/10/2025 - 15:44
 * Version:v1.0
 */
public abstract class Worker1 {
    private String name;
    private String surname;
    private double hourlyRate;

    public Worker1(String name, String surname, double hourlyRate) {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Name and surname cannot be null");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        }
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }



    public abstract double calculateSalary(double hour);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker1 worker = (Worker1) o;
        return Double.compare(hourlyRate, worker.hourlyRate) == 0 && Objects.equals(name, worker.name) && Objects.equals(surname, worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, hourlyRate);
    }

    @Override
    public String toString() {
        return "name : " + name + '\t' +
                "surname : " + surname + '\t' +
                " hourlyRate : " + hourlyRate+'\t'
                ;
    }
}
