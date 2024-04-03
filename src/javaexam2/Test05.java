package javaexam2;

import java.util.HashMap;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        double sum = 0.0;

        // HashMap에 1~100까지의 정수를 랜덤하게 10개 셋팅
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = random.nextInt(100) + 1; // 1부터 100까지의 랜덤한 정수 생성
            map.put(i, randomNumber);
        }

        // HashMap 데이터를 화면에 출력
        for (int key : map.keySet()) {
            int value = map.get(key);
            System.out.print(value + " ");
        }
        System.out.println();

        // HashMap 데이터의 합계를 계산
        for (int key : map.keySet()) {
            int value = map.get(key);
            sum += value;
        }

        double average = sum / map.size();

        System.out.printf("합계: %.2f\n", sum);
        System.out.printf("평균: %.2f\n", average);
    }
}
