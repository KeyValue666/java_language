package program7d10;

/*
1002. 写出这个数 (20) [字符串处理]
读⼊⼀个⾃然数n，计算其各位数字之和，⽤汉语拼⾳写出和的每⼀位数字。
输⼊格式：每个测试输⼊包含1个测试⽤例，即给出⾃然数n的值。这⾥保证n⼩于10100。
    输出格式：
    在⼀⾏内输出n的各位数字之和的每⼀位，拼⾳数字间有1 空格，但⼀⾏中最后⼀个拼⾳数字后没有空格。
    输⼊样例：
    1234567890987654321123456789
    输出样例：
    yi san wu
* */

import java.util.Scanner;

public class printThisNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        int sum=0;
        for (int i = 0; i < string.length(); i++) {
            sum+=string.charAt(i)-'0';//将单个字符转换成相应的整型
        }
        String[]temp={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String string1=sum+"";//将数字转换成相应的字符串
        for (int i = 0; i <string1.length(); i++) {
            if (i==string1.length()-1){
                System.out.print(temp[string1.charAt(i)-'0']);
            }else {
                System.out.print(temp[string1.charAt(i)-'0']+" ");
            }
        }
    }
}
