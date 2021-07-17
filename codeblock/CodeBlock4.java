package com.codeblock;

public class CodeBlock4 {
    public static void main(String[] args) {
        new BB();
    }
}
class BB extends AA{
    private static int num3=getValuB();
    static {
        System.out.println("BB中的静态代码块。。。");//4
    }
    {
        System.out.println("BB中的普通代码块。。。");//7
    }
    public static int getValuB(){
        System.out.println("getValuB");//3
        return 10;
    }

    public BB() {
        System.out.println("BB中的构造器。。。");//8
    }
}
class AA{
    private static int num1=getValuA();
    private int num2;
    static {
        System.out.println("AA中的静态代码块。。。");//2
    }
    {
        System.out.println("AA中的普通代码块。。。");//5
    }
    public static int getValuA(){
        System.out.println("getValuA");//1
        return 10;
    }

    public AA() {
        System.out.println("AA中的构造器。。");//6
    }
}
/*总结
1.先父类、再子类
2.类先进行加载
    1.1:静态代码块、静态变量的初始化
    1.2:再进行构造器的初始化
执行顺序如下所示：
static father()  1.先执行父类静态部分、再执行子类静态部分
public AA(){     2.之后先执行父类构造器、再执行子类构造器
    {}           3.在相应构造器内部先执行普通代码块（“隐藏"，不显示）
    super()      4.再执行父类的构造器（当父类构造器没有参数时，也会被“隐藏"）
    ....         5.最后执行构造器特有的属性
}
* */