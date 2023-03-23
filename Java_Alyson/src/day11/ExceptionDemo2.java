package day11;
/*
    异常处理的方式1：try...catch...finally
 */

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = 11;
        int b = 0;

//        System.out.println(arr[6]);  //ArrayIndexOutOfBoundsException
//        System.out.println(a/b);   // ArithmeticException

        //1、catch中的代码只有try中出现异常时才会进行匹配
        //2、catch可以写多个，但是如果异常存在父子关系，请将父异常写在下面
        //3、Throwable类中有一个方法：void printStackTrace() 将此throwable和其追溯打印到标准错误流。
        //4、finally可以写也可以不写，写的话，无论try中代码是否会出现异常，都会执行finally中语句。

        try{
            System.out.println(arr[2]);
            System.out.println(a/b);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("这里有问题!");
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("这里也有问题!");
        }finally {
            System.out.println("这里是finally");
        }

        System.out.println("这里没问题");
    }
}
