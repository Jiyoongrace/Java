package javaexam1;

public class Text03 {
    public static void main(String[] args) {
        for (int i=2; i<=5; i++) {
            for (int j=1; j<=9; j++) {
                int result = i*j;
                if (result % 2 != 0) {
                    System.out.println(i + " * " + j + " = " + result);
                }
            }
        }
    }
}
