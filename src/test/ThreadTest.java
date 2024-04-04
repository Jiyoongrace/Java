package test;

// 첫 번째 방법
class MyThread extends Thread { // Thread의 run()은 일반 메소드

    @Override
    public void run() {
        // Thread의 실행 코드
        System.out.println("여기는 첫 번째 Thread");
    }
}

// 두 번째 방법(이걸 더 많이 씀)
// 일반 추상 클래스는 객체를 만들지 않는다.
class MyRunnable implements Runnable { // Runnable의 run()은 추상 메소드
    // Thread의 실행 코드는 무조건 run() 안에 들어간다.
    @Override
    public void run() {
        // Thread의 실행 코드
        System.out.println("여기는 두 번째 Thread");
    }
}

public class ThreadTest {

    // main thread
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Thread 생성
        t1.start(); // Thread 실행
        // start()는 non-blocking method
        // start()는 thread scheduler에게 thread를 실행시켜 달라고 요청하는 method
        // JVM이 thread scheduler를 가지고 있다.

        MyRunnable r = new MyRunnable(); // Runnable 객체
        Thread t2 = new Thread(r); // Thread 실행
        t2.start();
    }
}
