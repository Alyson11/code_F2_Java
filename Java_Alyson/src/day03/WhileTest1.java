package day03;

/*
     我国最高山峰是珠穆朗玛峰：8848m，
     我现在有一张足够大的纸张，厚度为：0.01m。
     请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?

 * */

public class WhileTest1 {
    public static void main(String[] args) {
        int high=884800;
        int thickness=1;
        int count=0;
        while(thickness<884800){
            thickness*=2;
            count++;
        }
        System.out.println(count);
    }
}
