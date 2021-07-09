package com.work.work1;

public class Scicent extends Employee{
    public Scicent(double daySal, int dayWork, String name) {
        super(daySal, dayWork, name);
    }
    private double pars;

    public double getPars() {
        return pars;
    }

    public void setPars(double pars) {
        this.pars = pars;
    }

    @Override
    public void printSal() {
        System.out.println("科学家"+getName()+"的工资为"+(getDaySal()*getDayWork()+getPars()));
    }
}
