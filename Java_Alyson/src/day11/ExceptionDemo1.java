package day11;
/*

    异常：
        Throwable
            Error                   严重的错误
            Exception
                --RuntimeException  运行时期异常
                --其他Exception      编译时期异常

    异常带来的影响：
        出现异常的异常，程序会停止，后续代码不会执行。

    如何处理异常：
        1、try...catch...finally
        2、throws
 */

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //演示一个编译时期的问题
//        ArrayList<String> list = new ArrayList<>();
//        list.add(100);

        //运行时期异常
        int[] arr = {11,22,33,44,55};
        System.out.println(arr[10]);

        //Error  一般这种问题比如是内存溢出

        System.out.println("HelloWorld");

    }
}
