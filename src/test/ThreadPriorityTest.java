package test;

public class ThreadPriorityTest {
    public static void main(String[] args) {

        // 추상 메소드를 가진 인터페이스이므로 객체를 생성할 수 없다.
        // 따라서 run() 메소드를 오버라이딩하면 쓸 수 있다.
        Thread t1 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.setPriority(1);

        Thread t2 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
