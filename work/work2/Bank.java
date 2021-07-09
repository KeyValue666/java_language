package com.work.work2;

public class Bank {
    private double balence;

    public Bank(double balence) {
        this.balence = balence;
    }

    //存款
    public void addMoney(double money){
        balence+=money;
    }
    //取款
    public void subMoney(double money){
        balence-=money;
    }

    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }
}
