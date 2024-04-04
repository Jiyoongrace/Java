package workshop05.school;

import workshop04.account.Account;

public class StudentTest {
    public static void main(String[] args) {
        Student studentArray [] = new Student[3];
        int ageSum = 0;
        int weightSum = 0;
        int heightSum = 0;

        studentArray[0] = new Student("홍길동", 15, 171, 81);
        studentArray[1] = new Student("한사람", 13, 183, 72);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

        System.out.println("이름\t나이\t신장\t몸무게");

        for (Student st : studentArray) {
            System.out.println(st.getName() + "\t" + st.getAge() + "\t" + st.getHeight() + "\t" + st.getWeight());
        }

        for (Student st : studentArray) {
            ageSum += st.getAge();
            heightSum += st.getHeight();
            weightSum += st.getWeight();
        }

        System.out.println("\n나이의 평균: " + String.format("%.2f", (double)ageSum / studentArray.length));
        System.out.println("신장의 평균: " + String.format("%.2f", (double)heightSum / studentArray.length));
        System.out.println("몸무게의 평균: " + String.format("%.2f", (double)weightSum / studentArray.length));


    }
}
