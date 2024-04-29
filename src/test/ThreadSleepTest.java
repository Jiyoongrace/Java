package test;

class Sleep_1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) { }

        for (int i=0; i<300; i++) {
            System.out.print("-");
        }
        System.out.println("<<Thread 1 종료>>");
    }
}

class Sleep_2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<300; i++) {
            System.out.print("|");
        }
        System.out.println("<<Thread 2 종료>>");
    }
}

public class ThreadSleepTest {
    public static void main(String[] args) {
        Thread t1 = new Sleep_1();
        Thread t2 = new Sleep_2();

        t1.start();
        t2.start();

        try {
            // t1.sleep(2000); 이렇게는 사용하지 않는다.
            // t1을 지정해서 sleep 시킬 수 없다.
            Thread.sleep(2000); // main thread가 자게 된다.
            // sleep은 static method이고 현재 Thread를 sleep 시키는 method이다.
            // t1을 재우려면 t1의 run에 sleep이 있어야 한다.
        } catch (Exception e) { }

        System.out.println("<< main thread 종료 >>");
    }
}
