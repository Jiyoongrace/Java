package test;

public class SuperClass { // extends java.lang.Object 최상위로 항상 상속

    int a = 100;
    String b = "여기는 super class";

    public SuperClass() { // 항상 인자 없는 생성자를 만들어야 한다.
        super();
    }

    public void myFunc() {
        System.out.println("super");
    }
}
