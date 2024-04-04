package test;

class MyException extends Exception {

}

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (Exception e) {
            System.out.println("사용자 정의 Exception 발생");
        }
    }
}
