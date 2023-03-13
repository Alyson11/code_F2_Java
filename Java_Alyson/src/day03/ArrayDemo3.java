package day03;
/*
    使用数组时常见的问题：
        1、ArrayIndexOutOfBoundsException 数组索引越界异常
        2、NullPointerException 空指针异常
 */

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);  // ArrayIndexOutOfBoundsException

//        arr = null;
//        System.out.println(arr[0]); //NullPointerException
    }
}
