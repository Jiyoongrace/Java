package workshop04.account;

public class AccountTest2 {
    public static void main(String[] args) {
        // 5개의 Account 형 객체 배열 선언
        Account[] accounts = new Account[5];

        // for문을 이용하여 Account 객체를 배열에 생성
        for (int i = 0; i < accounts.length; i++) {
            String accountNumber = "221-0101-211" + (i + 1);
            accounts[i] = new Account(accountNumber, 100000, 0.045);
        }

        // for문을 이용하여 Account 정보 출력
        for (Account acc : accounts) {
            acc.accountInfo();
            System.out.println();
        }

        System.out.println("");

        // for문을 이용하여 모든 Account 객체의 이자율을 3.7% 변경하고 이자를 화면에 출력
        for (Account acc : accounts) {
            acc.setInterestRate(0.037);
            acc.accountInfo();
            System.out.println(" 이자: " + acc.calculateInterest());
        }
    }
}
