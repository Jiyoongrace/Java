package javaexam1.tv;

public class Tv {

    // field
    private String name;
    private int price;
    private String description;

    // constructor
    public Tv() {
    }

    public Tv(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // method
    @Override
    public String toString() {
        return "이름: " + this.getName() + ", 가격: " + this.getPrice() + ", 설명: " + this.getDescription();
    }
}
