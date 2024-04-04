package test;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("예외 상황을 발생시켜보자.");
        try { // Exception e <- 이것은 Exception의 상위 클래스
            // int result = 10 / 0; // Exception 발생
            ExceptionTest t = null;
            System.out.println(t.toString());
        } catch (ArithmeticException e) {
            // 발생한 예외에 대한 처리코드가 나온다.
            System.out.println("처리 완료");
        } catch (NullPointerException e) {
            System.out.println("NullPointer 처리 완료");
        } finally {
            System.out.println("finally는 무조건 수행");
        }

        // Exception이 발생하면 해당 Exception에 대한
        // 클래스를 찾아서 Exception 객체를 생성한다.
        // (java.lang.ArithmeticException)
        // 자동으로 생성된 이 객체를 프로그램적으로 처리를 안해주면
        // 프로그램 비정상 종료!
        // Exception Handling 해서 강제 종료를 하지 않는다.
        System.out.println("이 문장 출력되나요?"); // 프로그램의 비정상 종료

    }
}
