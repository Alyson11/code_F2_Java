package day12;
/*
    将C:\Users\Alyson\Pictures\Camera Roll\wl1.jpg 复制到当前目录下并改名 william.jpg
    读取的文件：C:\Users\Alyson\Pictures\Camera Roll\wl1.jpg -- 输入流 -- InputStream -- FileInputStream
    写入的文件：Java_Alyson/src/day12/william.jpg

 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\Alyson\\Pictures\\Camera Roll\\wl1.jpg");
        // 创建输出流对象
        FileOutputStream fos = new FileOutputStream("Java_Alyson/src/day12/william.jpg");

        // 一次读写一个字节
//        int i=0;
//        while ((i=fis.read())!=-1){
//            fos.write(i);
//        }

        // 一次读写一个字节数组
        byte[] bytes = new byte[1024];
        int length=0;
        while ((length=fis.read(bytes))!=-1){
            fos.write(bytes,0,length);
        }

        fos.close();
        fis.close();
    }
}
