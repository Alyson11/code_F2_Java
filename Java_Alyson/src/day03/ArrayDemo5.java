package day03;

/*
    求数组中的最值（最大值，最小值）
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 23, 543, 45, 46, 2};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最大值：" + max + "," + "最小值：" + min);
    }
}
