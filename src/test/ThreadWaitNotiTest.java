package test;

class Shared {

    // method 1개 만든다.
    // 해당 공유 객체는 여러 Thread에 의해서 같이 사용되는데
    // method를 호출할 때는 동기화시켜서 사용한다.
    public synchronized void printNum() {
        try {
            for (int i=0; i<10; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":" + i);
                notify(); // 아까 전의 Thread를 깨운다.
                wait();
            }
        } catch (Exception e) {

        }
    }
}

class MyRunnable_10 implements Runnable {

    private Shared shared;

    public MyRunnable_10(Shared shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        shared.printNum();
    }
}

public class ThreadWaitNotiTest {
    public static void main(String[] args) {
        Shared obj = new Shared(); // 공유 객체

        Thread t1 = new Thread(new MyRunnable_10(obj));
        Thread t2 = new Thread(new MyRunnable_10(obj));

        t1.setName("첫 번째 Thread");
        t2.setName("두 번째 Thread");

        t1.start();
        t2.start();
    }
}
