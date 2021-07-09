package com.work.work7;

public class C extends B {
    public C() {
        this("hello");
        System.out.println("C中的无参构造。");
    }
    public C(String name){
        super("hahah");
        System.out.println("C中的有参构造。");
    }
}
/*
    A类中的无参构造器。
    hahahB中的有参构造。
    C中的有参构造。
    C中的无参构造。
 */
