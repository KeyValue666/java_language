package com.work.work1;

public class Test1Demo  extends Test1{
    String name="jack";

    public Test1Demo() {
        super();
        System.out.println("Test1Demo");
    }

    public Test1Demo(String name) {
        super(name);
    }
    public void say(){
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        new Test1Demo().say();
        new Test1Demo("john").say();
    }
    /*
    Test1
    Test1Demo
    jack
    rose
    jack
    john
     */
}
