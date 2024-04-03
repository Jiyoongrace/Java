package test;

import java.util.ArrayList;
import java.util.List;

class MyStudent {

}

public class ArrayListTest {
    public static void main(String[] args) {

        // ArrayList 객체를 만들어서 사용하자.
        // List 계열은 객체면 type에 상관없이 다 저장 가능하다.
        // 다른 reference data type들을 저장할 수 있다.
        // 그런데 실제로 구현하다보면 거의 예외없이
        // 같은 데이터 타입을 이용해서 사용하게 된다. (마치 배열처럼)
        List<String> list = new ArrayList<String>();
    }
}
