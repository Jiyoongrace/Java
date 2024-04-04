package test;

public class ThreadTest2 {

    // main thread
    public static void main(String[] args) {
        // interface는 추상 method가 있어서 객체(new Runnable())를 만들 수 없다.
        // 객체를 만들 수 없는 이유는 추상 method가 있기 때문이다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("너무 복잡하다.");
            }
        }).start(); // new Thread부터 .start() 전까지 Thread이다.

        new Thread(() -> {
                System.out.println("너무 복잡하다...");
            }
        ).start();
    }
}
