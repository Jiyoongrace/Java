package test;

public class SubClass extends SuperClass {

    // 추가적인 field와 method를 정의하면 된다.
    int a = 5000; // shadow
    int b = 500;

    public SubClass() {
        this(10); // int형을 가지고 있는 생성자를 호출
    }

    public SubClass(int k) {
        // 현재 class가 최상위 클래스인지 확인하고 아니면
        // 상위 클래스의 instance를 만드는 코드
        // SuperClass(); 이건 못 쓰고 대신 super을 쓴다.
        super(); // 상위 클래스를 찾아서 상위 클래스의 생성자를 호출하는 코드
    }

    @Override
    public void myFunc() {
        System.out.println("여기는 sub class 입니다.");
    }
}
