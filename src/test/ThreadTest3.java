package test;

class MyThread1 extends Thread {

    public MyThread1(String name) {
        // super(); 상위 클래스에서 인자가 없는 생성자
        super(name); // 상위 클래스에서 name 인자를 가진 생성자
    }

    @Override
    public void run() { // Thread 객체가 가지고 있는 run() 메소드
        for (int i=0; i<9; i++) {
            System.out.println(this.getName()); // 결국 this는 Thread
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<9; i++) {
            System.out.println(Thread.currentThread().getName()); // 인스턴스가 없어도 쓸 수 있는 static(메소드 or 필드)
            // 글씨가 기울어져 있으면 static
        }
    }
}
public class ThreadTest3 {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1("홍길동");
        MyRunnable2 r = new MyRunnable2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        // Runnable(실행이 가능한) 상태로 Thread가 들어온다. Thread 큐로 들어온다.
        // Thread Scheduler가 Thread를 선택하고 Core가 붙어서 Running 상태로 만든다.
        // run이 끝나면 Thread가 Dead 상태가 된다.
        // 즉, 여러 가지 상태 전이가 일어난다.
        // 누가 먼저 실행 될지는 아무도 모른다.
    }
}
