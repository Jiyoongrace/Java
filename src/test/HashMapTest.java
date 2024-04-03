package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // 상위타입 Map = 실제 구현 클래스 하위타입 HashMap
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "안녕하세요!");
        map.put("2", "하이하이");

        System.out.println(map.get("2"));
    }
}
