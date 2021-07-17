package com.codeblock;

public class CodeBlock2 {
    public static void main(String[] args) {
        Code1 code1 = new Code1();
        Code1 code2 = new Code1();
    }
}
class Code1{
    {
        System.out.println("普通代码块被执行。。。");
    }
    static {
        System.out.println("静态代码块被执行。。。");
    }
}