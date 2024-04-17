package com.javalab.cafe.excute;

import com.javalab.cafe.data.ArrayListDatabase;
import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Employee;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;

import java.util.ArrayList;

/**
 * 카페 관리 시스템
 * 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페 관리 시스템
 * 주문, 사원, 상품, 카테고리 정보를 배열(Array)에 저장하고 관리
 * 데이터 전담 클래스를 객체로 생성하여 기초 데이터 생성 작업
 */
public class CafeManagementArrayList {
    public static void main(String[] args) {
        // ArrayList 형태로 된 데이터베이스 객체 생성
        ArrayListDatabase db = new ArrayListDatabase();

        // 카테고리 ArrayList 객체 얻기 - 카테고리 정보 출력
        ArrayList<Category> categories = db.getCategoryList();
        showCategoryList(categories);
        //========================================================
        ArrayList<Product> products = db.getProductList();
        showProductList(products);
        //========================================================
        ArrayList<Employee> employees = db.getEmployeeList();
        showEmployeeList(employees);
        //========================================================
        ArrayList<Order> orders = db.getOrderList();
        showOrderList(orders);
        //========================================================



    } //end of main;


    // 카테고리 정보 출력
    public static void showCategoryList(ArrayList<Category> categories){
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("==================================================================");
        for(Category category : categories){
            if(category != null){
                System.out.println(category.getCategoryId() + "\t" + category.getName()
                        + "\t" + category.getDescription());
            }
        }
    }
    //===========================================================================================
    public static void showProductList(ArrayList<Product> products){
        System.out.println("=====================================================================");
        System.out.println("상품 정보 출력");
        System.out.println("상품번호\t상품이름\t카테고리번호\t상품가격");
        for (Product product : products) {
            if (products != null) {
                System.out.println(product.getProductId() + "\t" + product.getName() + "\t" +
                        product.getCategoryId() + "\t" + product.getPrice());
            }
        }

    }


    //===========================================================================================
    public static void showEmployeeList(ArrayList<Employee> employees){
        System.out.println("=====================================================================");
        System.out.println("사원 정보 출력");
        System.out.println("사원번호\t사원이름\t직급\t급여");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeId() + "\t" + employee.getName()
                        + "\t" + employee.getPosition() + "\t"
                        + employee.getSalary());
            }
        }

    }


    //===========================================================================================
    public static void showOrderList(ArrayList<Order> orders){
        System.out.println("=====================================================================");
        System.out.println("주문 정보 출력");
        System.out.println("주문번호\t주문일시\t상품번호\t사원번호\t주문수량");
        for (Order order : orders) {
            if (orders != null) {
                System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" +
                        order.getProductId() + "\t" + order.getEmployeeId() + "\t" + order.getQuantity());
            }
        }

    }



}// class끝
