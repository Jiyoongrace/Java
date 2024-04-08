package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamTest {
    public static void main(String[] args) {

        // 키보드로 한 line을 입력 받아서 그대로 출력한다.
        // 당연히 입력 Stream과 출력 Stream이 필요하다.
        // 키보드로부터 입력을 받기 위한 Stream
        // 모니터에 출력하기 위한 출력 Stream
        // 표준 입력(키보드 입력) System.in -> 불편함
        // 표준 출력(모니터 출력) System.out
        InputStreamReader isr = new InputStreamReader(System.in);
        // 아직도 불편하다. InputStreamReader은 문자 단위로 입력 받는다.
        // 우리는 한 line 단위로 입력을 받고 싶다. (문자열 단위로)
        BufferedReader br = new BufferedReader(isr);

        try {
            String msg = br.readLine();
            System.out.println("입력받은 데이터: " + msg);
        } catch (Exception e) {

        }
    }
}