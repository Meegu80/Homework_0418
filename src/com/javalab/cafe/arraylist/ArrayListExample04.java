package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample04 {
    public static void main(String[] args) {
        //Item 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1001, "아메리카노", 3000));
        items.add(new Item(1002, "카푸치노", 4000));
        items.add(new Item(1003, "카페라떼", 4500));

        // ArrayList에 저장된 Item 객체 출력

        showItemList(items);

        showUpdatedPrice(items);

    }

    public static void showUpdatedPrice(ArrayList<Item> items){
        double percentIncrease = 10.0;
        ArrayList<Item> updatedItems = new ArrayList<>();
        for (Item mono : items) {
            // 가격 인상률이 반영된 금액 구하기
            double newPrice = mono.getPrice() + (mono.getPrice() * percentIncrease / 100);
            // 가격 인상된 Item  객체 생성
            Item tempItem = new Item(mono.getId(), mono.getName(), newPrice);
            // 가격 인상된 Item 객체를 새로운 ArrayList에 저장
            updatedItems.add(tempItem);
        }


    }

    public static void showItemList(ArrayList<Item> items) {
        for (Item mono : items) {
            System.out.println(mono.getId() + "\t" + mono.getName() + "\t\t" + mono.getPrice());
        }
    }

} // end of class







class Item {
    private int id;
    private String name;
    private double price;

    public Item() {
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
