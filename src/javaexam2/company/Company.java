package javaexam2.company;

import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();

        // 1번의 데이터를 기반으로 객체를 생성 하여 HashMap에 넣는다.
        Secretary hilery = new Secretary("Hilery", 1, "secretary", 800);
        Sales clinten = new Sales("Clinten", 2, "sales", 1200);

        // HashMap에 넣을 때 키 값은 각 객체의 Number로 한다.
        map.put(hilery.getNumber(), hilery);
        map.put(clinten.getNumber(), clinten);

        // 모든 객체의 기본 정보를 출력 한다(for문을 이용하여 출력 한다.)
        System.out.println("name\t\t\tdepartment\t\t\tsalary");
        System.out.println("-------------------------------------------");

        for (Employee employee : map.values()) {
            System.out.println(employee.getName() +
                    "\t\t\t" + employee.getDepartment() +
                    "\t\t\t" + employee.getSalary());
        }

        // 모든 객체에 인센티브 100씩 지급하고 다시 HashMap에 넣는다.
//        for (Employee employee : map.values()) {
//            if (employee instanceof Bonus) {
//                ((Bonus) employee).incentive(100);
//            }
//        }
        hilery.incentive(100);
        clinten.incentive(100);

        // 모든 객체의 정보와 세금을 출력 한다 (for문을 이용하여 출력 한다.)
        System.out.println("\n인센티브 100 지급");
        System.out.println("name\t\t\tdepartment\t\t\tsalary\t\t\ttax");
        System.out.println("--------------------------------------------------------");
        for (Employee employee : map.values()) {
            double tax = employee.tax();
            System.out.println(employee.getName() +
                    "\t\t\t" + employee.getDepartment() +
                    "\t\t\t" + employee.getSalary() +
                    "\t\t\t" + tax);
        }
    }
}
