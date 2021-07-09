package com.work;

public class Work04 {
    public static void main(String[] args) {
        Manner jack = new Manner("jack", 200, 30);
        jack.printSal();
        Ployment lisa = new Ployment("lisa", 180, 30);
        lisa.printSal();
    }
}

class Volinter {
    protected String name;
    protected double sal;
    protected int workDays;


    public Volinter(String name, double sal, int workDays) {
        this.name = name;
        this.sal = sal;
        this.workDays = workDays;
    }

    public void printSal() {
        System.out.println(sal);
    }
}

class Manner extends Volinter {

    public Manner(String name, double sal, int workDays) {
        super(name, sal, workDays);
    }

    @Override
    public void printSal() {
        System.out.println("经理" + name + "的工资为 :" + sal * 1.2 * workDays + 1000);
    }
}

class Ployment extends Volinter {

    public Ployment(String name, double sal, int workDays) {
        super(name, sal, workDays);
    }

    @Override
    public void printSal() {
        System.out.println("员工" + name + "的工资为 :" + sal * workDays);
    }
}