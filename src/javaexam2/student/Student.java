package javaexam2.student;

public class Student extends Human{

    // field
    private String number;
    private String major;

    // constructor

    public Student() {
    }

    public Student(String name, int age, int height, int weight, String number, String major) {
        super(name, age, height, weight);
        this.number = number;
        this.major = major;
    }

    // getter & setter

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // method
    @Override
    public String printInformation() {
        return super.printInformation() + " " + this.getNumber() + " " + this.getMajor();
    }
}