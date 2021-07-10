package com.debug;

public class DebugTest01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("sum=" + sum);
            System.out.println("sum" + i);
        }
        System.out.println("progress has exit...");
    }
}
