package com.work.work1;

public class Waiter extends Employee {
    public Waiter(double daySal, int dayWork, String name) {
        super(daySal, dayWork, name);
    }

    @Override
    public void printSal() {
        System.out.println("服务员"+getName()+"的工资为"+getDaySal()*getDayWork());
    }
}
