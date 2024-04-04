package workshop05.company;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();

        Company c = new Company(sal);

        System.out.println("연 기본급 합: " + c.getIncome() + " 세후: " + c.getAfterTaxIncome());
        System.out.println("연 보너스 합: " + c.getBonus() + " 세후: " + c.getAfterTaxBonus());

        double money = c.getAfterTaxIncome() + c.getAfterTaxBonus();

        System.out.println("연 지급액 합: " + money);

        sc.close();
    }
}
