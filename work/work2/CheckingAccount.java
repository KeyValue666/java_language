package com.work.work2;

public class CheckingAccount extends Bank{
    private int months=1;
    public CheckingAccount(double balence) {
        super(balence);
    }

    @Override
    public void addMoney(double money) {
        if (months>3){
            money--;
        }else {
            months++;
        }//当一个月超过三次就会扣除1美元
        super.addMoney(money);
    }

    @Override
    public void subMoney(double money) {
        if (months>3){
            money++;
        }else {
            months++;
        }//当一个月超过三次就会扣除1美元
       if (getBalence()<money){
           System.out.println("余额不足");
       }else {
           super.subMoney(money);
       }
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
