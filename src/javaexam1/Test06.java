package javaexam1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test06 {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = 0;
        int count = 0;

        for (int number : array) { // 배열 순회
            if (number % 2 == 0) {
                continue;
            }
            System.out.println(number);
            sum += number;
            count++;
        }

        double average = sum / count;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }

}
