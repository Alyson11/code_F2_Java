package day04.homework;
/*
    冒泡排序
 */

public class Test1 {
    public static void main(String[] args) {
        // 定义一个数组，进行静态初始化
        int[] arr = {2, 6, 324, 7, 89, 54, 789, 23, 6, 8, 0};
        System.out.println("排序之前：");
        printArray(arr);
//        定义一个方法进行冒泡排序
        int[] arr2 = BubblingSort(arr);
        System.out.println("排序之后：");
        printArray(arr2);
    }

    /**
     * 返回值类型 int[]
     * 参数列表 int[] arr
     */
    public static int[] BubblingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // 外层循环控制循环次数
            for (int j = 0; j < arr.length - i - 1; j++) { // 内层循环进行相邻两个数比较大小
                if (arr[j] < arr[j + 1]) { // 交换
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arr[j];
                }
            }
        }
        return arr;
    }

    // 以数组[1,2,3,4,5]形式输出
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[0] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[arr.length - 1] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
