package javaexam1.calc;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Calc ca = new Calc();

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("합: " + ca.sum(num1, num2));
        System.out.println("차: " + ca.subtract(num1, num2));
        System.out.println("곱: " + ca.multiply(num1, num2));
        System.out.println("나누기: " + ca.divide(num1, num2));
    }
}