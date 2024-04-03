package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("홍길동");
        set.add("신사임당");
        set.add("홍길동");

        // Iterator 생성
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) { // 다음 것이 있는지 체크하고 있으면 출력
            System.out.println(iter.next());
        }
    }
}
