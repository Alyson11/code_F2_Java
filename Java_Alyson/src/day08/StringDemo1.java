package day08;
/*
    String字符串：理解为使用一个签子将一个一个字符串起来的串儿，叫做字符串
    字符串一旦被创建，就不能被改变，可以被看作是一个字符数组
     Java程序中的所有字符串文字（例如"abc" ）都被实现为此类的对象。

     构造方法：
        public String()
        public String(byte[] bytes)
        public String(byte[] bytes,int offset,int length)
        public String(char[] value)
        public String(char[] value,int offset,int count)
        public String(String original)
 */

public class StringDemo1 {
    public static void main(String[] args) {
//        String s = "jackson";

        // public String()
//        String s1 = new String(s);
//        System.out.println(s1);

        // public String(byte[] bytes)  //可以将字节数组转成一个字符串对象
//        byte[] bytes = {97, 98, 99, 100};
//        String b1 = new String(bytes);
//        System.out.println(b1);
//        java.lang.String b2 = new java.lang.String(bytes);
//        System.out.println(b2);
        // public String(byte[] bytes,int offset,int length) 将字节数组的一部分转成字符串
//        byte[] bytes = {97,98,99,100};
//        String s = new String(bytes, 0, 2);
//        System.out.println(s);

        // public String(char[] value)  将字符数组转成字符串
//        char[] chars = {'a', 97, 'b', 98};
//        String s = new String(chars);
//        System.out.println(s);  // aabb
//        // public String(char[] value,int offset,int count)
//        String s1 = new String(chars,0,2);
//        System.out.println(s1);  // aa

        //public String(String original)
        String s = new String("jackson");
        System.out.println(s);

    }
}
