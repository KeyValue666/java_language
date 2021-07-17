package com.codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        Code code = new Code();
    }
}
class Code extends CodeFather{
    {
        System.out.println("Code普通代码块。。。");
    }
    static {
        System.out.println("Code静态代码块。。。");
    }
}
class CodeFather{
    {
        System.out.println("CodeFather普通代码块。。。");
    }
    static {
        System.out.println("CodeFather静态代码块。。。");
    }
}