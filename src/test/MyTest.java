package test;

public class MyTest {

    // static block
    // 클래스가 로드될 때 가장 먼저 수행된다.
    static {

    }

    // 필드들
    // a라는 변수에 100을 넣을 것이다.
    // 넣는 것에서 끝나는 것이 아니라, 클래스로부터 인스턴스를 만들어야 함.
    // 인스턴스가 있어야 사용할 수 있는 변수
    // 즉, instance variable이라고도 한다.
    // instance variable은 메모리 heap 영역에 만들어진다.
    public int a = 100;

    private static int b = 200; // java에는 전역 변수는 따로 없다.
    // class variable
    // static이 붙으면 Method Area에 올라간다.
    // heap에 instance가 없어도 사용할 수 있다.
    // instance에는 b가 저기 있다고 알려주는 참조 값이 있다.

    private int c = 300;

    // 생성자들
    public MyTest() {

    }

    MyTest(int k) {

    }

    // 메소드들


    public static void main(String args[]) {
        // 위에 있는 a라고 되어 있는 field를 사용하려면
        // 당연히 instance가 존재해야 한다.
        MyTest obj = new MyTest();

        // obj 라는 시작 주소값이 들어있는 참조 변수 = 객체
        // obj 라는 reference variable을 이용해서 Heap 영역에
        // 생성된 instance를 사용할 수 있다.
        // reference variable을 이용해서 instance를 사용할 때
        // 우리가 이용하는 연산자가 있다.
        // dot operator(.)
        System.out.println("a의 값은 : " + obj.a);
        // import java.lang.*; 을 원래 추가해야하지만 javac 컴파일러가 자동으로 추가해준다.

        // 지역 변수는 메소드가 호출될 때 만들어지고
        // stack 영역에 공간이 잡히고
        // 메소드가 끝나면 pop되면서 사라지는 변수
        int k = 200; // 지역 변수(local variable)
        // 지역 변수는 stack 영역에 만들어진다.
    }

}
