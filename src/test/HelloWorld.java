// package는 관련 있는 class들을 하나로 묶는 논리적인 단위이고
// 물리적으로는 폴더로 표현된다.
// 거의 예외없이 package는 사용을 한다.

// 하나의 자바 파일에 public이 붙은 class는
// 두 개 이상 존재할 수 없다. (하나만 있어야 한다.)
// 만약, public class가 존재하면 파일명은 반드시
// public class 이름으로 설정해야 한다.

package test;

public class HelloWorld {

    // field들
    int age;

    // constructor들
    // constructor는 이름이 클래스 이름과 같다.
    // 모양은 method와 유사하다. (리턴 타입 존재 X)
    // constructor는 instance의 초기화를 담당하는 일을 주로 한다.
    public HelloWorld() {

    }
    // 만약 생성자를 직접적으로 명시하지 않으면
    // javac compiler가 소스 코드를 bytecode로 컴파일 할 때
    // default constructor를 자동으로 삽입한다.
    // default constructor는 인자도 없고 하는 일도 없는 생성자다.
    // default constructor는 반드시 작성하는 버릇을 들이자.
    // 그러고 오버로딩해서 여러 생성자를 만들던가 한다.

    // method들
    public void sayHello() {

    }

    // 프로그램의 entry point 진입점
    public static void main(String args[]) {
        System.out.println("안녕하세요~");

        // 인스턴스 만들기
        // 메모리 공간의 heap 영역에 대부분 인스턴스가 만들어진다.
        // java는 강타입 언어기 때문에 무조건 데이터 타입을 명시해 주어야 한다.
        // a는 reference variable이라고 부른다.
        // Heap 영역의 instance의 시작 주소를 가지고 있기 때문에 그렇다.
        HelloWorld a = new HelloWorld();
    }
}
