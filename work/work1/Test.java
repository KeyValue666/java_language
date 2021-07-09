package com.work.work1;

public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(100,30,"waiter");
        waiter.printSal();
        Teacher teacher = new Teacher(110, 30, "teacher");
        teacher.setNother(1000);
        teacher.printSal();
        Scicent scicent = new Scicent(120, 30, "scicent");
        scicent.setPars(2000);
        scicent.printSal();

    }
}
