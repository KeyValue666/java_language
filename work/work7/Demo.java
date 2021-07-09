package com.work.work7;

public class Demo {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getClass());
        /*
        A类中的无参构造器。
        hahahB中的有参构造。
        C中的有参构造。
        C中的无参构造。
        * */
//
//        B b=new C();//运行时执行的是C中的构造器
//        System.out.println(b.getClass());
        /*
        A类中的无参构造器。
        hahahB中的有参构造。
        C中的有参构造。
        C中的无参构造。
        class com.work.work7.C
        */
    }
}
