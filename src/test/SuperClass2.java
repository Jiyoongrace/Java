package test;

public class SuperClass2 {
    static int staticCall(String msg) {
        System.out.println(msg);
        return 0;
    }

    int a = staticCall("1번 문장");
    static int b = staticCall("2번 문장");

    public SuperClass2() {
        staticCall("3번 문장");
    }

    public SuperClass2(int i) {
        this();
        staticCall("4번 문장");
    }

    public void myFunc() {
        System.out.println("5번 문장");
    }
}
