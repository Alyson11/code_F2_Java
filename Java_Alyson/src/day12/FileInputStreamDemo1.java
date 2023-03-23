package day12;
/*
    以java程序为参照物
        按照流向分为输入流(外部文件时数据---->java)和输出流(java---->外部文件中去)
        按照数据的类型:
            辨别字节流和字符流: 如果一个文件使用记事本打开能够看懂就属于字符流,否则就是字节流(万能流)
            字节流:
                字节输入流：InputStream   ---  FileInputStream
                字节输出流：OutputStream  ---  FileOutputStream
            字符流:
                字符输入流
                字符输出流

 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //FileInputStream(File file)
        //将要读取的目标文件封装成File对象。以参数的形式传入构造方法中
        //对于字节输入流读取文件而言，目标文件必须存在，否则会出现异常
//        File file = new File("Java_Alyson/src/day12/a.txt");
//        FileInputStream fis = new FileInputStream(file);

        //FileInputStream(String name)
        FileInputStream fis = new FileInputStream("Java_Alyson/src/day12/a.txt");

//        /public int read()
        //字节输入流读取数据的第一种方式：一次读取一个字节
//        System.out.print((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());

        //将来我们不清楚一个文件有多少个字节所以使用while循环读取
        //        //通过观察api发现，如果读取到了数据的末尾，返回-1
//        int i = 0;
//        while ((i = fis.read()) != -1) {
//            System.out.print((char) i);
//        }

        //public int read(byte[] b)
        //一次读取一个字节数组
        byte[] bytes = new byte[1024];
        int length = fis.read(bytes);   //返回的是真正获取的字节数量，获取的数据存在数组中
        while ((length = fis.read(bytes)) != -1) {
            String s = new String(bytes,0,length);
            System.out.println(s);
        }

        // 释放资源
        fis.close();
    }
}
