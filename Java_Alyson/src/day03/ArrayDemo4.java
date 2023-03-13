package day03;

/*
    数组遍历(依次输出数组中的每一个元素)

 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            if (i == 0) {
                System.out.print("[" + arr[i]+",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }

        }
    }
}
