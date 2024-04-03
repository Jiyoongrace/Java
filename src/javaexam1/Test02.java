package javaexam1;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1 * num2;

        if (result >= 1 && result <=9) {
            System.out.println("한 자리 수 입니다.");
        } else if (result >= 10 && result <= 99) {
            System.out.println("두 자리 수 입니다.");
        } else {
            System.out.println("곱한 결과는 세 자리 이상입니다.");
        }

        sc.close();
    }
}
