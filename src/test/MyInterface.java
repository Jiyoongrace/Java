package test;

public interface MyInterface {

    // field
    int MY_NUM = 100;
    // public static final int MY_NUM = 100;
    // 모든 field에 public, static, final 이 다 붙어야 해서 생략 가능

    // method
    // public abstract void myFunc();
    void myFunc();
    // 인터페이스에는 모든 메소드에 abstract이 다 붙어야 해서 생략 가능
    // 즉, 추상 메소드만 넣을 수 있다.
    // method는 선언만 한다.
}

// MyClass1 부분과 MyInterface 부분이 같으면 extends
// MyClass1 부분과 MyInterface 부분이 다르면 implements
// 콤마찍고 인터페이스(MyInterface 부분) 여러 개 동시 구현 가능
class MyClass1 implements MyInterface {
    @Override
    public void myFunc() {
    }
}