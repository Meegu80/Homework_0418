package com.javalab.cafe.arraylist;


import com.javalab.cafe.domain.Employee;
import java.util.ArrayList;

public class ArrayListExample03 {
    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1001, "태우개", "대리", 29));
        employeeList.add(new Employee(1002, "윤강석", "대리", 45));
        employeeList.add(new Employee(1003, "신동찬", "과장", 94));

        showEmployeeList(employeeList);

    } //end of main

    private static void showEmployeeList(ArrayList<Employee> employeeList) {
        // 주문 정보 출력
        for (Employee emp : employeeList) {
            System.out.println(emp.getEmployeeId() + " " + emp.getName() + " " +
                    emp.getPosition() + " " + emp.getSalary());

        }
    }
}
