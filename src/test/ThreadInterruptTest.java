package test;

import javax.swing.*;

class MyThread_3 extends Thread {
    @Override
    public void run() {
        int i = 10;

        // isInterrupted() -> interrupt면 true, 아니면 false 반환
        while (i != 0 && !isInterrupted()) { // interrupt도 아니고 i가 10이면
            System.out.println(i--);

            try {
                Thread.sleep(4000); // 4초 자고 깨서 다시 while문 반복
                // sleep에서 깨면서 내부적으로 interrupt가 false가 된다.
            } catch (Exception e) { // Exception 발생하면 바로 while문으로 가며 interrupt가 발생하면서 while문이 끝난다.
                interrupt();
            }
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}

public class ThreadInterruptTest {
    public static void main(String[] args) {
        Thread t = new MyThread_3();
        t.start();

        // 약간의 시간 지연을 위해 Swing을 이용한다.
        // swing에서 값을 입력하면 바로 while 문이 끝난다.
        // 즉, swing에서 값을 입력하면 interrupt가 발생한다.
        String input = JOptionPane.showInputDialog("값을 입력하세요!");
        System.out.println("입력된 값은 " + input + " 입니다.");

        t.interrupt(); // isInterrupted() 메소드에 의해 while 문을 탈출한다.
    }
}
