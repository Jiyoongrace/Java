package javaexam2.company;

public class Sales extends Employee implements Bonus {

    // constructor
    public Sales() {
    }

    public Sales(String name, int number, String department, int salary) {
        super(name, number, department, salary);
    }

    // method

    @Override
    public double tax() {
        return salary * 0.13;
    }

    @Override
    public void incentive(int pay) {
        salary += pay * 1.2;
    }
}
