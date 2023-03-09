package day02;
/*
    switch语句和if语句的区别：
        1、if语句可以匹配一个范围内选择
        2、switch只能匹配一个值进行选择
 */
public class SwitchAndIfDemo {
    public static void main(String[] args) {
        int a = 5;

//        if(a>=1 & a<=10){
//            System.out.println("hello world");
//        }else {
//            System.out.println("java");
//        }

        switch(a){
            case 1:
                System.out.println("hello world");
        }
    }
}
