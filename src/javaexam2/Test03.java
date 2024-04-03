package javaexam2;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        String str = "1.22,4.12,5.93,8.71,9.34";
        double data []= new double[5];
        double sum = 0;

        // StringTokenizer를 이용하여 데이터를 꺼낸다.
        StringTokenizer st = new StringTokenizer(str, ",");;

        int index = 0;
        for(int i=0; st.hasMoreElements();i++){
            // 배열에 실수 데이터를 넣는다.
            String token = st.nextToken();
            data[index++] = Double.parseDouble(token);

        }

        // 배열 데이터의 합을 구한다.
        for (double d : data) {
            sum += d;
        }

        // 평균 계산
        double average = sum / data.length;

        // 결과 값을 출력 한다.
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
