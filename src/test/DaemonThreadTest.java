package test;

public class DaemonThreadTest implements Runnable {

    static boolean autuSave = false;
    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThreadTest());
        t.setDaemon(true); // 내가 만든 Thread는 DaemaonThread로 사용할 것이다.

        t.start(); // 언젠가는 이 Thread가 동작하게 될 것이다.

        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("i의 값은: "+ i);
            if (i==5) {
                autuSave = true;
            }
        }

    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(3000); // 3초가 지나면 or 중간에 누군가 방해하면 Interrupt를 걸면 깬다.
            } catch (Exception e) {
                System.out.println("오류 발생");
            }

            if (autuSave) { // 3초 중지 -> 자동 저장 -> 3초 중지 -> 자동 저장
                System.out.println("자동 저장");
            }

        }
    }
}
