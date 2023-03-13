package day03;
/*
    数组的静态初始化：
    语句定义格式1：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3....};
    语句定义格式2：数据类型[] 数组名;
                数组名 = new 数据类型[]{元素1,元素2,元素3....};
    语句定义格式3：数据类型[] 数组名 = {元素1,元素2,元素3....};  //是第一种格式的简化写法


    数组使用的注意事项：
        1、不能动态初始化和静态初始化混合使用

 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        //需求：使用数组的静态初始化，将11，22，33，44，55存储到数组中

//        int[] arr= new int[]{11,22,33,44};
//        int[] arr;
//        arr=new int[]{11,22,33,44};

        int[] arr = {11, 22, 33, 44};
//        int[] arr;
//        arr={11,22,33,44};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);


    }
}
