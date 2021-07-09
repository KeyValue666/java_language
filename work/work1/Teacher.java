package com.work.work1;

public class Teacher extends Employee {
    public Teacher(double daySal, int dayWork, String name) {
        super(daySal, dayWork, name);
    }

    private double nother;

    public double getNother() {
        return nother;
    }

    public void setNother(double nother) {
        this.nother = nother;
    }

    @Override
    public void printSal() {
        System.out.println("教师"+getName()+"的工资为"+(getDaySal()*getDayWork()+getNother()));
    }
}
