package com.work;

public class Work02 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.talk();
    }
}

class Test1 {
    protected static int age = 0;
}

class Test2 extends Test1 {
    public void talk() {
        System.out.println(Test1.age);
    }
}