package day02;
/*
    获取三个数据中的最大值
 */

public class IfDemo3 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;

        if(a>b){
            if(a>c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else {
            if(b>c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}
