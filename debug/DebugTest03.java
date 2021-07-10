package com.debug;

import java.util.Arrays;

public class DebugTest03 {
    public static void main(String[] args) {
        int []arr={12,4,-2,45};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d",i,arr[i]);
        }
    }
}
