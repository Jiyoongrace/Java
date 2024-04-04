package workshop05.company;

public class Company {

    // field
    private double salary;
    private double annualIncome;
    private double afterTaxAnnualIncome;
    private double bonus;
    private double afterTaxBonus;

    // constructor
    public Company() {
    }

    public Company(double salary) {
        this.salary = salary;
    }

    // method
    public double getIncome() {
        annualIncome = salary * 12;
        return annualIncome;
    }

    public double getAfterTaxIncome() {
        afterTaxAnnualIncome = annualIncome * 0.9;
        return afterTaxAnnualIncome;
    }

    public double getBonus() {
        bonus = 4 * salary * 0.2;
        return bonus;
    }

    public double getAfterTaxBonus() {
        afterTaxBonus = bonus * 0.945;
        return afterTaxBonus;
    }
}
