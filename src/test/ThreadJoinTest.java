package test;

class MyThread_8 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("-");
        }
    }
}

class MyThread_9 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("|");
        }
    }
}

public class ThreadJoinTest {
    public static void main(String[] args) {
        MyThread_8 t1 = new MyThread_8();
        MyThread_9 t2 = new MyThread_9();

        t1.start();
        t2.start();

        try {
            t1.join(); // t1을 참여시키고, main thread를 일시 정지 시키고(대기), t1이 끝나면 main이 다시 실행
            t2.join();
        } catch (Exception e) {

        } // t1, t2 중 누가 어떻게 먼저 끝날지는 모르지만 적어도 main이 가장 늦게 끝날 것이다.
    }
}
