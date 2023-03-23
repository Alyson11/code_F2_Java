package day11;

/*
        递归:方法定义的时候内部调用方法自身的现象
        Math.max(Max(10,200),28);  方法的嵌套调用
        stringBuffer.append().append(); 方法的链式调用

 */
public class DiGuiDemo1 {
    public static void main(String[] args) {
        long res = fun(11);
        System.out.println(res);
    }

    public static long fun(long num) {
        if (num == 1) {
            return num;
        } else {
            return num * fun(--num);
        }
    }
}
