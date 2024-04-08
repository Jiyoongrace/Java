package test;

class MyRunnable_4 implements Runnable {

    // 인스턴스 variable이므로 Thread가 이것을 공유할 수 없다.
    // 객체를 만들어서 각각 Thread와 맵핑한다.
    volatile boolean suspended = false;
    volatile boolean stoped = false;

    private Thread t;

    public void setThread(Thread t) {
        this.t = t;
    }


    @Override
    public void run() {

        while (!stoped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            } else {
                Thread.yield();
            }
        }
    }

    public void suspend() {
        suspended = true;
        // thread에 대해서 interrupt 걸면 된다.
        // thread에 대한 reference가 있어야 한다.
        t.interrupt();
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stoped = true;
    }
}

public class ThreadYieldTest {
    public static void main(String[] args) {
        // Runnable 객체
        MyRunnable_4 r1 = new MyRunnable_4();
        MyRunnable_4 r2 = new MyRunnable_4();
        MyRunnable_4 r3 = new MyRunnable_4();

        Thread t1 = new Thread(r1, "*"); // Thread 이름 지정
        Thread t2 = new Thread(r2, "**"); // Thread 이름 지정
        Thread t3 = new Thread(r3, "***"); // Thread 이름 지정

        r1.setThread(t1);
        r2.setThread(t2);
        r3.setThread(t3);

        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(2000); // main thread가 sleep
            r1.suspend(); // t1을 일시 중지
            Thread.sleep(2000); // main thread가 sleep
            r2.suspend(); // t2을 일시 중지
            Thread.sleep(3000); // main thread가 sleep
            r1.resume();
            Thread.sleep(3000); // main thread가 sleep
            r1.stop();
            r2.stop();
            Thread.sleep(2000); // main thread가 sleep
            r3.stop();
        } catch (Exception e) {

        }
    }
}
