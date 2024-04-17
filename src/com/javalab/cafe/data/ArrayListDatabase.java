package com.javalab.cafe.data;


import com.javalab.cafe.domain.Category;
import com.javalab.cafe.domain.Order;
import com.javalab.cafe.domain.Product;
import com.javalab.cafe.domain.Employee;

import java.util.ArrayList;

/**
 * 순수하게 데이터만 저장하는 클래스
 * - 데이터를 저장하는 형태를 배열 대신 ArrayList로 변경
 * - 데이터베이스 역할을 한다.
 */
public class ArrayListDatabase {
    // 인스턴스 변수,속성,필드 각각의 ArrayList
    // 카테고리 저장용 ArrayList 생성
    private ArrayList<Category> categoryList = new ArrayList<>();
    // 상품 저장용 ArrayList 생성
    private ArrayList<Product> productList = new ArrayList<>();
    // 사원 저장용 ArrayList 생성
    private ArrayList<Employee> employeeList = new ArrayList<>();
    // 주문 저장용 ArrayList 생성
    private ArrayList<Order> orderList = new ArrayList<>();


    // 생성자
    public ArrayListDatabase(){
        initializeData(); // 데이터 생성작업을 별도의 메소드로 분리
    }
    // 데이터 생성 - ArryList에 데이터 추가
    public void initializeData(){
        // 카테고리 데이터 초기화
        Category c1 = new Category(1, "Coffee", "All types of coffee drinks");
        Category c2 = new Category(2, "Latte", "Various kinds of lattes");
        Category c3 = new Category(3, "Ade/Shake", "Fresh ades and shakes");
        Category c4 = new Category(4, "Smoothie/Juice", "Healthy smoothies and juices");
        Category c5 = new Category(5, "Bakery", "Fresh baked goods");
        Category c6 = new Category(6, "Tea", "Traditional and herbal teas");

        // 생성된 카테고리 ArrayList에 카테고리 객체 추가 작업
        categoryList.add(c1); // 카테고리 리스트에 첫번째 카테고리 객체 추가
        categoryList.add(c2); // 카테고리 리스트에 두번째 카테고리 객체 추가
        categoryList.add(c3); // 카테고리 리스트에 세번째 카테고리 객체 추가
        categoryList.add(c4); // 카테고리 리스트에 네번째 카테고리 객체 추가
        categoryList.add(c5); // 카테고리 리스트에 다섯번째 카테고리 객체 추가
        categoryList.add(c6); // 카테고리 리스트에 여섯번째 카테고리 객체 추가

        // 상품 저장용 ArrayList에 상품 객체 추가
        // 상품 데이터 초기화
        productList.add(new Product(1,"카라멜마끼아또",  1, 5000));
        productList.add(new Product(2,"홍차라떼",  2, 5000));
        productList.add(new Product(3,"초코라떼",  2, 5000));
        productList.add(new Product(4,"오레오",  3, 5000));
        productList.add(new Product(5,"카라멜마끼아또",  1, 5000));
        productList.add(new Product(6,"초코라떼",  2, 4500));
        productList.add(new Product(7,"복숭아스무디",  4, 5000));
        productList.add(new Product(8,"커피콩빵",  5, 3000));
        productList.add(new Product(9,"바니라라떼",  1, 5000));
        productList.add(new Product(10,"매실차",  6, 4500));
        productList.add(new Product(11,"깔라만시",  6, 4500));
        productList.add(new Product(12,"카페라떼",  1, 4000));
        productList.add(new Product(13,"헤이즐넛라떼",  1, 5000));
        productList.add(new Product(14,"카라멜마끼아또",  1, 5000));
        productList.add(new Product(15,"아메리카노",  1, 4000));
        productList.add(new Product(16,"캐모마일",  6, 4500));
        productList.add(new Product(17,"아포가또",  3, 5500));
        productList.add(new Product(18,"비엔나커피",  1, 5000));
        productList.add(new Product(19,"베이글",  5, 3500));
        productList.add(new Product(20,"카푸치노",  1, 4000));
        productList.add(new Product(21,"허니브레드",  5, 6000));
        productList.add(new Product(22,"카페모카",  1, 5000));
        productList.add(new Product(23,"얼그레이",  6, 4500));
        productList.add(new Product(24,"히비아이스트",  3, 5000));
        productList.add(new Product(25,"플레인 와플",  5, 6000));
        productList.add(new Product(26,"요거트",  3, 5500));
        productList.add(new Product(27,"유자스무디",  4, 5000));
        productList.add(new Product(28,"딸기스무디",  4, 5000));

        // 사원 저장용 ArrayList에 사원 객체 추가
        employeeList.add(new Employee(201, "Alice", "사원", 30000));
        employeeList.add(new Employee(202, "Bob", "대리", 40000));
        employeeList.add(new Employee(203, "Charlie", "과장", 50000));
        employeeList.add(new Employee(204, "David", "사원", 32000));
        employeeList.add(new Employee(205, "Eve", "대리", 42000));

        // 주문 저장용 ArrayList에 주문 객체 추가
        orderList.add(new Order(38167668, "2017-09-13 10:15", 1 ,201, 1));
        orderList.add(new Order(89217297, "2017-09-13 10:20", 2 ,201, 12));
        orderList.add(new Order(39178816, "2017-09-13 10:40", 3 ,201, 13));
        orderList.add(new Order(63105816, "2017-09-13 10:05", 4 ,201, 14));
        orderList.add(new Order(47018158, "2017-09-13 11:15", 5 ,201, 15));
        orderList.add(new Order(46078737, "2017-09-13 11:25", 6 ,201, 16));
        orderList.add(new Order(32215456, "2017-09-13 11:35", 7 ,201, 17));
        orderList.add(new Order(60728464, "2017-09-13 11:45", 8 ,201, 18));
        orderList.add(new Order(99145980, "2017-09-13 11:50", 9 ,201, 10));
        orderList.add(new Order(65700654, "2017-09-13 12:00", 8 ,201, 2));
        orderList.add(new Order(65700654, "2017-09-13 12:00", 7 ,201, 3));
        orderList.add(new Order(65700654, "2017-09-13 12:00", 6 ,201, 4));
        orderList.add(new Order(65700654, "2017-09-13 12:00", 5 ,201, 5));
        orderList.add(new Order(54449843, "2017-09-13 12:10", 4 ,201, 6));
        orderList.add(new Order(66578200, "2017-09-13 12:15", 3 ,201, 7));
        orderList.add(new Order(79287280, "2017-09-13 12:35", 3 ,201, 8));
        orderList.add(new Order(56679560, "2017-09-13 12:50", 6 ,205, 11));
        orderList.add(new Order(39865396, "2017-09-13 12:55", 4 ,205, 12));
        orderList.add(new Order(49791945, "2017-09-13 13:15", 6 ,205, 13));
        orderList.add(new Order(49791945, "2017-09-13 13:15", 8 ,205, 14));
        orderList.add(new Order(49791945, "2017-09-13 13:15", 11,205, 15));
        orderList.add(new Order(49791945, "2017-09-13 13:15", 12,205, 2));
        orderList.add(new Order(73592627, "2017-09-13 13:30", 13,205, 2));
        orderList.add(new Order(57111296, "2017-09-13 13:45", 14,205, 2));
        orderList.add(new Order(57111296, "2017-09-13 13:45", 15,205, 3));
        orderList.add(new Order(57111296, "2017-09-13 13:45", 16,205, 3));
        orderList.add(new Order(57111296, "2017-09-13 13:45", 17,205, 3));
        orderList.add(new Order(69598408, "2017-09-13 13:05", 18,202, 3));
        orderList.add(new Order(69598408, "2017-09-13 13:05", 19,202, 4));
        orderList.add(new Order(69598408, "2017-09-13 13:05", 20,202, 4));
        orderList.add(new Order(69598408, "2017-09-13 13:05", 23,202, 5));
        orderList.add(new Order(67173436, "2017-09-13 14:30", 22,202, 6));
        orderList.add(new Order(67173436, "2017-09-13 14:30", 23,202, 7));
        orderList.add(new Order(67173436, "2017-09-13 14:30", 24,202, 8));
        orderList.add(new Order(67173436, "2017-09-13 14:30", 25,202, 9));
        orderList.add(new Order(36320862, "2017-09-13 14:35", 26,202, 1));
        orderList.add(new Order(71781108, "2017-09-13 14:05", 27,202, 2));
        orderList.add(new Order(55756203, "2017-09-13 14:55", 28,202, 3));
        orderList.add(new Order(55756203, "2017-09-13 14:55", 19,202, 4));
        orderList.add(new Order(55756203, "2017-09-13 14:55", 20,202, 5));
        orderList.add(new Order(55756203, "2017-09-13 14:55", 22,202, 6));
        orderList.add(new Order(22817525, "2017-09-13 15:00", 23,202, 7));
        orderList.add(new Order(55183914, "2017-09-13 15:15", 11,202, 8));
        orderList.add(new Order(39118494, "2017-09-13 15:40", 12,203, 9));
        orderList.add(new Order(56152549, "2017-09-13 15:45", 13,203, 1));
        orderList.add(new Order(44004393, "2017-09-13 16:45", 14,203, 1));
        orderList.add(new Order(57522351, "2017-09-13 16:55", 15,203, 2));
        orderList.add(new Order(57522351, "2017-09-13 16:55", 17,203, 2));
        orderList.add(new Order(57522351, "2017-09-13 16:55", 19,203, 2));
        orderList.add(new Order(57522351, "2017-09-13 16:55", 29,203, 3));
        orderList.add(new Order(97267860, "2017-09-13 17:40", 28,203, 3));
        orderList.add(new Order(23534034, "2017-09-13 17:55", 27,203, 3));
        orderList.add(new Order(91629257, "2017-09-13 18:20", 26,203, 3));
        orderList.add(new Order(37776984, "2017-09-13 19:15", 25,203, 4));
        orderList.add(new Order(46888645, "2017-09-13 19:20", 24,203, 4));
        orderList.add(new Order(47293154, "2017-09-13 19:25", 13,203, 4));
        orderList.add(new Order(34402591, "2017-09-13 20:25", 1 ,203, 4));
        orderList.add(new Order(75967086, "2017-09-13 20:45", 2 ,203, 4));
        orderList.add(new Order(41288267, "2017-09-13 20:55", 3 ,203, 5));
        orderList.add(new Order(38559076, "2017-09-13 21:25", 4 ,203, 5));
        orderList.add(new Order(16229001, "2017-09-13 21:40", 5 ,203, 5));
        orderList.add(new Order(59480814, "2017-09-13 22:00", 14,203, 5));
        orderList.add(new Order(96791246, "2017-09-13 22:10", 15,203, 12));
        orderList.add(new Order(50021775, "2017-09-13 22:35", 16,203, 10));
        orderList.add(new Order(55861805, "2017-09-13 22:40", 17,203, 12));
        orderList.add(new Order(68585789, "2017-09-13 22:50", 18,203, 13));
        orderList.add(new Order(92127744, "2017-09-13 22:55", 21,203, 1));
        orderList.add(new Order(92127744, "2017-09-13 22:55", 22,204, 2));
        orderList.add(new Order(92127744, "2017-09-13 22:55", 23,204, 3));
        orderList.add(new Order(92127744, "2017-09-13 22:55", 24,204, 4));
        orderList.add(new Order(94113278, "2017-09-13 23:15", 15,204, 5));
        orderList.add(new Order(17708771, "2017-09-13 23:20", 16,204, 6));
        orderList.add(new Order(71621027, "2017-09-13 23:25", 17,204, 7));
        orderList.add(new Order(49305845, "2017-09-13 23:45", 12,204, 8));
    } // end initializeData()

    // 게터/세터 메소드 메소드
    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }


}