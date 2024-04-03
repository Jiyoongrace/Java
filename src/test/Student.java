package test;

public class Student {

    // field
    private String name;
    private int age;

    // constructor
    public Student() {
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // method
    @Override
    public boolean equals(Object obj) {
        // 인자로 들어온 instance가 equals method를 가지고 있는
        // instance의 내용과 같으면 같은 객체로 판별하는 로직을 작성하면 된다.
        // 당연히 처음은 두 instance의 type을 똑같이 맞춰야 한다.
        // 문자열 비교는 무조건 equals를 쓴다. (==)를 쓰지 않는다.
        Student target = (Student)obj;
        boolean result = false;
        if(this.getName().equals(target.getName()) && this.getAge() == target.getAge()) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return this.getName() + " : " + this.getAge();
    }
}

class MyMain {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 20);
//        Student s2 = new Student("홍길동", 20);
//
//        boolean result = s1 == s2; // 서로 인스턴스 값이 같은지?
//        System.out.println(result); // false
//        System.out.println(s1.equals(s2));

        System.out.println(s1);
        // toString() 오버라이딩 X -> 메모리 주소값이 나온다. test.Student@4554617c
        // toString() 오버라이딩 O -> 홍길동 : 20
    }
}