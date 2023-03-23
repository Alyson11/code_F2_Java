package day12;
/*
    把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
    读取的文件：a.txt -- 输入流 -- 字节输入流 -- InputStream -- FileInputStream
    写入的文件：b.txt -- 输出流 -- 字节输出流 -- OutputStream -- FileOutputStream
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("Java_Alyson/src/day12/a.txt");
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("Java_Alyson/src/day12/b.txt");

        //读写的第一种方式：一次读写一个字节
//        int i = 0;
//        while ((i = fis.read()) != -1) {
//            fos.write(i);
//        }

        //读写的第二种方式：一次读写一个字节数组
        byte[] bytes = new byte[1024];
        int length=0;
        while ((length=fis.read(bytes))!=-1){
            fos.write(bytes,0,length);
        }

        fos.close();
        fis.close();
    }
}
