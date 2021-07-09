package com.work.work1;

public class Employee {
    private double daySal;
    private int dayWork;
    private String name;

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(double daySal, int dayWork, String name) {
        this.daySal = daySal;
        this.dayWork = dayWork;
        this.name = name;
    }

    public void printSal(){

    }
}
