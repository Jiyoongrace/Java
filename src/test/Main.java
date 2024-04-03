package test;

public class Main {
    public static void main(String[] args) {

        // instance를 생성하자.
        // 동적 바인딩
        // 메소드는 오버라이딩되어 있으면 오버라이딩 된 것을 찾아 출력한다.
        SuperClass sub = new SubClass();
        System.out.println(sub.a); // 100
        sub.myFunc(); // 여기는 sub class 입니다.
    }
}


