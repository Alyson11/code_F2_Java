package day03;

/*
    数组：java提供的一个大小空间固定，长度固定，对于同一个数组而言，存储的数据元素类型一致的容器。
    如何定义一个数组：
        格式1：数据类型[] 数组的名字
        格式2：数据类型 数组名[]

    如何对数组进行初始化：其实就是在内存中开辟一块真正连续的空间，然后把地址值赋值给变量名。
    JVM虚拟机将java程序运行时的内存划分了5个区域：
    1、栈（方法调用，局部变量的创建）
        局部变量：在方法定义上或者方法内部中定义的变量，称之为局部变量
    2、堆（只要在代码看到new关键，new出来的东西一律在堆内存中）
    3、方法区（今天不讲解，说到面向对象的时候加上）
    4、本地方法区（和系统相关）
    5、寄存器（和CPU使用相关）

    java对数组有两种初始化的方式：
        1、动态初始化
            语句定义格式：数据类型[] 数组名 = new 数据类型[m];
            m指的是数组的容量大小，也就是真实要存储元素的个数
            举例：创建一个可以存储3个int类型元素的数组
            int[] arr = new int[3];
        2、静态初始化

 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个存储int类型的数组

        int[] arr1 = new int[3];
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        int[] arr2 = new int[3];
        arr2[0] = 11;
        arr2[1] = 22;
        arr2[2] = 33;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

    }

    public static class test{
        public static void main(String[] args) {
            //定义一个数组，并进行静态初始化。
            int[] arr = {12,98,50,34,76,87,90,34,67,80};
            //逆序前
            System.out.println("逆序前：");
            printArr(arr);
            //逆序后
            System.out.println("逆序后：");
            reverseArr(arr);
            printArr(arr);
        }
        public static void reverseArr(int[] arr) {
            for(int x=0; x<arr.length/2; x++) {
                int temp = arr[x];
                arr[x] = arr[arr.length-1-x];
                arr[arr.length-1-x] = temp;
            }
        }
        //遍历数组
        public static void printArr(int[] arr) {
            System.out.print("[");
            for(int x=0; x<arr.length; x++) {
                if(x == arr.length-1) { //这是最后一个元素
                    System.out.println(arr[x]+"]");
                }else {
                    System.out.print(arr[x]+", ");
                }
            }
        }
    }
}
