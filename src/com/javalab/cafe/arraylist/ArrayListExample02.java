package com.javalab.cafe.arraylist;

import java.util.ArrayList;

public class ArrayListExample02 {

    public static void main(String[] args) {

        // Human 타입의 객체를 저장할 수 있는 ArrayList 객체 생성
        ArrayList<Human> humanList = new ArrayList<Human>();
        humanList.add(new Human("홍길동", 20));
        humanList.add(new Human("김철수", 30));
        humanList.add(new Human("이영희", 40));

//        Human h1 = new Human("홍길동",20);
//        humanList.add(h1);
//        이 두줄을 한줄로 간결화했고, h1변수도 안써도 되니 메모리도 절약한다.
//        출력

        System.out.println(humanList.get(0).getName() + humanList.get(0).getAge());
        System.out.println(humanList.get(1).getName() + humanList.get(1).getAge());
        System.out.println(humanList.get(2).getName() + humanList.get(2).getAge());

    } // end of main
}


class Human {
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

