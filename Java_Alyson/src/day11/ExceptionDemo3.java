package day11;
/*
    如果catch里面有return语句，请问finally的代码还会执行吗?如果会，请问是在return前还是return后。
 */

public class ExceptionDemo3 {
    public static void main(String[] args) {
        // 1、一个方法只能有一个return生效 也就是第一个return
        // 2、finally中的代码只要不是强制退出一定会执行

        System.out.println(fun1());
    }

    public static int fun1() {
        int a = 10;
        int[] arr = {11, 22, 33, 44, 55};
        try {
            a = 20;
            System.out.println(arr[10]); //try中的代码出错后，try中的其他代码就不会执行，直接去匹配catch
            a = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            a = 40;
            return a;  // 此处的return生效 并返回a的值是40
        } finally {
            a = 50; // 这里继续执行，将a的值更改为50
        }
        return a;   // 此处的return不执行

    }
}
