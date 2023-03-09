package day02;

public class SuanShuDemo3 {
    public static void main(String[] args) {
        int a = 4;
        int b = (a++)+(++a)+(a*10); // 4 + 6 + 60

        System.out.println(a); // 6
        System.out.println(b); // 70

    }
}
