package javaexam2.company;

public class Secretary extends Employee implements Bonus {

    // constructor
    public Secretary() {
    }

    public Secretary(String name, int number, String department, int salary) {
        super(name, number, department, salary);
    }

    // method
    @Override
    public double tax() {
        return salary * 0.1;
    }

    @Override
    public void incentive(int pay) {
       salary += pay * 0.8;
    }
}
