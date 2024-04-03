package test;

public class InstanceTest {
    static int a = staticCall("1번 출력");
    int b = staticCall("2번 출력");

    public static int staticCall(String msg) {
        System.out.println(msg);
        return 100;
    }

    public InstanceTest() {
        this.b = staticCall("3번 출력");
    } // this는 현재 사용하고 있는 reference의 객체
    // 지금 만들어지는 그 객체를 말함.

    public static void main(String[] args) {
        System.out.println("4번 출력");
        int c = staticCall("5번 출력");
        InstanceTest d = new InstanceTest();
    }
}
