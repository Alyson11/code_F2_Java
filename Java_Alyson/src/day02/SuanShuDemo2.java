package day02;

public class SuanShuDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++; // a=10  ,b=11  ,c=10
        c = --a; // a=9 ,b=11  ,c=9
        b = ++a; // a=10  ,b=10  ,c=9
        a = c--; // a=9  ,b=10  ,c=8

        //请分别计算出a,b,c的值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
