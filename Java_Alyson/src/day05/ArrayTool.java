package day05;

/**
 * 解释说明，比如，这里是对数组的一些处理方法，有冒泡排序、输出、打印、求极值等等
 *
 * @author 小王
 * @version 1.0.0
 */

public class ArrayTool {
    private ArrayTool() {

    }

    /**
     * 这里是对一维数组进行冒泡排序的方法
     *
     * @param array 需要传入的参数：int类型的一维数组
     * @return 返回值： 返回的是排序后的数组
     */
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

    /**
     * 这里是打印数组的功能
     *
     * @param array 传入int类型的一维数组
     */
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

    /**
     * 这里是获取数组中的最大值
     *
     * @param array 传入一个int类型的一维数组
     * @return 返回数组中的最大值
     */
    public static int getMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[0]) {
                int tmp = array[0];
                array[0] = array[i];
                array[i] = tmp;
            }
        }
        return array[0];
    }

    /**
     * 这里是获取数组中的最小值
     *
     * @param array 传入一个int类型的一维数组
     * @return 返回数组中的最小值
     */
    public static int getMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                int tmp = array[0];
                array[0] = array[i];
                array[i] = tmp;
            }
        }
        return array[0];
    }

    /**
     * 该方法是将数组逆序
     * 比如：
     * 旧数组：[1,2,3,4,5]
     * 逆序后：[5,4,3,2,1]
     *
     * @param array 需要传入一个int类型数组
     * @return 返回逆序后的数组
     */

    public static int[] niXv(int[] array) {
        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
        }
        return array;
    }


}
