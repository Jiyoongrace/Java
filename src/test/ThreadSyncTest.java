package test;

// 공유 자원 한 가지 정의
// Thread에 의해서 같이 사용되는 자원
// 즉, 공유 객체를 만들어서 사용한다.
// 공유 객체를 만들려면 당연히 class가 있어야 한다.
class Account {
    private int balance = 1000; // 잔액

    // 잔액 알아오는 method
    public int getBalance() {
        return balance;
    }

    // 출금하는 method
    // synchronized 키워드는 하나의 Thread가 이 메소드를 쓰면
    // 다른 Thread는 block이 걸리면서 순차적으로 처리가 된다.
    // Critical Section 임계 영역이 생긴다.
    // 임계 영역을 설정해서 다수의 Thread가 동시에 사용할 수 없도록
    // synchronized 키워드로 임계 영역을 설정한다.
    // 당연히 순차 처리가 된다.
    // 그러나 method에 이 키워드를 사용하는게 부담스럽다.
    // 이 method 안에 모든 코드들이 동기화를 필요로 하는 것이 아니기 때문에
    // 따라서 일반적으로 synchronized block을 이용한다.
    public synchronized void withdraw(int money) {
        if (balance > money) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
//            synchronized (this) { // 임계 영역을 줄여서 훨씬 효율적으로 synchronized를 사용한다.
//                balance -= money;
//            }
            balance -= money;
        }
    }

}

// Thread → Runnable → 공용 객체
class MySyncRunnable implements Runnable {

    Account acc = new Account(); // 공용 객체
    @Override
    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("잔액은 " + acc.getBalance());
        }
    }
}

public class ThreadSyncTest {
    public static void main(String[] args) {
        MySyncRunnable r = new MySyncRunnable();

        // 같은 Runnable 객체를 다른 Thread가 사용
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
