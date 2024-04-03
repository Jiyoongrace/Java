package test;

public class Exam01_InheritanceOrder extends SuperClass2 {

    int c = staticCall("6번 문장");
    static int d = staticCall("7번 문장");
    // 상위 클래스의 static 먼저 출력, 다음으로 하위 클래스 static 출력

    public Exam01_InheritanceOrder() {
        super(100);
        staticCall("8번 문장");
        super.myFunc();
    }

    @Override
    public void myFunc() {
        System.out.println("9번 문장");
    }

    public static void main(String[] args) {
        System.out.println("10번 문장");
        SuperClass2 obj = new Exam01_InheritanceOrder();
        obj.myFunc();
    }
}
