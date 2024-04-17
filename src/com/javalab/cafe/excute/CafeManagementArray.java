package com.javalab.cafe.excute;

import com.javalab.cafe.data.ArrayDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Product;
import com.javalab.cafe.domain.Order;

/**
 * 카페 관리 시스템
 * 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페 관리 시스템
 * 주문, 사원, 상품, 카테고리 정보를 배열(Array)에 저장하고 관리
 * 데이터 전담 클래스를 객체로 생성하여 기초 데이터 생성 작업
 */
public class CafeManagementArray {
    public static void main(String[] args) {
        // 데이터 전용 클래스 객체 생성, 생성자에서 데이터가 만들어진다.
        ArrayDatabase db = new ArrayDatabase();

        // 카테고리 정보 출력
        Category[] categories = db.getCategories(); // 데이터 전담 객체에서 카테고리 정보 가져옴


        // 상품 정보 출력
        Product[] products = db.getProducts(); // 데이터전담 객체에서 상품 정보 가져옴

        // 상품 정보 출력
        Employee[] employees = db.getEmployees(); // 데이터전담 객체에서 상품 정보 가져옴


        // 상품 정보 출력
        Order[] orders = db.getOrders(); // 데이터전담 객체에서 상품 정보 가져옴

        showCategories(categories); // 카테고리 정보 출력
        showEmployees(employees); // 사원 정보 출력
        showProducts(products); // 상품 정보 출력
        showOrders(orders); // 주문 정보 출력


    } //end of main

    public static void showCategories(Category[] categories) {
        System.out.println("=====================================================================");
        System.out.println("카테고리 정보 출력");
        for (Category category : categories) {
            if (category != null) {
                System.out.println(category.getCategoryId() + "\t" + category.getName() + "\t" +
                        category.getDescription());
            }
        }
    }

    public static void showProducts(Product[] products) {
        System.out.println("=====================================================================");
        System.out.println("상품 정보 출력");
        for (Product product : products) {
            if (products != null) {
                System.out.println(product.getProductId() + "\t" + product.getName() + "\t" +
                        product.getCategoryId() + "\t" + product.getPrice());
            }
        }
    }

    // 사원 정보 출력 메소드
    public static void showEmployees(Employee[] employees) {
        System.out.println("=====================================================================");
        System.out.println("사원 정보");
        System.out.println("사원번호\t이름\t직급\t전화번호");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeId() + "\t" + employee.getName()
                        + "\t" + employee.getPosition() + "\t"
                        + employee.getSalary());
            }
        }
    }

    public static void showOrders(Order[] orders) {
        System.out.println("=====================================================================");
        System.out.println("주문 정보 출력");
        for (Order order : orders) {
            if (orders != null) {
                System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" +
                        order.getProductId() + "\t" + order.getEmployeeId() + "\t" + order.getQuantity());
            }
        }
    }
}//class 끝
