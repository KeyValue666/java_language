package com.work.work2;

public class BankAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(0);
        account.addMoney(10);
        account.addMoney(10);
        account.addMoney(10);
        System.out.println(account.getBalence());//30
        account.subMoney(10);
        System.out.println(account.getBalence());//19
        account.addMoney(10);
        System.out.println(account.getBalence());//28
        account.subMoney(27);
        System.out.println(account.getBalence());
        account.subMoney(1);


    }
}
