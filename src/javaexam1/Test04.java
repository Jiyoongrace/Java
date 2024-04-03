package javaexam1;

public class Test04 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int num = 1;

        while (num <= 100) {
            sum += num;
            count++;
            num++;
        }

        double average = (double) sum / count;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
