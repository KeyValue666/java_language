package com.codeblock;

public class CodeBlock3 {
    public static void main(String[] args) {
        new Code2();
        new Code2();
    }
}
class Code2{
    public Code2() {
        System.out.println("这是构造器。。。");
    }
    {
        System.out.println("这是普通代码块。。。");
    }
    static {
        System.out.println("这是静态代码块。。。");
    }
}