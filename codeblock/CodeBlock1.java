package com.codeblock;

public class CodeBlock1 {
    public static void main(String[] args) {
        System.out.println(CodeSun.num);
        System.out.println(CodeSun.num);
    }
}
class CodeSun{
    public static  int num=1;
     static {
        System.out.println("调用静态属性时，静态方法也会被执行。。。");
    }
}