package test;

// class 안에 추상 메소드가 있으면 추상 클래스다.
public abstract class TestA {
    // field
    private int age;
    private String name;

    // constructor
    public TestA() {
    }

    // constructor overloading
    public TestA(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    // method
    public void myFunc() {
        // method를 정의했다.
    }

    // 추상 (abstract method)
    public abstract void sayHello(); // method를 선언했다.

}

class MySubClass extends TestA {
    @Override
    public void sayHello() {

    }
}

