package javaexam2;

public class Test01 {
    public static void main(String[] args) {
        int[][] array = {
                {12, 41, 36, 56},
                {82, 10, 12, 61},
                {14, 16, 18, 78},
                {45, 26, 72, 23}
        };

        int sum = 0;
        int count = 0;

        // 2차원 배열 순회, 합계 계산, 요소 개수 세기
        for (int[] row : array) {
            for (int number : row) {
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
