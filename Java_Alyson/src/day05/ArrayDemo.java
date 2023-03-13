package day05;
/*
    文档注释：主要作用是生成帮助文档

    工具类：专注于某一个方向操作的类
    ArrayTool
    如何编写一个工具类：
        1、要使用文档注释
        2、构造方法私有化
 */

public class ArrayDemo {
    public static void main(String[] args) {
        // 已经学过的一些对数组的操作处理
        int[] array = {12, 3, 12, 3, 45, 45, 3, 2, 4, 7, 5, 3};

        // 进行冒泡排序  升序
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                }
//            }
//        }

        // 以[1,2,3]形式输出
//        for(int i=0;i<array.length;i++){
//            if(i==0){
//                System.out.print("["+array[i]+",");
//            } else if (i==array.length-1) {
//                System.out.println(array[i]+"]");
//            }else{
//                System.out.print(array[i]+",");
//            }
//        }

        // 使用方法对功能进行封装
        BubblingSort(array);
        printArray(array);
    }

    // 使用工具类来完成

    //使用冒泡排序
    public static int[] BubblingSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    // 以[1,2,3]形式输出
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ",");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
