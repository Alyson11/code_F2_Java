package day08;
/*
    字符串的获取功能：
        int length()
        char charAt(int index)
        int indexOf(int ch)
        int indexOf(String str)
        int indexOf(int ch,int fromIndex)
        int indexOf(String str,int fromIndex)  自己练习
        String substring(int start)
        String substring(int start,int end)

 */

public class StringDemo5 {
    public static void main(String[] args) {
        String s1="java";
//        System.out.println(s1.length());

        // 返回char指定索引处的值,指数范围为0至length() - 1
//        System.out.println(s1.charAt(2));
        // 根据字符获取索引号
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.indexOf(97));
    }
}
