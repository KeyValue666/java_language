package com.work.work9;

public class TestDemo {
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        StaticTest.num =1;
        StaticTest.name ="hello";
        StaticTest staticTest1 = new StaticTest();
        StaticTest.num++;
        System.out.println(StaticTest.name);
        System.out.println(StaticTest.num);
    }
}
