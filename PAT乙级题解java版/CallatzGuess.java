package program7d10;

/*1001 卡拉兹(Callatz)猜想：
        对任何⼀个⾃然数n，如果它是偶数，那么把它砍掉⼀半；如果它是奇数，那么把(3n+1)砍掉⼀半。这
        样⼀直反复砍下去，最后⼀定在某⼀步得到n=1。卡拉兹在1950年的世界数学家⼤会上公布了这个猜
        想，传说当时耶鲁⼤学师⽣⻬动员，拼命想证明这个貌似很傻很天真的命题，结果闹得学⽣们⽆⼼学
        业，⼀⼼只证(3n+1)，以⾄于有⼈说这是⼀个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进
        展……
        我们今天的题⽬不是证明卡拉兹猜想，⽽是对给定的任⼀不超过1000的正整数n，简单地数⼀下，需要
        多少步（砍⼏下）才能得到n=1？
        输⼊格式：
        每个测试输⼊包含1个测试⽤例，即给出⾃然数n的值。
        输出格式：
        输出从n计算到1需要的步数。
        输⼊样例：
        3
        输出样例：
        5
    * */

import java.util.Scanner;

public class CallatzGuess {
    public static void main(String[] args) {
        int count=0;//计数器
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        while (input!=1){
            if (input%2==0){
                input/=2;
            }else {
                input=(3*input+1)/2;
            }
            count++;
        }
        System.out.println(count);
    }

}
