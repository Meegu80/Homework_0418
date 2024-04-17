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

        showProductsWithCategoryName(products, categories);
        //과제
        showOrdersWithEmployeeName(orders, employees, products);


    } //end of main;


    // 카테고리 정보 출력
    public static void showCategoryList(ArrayList<Category> categories) {
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("==================================================================");
        for (Category category : categories) {
            if (category != null) {
                System.out.println(category.getCategoryId() + "\t" + category.getName()
                        + "\t" + category.getDescription());
            }
        }
    }

    //===========================================================================================
    public static void showProductList(ArrayList<Product> products) {
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
    public static void showEmployeeList(ArrayList<Employee> employees) {
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
    public static void showOrderList(ArrayList<Order> orders) {
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

    private static void showProductsWithCategoryName(ArrayList<Product> products,
                                                     ArrayList<Category> categories) {

        System.out.println("상품번호\t상품명\t카테고리id\t카테고리이름\t가격");
        System.out.println("-------------------------------");

        for (Product product : products) {
            int categoryId = product.getCategoryId(); // 현재 상품의 카테고리Id
            String categoryName = ""; // 카테고리 이름
            // for 문으로 카테고리 리스트에서 카테고리Id와 일치하는 카테고리 이름 찾기
            if (categoryId != 0) {
                for (Category category : categories) {    // 카테고리 for문
                    if (category.getCategoryId() == categoryId) {
                        categoryName = category.getName();
                        break;
                    }
                }
            }
            System.out.println(product.getProductId() + "\t" + product.getName()
                    + "\t" + product.getCategoryId() + "\t" + categoryName + "\t" + product.getPrice());
        }
    }

    /////과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제//과제과제
    //과제  주문데이터 출력시 주문처리직원id옆에 해당직원 이름 같이 출력하기
    private static void showOrdersWithEmployeeName(ArrayList<Order> orders, ArrayList<Employee> employees,
                                                   ArrayList<Product> products) {
        System.out.println("===============================================================================");
        System.out.println("주문번호\t\t주문일자\t\t\t\t\t상품명\t\t\t수량\t\t담당직원명");
        for (Order order : orders) {
            //상품번호 productId보고 상품명name 받아오기
            int productId = order.getProductId();
            String productName = ""; // 상품명
            int employeeId = order.getEmployeeId();
            String employeeName = ""; // 담당직원명
//            if (employeeId != 0 && productId !=0) {
            for (Employee emp : employees) {
                for (Product pro : products) {
                    if (emp.getEmployeeId() == employeeId && pro.getProductId() == productId) {
                        employeeName = emp.getName();
                        productName = pro.getName();
                        break;
                    }
                }
            }
            System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" +
                    productName + "\t\t\t" + order.getQuantity() + "\t\t\t" + employeeName);
        }
    }
}
