package com.work.work8;

public class TestDemo {
    public static void main(String[] args) {


/*

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String date=simpleDateFormat.format(new Date());
        System.out.println(date);
        System.out.println(date.length());
*/

        /*int maxSize=5;//原先数组的长度
        int[] arr = new int[maxSize];
        for (int i = 0; i < arr.length; i++) {//初始化原数组
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));//输出原数组
        int  newMaxSize=10;//扩容后数组的长度
        int[] temp = new int[newMaxSize];//临时扩容后的数组
        temp= Arrays.copyOf(arr,newMaxSize);//将原数组拷贝到临时数组
        arr=temp;//修改指针
        System.out.println(Arrays.toString(arr));//再次输出原数组*/



       /* int[] ints = {1,2,3,4,5};
        //方法一：foreach循环遍历打印
        for (int temp:ints) {
            System.out.printf("%-3d",temp);
        }
        System.out.println();
        //方法二：toString()方法打印
        System.out.println(Arrays.toString(ints));*/
        /*int[][] arr = {{1,2,3},{14,25},{10,22,34,3,90}};

        for (int[]a:arr) {
            for (int temp:a){
                System.out.printf("%-4d",temp);
            }
        }
        System.out.println();
        System.out.println(deepToString(arr));*/
        /*double[] ints = new double[10];
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(10);
            System.out.println("int[i]"+arr[i]);
        }
        for (int i = 0; i < ints.length; i++) {
            ints[i]=Math.random();
            System.out.println("int[i]"+ints[i]);
        }*/

        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*/
       /* int[] a = {1,2,3,4,5};
        int[] b = Arrays.copyOf(a, 10);
        for (int temp : b) {
            System.out.println(temp);
        }
        System.out.println(b==a);*/
    }
}
