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
        List list = new ArrayList();
        list.add("홍길동"); // 문자열 (오버라이딩 되어있다.)
        list.add(new MyStudent()); // class (오버라이딩 X)
        list.add(100); // integer (오버라이딩 되어있다.)
        // 100은 int형태의 primitive type이다.
        // 따라서 ArrayList 안에 저장될 수 없다.
        // 자바에는 primitive type에 각각 대응되는 wrapper class가 존재
        // list.add(100); => list.add(new Integer(100));
        // boxing 이라는 표현을 사용한다.
//        for(int i=0; i<10; i++) {
//
//        }
        for(Object obj : list) {
            System.out.println(obj.toString());
        }

        List<String> myList = new ArrayList<String>();
        myList.add("홍길동");
        myList.add("신사임당");

        for(String str : myList) { // generic을 쓰면 type이 명시되어 있어 편리하다.
            System.out.println(str);
        }
    }
}
