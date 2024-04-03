package javaexam2;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 10개의 랜덤한 값을 ArrayList에 추가하고 출력한다.
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10) + 1; // 1부터 10까지의 랜덤한 정수 생성
            list.add(randomNumber);
            System.out.print(randomNumber + " ");
        }
        System.out.println();

        // ArrayList의 값들을 정렬한다.
        Collections.sort(list);

        // 정렬된 ArrayList의 값들을 출력한다.
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}
